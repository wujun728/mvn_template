package com.doroodo.work.service;

import java.util.List;

import com.doroodo.base.service.BaseService;
import com.doroodo.sys.model.*;
import com.doroodo.work.model.*;
public interface VcxSbTakeStateMonitorService extends BaseService<VcxSbTakeStateMonitor> {
	public List countGroupByState();
}