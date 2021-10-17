package top.andywu.student.controller;

import top.andywu.student.entity.Course;
import top.andywu.student.service.CourseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Course)表控制层
 *
 * @author makejava
 * @since 2021-10-16 16:28:15
 */
@RestController
@RequestMapping("course")
public class CourseController {
    /**
     * 服务对象
     */
    @Resource
    private CourseService courseService;

    /**
     * 分页查询
     *
     * @param course 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Course>> queryByPage(Course course, PageRequest pageRequest) {
        return ResponseEntity.ok(this.courseService.queryByPage(course, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Course> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.courseService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param course 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Course> add(@RequestBody Course course) {
        return ResponseEntity.ok(this.courseService.insert(course));
    }

    /**
     * 编辑数据
     *
     * @param course 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Course> edit(Course course) {
        return ResponseEntity.ok(this.courseService.update(course));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.courseService.deleteById(id));
    }

}

