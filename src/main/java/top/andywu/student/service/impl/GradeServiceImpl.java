package top.andywu.student.service.impl;

import top.andywu.student.entity.Grade;
import top.andywu.student.dao.GradeDao;
import top.andywu.student.service.GradeService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Grade)表服务实现类
 *
 * @author makejava
 * @since 2021-10-17 19:00:55
 */
@Service("gradeService")
public class GradeServiceImpl implements GradeService {
    @Resource
    private GradeDao gradeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Grade queryById(Integer id) {
        return this.gradeDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param grade 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Grade> queryByPage(Grade grade, PageRequest pageRequest) {
        long total = this.gradeDao.count(grade);
        return new PageImpl<>(this.gradeDao.queryAllByLimit(grade, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param grade 实例对象
     * @return 实例对象
     */
    @Override
    public Grade insert(Grade grade) {
        this.gradeDao.insert(grade);
        return grade;
    }

    /**
     * 修改数据
     *
     * @param grade 实例对象
     * @return 实例对象
     */
    @Override
    public Grade update(Grade grade) {
        this.gradeDao.update(grade);
        return this.queryById(grade.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.gradeDao.deleteById(id) > 0;
    }
}
