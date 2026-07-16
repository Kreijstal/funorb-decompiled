/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ga extends le {
    static int field_q;
    int field_k;
    int field_p;
    int field_j;
    sk field_v;
    int field_m;
    int field_n;
    static int field_r;
    vg field_t;
    io field_h;
    String field_o;
    boolean field_l;
    String field_s;
    int field_u;
    static boolean field_w;
    int field_i;

    void c(byte param0) {
        if (param0 != 57) {
            boolean discarded$0 = ((ga) this).a((ga) null, -6, 18, 10, -10, false, 55);
        }
    }

    boolean a(ga param0, int param1, int param2, int param3, int param4, boolean param5, int param6) {
        if (!param5) {
            ((ga) this).field_s = null;
            return false;
        }
        return false;
    }

    boolean a(byte param0, ga param1) {
        if (param0 < 67) {
            ((ga) this).field_l = true;
            return false;
        }
        return false;
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ga param6) {
        if (!((ga) this).b(param3, 21224, param2, param4, param0)) {
          if (param1 != 1) {
            boolean discarded$4 = ((ga) this).a((ga) null, 64, -30, -110, -58, false, 34);
            return false;
          } else {
            return false;
          }
        } else {
          ((ga) this).field_m = param5;
          if (param1 == 1) {
            return false;
          } else {
            boolean discarded$5 = ((ga) this).a((ga) null, 64, -30, -110, -58, false, 34);
            return false;
          }
        }
    }

    final void a(Hashtable param0, int param1, int param2, StringBuilder param3) {
        int var6 = 0;
        L0: {
          var6 = ZombieDawn.field_J;
          StringBuilder discarded$23 = param3.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(((ga) this).field_k).append(",").append(((ga) this).field_j).append(" ").append(((ga) this).field_i).append("x").append(((ga) this).field_n);
          if (null != ((ga) this).field_o) {
            StringBuilder discarded$24 = param3.append(" text=\"").append(((ga) this).field_o).append(34);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (((ga) this).field_l) {
            StringBuilder discarded$25 = param3.append(" mouseover");
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (((ga) this).e(-17741)) {
            StringBuilder discarded$26 = param3.append(" focused");
            break L2;
          } else {
            break L2;
          }
        }
        if (null != ((ga) this).field_h) {
          StringBuilder discarded$27 = param3.append(" renderer=");
          if (((ga) this).field_h instanceof ga) {
            param3 = ((ga) this).a(param0, param3, true, param1 + 1);
            if (var6 == 0) {
              if (((ga) this).field_v != null) {
                L3: {
                  StringBuilder discarded$28 = param3.append(" listener=");
                  if (!(((ga) this).field_v instanceof ga)) {
                    break L3;
                  } else {
                    param3 = ((ga) this).a(param0, param3, true, param1 - -1);
                    if (var6 == 0) {
                      if (param2 <= 64) {
                        String discarded$29 = ((ga) this).d(37);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  StringBuilder discarded$30 = param3.append(((ga) this).field_v);
                  if (param2 > 64) {
                    break L4;
                  } else {
                    String discarded$31 = ((ga) this).d(37);
                    break L4;
                  }
                }
                return;
              } else {
                L5: {
                  if (param2 > 64) {
                    break L5;
                  } else {
                    String discarded$32 = ((ga) this).d(37);
                    break L5;
                  }
                }
                return;
              }
            } else {
              L6: {
                StringBuilder discarded$33 = param3.append(((ga) this).field_h);
                if (((ga) this).field_v != null) {
                  L7: {
                    StringBuilder discarded$34 = param3.append(" listener=");
                    if (!(((ga) this).field_v instanceof ga)) {
                      break L7;
                    } else {
                      param3 = ((ga) this).a(param0, param3, true, param1 - -1);
                      break L7;
                    }
                  }
                  StringBuilder discarded$35 = param3.append(((ga) this).field_v);
                  break L6;
                } else {
                  break L6;
                }
              }
              L8: {
                if (param2 > 64) {
                  break L8;
                } else {
                  String discarded$36 = ((ga) this).d(37);
                  break L8;
                }
              }
              return;
            }
          } else {
            L9: {
              StringBuilder discarded$37 = param3.append(((ga) this).field_h);
              if (((ga) this).field_v != null) {
                L10: {
                  StringBuilder discarded$38 = param3.append(" listener=");
                  if (!(((ga) this).field_v instanceof ga)) {
                    break L10;
                  } else {
                    param3 = ((ga) this).a(param0, param3, true, param1 - -1);
                    if (var6 == 0) {
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
                StringBuilder discarded$39 = param3.append(((ga) this).field_v);
                break L9;
              } else {
                break L9;
              }
            }
            L11: {
              if (param2 > 64) {
                break L11;
              } else {
                String discarded$40 = ((ga) this).d(37);
                break L11;
              }
            }
            return;
          }
        } else {
          if (((ga) this).field_v != null) {
            L12: {
              StringBuilder discarded$41 = param3.append(" listener=");
              if (!(((ga) this).field_v instanceof ga)) {
                break L12;
              } else {
                param3 = ((ga) this).a(param0, param3, true, param1 - -1);
                if (var6 == 0) {
                  if (param2 <= 64) {
                    String discarded$42 = ((ga) this).d(37);
                    return;
                  } else {
                    return;
                  }
                } else {
                  break L12;
                }
              }
            }
            L13: {
              StringBuilder discarded$43 = param3.append(((ga) this).field_v);
              if (param2 > 64) {
                break L13;
              } else {
                String discarded$44 = ((ga) this).d(37);
                break L13;
              }
            }
            return;
          } else {
            L14: {
              if (param2 > 64) {
                break L14;
              } else {
                String discarded$45 = ((ga) this).d(37);
                break L14;
              }
            }
            return;
          }
        }
    }

    final boolean a(int param0, int param1, boolean param2, boolean param3) {
        int var5 = 0;
        ij var6 = null;
        int var7 = 0;
        var7 = ZombieDawn.field_J;
        ((ga) this).a((ga) this, (byte) 108, param0, param1);
        if (!param3) {
          L0: {
            boolean discarded$3 = ((ga) this).a(76, 88, -58, 36, -103, -17, (ga) null);
            var5 = ((ga) this).e(-17741) ? 1 : 0;
            if (param2) {
              break L0;
            } else {
              if (var5 != 0) {
                if (0 != ci.field_d) {
                  ((ga) this).c((byte) 57);
                  if (var7 != 0) {
                    break L0;
                  } else {
                    he.field_b = kc.field_R;
                    og.a(((ga) this).d(-58), 0);
                    return param2;
                  }
                } else {
                  he.field_b = kc.field_R;
                  og.a(((ga) this).d(-58), 0);
                  return param2;
                }
              } else {
                he.field_b = kc.field_R;
                og.a(((ga) this).d(-58), 0);
                return param2;
              }
            }
          }
          L1: {
            if (id.field_I == 0) {
              break L1;
            } else {
              if (var5 != 0) {
                boolean discarded$4 = ((ga) this).a((ga) this, id.field_I, param1, ha.field_b, param0, true, ei.field_K);
                break L1;
              } else {
                L2: {
                  if (ci.field_d == 0) {
                    break L2;
                  } else {
                    L3: {
                      if (((ga) this).a(nc.field_j, 1, param0, hp.field_D, param1, ci.field_d, (ga) this)) {
                        break L3;
                      } else {
                        if (var5 == 0) {
                          break L2;
                        } else {
                          ((ga) this).c((byte) 57);
                          if (var7 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    param2 = false;
                    break L2;
                  }
                }
                if (kc.field_R == 0) {
                  if (0 != he.field_b) {
                    ((ga) this).a(param1, 112, ha.field_b, ei.field_K, param0, (ga) this);
                    var6 = np.field_H;
                    if (var6 != null) {
                      if (!(var6.field_v instanceof in)) {
                        np.field_H = null;
                        he.field_b = kc.field_R;
                        og.a(((ga) this).d(-58), 0);
                        return param2;
                      } else {
                        ((in) (Object) var6.field_v).a(-12156, (rd) null, var6);
                        np.field_H = null;
                        he.field_b = kc.field_R;
                        og.a(((ga) this).d(-58), 0);
                        return param2;
                      }
                    } else {
                      he.field_b = kc.field_R;
                      og.a(((ga) this).d(-58), 0);
                      return param2;
                    }
                  } else {
                    he.field_b = kc.field_R;
                    og.a(((ga) this).d(-58), 0);
                    return param2;
                  }
                } else {
                  he.field_b = kc.field_R;
                  og.a(((ga) this).d(-58), 0);
                  return param2;
                }
              }
            }
          }
          if (ci.field_d != 0) {
            if (((ga) this).a(nc.field_j, 1, param0, hp.field_D, param1, ci.field_d, (ga) this)) {
              param2 = false;
              if (kc.field_R == 0) {
                if (0 != he.field_b) {
                  ((ga) this).a(param1, 112, ha.field_b, ei.field_K, param0, (ga) this);
                  var6 = np.field_H;
                  if (var6 != null) {
                    if (!(var6.field_v instanceof in)) {
                      np.field_H = null;
                      he.field_b = kc.field_R;
                      og.a(((ga) this).d(-58), 0);
                      return param2;
                    } else {
                      ((in) (Object) var6.field_v).a(-12156, (rd) null, var6);
                      np.field_H = null;
                      he.field_b = kc.field_R;
                      og.a(((ga) this).d(-58), 0);
                      return param2;
                    }
                  } else {
                    he.field_b = kc.field_R;
                    og.a(((ga) this).d(-58), 0);
                    return param2;
                  }
                } else {
                  he.field_b = kc.field_R;
                  og.a(((ga) this).d(-58), 0);
                  return param2;
                }
              } else {
                he.field_b = kc.field_R;
                og.a(((ga) this).d(-58), 0);
                return param2;
              }
            } else {
              if (var5 != 0) {
                ((ga) this).c((byte) 57);
                if (var7 != 0) {
                  param2 = false;
                  if (kc.field_R == 0) {
                    if (0 != he.field_b) {
                      ((ga) this).a(param1, 112, ha.field_b, ei.field_K, param0, (ga) this);
                      var6 = np.field_H;
                      if (var6 != null) {
                        if (!(var6.field_v instanceof in)) {
                          np.field_H = null;
                          he.field_b = kc.field_R;
                          og.a(((ga) this).d(-58), 0);
                          return param2;
                        } else {
                          ((in) (Object) var6.field_v).a(-12156, (rd) null, var6);
                          np.field_H = null;
                          he.field_b = kc.field_R;
                          og.a(((ga) this).d(-58), 0);
                          return param2;
                        }
                      } else {
                        he.field_b = kc.field_R;
                        og.a(((ga) this).d(-58), 0);
                        return param2;
                      }
                    } else {
                      he.field_b = kc.field_R;
                      og.a(((ga) this).d(-58), 0);
                      return param2;
                    }
                  } else {
                    he.field_b = kc.field_R;
                    og.a(((ga) this).d(-58), 0);
                    return param2;
                  }
                } else {
                  if (kc.field_R == 0) {
                    if (0 != he.field_b) {
                      ((ga) this).a(param1, 112, ha.field_b, ei.field_K, param0, (ga) this);
                      var6 = np.field_H;
                      if (var6 != null) {
                        if (!(var6.field_v instanceof in)) {
                          np.field_H = null;
                          he.field_b = kc.field_R;
                          og.a(((ga) this).d(-58), 0);
                          return param2;
                        } else {
                          ((in) (Object) var6.field_v).a(-12156, (rd) null, var6);
                          np.field_H = null;
                          he.field_b = kc.field_R;
                          og.a(((ga) this).d(-58), 0);
                          return param2;
                        }
                      } else {
                        he.field_b = kc.field_R;
                        og.a(((ga) this).d(-58), 0);
                        return param2;
                      }
                    } else {
                      he.field_b = kc.field_R;
                      og.a(((ga) this).d(-58), 0);
                      return param2;
                    }
                  } else {
                    he.field_b = kc.field_R;
                    og.a(((ga) this).d(-58), 0);
                    return param2;
                  }
                }
              } else {
                if (kc.field_R == 0) {
                  if (0 != he.field_b) {
                    ((ga) this).a(param1, 112, ha.field_b, ei.field_K, param0, (ga) this);
                    var6 = np.field_H;
                    if (var6 != null) {
                      if (!(var6.field_v instanceof in)) {
                        np.field_H = null;
                        he.field_b = kc.field_R;
                        og.a(((ga) this).d(-58), 0);
                        return param2;
                      } else {
                        ((in) (Object) var6.field_v).a(-12156, (rd) null, var6);
                        np.field_H = null;
                        he.field_b = kc.field_R;
                        og.a(((ga) this).d(-58), 0);
                        return param2;
                      }
                    } else {
                      he.field_b = kc.field_R;
                      og.a(((ga) this).d(-58), 0);
                      return param2;
                    }
                  } else {
                    he.field_b = kc.field_R;
                    og.a(((ga) this).d(-58), 0);
                    return param2;
                  }
                } else {
                  he.field_b = kc.field_R;
                  og.a(((ga) this).d(-58), 0);
                  return param2;
                }
              }
            }
          } else {
            if (kc.field_R == 0) {
              if (0 != he.field_b) {
                ((ga) this).a(param1, 112, ha.field_b, ei.field_K, param0, (ga) this);
                var6 = np.field_H;
                if (var6 != null) {
                  if (!(var6.field_v instanceof in)) {
                    np.field_H = null;
                    he.field_b = kc.field_R;
                    og.a(((ga) this).d(-58), 0);
                    return param2;
                  } else {
                    ((in) (Object) var6.field_v).a(-12156, (rd) null, var6);
                    np.field_H = null;
                    he.field_b = kc.field_R;
                    og.a(((ga) this).d(-58), 0);
                    return param2;
                  }
                } else {
                  he.field_b = kc.field_R;
                  og.a(((ga) this).d(-58), 0);
                  return param2;
                }
              } else {
                he.field_b = kc.field_R;
                og.a(((ga) this).d(-58), 0);
                return param2;
              }
            } else {
              he.field_b = kc.field_R;
              og.a(((ga) this).d(-58), 0);
              return param2;
            }
          }
        } else {
          L4: {
            var5 = ((ga) this).e(-17741) ? 1 : 0;
            if (param2) {
              break L4;
            } else {
              if (var5 != 0) {
                if (0 != ci.field_d) {
                  ((ga) this).c((byte) 57);
                  if (var7 != 0) {
                    break L4;
                  } else {
                    he.field_b = kc.field_R;
                    og.a(((ga) this).d(-58), 0);
                    return param2;
                  }
                } else {
                  he.field_b = kc.field_R;
                  og.a(((ga) this).d(-58), 0);
                  return param2;
                }
              } else {
                he.field_b = kc.field_R;
                og.a(((ga) this).d(-58), 0);
                return param2;
              }
            }
          }
          L5: {
            if (id.field_I == 0) {
              break L5;
            } else {
              if (var5 != 0) {
                boolean discarded$5 = ((ga) this).a((ga) this, id.field_I, param1, ha.field_b, param0, true, ei.field_K);
                break L5;
              } else {
                L6: {
                  if (ci.field_d == 0) {
                    break L6;
                  } else {
                    L7: {
                      if (((ga) this).a(nc.field_j, 1, param0, hp.field_D, param1, ci.field_d, (ga) this)) {
                        break L7;
                      } else {
                        if (var5 == 0) {
                          break L6;
                        } else {
                          ((ga) this).c((byte) 57);
                          break L7;
                        }
                      }
                    }
                    param2 = false;
                    break L6;
                  }
                }
                if (kc.field_R == 0) {
                  if (0 == he.field_b) {
                    he.field_b = kc.field_R;
                    og.a(((ga) this).d(-58), 0);
                    return param2;
                  } else {
                    L8: {
                      ((ga) this).a(param1, 112, ha.field_b, ei.field_K, param0, (ga) this);
                      var6 = np.field_H;
                      if (var6 != null) {
                        if (!(var6.field_v instanceof in)) {
                          np.field_H = null;
                          break L8;
                        } else {
                          ((in) (Object) var6.field_v).a(-12156, (rd) null, var6);
                          np.field_H = null;
                          break L8;
                        }
                      } else {
                        break L8;
                      }
                    }
                    he.field_b = kc.field_R;
                    og.a(((ga) this).d(-58), 0);
                    return param2;
                  }
                } else {
                  he.field_b = kc.field_R;
                  og.a(((ga) this).d(-58), 0);
                  return param2;
                }
              }
            }
          }
          L9: {
            if (ci.field_d == 0) {
              break L9;
            } else {
              if (((ga) this).a(nc.field_j, 1, param0, hp.field_D, param1, ci.field_d, (ga) this)) {
                param2 = false;
                break L9;
              } else {
                ((ga) this).c((byte) 57);
                param2 = false;
                if (kc.field_R == 0) {
                  if (0 == he.field_b) {
                    he.field_b = kc.field_R;
                    og.a(((ga) this).d(-58), 0);
                    return param2;
                  } else {
                    L10: {
                      ((ga) this).a(param1, 112, ha.field_b, ei.field_K, param0, (ga) this);
                      var6 = np.field_H;
                      if (var6 != null) {
                        if (!(var6.field_v instanceof in)) {
                          np.field_H = null;
                          break L10;
                        } else {
                          ((in) (Object) var6.field_v).a(-12156, (rd) null, var6);
                          np.field_H = null;
                          break L10;
                        }
                      } else {
                        break L10;
                      }
                    }
                    he.field_b = kc.field_R;
                    og.a(((ga) this).d(-58), 0);
                    return param2;
                  }
                } else {
                  he.field_b = kc.field_R;
                  og.a(((ga) this).d(-58), 0);
                  return param2;
                }
              }
            }
          }
          if (kc.field_R == 0) {
            if (0 != he.field_b) {
              ((ga) this).a(param1, 112, ha.field_b, ei.field_K, param0, (ga) this);
              var6 = np.field_H;
              if (var6 != null) {
                if (!(var6.field_v instanceof in)) {
                  np.field_H = null;
                  he.field_b = kc.field_R;
                  og.a(((ga) this).d(-58), 0);
                  return param2;
                } else {
                  ((in) (Object) var6.field_v).a(-12156, (rd) null, var6);
                  np.field_H = null;
                  he.field_b = kc.field_R;
                  og.a(((ga) this).d(-58), 0);
                  return param2;
                }
              } else {
                he.field_b = kc.field_R;
                og.a(((ga) this).d(-58), 0);
                return param2;
              }
            } else {
              he.field_b = kc.field_R;
              og.a(((ga) this).d(-58), 0);
              return param2;
            }
          } else {
            he.field_b = kc.field_R;
            og.a(((ga) this).d(-58), 0);
            return param2;
          }
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4, ga param5) {
        if (param1 < 1) {
            ((ga) this).field_v = null;
            ((ga) this).field_m = 0;
            return;
        }
        ((ga) this).field_m = 0;
    }

    public final String toString() {
        return ((ga) this).a(new Hashtable(), new StringBuilder(), true, 0).toString();
    }

    boolean b(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_17_0 = 0;
        if (param1 == 21224) {
          if (param4 >= ((ga) this).field_k + param3) {
            if (param0 < ((ga) this).field_j + param2) {
              return false;
            } else {
              L0: {
                L1: {
                  if (((ga) this).field_i + param3 - -((ga) this).field_k <= param4) {
                    break L1;
                  } else {
                    if (param0 >= param2 - -((ga) this).field_j + ((ga) this).field_n) {
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
          boolean discarded$1 = ((ga) this).a(22, -63, true, true);
          if (param4 >= ((ga) this).field_k + param3) {
            if (param0 >= ((ga) this).field_j + param2) {
              if (((ga) this).field_i + param3 - -((ga) this).field_k > param4) {
                if (param0 >= param2 - -((ga) this).field_j + ((ga) this).field_n) {
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

    int c(int param0) {
        if (param0 != 0) {
            ((ga) this).field_u = 73;
            return 0;
        }
        return 0;
    }

    final static void a(int param0, int param1, lo param2) {
        am var3 = dp.field_e;
        var3.j(11, param0);
        var3.i(2, 93);
        var3.i(param1, param1 ^ 35);
        var3.i(param2.field_k, -96);
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        var6 = ZombieDawn.field_J;
        var4 = ((ga) this).c(0);
        var5_int = param0;
        L0: while (true) {
          L1: {
            if (var4 < var5_int) {
              break L1;
            } else {
              ((ga) this).a(param2, var5_int, param1, 0);
              var5_int++;
              if (var6 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          var5 = eg.a(109);
          if (var5 != null) {
            se.field_j.a(mm.field_i, lc.field_i, var5, -104);
            return;
          } else {
            return;
          }
        }
    }

    void a(ga param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        L0: {
          var5 = ((ga) this).b(ei.field_K, 21224, param2, param3, ha.field_b) ? 1 : 0;
          var6 = 7 / ((46 - param1) / 42);
          if (var5 != 0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        if (stackIn_3_0 == (((ga) this).field_l ? 1 : 0)) {
          L1: {
            stackOut_5_0 = this;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (var5 == 0) {
              stackOut_7_0 = this;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L1;
            } else {
              stackOut_6_0 = this;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L1;
            }
          }
          ((ga) this).field_l = stackIn_8_1 != 0;
          if (null != ((ga) this).field_v) {
            if (!(((ga) this).field_v instanceof ue)) {
              return;
            } else {
              ((ue) (Object) ((ga) this).field_v).a((ga) this, 10766, var5 != 0);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    boolean e(int param0) {
        if (param0 != -17741) {
            boolean discarded$0 = ((ga) this).a(-123, 51, -13, -35, -43, -14, (ga) null);
            return false;
        }
        return false;
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        ((ga) this).field_j = param1;
        ((ga) this).field_i = param3;
        ((ga) this).field_k = param2;
        ((ga) this).field_n = param4;
        int var6 = 124 / ((param0 - -23) / 48);
    }

    final void a(boolean param0) {
        ((ga) this).a(38, ((ga) this).field_j, ((ga) this).field_k, ((ga) this).field_i, ((ga) this).field_n);
        if (!param0) {
            ga.a(122, 7, (lo) null);
        }
    }

    ga(String param0, sk param1) {
        this(param0, se.field_j.field_n, param1);
    }

    boolean a(int param0, int param1, ga param2, char param3) {
        int var5 = -46 / ((param0 - -83) / 32);
        return false;
    }

    final boolean a(int param0, byte param1, char param2) {
        int var4 = 0;
        if (((ga) this).e(-17741)) {
          if (!((ga) this).a(28, param0, (ga) this, param2)) {
            var4 = param0;
            if (var4 == 80) {
              return ((ga) this).a((byte) 76, (ga) this);
            } else {
              if (param1 <= 21) {
                ((ga) this).field_n = 58;
                return false;
              } else {
                return false;
              }
            }
          } else {
            return true;
          }
        } else {
          var4 = param0;
          if (var4 == 80) {
            return ((ga) this).a((byte) 76, (ga) this);
          } else {
            if (param1 <= 21) {
              ((ga) this).field_n = 58;
              return false;
            } else {
              return false;
            }
          }
        }
    }

    StringBuilder a(Hashtable param0, StringBuilder param1, boolean param2, int param3) {
        L0: {
          if (((ga) this).a(param0, param1, 11098, param3)) {
            ((ga) this).a(param0, param3, 67, param1);
            break L0;
          } else {
            break L0;
          }
        }
        if (!param2) {
          String discarded$2 = ((ga) this).toString();
          return param1;
        } else {
          return param1;
        }
    }

    final boolean a(Hashtable param0, StringBuilder param1, int param2, int param3) {
        if (param2 == 11098) {
          if (!param0.containsKey(this)) {
            Object discarded$8 = param0.put(this, this);
            return true;
          } else {
            StringBuilder discarded$9 = param1.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
            return false;
          }
        } else {
          field_q = 49;
          if (!param0.containsKey(this)) {
            Object discarded$10 = param0.put(this, this);
            return true;
          } else {
            StringBuilder discarded$11 = param1.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
            return false;
          }
        }
    }

    String d(int param0) {
        int var2 = 67 / ((10 - param0) / 58);
        return !((ga) this).field_l ? null : ((ga) this).field_s;
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param1 == param3) {
            if (((ga) this).field_h == null) {
                return;
            }
            ((ga) this).field_h.a(16777215, true, param0, (ga) this, param2);
        }
    }

    protected ga() {
        ((ga) this).field_p = 0;
        ((ga) this).field_u = 0;
    }

    ga(String param0, io param1, sk param2) {
        ak var4 = null;
        ((ga) this).field_p = 0;
        ((ga) this).field_u = 0;
        ((ga) this).field_v = param2;
        ((ga) this).field_o = param0;
        ((ga) this).field_h = param1;
        if (((ga) this).field_h instanceof ak) {
            var4 = (ak) (Object) ((ga) this).field_h;
            ((ga) this).field_i = var4.b((byte) -58, (ga) this);
            ((ga) this).field_n = var4.a(false, (ga) this);
        }
    }

    ga(int param0, int param1, int param2, int param3, io param4, sk param5) {
        ((ga) this).field_p = 0;
        ((ga) this).field_u = 0;
        ((ga) this).field_h = param4;
        ((ga) this).field_k = param0;
        ((ga) this).field_j = param1;
        ((ga) this).field_n = param3;
        ((ga) this).field_i = param2;
        ((ga) this).field_v = param5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = 15;
        field_w = false;
        field_r = 0;
    }
}
