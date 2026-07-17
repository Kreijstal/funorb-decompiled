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
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5_ref_byte__ = null;
        int var5 = 0;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Object stackIn_7_0 = null;
        byte[] stackIn_10_0 = null;
        byte[] stackIn_25_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        Throwable decompiledCaughtException = null;
        byte[] stackOut_24_0 = null;
        byte[] stackOut_9_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        try {
          L0: {
            L1: {
              var2 = new be(param1);
              var3 = var2.h(16383);
              var4 = var2.e((byte) 113);
              if (0 > var4) {
                break L1;
              } else {
                L2: {
                  if (he.field_b == 0) {
                    break L2;
                  } else {
                    if (var4 <= he.field_b) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                if (param0 <= -115) {
                  if (var3 != 0) {
                    L3: {
                      var5 = var2.e((byte) 113);
                      if (0 > var5) {
                        break L3;
                      } else {
                        L4: {
                          if (he.field_b == 0) {
                            break L4;
                          } else {
                            if (he.field_b >= var5) {
                              break L4;
                            } else {
                              break L3;
                            }
                          }
                        }
                        L5: {
                          L6: {
                            var6 = new byte[var5];
                            if (1 == var3) {
                              break L6;
                            } else {
                              var7 = (Object) (Object) bd.field_b;
                              synchronized (var7) {
                                L7: {
                                  bd.field_b.a((byte) 28, var6, var2);
                                  break L7;
                                }
                              }
                              if (!TrackController.field_F) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          int discarded$2 = b.a(var6, var5, param1, var4, 9);
                          break L5;
                        }
                        stackOut_24_0 = (byte[]) var6;
                        stackIn_25_0 = stackOut_24_0;
                        break L0;
                      }
                    }
                    throw new RuntimeException();
                  } else {
                    var5_ref_byte__ = new byte[var4];
                    var2.a(96, var5_ref_byte__, 0, var4);
                    stackOut_9_0 = (byte[]) var5_ref_byte__;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  }
                } else {
                  stackOut_6_0 = null;
                  stackIn_7_0 = stackOut_6_0;
                  return (byte[]) (Object) stackIn_7_0;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var2_ref;
            stackOut_26_1 = new StringBuilder().append("al.AB(").append(param0).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L8;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 41);
        }
        return stackIn_25_0;
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
          if (param0 == 0) {
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
          if (param0 == 0) {
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
        var7 = TrackController.field_F ? 1 : 0;
        ((al) this).a(param3, param0, (byte) -124, (al) this);
        var5 = ((al) this).h(-96) ? 1 : 0;
        if (!param2) {
          L0: {
            if (param1) {
              L1: {
                if (ee.field_c == 0) {
                  break L1;
                } else {
                  if (var5 != 0) {
                    boolean discarded$4 = ((al) this).a(kf.field_b, param3, ee.field_c, param0, fg.field_a, (al) this, (byte) 127);
                    break L1;
                  } else {
                    L2: {
                      if (uk.field_a == 0) {
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
                              if (sc.field_h != 0) {
                                ((al) this).a((al) this, false, fg.field_a, param3, kf.field_b, param0);
                                var6 = rf.field_e;
                                if (var6 != null) {
                                  L5: {
                                    if (var6.field_l instanceof n) {
                                      ((n) (Object) var6.field_l).a(var6, (mc) null, 21277);
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
                        if (sc.field_h != 0) {
                          ((al) this).a((al) this, false, fg.field_a, param3, kf.field_b, param0);
                          var6 = rf.field_e;
                          if (var6 != null) {
                            L7: {
                              if (var6.field_l instanceof n) {
                                ((n) (Object) var6.field_l).a(var6, (mc) null, 21277);
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
                if (uk.field_a == 0) {
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
                        if (sc.field_h != 0) {
                          ((al) this).a((al) this, false, fg.field_a, param3, kf.field_b, param0);
                          var6 = rf.field_e;
                          if (var6 != null) {
                            L11: {
                              if (var6.field_l instanceof n) {
                                ((n) (Object) var6.field_l).a(var6, (mc) null, 21277);
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
                if (sc.field_h != 0) {
                  ((al) this).a((al) this, false, fg.field_a, param3, kf.field_b, param0);
                  var6 = rf.field_e;
                  if (var6 != null) {
                    L12: {
                      if (var6.field_l instanceof n) {
                        ((n) (Object) var6.field_l).a(var6, (mc) null, 21277);
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
                if (uk.field_a == 0) {
                  break L0;
                } else {
                  ((al) this).f(-24174);
                  if (var7 == 0) {
                    break L0;
                  } else {
                    L13: {
                      if (ee.field_c == 0) {
                        break L13;
                      } else {
                        if (var5 != 0) {
                          boolean discarded$5 = ((al) this).a(kf.field_b, param3, ee.field_c, param0, fg.field_a, (al) this, (byte) 127);
                          break L13;
                        } else {
                          L14: {
                            if (uk.field_a == 0) {
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
                              if (sc.field_h != 0) {
                                ((al) this).a((al) this, false, fg.field_a, param3, kf.field_b, param0);
                                var6 = rf.field_e;
                                if (var6 != null) {
                                  L17: {
                                    if (var6.field_l instanceof n) {
                                      ((n) (Object) var6.field_l).a(var6, (mc) null, 21277);
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
                      if (uk.field_a == 0) {
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
                              if (sc.field_h != 0) {
                                ((al) this).a((al) this, false, fg.field_a, param3, kf.field_b, param0);
                                var6 = rf.field_e;
                                if (var6 != null) {
                                  L21: {
                                    if (var6.field_l instanceof n) {
                                      ((n) (Object) var6.field_l).a(var6, (mc) null, 21277);
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
                        if (sc.field_h != 0) {
                          ((al) this).a((al) this, false, fg.field_a, param3, kf.field_b, param0);
                          var6 = rf.field_e;
                          if (var6 != null) {
                            L23: {
                              if (var6.field_l instanceof n) {
                                ((n) (Object) var6.field_l).a(var6, (mc) null, 21277);
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
                if (uk.field_a == 0) {
                  break L24;
                } else {
                  ((al) this).f(-24174);
                  if (var7 == 0) {
                    break L24;
                  } else {
                    L25: {
                      if (ee.field_c == 0) {
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
                      if (uk.field_a == 0) {
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
                      if (sc.field_h != 0) {
                        ((al) this).a((al) this, false, fg.field_a, param3, kf.field_b, param0);
                        var6 = rf.field_e;
                        if (var6 != null) {
                          L28: {
                            if (var6.field_l instanceof n) {
                              ((n) (Object) var6.field_l).a(var6, (mc) null, 21277);
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
              if (ee.field_c == 0) {
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
              if (uk.field_a == 0) {
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
                if (sc.field_h != 0) {
                  ((al) this).a((al) this, false, fg.field_a, param3, kf.field_b, param0);
                  var6 = rf.field_e;
                  if (var6 != null) {
                    L33: {
                      if (var6.field_l instanceof n) {
                        ((n) (Object) var6.field_l).a(var6, (mc) null, 21277);
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
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (param0 >= 114) {
              if (param3.containsKey(this)) {
                StringBuilder discarded$4 = param2.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                Object discarded$5 = param3.put(this, this);
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("al.VA(").append(param0).append(44).append(param1).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          L2: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_7_0 != 0;
    }

    boolean h(int param0) {
        if (param0 >= -83) {
            int discarded$0 = ((al) this).c((byte) 69);
            return false;
        }
        return false;
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, al param5, byte param6) {
        RuntimeException var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param6 == 127) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var8;
            stackOut_5_1 = new StringBuilder().append("al.PA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param5 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param6 + 41);
        }
        return stackIn_4_0 != 0;
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
        int var5_int = 0;
        RuntimeException var5 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (param2 == -124) {
              L1: {
                var5_int = ((al) this).a(param1, param0, kf.field_b, false, fg.field_a) ? 1 : 0;
                if (var5_int != (((al) this).field_q ? 1 : 0)) {
                  L2: {
                    stackOut_4_0 = this;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (var5_int == 0) {
                      stackOut_6_0 = this;
                      stackOut_6_1 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      break L2;
                    } else {
                      stackOut_5_0 = this;
                      stackOut_5_1 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      break L2;
                    }
                  }
                  ((al) this).field_q = stackIn_7_1 != 0;
                  if (((al) this).field_l == null) {
                    break L1;
                  } else {
                    if (((al) this).field_l instanceof vc) {
                      ((vc) (Object) ((al) this).field_l).a(-11809, (al) this, var5_int != 0);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("al.EA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
    }

    final void a(int param0, StringBuilder param1, int param2, Hashtable param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var6 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              StringBuilder discarded$8 = param1.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(((al) this).field_p).append(",").append(((al) this).field_m).append(" ").append(((al) this).field_x).append("x").append(((al) this).field_u);
              if (((al) this).field_s != null) {
                StringBuilder discarded$9 = param1.append(" text=\"").append(((al) this).field_s).append(34);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((al) this).field_q) {
                StringBuilder discarded$10 = param1.append(" mouseover");
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!((al) this).h(-113)) {
                break L3;
              } else {
                StringBuilder discarded$11 = param1.append(" focused");
                break L3;
              }
            }
            L4: {
              if (null != ((al) this).field_y) {
                L5: {
                  StringBuilder discarded$12 = param1.append(" renderer=");
                  if (((al) this).field_y instanceof al) {
                    break L5;
                  } else {
                    StringBuilder discarded$13 = param1.append(((al) this).field_y);
                    if (var6 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                param1 = ((al) this).a(false, param3, param1, 1 + param2);
                break L4;
              } else {
                break L4;
              }
            }
            L6: {
              if (param0 == 34) {
                break L6;
              } else {
                field_t = null;
                break L6;
              }
            }
            L7: {
              if (((al) this).field_l == null) {
                break L7;
              } else {
                L8: {
                  StringBuilder discarded$14 = param1.append(" listener=");
                  if (((al) this).field_l instanceof al) {
                    break L8;
                  } else {
                    StringBuilder discarded$15 = param1.append(((al) this).field_l);
                    if (var6 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                param1 = ((al) this).a(false, param3, param1, 1 + param2);
                break L7;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var5;
            stackOut_23_1 = new StringBuilder().append("al.DB(").append(param0).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          L10: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(44).append(param2).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param3 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L10;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L10;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 41);
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
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((al) this).field_r = 0;
              if (!param1) {
                break L1;
              } else {
                ((al) this).field_o = 76;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("al.GB(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8, int param9) {
        RuntimeException var10 = null;
        int[] var10_array = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        Object var17 = null;
        int[] var18 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var16 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param7 == -1) {
                break L1;
              } else {
                var17 = null;
                byte[] discarded$1 = al.a(103, (byte[]) null);
                break L1;
              }
            }
            L2: while (true) {
              param1--;
              if (param1 < 0) {
                break L0;
              } else {
                var18 = param6;
                var10_array = var18;
                var11 = param8;
                var12 = param2;
                var13 = param9;
                var14 = param3;
                var15 = 8355711 & var18[var11] >> 1;
                var10_array[var11] = var15 + ((tc.a(var14, 33501438) >> 17) + tc.a(65280, var13 >> 9)) + tc.a(16711680, var12 >> 1);
                param8++;
                param9 = param9 + param4;
                param2 = param2 + param5;
                param3 = param3 + param0;
                if (var16 == 0) {
                  continue L2;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var10 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var10;
            stackOut_9_1 = new StringBuilder().append("al.FB(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param6 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param7 + 44 + param8 + 44 + param9 + 41);
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
        RuntimeException var8 = null;
        Object var9 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param4 == 0) {
                break L1;
              } else {
                var9 = null;
                byte[] discarded$2 = al.a(85, (byte[]) null);
                break L1;
              }
            }
            if (((al) this).a(param5, param6, param2, false, param1)) {
              ((al) this).field_r = param3;
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var8;
            stackOut_6_1 = new StringBuilder().append("al.R(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_5_0 != 0;
    }

    StringBuilder a(boolean param0, Hashtable param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        Object var6 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (!((al) this).a((byte) 121, param3, param2, param1)) {
                break L1;
              } else {
                ((al) this).a(34, param2, param3, param1);
                break L1;
              }
            }
            L2: {
              if (!param0) {
                break L2;
              } else {
                var6 = null;
                boolean discarded$2 = ((al) this).a((byte) -107, 'ﾔ', (al) null, 124);
                break L2;
              }
            }
            stackOut_4_0 = (StringBuilder) param2;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("al.BB(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param3 + 41);
        }
        return stackIn_5_0;
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
        al.d(17);
        field_w = null;
        field_v = null;
        field_z = null;
        field_i = null;
    }

    boolean a(byte param0, al param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param0 < -104) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              ((al) this).field_u = 109;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("al.QA(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0 != 0;
    }

    int c(byte param0) {
        if (param0 != -14) {
            return -70;
        }
        return 0;
    }

    boolean a(byte param0, char param1, al param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var5_int = 45 % ((17 - param0) / 51);
            stackOut_0_0 = 0;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5;
            stackOut_2_1 = new StringBuilder().append("al.GA(").append(param0).append(44).append(param1).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param3 + 41);
        }
        return stackIn_1_0 != 0;
    }

    protected al() {
        ((al) this).field_A = 0;
        ((al) this).field_o = 0;
    }

    al(String param0, t param1, tg param2) {
        RuntimeException runtimeException = null;
        dl var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        ((al) this).field_A = 0;
        ((al) this).field_o = 0;
        try {
          L0: {
            L1: {
              ((al) this).field_s = param0;
              ((al) this).field_l = param2;
              ((al) this).field_y = param1;
              if (!(((al) this).field_y instanceof dl)) {
                break L1;
              } else {
                var4 = (dl) (Object) ((al) this).field_y;
                ((al) this).field_x = var4.a(false, (al) this);
                ((al) this).field_u = var4.a(89, (al) this);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("al.<init>(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    al(int param0, int param1, int param2, int param3, t param4, tg param5) {
        ((al) this).field_A = 0;
        ((al) this).field_o = 0;
        try {
            ((al) this).field_l = param5;
            ((al) this).field_m = param1;
            ((al) this).field_y = param4;
            ((al) this).field_p = param0;
            ((al) this).field_u = param3;
            ((al) this).field_x = param2;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "al.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Go Back";
        field_i = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
