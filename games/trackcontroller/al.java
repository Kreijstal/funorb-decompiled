/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

class al extends fc {
    String field_n;
    tg field_l;
    int field_A;
    int field_u;
    String field_s;
    boolean field_q;
    static be field_w;
    int field_m;
    t field_y;
    int field_p;
    static String[] field_i;
    int field_o;
    static qj field_t;
    int field_r;
    static qj[] field_z;
    static String field_v;
    int field_x;
    rb field_k;
    static ng[] field_j;

    final static byte[] a(int param0, byte[] param1) {
        be var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5_ref_byte__ = null;
        int var5 = 0;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        byte[] var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          var2 = new be(param1);
          var3 = var2.h(16383);
          var4 = var2.e((byte) 113);
          if (0 > var4) {
            break L0;
          } else {
            L1: {
              if (-1 == (he.field_b ^ -1)) {
                break L1;
              } else {
                if (var4 <= he.field_b) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            if (param0 <= -115) {
              if (var3 != 0) {
                L2: {
                  var5 = var2.e((byte) 113);
                  if (0 > var5) {
                    break L2;
                  } else {
                    L3: {
                      if (he.field_b == 0) {
                        break L3;
                      } else {
                        if (he.field_b >= var5) {
                          break L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var12 = new byte[var5];
                    var10 = var12;
                    var6 = var10;
                    if (1 == var3) {
                      int discarded$4 = b.a(var12, var5, param1, var4, 9);
                      return var6;
                    } else {
                      var7 = (Object) (Object) bd.field_b;
                      synchronized (var7) {
                        L4: {
                          bd.field_b.a((byte) 28, var12, var2);
                          break L4;
                        }
                      }
                      if (TrackController.field_F) {
                        int discarded$5 = b.a(var12, var5, param1, var4, 9);
                        return var6;
                      } else {
                        return var6;
                      }
                    }
                  }
                }
                throw new RuntimeException();
              } else {
                var11 = new byte[var4];
                var9 = var11;
                var5_ref_byte__ = var9;
                var2.a(96, var11, 0, var4);
                return var5_ref_byte__;
              }
            } else {
              return null;
            }
          }
        }
        throw new RuntimeException();
    }

    void f(int param0) {
        if (param0 == -24174) {
            return;
        }
        field_v = null;
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != -3050) {
          int discarded$2 = ((al) this).c((byte) -123);
          ((al) this).field_p = param4;
          ((al) this).field_m = param2;
          ((al) this).field_x = param3;
          ((al) this).field_u = param0;
          return;
        } else {
          ((al) this).field_p = param4;
          ((al) this).field_m = param2;
          ((al) this).field_x = param3;
          ((al) this).field_u = param0;
          return;
        }
    }

    al(String param0, tg param1) {
        this(param0, lb.field_O.field_k, param1);
    }

    final void g(int param0) {
        if (param0 < 33) {
            return;
        }
        ((al) this).a(((al) this).field_u, -3050, ((al) this).field_m, ((al) this).field_x, ((al) this).field_p);
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param3 == 29221) {
          if (-1 == (param0 ^ -1)) {
            if (null != ((al) this).field_y) {
              ((al) this).field_y.a(-24969, (al) this, param2, true, param1);
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          boolean discarded$11 = ((al) this).a(38, false, true, 115);
          if (-1 == (param0 ^ -1)) {
            if (null == ((al) this).field_y) {
              return;
            } else {
              ((al) this).field_y.a(-24969, (al) this, param2, true, param1);
              return;
            }
          } else {
            return;
          }
        }
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final boolean a(int param0, boolean param1, boolean param2, int param3) {
        int var5 = 0;
        fj var6 = null;
        int var7 = 0;
        fj var8 = null;
        fj var17 = null;
        fj var18 = null;
        fj var22 = null;
        fj var29 = null;
        fj var30 = null;
        fj var38 = null;
        fj var39 = null;
        fj var40 = null;
        var7 = TrackController.field_F ? 1 : 0;
        ((al) this).a(param3, param0, (byte) -124, (al) this);
        var5 = ((al) this).h(-96) ? 1 : 0;
        if (!param2) {
          L0: {
            if (param1) {
              L1: {
                if (-1 == (ee.field_c ^ -1)) {
                  break L1;
                } else {
                  if (var5 != 0) {
                    boolean discarded$4 = ((al) this).a(kf.field_b, param3, ee.field_c, param0, fg.field_a, (al) this, (byte) 127);
                    break L1;
                  } else {
                    L2: {
                      if ((uk.field_a ^ -1) == -1) {
                        break L2;
                      } else {
                        L3: {
                          if (!((al) this).a((al) this, wg.field_e, db.field_X, uk.field_a, 0, param0, param3)) {
                            break L3;
                          } else {
                            param1 = false;
                            if (var7 == 0) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                        if (var5 == 0) {
                          break L2;
                        } else {
                          L4: {
                            ((al) this).f(-24174);
                            if (0 != rj.field_a) {
                              break L4;
                            } else {
                              if ((sc.field_h ^ -1) != -1) {
                                ((al) this).a((al) this, false, fg.field_a, param3, kf.field_b, param0);
                                var30 = rf.field_e;
                                var6 = var30;
                                if (var30 != null) {
                                  L5: {
                                    if (var30.field_l instanceof n) {
                                      ((n) (Object) var30.field_l).a(var30, (mc) null, 21277);
                                      break L5;
                                    } else {
                                      break L5;
                                    }
                                  }
                                  rf.field_e = null;
                                  break L4;
                                } else {
                                  break L4;
                                }
                              } else {
                                sc.field_h = rj.field_a;
                                aj.a((byte) -127, ((al) this).e(0));
                                return param1;
                              }
                            }
                          }
                          sc.field_h = rj.field_a;
                          aj.a((byte) -127, ((al) this).e(0));
                          return param1;
                        }
                      }
                    }
                    L6: {
                      if (0 != rj.field_a) {
                        break L6;
                      } else {
                        if ((sc.field_h ^ -1) != -1) {
                          ((al) this).a((al) this, false, fg.field_a, param3, kf.field_b, param0);
                          var38 = rf.field_e;
                          var6 = var38;
                          if (var38 != null) {
                            L7: {
                              if (var38.field_l instanceof n) {
                                ((n) (Object) var38.field_l).a(var38, (mc) null, 21277);
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            rf.field_e = null;
                            break L6;
                          } else {
                            sc.field_h = rj.field_a;
                            aj.a((byte) -127, ((al) this).e(0));
                            return param1;
                          }
                        } else {
                          sc.field_h = rj.field_a;
                          aj.a((byte) -127, ((al) this).e(0));
                          return param1;
                        }
                      }
                    }
                    sc.field_h = rj.field_a;
                    aj.a((byte) -127, ((al) this).e(0));
                    return param1;
                  }
                }
              }
              L8: {
                if ((uk.field_a ^ -1) == -1) {
                  break L8;
                } else {
                  L9: {
                    if (!((al) this).a((al) this, wg.field_e, db.field_X, uk.field_a, 0, param0, param3)) {
                      break L9;
                    } else {
                      param1 = false;
                      if (var7 == 0) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  if (var5 == 0) {
                    break L8;
                  } else {
                    L10: {
                      ((al) this).f(-24174);
                      if (0 != rj.field_a) {
                        break L10;
                      } else {
                        if ((sc.field_h ^ -1) != -1) {
                          ((al) this).a((al) this, false, fg.field_a, param3, kf.field_b, param0);
                          var39 = rf.field_e;
                          var6 = var39;
                          if (var39 != null) {
                            L11: {
                              if (var39.field_l instanceof n) {
                                ((n) (Object) var39.field_l).a(var39, (mc) null, 21277);
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            rf.field_e = null;
                            break L10;
                          } else {
                            sc.field_h = rj.field_a;
                            aj.a((byte) -127, ((al) this).e(0));
                            return param1;
                          }
                        } else {
                          sc.field_h = rj.field_a;
                          aj.a((byte) -127, ((al) this).e(0));
                          return param1;
                        }
                      }
                    }
                    sc.field_h = rj.field_a;
                    aj.a((byte) -127, ((al) this).e(0));
                    return param1;
                  }
                }
              }
              if (0 != rj.field_a) {
                break L0;
              } else {
                if ((sc.field_h ^ -1) != -1) {
                  ((al) this).a((al) this, false, fg.field_a, param3, kf.field_b, param0);
                  var40 = rf.field_e;
                  if (var40 != null) {
                    L12: {
                      if (var40.field_l instanceof n) {
                        ((n) (Object) var40.field_l).a(var40, (mc) null, 21277);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    rf.field_e = null;
                    break L0;
                  } else {
                    sc.field_h = rj.field_a;
                    aj.a((byte) -127, ((al) this).e(0));
                    return param1;
                  }
                } else {
                  sc.field_h = rj.field_a;
                  aj.a((byte) -127, ((al) this).e(0));
                  return param1;
                }
              }
            } else {
              if (var5 == 0) {
                break L0;
              } else {
                if ((uk.field_a ^ -1) == -1) {
                  break L0;
                } else {
                  ((al) this).f(-24174);
                  if (var7 == 0) {
                    break L0;
                  } else {
                    L13: {
                      if (-1 == (ee.field_c ^ -1)) {
                        break L13;
                      } else {
                        if (var5 != 0) {
                          boolean discarded$5 = ((al) this).a(kf.field_b, param3, ee.field_c, param0, fg.field_a, (al) this, (byte) 127);
                          break L13;
                        } else {
                          L14: {
                            if ((uk.field_a ^ -1) == -1) {
                              break L14;
                            } else {
                              L15: {
                                if (!((al) this).a((al) this, wg.field_e, db.field_X, uk.field_a, 0, param0, param3)) {
                                  break L15;
                                } else {
                                  param1 = false;
                                  if (var7 == 0) {
                                    break L14;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                              if (var5 == 0) {
                                break L14;
                              } else {
                                ((al) this).f(-24174);
                                break L14;
                              }
                            }
                          }
                          L16: {
                            if (0 != rj.field_a) {
                              break L16;
                            } else {
                              if ((sc.field_h ^ -1) != -1) {
                                ((al) this).a((al) this, false, fg.field_a, param3, kf.field_b, param0);
                                var18 = rf.field_e;
                                if (var18 != null) {
                                  L17: {
                                    if (var18.field_l instanceof n) {
                                      ((n) (Object) var18.field_l).a(var18, (mc) null, 21277);
                                      break L17;
                                    } else {
                                      break L17;
                                    }
                                  }
                                  rf.field_e = null;
                                  break L16;
                                } else {
                                  break L16;
                                }
                              } else {
                                sc.field_h = rj.field_a;
                                aj.a((byte) -127, ((al) this).e(0));
                                return param1;
                              }
                            }
                          }
                          sc.field_h = rj.field_a;
                          aj.a((byte) -127, ((al) this).e(0));
                          return param1;
                        }
                      }
                    }
                    L18: {
                      if ((uk.field_a ^ -1) == -1) {
                        break L18;
                      } else {
                        L19: {
                          if (!((al) this).a((al) this, wg.field_e, db.field_X, uk.field_a, 0, param0, param3)) {
                            break L19;
                          } else {
                            param1 = false;
                            if (var7 == 0) {
                              break L18;
                            } else {
                              break L19;
                            }
                          }
                        }
                        if (var5 == 0) {
                          break L18;
                        } else {
                          L20: {
                            ((al) this).f(-24174);
                            if (0 != rj.field_a) {
                              break L20;
                            } else {
                              if ((sc.field_h ^ -1) != -1) {
                                ((al) this).a((al) this, false, fg.field_a, param3, kf.field_b, param0);
                                var22 = rf.field_e;
                                if (var22 != null) {
                                  L21: {
                                    if (var22.field_l instanceof n) {
                                      ((n) (Object) var22.field_l).a(var22, (mc) null, 21277);
                                      break L21;
                                    } else {
                                      break L21;
                                    }
                                  }
                                  rf.field_e = null;
                                  break L20;
                                } else {
                                  break L20;
                                }
                              } else {
                                sc.field_h = rj.field_a;
                                aj.a((byte) -127, ((al) this).e(0));
                                return param1;
                              }
                            }
                          }
                          sc.field_h = rj.field_a;
                          aj.a((byte) -127, ((al) this).e(0));
                          return param1;
                        }
                      }
                    }
                    L22: {
                      if (0 != rj.field_a) {
                        break L22;
                      } else {
                        if ((sc.field_h ^ -1) != -1) {
                          ((al) this).a((al) this, false, fg.field_a, param3, kf.field_b, param0);
                          var29 = rf.field_e;
                          if (var29 != null) {
                            L23: {
                              if (var29.field_l instanceof n) {
                                ((n) (Object) var29.field_l).a(var29, (mc) null, 21277);
                                break L23;
                              } else {
                                break L23;
                              }
                            }
                            rf.field_e = null;
                            break L22;
                          } else {
                            sc.field_h = rj.field_a;
                            aj.a((byte) -127, ((al) this).e(0));
                            return param1;
                          }
                        } else {
                          sc.field_h = rj.field_a;
                          aj.a((byte) -127, ((al) this).e(0));
                          return param1;
                        }
                      }
                    }
                    sc.field_h = rj.field_a;
                    aj.a((byte) -127, ((al) this).e(0));
                    return param1;
                  }
                }
              }
            }
          }
          sc.field_h = rj.field_a;
          aj.a((byte) -127, ((al) this).e(0));
          return param1;
        } else {
          ((al) this).field_n = null;
          if (!param1) {
            if (var5 != 0) {
              L24: {
                if ((uk.field_a ^ -1) == -1) {
                  break L24;
                } else {
                  ((al) this).f(-24174);
                  if (var7 == 0) {
                    break L24;
                  } else {
                    L25: {
                      if (-1 == (ee.field_c ^ -1)) {
                        break L25;
                      } else {
                        if (var5 != 0) {
                          boolean discarded$6 = ((al) this).a(kf.field_b, param3, ee.field_c, param0, fg.field_a, (al) this, (byte) 127);
                          break L25;
                        } else {
                          break L25;
                        }
                      }
                    }
                    L26: {
                      if ((uk.field_a ^ -1) == -1) {
                        break L26;
                      } else {
                        L27: {
                          if (!((al) this).a((al) this, wg.field_e, db.field_X, uk.field_a, 0, param0, param3)) {
                            break L27;
                          } else {
                            param1 = false;
                            if (var7 == 0) {
                              break L26;
                            } else {
                              break L27;
                            }
                          }
                        }
                        if (var5 == 0) {
                          break L26;
                        } else {
                          ((al) this).f(-24174);
                          break L26;
                        }
                      }
                    }
                    if (0 != rj.field_a) {
                      break L24;
                    } else {
                      if ((sc.field_h ^ -1) != -1) {
                        ((al) this).a((al) this, false, fg.field_a, param3, kf.field_b, param0);
                        var17 = rf.field_e;
                        if (var17 != null) {
                          L28: {
                            if (var17.field_l instanceof n) {
                              ((n) (Object) var17.field_l).a(var17, (mc) null, 21277);
                              break L28;
                            } else {
                              break L28;
                            }
                          }
                          rf.field_e = null;
                          break L24;
                        } else {
                          break L24;
                        }
                      } else {
                        sc.field_h = rj.field_a;
                        aj.a((byte) -127, ((al) this).e(0));
                        return param1;
                      }
                    }
                  }
                }
              }
              sc.field_h = rj.field_a;
              aj.a((byte) -127, ((al) this).e(0));
              return param1;
            } else {
              sc.field_h = rj.field_a;
              aj.a((byte) -127, ((al) this).e(0));
              return param1;
            }
          } else {
            L29: {
              if (-1 == (ee.field_c ^ -1)) {
                break L29;
              } else {
                if (var5 != 0) {
                  boolean discarded$7 = ((al) this).a(kf.field_b, param3, ee.field_c, param0, fg.field_a, (al) this, (byte) 127);
                  break L29;
                } else {
                  break L29;
                }
              }
            }
            L30: {
              if ((uk.field_a ^ -1) == -1) {
                break L30;
              } else {
                L31: {
                  if (!((al) this).a((al) this, wg.field_e, db.field_X, uk.field_a, 0, param0, param3)) {
                    break L31;
                  } else {
                    param1 = false;
                    if (var7 == 0) {
                      break L30;
                    } else {
                      break L31;
                    }
                  }
                }
                if (var5 == 0) {
                  break L30;
                } else {
                  ((al) this).f(-24174);
                  break L30;
                }
              }
            }
            L32: {
              if (0 != rj.field_a) {
                break L32;
              } else {
                if ((sc.field_h ^ -1) != -1) {
                  ((al) this).a((al) this, false, fg.field_a, param3, kf.field_b, param0);
                  var8 = rf.field_e;
                  if (var8 != null) {
                    L33: {
                      if (var8.field_l instanceof n) {
                        ((n) (Object) var8.field_l).a(var8, (mc) null, 21277);
                        break L33;
                      } else {
                        break L33;
                      }
                    }
                    rf.field_e = null;
                    break L32;
                  } else {
                    break L32;
                  }
                } else {
                  sc.field_h = rj.field_a;
                  aj.a((byte) -127, ((al) this).e(0));
                  return param1;
                }
              }
            }
            sc.field_h = rj.field_a;
            aj.a((byte) -127, ((al) this).e(0));
            return param1;
          }
        }
    }

    final boolean a(byte param0, int param1, StringBuilder param2, Hashtable param3) {
        if (param0 >= 114) {
          if (!param3.containsKey(this)) {
            Object discarded$4 = param3.put(this, this);
            return true;
          } else {
            StringBuilder discarded$5 = param2.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
            return false;
          }
        } else {
          return false;
        }
    }

    boolean h(int param0) {
        if (param0 >= -83) {
            int discarded$0 = ((al) this).c((byte) 69);
            return false;
        }
        return false;
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, al param5, byte param6) {
        if (param6 != 127) {
            return true;
        }
        return false;
    }

    final boolean a(int param0, int param1, int param2, boolean param3, int param4) {
        int stackIn_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_17_0 = 0;
        if (!param3) {
          if (param0 + ((al) this).field_p <= param2) {
            if (param4 < param1 - -((al) this).field_m) {
              return false;
            } else {
              L0: {
                L1: {
                  if (((al) this).field_p + param0 - -((al) this).field_x <= param2) {
                    break L1;
                  } else {
                    if (param1 + ((al) this).field_m + ((al) this).field_u <= param4) {
                      break L1;
                    } else {
                      stackOut_16_0 = 1;
                      stackIn_18_0 = stackOut_16_0;
                      break L0;
                    }
                  }
                }
                stackOut_17_0 = 0;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              }
              return stackIn_18_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          ((al) this).field_A = -82;
          if (param0 + ((al) this).field_p <= param2) {
            if (param4 >= param1 - -((al) this).field_m) {
              if (((al) this).field_p + param0 - -((al) this).field_x > param2) {
                if (param1 + ((al) this).field_m + ((al) this).field_u <= param4) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    void a(int param0, int param1, byte param2, al param3) {
        int var5 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        if (param2 == -124) {
          var5 = ((al) this).a(param1, param0, kf.field_b, false, fg.field_a) ? 1 : 0;
          if (var5 != (((al) this).field_q ? 1 : 0)) {
            L0: {
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (var5 == 0) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L0;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L0;
              }
            }
            ((al) this).field_q = stackIn_7_1 != 0;
            if (((al) this).field_l != null) {
              if (!(((al) this).field_l instanceof vc)) {
                return;
              } else {
                ((vc) (Object) ((al) this).field_l).a(-11809, (al) this, var5 != 0);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void a(int param0, StringBuilder param1, int param2, Hashtable param3) {
        int var6 = 0;
        StringBuilder var7 = null;
        StringBuilder var8 = null;
        StringBuilder var9 = null;
        StringBuilder var10 = null;
        L0: {
          var6 = TrackController.field_F ? 1 : 0;
          StringBuilder discarded$30 = param1.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(((al) this).field_p).append(",").append(((al) this).field_m).append(" ").append(((al) this).field_x).append("x").append(((al) this).field_u);
          if (((al) this).field_s != null) {
            StringBuilder discarded$31 = param1.append(" text=\"").append(((al) this).field_s).append(34);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (((al) this).field_q) {
            StringBuilder discarded$32 = param1.append(" mouseover");
            break L1;
          } else {
            break L1;
          }
        }
        if (((al) this).h(-113)) {
          StringBuilder discarded$33 = param1.append(" focused");
          if (null != ((al) this).field_y) {
            StringBuilder discarded$34 = param1.append(" renderer=");
            if (((al) this).field_y instanceof al) {
              L2: {
                var9 = ((al) this).a(false, param3, param1, 1 + param2);
                if (param0 == 34) {
                  break L2;
                } else {
                  field_t = null;
                  break L2;
                }
              }
              if (((al) this).field_l != null) {
                L3: {
                  StringBuilder discarded$35 = var9.append(" listener=");
                  if (((al) this).field_l instanceof al) {
                    param1 = ((al) this).a(false, param3, var9, 1 + param2);
                    break L3;
                  } else {
                    StringBuilder discarded$36 = var9.append(((al) this).field_l);
                    param1 = ((al) this).a(false, param3, var9, 1 + param2);
                    break L3;
                  }
                }
                return;
              } else {
                return;
              }
            } else {
              StringBuilder discarded$37 = param1.append(((al) this).field_y);
              if (var6 == 0) {
                if (param0 == 34) {
                  if (((al) this).field_l != null) {
                    StringBuilder discarded$38 = param1.append(" listener=");
                    if (((al) this).field_l instanceof al) {
                      param1 = ((al) this).a(false, param3, param1, 1 + param2);
                      return;
                    } else {
                      StringBuilder discarded$39 = param1.append(((al) this).field_l);
                      if (var6 == 0) {
                        return;
                      } else {
                        param1 = ((al) this).a(false, param3, param1, 1 + param2);
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  field_t = null;
                  if (((al) this).field_l != null) {
                    L4: {
                      StringBuilder discarded$40 = param1.append(" listener=");
                      if (((al) this).field_l instanceof al) {
                        param1 = ((al) this).a(false, param3, param1, 1 + param2);
                        break L4;
                      } else {
                        StringBuilder discarded$41 = param1.append(((al) this).field_l);
                        if (var6 == 0) {
                          break L4;
                        } else {
                          param1 = ((al) this).a(false, param3, param1, 1 + param2);
                          break L4;
                        }
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                L5: {
                  var10 = ((al) this).a(false, param3, param1, 1 + param2);
                  if (param0 == 34) {
                    break L5;
                  } else {
                    field_t = null;
                    break L5;
                  }
                }
                if (((al) this).field_l != null) {
                  L6: {
                    StringBuilder discarded$42 = var10.append(" listener=");
                    if (((al) this).field_l instanceof al) {
                      param1 = ((al) this).a(false, param3, var10, 1 + param2);
                      break L6;
                    } else {
                      StringBuilder discarded$43 = var10.append(((al) this).field_l);
                      param1 = ((al) this).a(false, param3, var10, 1 + param2);
                      break L6;
                    }
                  }
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            if (param0 != 34) {
              field_t = null;
              if (((al) this).field_l == null) {
                return;
              } else {
                L7: {
                  StringBuilder discarded$44 = param1.append(" listener=");
                  if (((al) this).field_l instanceof al) {
                    param1 = ((al) this).a(false, param3, param1, 1 + param2);
                    break L7;
                  } else {
                    StringBuilder discarded$45 = param1.append(((al) this).field_l);
                    if (var6 == 0) {
                      break L7;
                    } else {
                      param1 = ((al) this).a(false, param3, param1, 1 + param2);
                      break L7;
                    }
                  }
                }
                return;
              }
            } else {
              if (((al) this).field_l == null) {
                return;
              } else {
                L8: {
                  StringBuilder discarded$46 = param1.append(" listener=");
                  if (((al) this).field_l instanceof al) {
                    param1 = ((al) this).a(false, param3, param1, 1 + param2);
                    break L8;
                  } else {
                    StringBuilder discarded$47 = param1.append(((al) this).field_l);
                    if (var6 == 0) {
                      break L8;
                    } else {
                      param1 = ((al) this).a(false, param3, param1, 1 + param2);
                      break L8;
                    }
                  }
                }
                return;
              }
            }
          }
        } else {
          if (null != ((al) this).field_y) {
            StringBuilder discarded$48 = param1.append(" renderer=");
            if (((al) this).field_y instanceof al) {
              L9: {
                var7 = ((al) this).a(false, param3, param1, 1 + param2);
                if (param0 == 34) {
                  break L9;
                } else {
                  field_t = null;
                  break L9;
                }
              }
              if (((al) this).field_l == null) {
                return;
              } else {
                L10: {
                  StringBuilder discarded$49 = var7.append(" listener=");
                  if (((al) this).field_l instanceof al) {
                    param1 = ((al) this).a(false, param3, var7, 1 + param2);
                    break L10;
                  } else {
                    StringBuilder discarded$50 = var7.append(((al) this).field_l);
                    param1 = ((al) this).a(false, param3, var7, 1 + param2);
                    break L10;
                  }
                }
                return;
              }
            } else {
              StringBuilder discarded$51 = param1.append(((al) this).field_y);
              if (var6 == 0) {
                if (param0 == 34) {
                  if (((al) this).field_l != null) {
                    StringBuilder discarded$52 = param1.append(" listener=");
                    if (!(((al) this).field_l instanceof al)) {
                      StringBuilder discarded$53 = param1.append(((al) this).field_l);
                      if (var6 != 0) {
                        param1 = ((al) this).a(false, param3, param1, 1 + param2);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      param1 = ((al) this).a(false, param3, param1, 1 + param2);
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  field_t = null;
                  if (((al) this).field_l == null) {
                    return;
                  } else {
                    L11: {
                      StringBuilder discarded$54 = param1.append(" listener=");
                      if (((al) this).field_l instanceof al) {
                        param1 = ((al) this).a(false, param3, param1, 1 + param2);
                        break L11;
                      } else {
                        StringBuilder discarded$55 = param1.append(((al) this).field_l);
                        if (var6 == 0) {
                          break L11;
                        } else {
                          param1 = ((al) this).a(false, param3, param1, 1 + param2);
                          break L11;
                        }
                      }
                    }
                    return;
                  }
                }
              } else {
                L12: {
                  var8 = ((al) this).a(false, param3, param1, 1 + param2);
                  if (param0 == 34) {
                    break L12;
                  } else {
                    field_t = null;
                    break L12;
                  }
                }
                if (((al) this).field_l == null) {
                  return;
                } else {
                  L13: {
                    StringBuilder discarded$56 = var8.append(" listener=");
                    if (((al) this).field_l instanceof al) {
                      param1 = ((al) this).a(false, param3, var8, 1 + param2);
                      break L13;
                    } else {
                      StringBuilder discarded$57 = var8.append(((al) this).field_l);
                      param1 = ((al) this).a(false, param3, var8, 1 + param2);
                      break L13;
                    }
                  }
                  return;
                }
              }
            }
          } else {
            L14: {
              if (param0 == 34) {
                break L14;
              } else {
                field_t = null;
                break L14;
              }
            }
            if (((al) this).field_l == null) {
              return;
            } else {
              L15: {
                StringBuilder discarded$58 = param1.append(" listener=");
                if (((al) this).field_l instanceof al) {
                  param1 = ((al) this).a(false, param3, param1, 1 + param2);
                  break L15;
                } else {
                  StringBuilder discarded$59 = param1.append(((al) this).field_l);
                  if (var6 == 0) {
                    break L15;
                  } else {
                    param1 = ((al) this).a(false, param3, param1, 1 + param2);
                    break L15;
                  }
                }
              }
              return;
            }
          }
        }
    }

    final boolean a(char param0, int param1, int param2) {
        int var4 = 0;
        if (!((al) this).h(-122)) {
          var4 = param2;
          if (var4 == 80) {
            return ((al) this).a((byte) -123, (al) this);
          } else {
            if (param1 != 3931) {
              String discarded$4 = ((al) this).e(-29);
              return false;
            } else {
              return false;
            }
          }
        } else {
          if (!((al) this).a((byte) 78, param0, (al) this, param2)) {
            var4 = param2;
            if (var4 == 80) {
              return ((al) this).a((byte) -123, (al) this);
            } else {
              if (param1 == 3931) {
                return false;
              } else {
                String discarded$5 = ((al) this).e(-29);
                return false;
              }
            }
          } else {
            return true;
          }
        }
    }

    void a(al param0, boolean param1, int param2, int param3, int param4, int param5) {
        ((al) this).field_r = 0;
        if (!param1) {
            return;
        }
        ((al) this).field_o = 76;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8, int param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        Object var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        var16 = TrackController.field_F ? 1 : 0;
        if (param7 != -1) {
          var17 = null;
          byte[] discarded$1 = al.a(103, (byte[]) null);
          L0: while (true) {
            param1--;
            if (-1 >= (param1 ^ -1)) {
              var20 = param6;
              var18 = var20;
              var10 = var18;
              var11 = param8;
              var12 = param2;
              var13 = param9;
              var14 = param3;
              var15 = 8355711 & var20[var11] >> -1365299103;
              var10[var11] = var15 + ((tc.a(var14, 33501438) >> 204378737) + tc.a(65280, var13 >> -804317111)) + tc.a(16711680, var12 >> 902227937);
              param8++;
              param9 = param9 + param4;
              param2 = param2 + param5;
              param3 = param3 + param0;
              if (var16 == 0) {
                continue L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          L1: while (true) {
            param1--;
            if (-1 >= (param1 ^ -1)) {
              var19 = param6;
              var18 = var19;
              var10 = var18;
              var11 = param8;
              var12 = param2;
              var13 = param9;
              var14 = param3;
              var15 = 8355711 & var19[var11] >> -1365299103;
              var10[var11] = var15 + ((tc.a(var14, 33501438) >> 204378737) + tc.a(65280, var13 >> -804317111)) + tc.a(16711680, var12 >> 902227937);
              param8++;
              param9 = param9 + param4;
              param2 = param2 + param5;
              param3 = param3 + param0;
              if (var16 == 0) {
                continue L1;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        var6 = TrackController.field_F ? 1 : 0;
        var4 = ((al) this).c((byte) -14);
        var5_int = param0;
        L0: while (true) {
          L1: {
            if (var5_int > var4) {
              break L1;
            } else {
              ((al) this).a(var5_int, param1, param2, 29221);
              var5_int++;
              if (var6 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            var5 = qg.b(32);
            if (var5 != null) {
              lb.field_O.a((byte) -86, r.field_j, aj.field_m, var5);
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
    }

    public final String toString() {
        return ((al) this).a(false, new Hashtable(), new StringBuilder(), 0).toString();
    }

    boolean a(al param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        Object var9 = null;
        if (param4 != 0) {
          var9 = null;
          byte[] discarded$4 = al.a(85, (byte[]) null);
          if (!((al) this).a(param5, param6, param2, false, param1)) {
            return false;
          } else {
            ((al) this).field_r = param3;
            return false;
          }
        } else {
          L0: {
            if (((al) this).a(param5, param6, param2, false, param1)) {
              ((al) this).field_r = param3;
              break L0;
            } else {
              break L0;
            }
          }
          return false;
        }
    }

    StringBuilder a(boolean param0, Hashtable param1, StringBuilder param2, int param3) {
        Object var6 = null;
        if (!((al) this).a((byte) 121, param3, param2, param1)) {
          if (param0) {
            var6 = null;
            boolean discarded$4 = ((al) this).a((byte) -107, 'ﾔ', (al) null, 124);
            return param2;
          } else {
            return param2;
          }
        } else {
          ((al) this).a(34, param2, param3, param1);
          if (!param0) {
            return param2;
          } else {
            var6 = null;
            boolean discarded$5 = ((al) this).a((byte) -107, 'ﾔ', (al) null, 124);
            return param2;
          }
        }
    }

    String e(int param0) {
        String stackIn_4_0 = null;
        String stackIn_8_0 = null;
        String stackOut_7_0 = null;
        Object stackOut_6_0 = null;
        String stackOut_3_0 = null;
        Object stackOut_2_0 = null;
        if (param0 != 0) {
          L0: {
            ((al) this).field_m = 111;
            if (((al) this).field_q) {
              stackOut_7_0 = ((al) this).field_n;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = null;
              stackIn_8_0 = (String) (Object) stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (((al) this).field_q) {
              stackOut_3_0 = ((al) this).field_n;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = null;
              stackIn_4_0 = (String) (Object) stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    public static void d(int param0) {
        field_j = null;
        field_t = null;
        if (param0 > -30) {
          al.d(17);
          field_w = null;
          field_v = null;
          field_z = null;
          field_i = null;
          return;
        } else {
          field_w = null;
          field_v = null;
          field_z = null;
          field_i = null;
          return;
        }
    }

    boolean a(byte param0, al param1) {
        if (param0 >= -104) {
            ((al) this).field_u = 109;
            return false;
        }
        return false;
    }

    int c(byte param0) {
        if (param0 != -14) {
            return -70;
        }
        return 0;
    }

    boolean a(byte param0, char param1, al param2, int param3) {
        int var5 = 45 % ((17 - param0) / 51);
        return false;
    }

    protected al() {
        ((al) this).field_A = 0;
        ((al) this).field_o = 0;
    }

    al(String param0, t param1, tg param2) {
        dl var4 = null;
        ((al) this).field_A = 0;
        ((al) this).field_o = 0;
        ((al) this).field_s = param0;
        ((al) this).field_l = param2;
        ((al) this).field_y = param1;
        if (((al) this).field_y instanceof dl) {
            var4 = (dl) (Object) ((al) this).field_y;
            ((al) this).field_x = var4.a(false, (al) this);
            ((al) this).field_u = var4.a(89, (al) this);
        }
    }

    al(int param0, int param1, int param2, int param3, t param4, tg param5) {
        ((al) this).field_A = 0;
        ((al) this).field_o = 0;
        ((al) this).field_l = param5;
        ((al) this).field_m = param1;
        ((al) this).field_y = param4;
        ((al) this).field_p = param0;
        ((al) this).field_u = param3;
        ((al) this).field_x = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Go Back";
        field_i = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
