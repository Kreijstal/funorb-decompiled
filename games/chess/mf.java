/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class mf extends o {
    int field_r;
    static String field_x;
    int field_C;
    static hg field_m;
    String field_v;
    static String field_B;
    int field_q;
    static ci[] field_l;
    rg field_p;
    int field_A;
    int field_u;
    int field_y;
    static boolean field_o;
    jm field_n;
    int field_k;
    boolean field_w;
    static int field_z;
    String field_j;
    ub field_t;
    static rk[] field_s;

    boolean a(int param0, int param1, int param2, byte param3, mf param4, int param5, int param6) {
        L0: {
          if (((mf) this).a(param2, param5, param6, (byte) -117, param1)) {
            ((mf) this).field_q = param0;
            break L0;
          } else {
            break L0;
          }
        }
        if (param3 != 88) {
          ((mf) this).field_j = null;
          return false;
        } else {
          return false;
        }
    }

    boolean a(int param0, mf param1) {
        if (param0 != 0) {
            field_z = 37;
            return false;
        }
        return false;
    }

    void d(int param0) {
        int var2 = 70 % ((34 - param0) / 57);
    }

    final boolean a(char param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        if (((mf) this).d((byte) -67)) {
          if (!((mf) this).a(param0, param2, -1, (mf) this)) {
            var4 = -101 / ((2 - param1) / 35);
            var5 = param2;
            if ((var5 ^ -1) == -81) {
              return ((mf) this).a(0, (mf) this);
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          var4 = -101 / ((2 - param1) / 35);
          var5 = param2;
          if ((var5 ^ -1) == -81) {
            return ((mf) this).a(0, (mf) this);
          } else {
            return false;
          }
        }
    }

    boolean a(int param0, int param1, int param2, mf param3, int param4, int param5, int param6) {
        if (param0 < 59) {
            return false;
        }
        return false;
    }

    public static void f(int param0) {
        field_l = null;
        field_B = null;
        field_s = null;
        field_x = null;
        if (param0 != 0) {
            return;
        }
        field_m = null;
    }

    final void a(Hashtable param0, StringBuilder param1, int param2, boolean param3) {
        int var6 = 0;
        Object var7 = null;
        var6 = Chess.field_G;
        StringBuilder discarded$54 = param1.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(((mf) this).field_u).append(",").append(((mf) this).field_r).append(" ").append(((mf) this).field_y).append("x").append(((mf) this).field_C);
        if (((mf) this).field_v != null) {
          StringBuilder discarded$55 = param1.append(" text=\"").append(((mf) this).field_v).append(34);
          if (!((mf) this).field_w) {
            L0: {
              if (((mf) this).d((byte) -67)) {
                StringBuilder discarded$56 = param1.append(" focused");
                break L0;
              } else {
                break L0;
              }
            }
            if (((mf) this).field_n != null) {
              L1: {
                StringBuilder discarded$57 = param1.append(" renderer=");
                if (!(((mf) this).field_n instanceof mf)) {
                  break L1;
                } else {
                  param1 = ((mf) this).a(param0, param2 + 1, param1, 1);
                  if (var6 == 0) {
                    L2: {
                      if (((mf) this).field_p == null) {
                        break L2;
                      } else {
                        StringBuilder discarded$58 = param1.append(" listener=");
                        if (((mf) this).field_p instanceof mf) {
                          L3: {
                            param1 = ((mf) this).a(param0, 1 + param2, param1, 1);
                            if (!param3) {
                              break L3;
                            } else {
                              var7 = null;
                              boolean discarded$59 = ((mf) this).a(107, 21, -55, (byte) -96, (mf) null, -117, -2);
                              break L3;
                            }
                          }
                          return;
                        } else {
                          StringBuilder discarded$60 = param1.append(((mf) this).field_p);
                          if (var6 == 0) {
                            break L2;
                          } else {
                            L4: {
                              param1 = ((mf) this).a(param0, 1 + param2, param1, 1);
                              if (!param3) {
                                break L4;
                              } else {
                                var7 = null;
                                boolean discarded$61 = ((mf) this).a(107, 21, -55, (byte) -96, (mf) null, -117, -2);
                                break L4;
                              }
                            }
                            return;
                          }
                        }
                      }
                    }
                    if (param3) {
                      var7 = null;
                      boolean discarded$62 = ((mf) this).a(107, 21, -55, (byte) -96, (mf) null, -117, -2);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              L5: {
                StringBuilder discarded$63 = param1.append(((mf) this).field_n);
                if (((mf) this).field_p == null) {
                  break L5;
                } else {
                  StringBuilder discarded$64 = param1.append(" listener=");
                  if (((mf) this).field_p instanceof mf) {
                    param1 = ((mf) this).a(param0, 1 + param2, param1, 1);
                    break L5;
                  } else {
                    StringBuilder discarded$65 = param1.append(((mf) this).field_p);
                    param1 = ((mf) this).a(param0, 1 + param2, param1, 1);
                    break L5;
                  }
                }
              }
              L6: {
                if (!param3) {
                  break L6;
                } else {
                  var7 = null;
                  boolean discarded$66 = ((mf) this).a(107, 21, -55, (byte) -96, (mf) null, -117, -2);
                  break L6;
                }
              }
              return;
            } else {
              L7: {
                if (((mf) this).field_p == null) {
                  break L7;
                } else {
                  StringBuilder discarded$67 = param1.append(" listener=");
                  if (((mf) this).field_p instanceof mf) {
                    param1 = ((mf) this).a(param0, 1 + param2, param1, 1);
                    break L7;
                  } else {
                    StringBuilder discarded$68 = param1.append(((mf) this).field_p);
                    if (var6 == 0) {
                      break L7;
                    } else {
                      param1 = ((mf) this).a(param0, 1 + param2, param1, 1);
                      break L7;
                    }
                  }
                }
              }
              L8: {
                if (!param3) {
                  break L8;
                } else {
                  var7 = null;
                  boolean discarded$69 = ((mf) this).a(107, 21, -55, (byte) -96, (mf) null, -117, -2);
                  break L8;
                }
              }
              return;
            }
          } else {
            L9: {
              StringBuilder discarded$70 = param1.append(" mouseover");
              if (((mf) this).d((byte) -67)) {
                StringBuilder discarded$71 = param1.append(" focused");
                break L9;
              } else {
                break L9;
              }
            }
            if (((mf) this).field_n != null) {
              StringBuilder discarded$72 = param1.append(" renderer=");
              if (((mf) this).field_n instanceof mf) {
                param1 = ((mf) this).a(param0, param2 + 1, param1, 1);
                if (var6 == 0) {
                  L10: {
                    if (((mf) this).field_p == null) {
                      break L10;
                    } else {
                      StringBuilder discarded$73 = param1.append(" listener=");
                      if (((mf) this).field_p instanceof mf) {
                        param1 = ((mf) this).a(param0, 1 + param2, param1, 1);
                        break L10;
                      } else {
                        StringBuilder discarded$74 = param1.append(((mf) this).field_p);
                        if (var6 == 0) {
                          break L10;
                        } else {
                          param1 = ((mf) this).a(param0, 1 + param2, param1, 1);
                          break L10;
                        }
                      }
                    }
                  }
                  L11: {
                    if (!param3) {
                      break L11;
                    } else {
                      var7 = null;
                      boolean discarded$75 = ((mf) this).a(107, 21, -55, (byte) -96, (mf) null, -117, -2);
                      break L11;
                    }
                  }
                  return;
                } else {
                  StringBuilder discarded$76 = param1.append(((mf) this).field_n);
                  L12: {
                    if (((mf) this).field_p == null) {
                      break L12;
                    } else {
                      StringBuilder discarded$77 = param1.append(" listener=");
                      if (((mf) this).field_p instanceof mf) {
                        param1 = ((mf) this).a(param0, 1 + param2, param1, 1);
                        break L12;
                      } else {
                        StringBuilder discarded$78 = param1.append(((mf) this).field_p);
                        param1 = ((mf) this).a(param0, 1 + param2, param1, 1);
                        break L12;
                      }
                    }
                  }
                  L13: {
                    if (!param3) {
                      break L13;
                    } else {
                      var7 = null;
                      boolean discarded$79 = ((mf) this).a(107, 21, -55, (byte) -96, (mf) null, -117, -2);
                      break L13;
                    }
                  }
                  return;
                }
              } else {
                StringBuilder discarded$80 = param1.append(((mf) this).field_n);
                L14: {
                  if (((mf) this).field_p == null) {
                    break L14;
                  } else {
                    StringBuilder discarded$81 = param1.append(" listener=");
                    if (((mf) this).field_p instanceof mf) {
                      param1 = ((mf) this).a(param0, 1 + param2, param1, 1);
                      break L14;
                    } else {
                      StringBuilder discarded$82 = param1.append(((mf) this).field_p);
                      if (var6 == 0) {
                        break L14;
                      } else {
                        param1 = ((mf) this).a(param0, 1 + param2, param1, 1);
                        break L14;
                      }
                    }
                  }
                }
                L15: {
                  if (!param3) {
                    break L15;
                  } else {
                    var7 = null;
                    boolean discarded$83 = ((mf) this).a(107, 21, -55, (byte) -96, (mf) null, -117, -2);
                    break L15;
                  }
                }
                return;
              }
            } else {
              L16: {
                if (((mf) this).field_p == null) {
                  break L16;
                } else {
                  StringBuilder discarded$84 = param1.append(" listener=");
                  if (((mf) this).field_p instanceof mf) {
                    param1 = ((mf) this).a(param0, 1 + param2, param1, 1);
                    break L16;
                  } else {
                    StringBuilder discarded$85 = param1.append(((mf) this).field_p);
                    if (var6 == 0) {
                      break L16;
                    } else {
                      param1 = ((mf) this).a(param0, 1 + param2, param1, 1);
                      break L16;
                    }
                  }
                }
              }
              L17: {
                if (!param3) {
                  break L17;
                } else {
                  var7 = null;
                  boolean discarded$86 = ((mf) this).a(107, 21, -55, (byte) -96, (mf) null, -117, -2);
                  break L17;
                }
              }
              return;
            }
          }
        } else {
          if (!((mf) this).field_w) {
            L18: {
              if (((mf) this).d((byte) -67)) {
                StringBuilder discarded$87 = param1.append(" focused");
                break L18;
              } else {
                break L18;
              }
            }
            if (((mf) this).field_n != null) {
              L19: {
                StringBuilder discarded$88 = param1.append(" renderer=");
                if (!(((mf) this).field_n instanceof mf)) {
                  break L19;
                } else {
                  param1 = ((mf) this).a(param0, param2 + 1, param1, 1);
                  if (var6 == 0) {
                    L20: {
                      if (((mf) this).field_p == null) {
                        break L20;
                      } else {
                        StringBuilder discarded$89 = param1.append(" listener=");
                        if (((mf) this).field_p instanceof mf) {
                          L21: {
                            param1 = ((mf) this).a(param0, 1 + param2, param1, 1);
                            if (!param3) {
                              break L21;
                            } else {
                              var7 = null;
                              boolean discarded$90 = ((mf) this).a(107, 21, -55, (byte) -96, (mf) null, -117, -2);
                              break L21;
                            }
                          }
                          return;
                        } else {
                          StringBuilder discarded$91 = param1.append(((mf) this).field_p);
                          if (var6 == 0) {
                            break L20;
                          } else {
                            L22: {
                              param1 = ((mf) this).a(param0, 1 + param2, param1, 1);
                              if (!param3) {
                                break L22;
                              } else {
                                var7 = null;
                                boolean discarded$92 = ((mf) this).a(107, 21, -55, (byte) -96, (mf) null, -117, -2);
                                break L22;
                              }
                            }
                            return;
                          }
                        }
                      }
                    }
                    if (param3) {
                      var7 = null;
                      boolean discarded$93 = ((mf) this).a(107, 21, -55, (byte) -96, (mf) null, -117, -2);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    break L19;
                  }
                }
              }
              L23: {
                StringBuilder discarded$94 = param1.append(((mf) this).field_n);
                if (((mf) this).field_p == null) {
                  break L23;
                } else {
                  StringBuilder discarded$95 = param1.append(" listener=");
                  if (((mf) this).field_p instanceof mf) {
                    param1 = ((mf) this).a(param0, 1 + param2, param1, 1);
                    break L23;
                  } else {
                    StringBuilder discarded$96 = param1.append(((mf) this).field_p);
                    param1 = ((mf) this).a(param0, 1 + param2, param1, 1);
                    break L23;
                  }
                }
              }
              L24: {
                if (!param3) {
                  break L24;
                } else {
                  var7 = null;
                  boolean discarded$97 = ((mf) this).a(107, 21, -55, (byte) -96, (mf) null, -117, -2);
                  break L24;
                }
              }
              return;
            } else {
              L25: {
                if (((mf) this).field_p == null) {
                  break L25;
                } else {
                  StringBuilder discarded$98 = param1.append(" listener=");
                  if (((mf) this).field_p instanceof mf) {
                    param1 = ((mf) this).a(param0, 1 + param2, param1, 1);
                    break L25;
                  } else {
                    StringBuilder discarded$99 = param1.append(((mf) this).field_p);
                    if (var6 == 0) {
                      break L25;
                    } else {
                      param1 = ((mf) this).a(param0, 1 + param2, param1, 1);
                      break L25;
                    }
                  }
                }
              }
              L26: {
                if (!param3) {
                  break L26;
                } else {
                  var7 = null;
                  boolean discarded$100 = ((mf) this).a(107, 21, -55, (byte) -96, (mf) null, -117, -2);
                  break L26;
                }
              }
              return;
            }
          } else {
            L27: {
              StringBuilder discarded$101 = param1.append(" mouseover");
              if (((mf) this).d((byte) -67)) {
                StringBuilder discarded$102 = param1.append(" focused");
                break L27;
              } else {
                break L27;
              }
            }
            L28: {
              if (((mf) this).field_n != null) {
                L29: {
                  StringBuilder discarded$103 = param1.append(" renderer=");
                  if (!(((mf) this).field_n instanceof mf)) {
                    break L29;
                  } else {
                    param1 = ((mf) this).a(param0, param2 + 1, param1, 1);
                    if (var6 == 0) {
                      break L28;
                    } else {
                      break L29;
                    }
                  }
                }
                StringBuilder discarded$104 = param1.append(((mf) this).field_n);
                break L28;
              } else {
                break L28;
              }
            }
            L30: {
              if (((mf) this).field_p == null) {
                break L30;
              } else {
                StringBuilder discarded$105 = param1.append(" listener=");
                if (((mf) this).field_p instanceof mf) {
                  param1 = ((mf) this).a(param0, 1 + param2, param1, 1);
                  break L30;
                } else {
                  StringBuilder discarded$106 = param1.append(((mf) this).field_p);
                  if (var6 == 0) {
                    break L30;
                  } else {
                    param1 = ((mf) this).a(param0, 1 + param2, param1, 1);
                    break L30;
                  }
                }
              }
            }
            L31: {
              if (!param3) {
                break L31;
              } else {
                var7 = null;
                boolean discarded$107 = ((mf) this).a(107, 21, -55, (byte) -96, (mf) null, -117, -2);
                break L31;
              }
            }
            return;
          }
        }
    }

    final static void a(pf param0, int param1) {
        ka.field_a.a(false, param0, param1 + 113);
        if (param1 != 0) {
            field_m = null;
        }
    }

    public final String toString() {
        return ((mf) this).a(new Hashtable(), 0, new StringBuilder(), 1).toString();
    }

    void a(int param0, mf param1, int param2, int param3, int param4, int param5) {
        ((mf) this).field_q = param4;
    }

    final void c(byte param0) {
        if (param0 <= 89) {
            return;
        }
        ((mf) this).a(((mf) this).field_r, 34, ((mf) this).field_C, ((mf) this).field_y, ((mf) this).field_u);
    }

    final boolean a(int param0, int param1, int param2, boolean param3) {
        int var5 = 0;
        kb var6 = null;
        int var7 = 0;
        var7 = Chess.field_G;
        ((mf) this).a(param2, -87, (mf) this, param1);
        if (param0 < -116) {
          L0: {
            L1: {
              var5 = ((mf) this).d((byte) -67) ? 1 : 0;
              if (!param3) {
                break L1;
              } else {
                L2: {
                  if (0 == fl.field_p) {
                    break L2;
                  } else {
                    if (var5 != 0) {
                      boolean discarded$1 = ((mf) this).a(78, fl.field_p, param1, (mf) this, param2, rf.field_b, hn.field_k);
                      break L2;
                    } else {
                      if (0 != th.field_d) {
                        L3: {
                          if (((mf) this).a(th.field_d, re.field_m, ag.field_f, (byte) 88, (mf) this, param1, param2)) {
                            param3 = false;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        if (wh.field_f == 0) {
                          if (on.field_h != 0) {
                            L4: {
                              ((mf) this).a(rf.field_b, (mf) this, param2, hn.field_k, 0, param1);
                              var6 = vj.field_a;
                              if (var6 == null) {
                                break L4;
                              } else {
                                if (!(var6.field_p instanceof cj)) {
                                  vj.field_a = null;
                                  break L4;
                                } else {
                                  ((cj) (Object) var6.field_p).a(var6, -10925, (ji) null);
                                  vj.field_a = null;
                                  break L4;
                                }
                              }
                            }
                            if (var7 != 0) {
                              if (var5 != 0) {
                                if (th.field_d != 0) {
                                  ((mf) this).d(102);
                                  on.field_h = wh.field_f;
                                  sb.a(((mf) this).g(0), true);
                                  return param3;
                                } else {
                                  on.field_h = wh.field_f;
                                  sb.a(((mf) this).g(0), true);
                                  return param3;
                                }
                              } else {
                                on.field_h = wh.field_f;
                                sb.a(((mf) this).g(0), true);
                                return param3;
                              }
                            } else {
                              on.field_h = wh.field_f;
                              sb.a(((mf) this).g(0), true);
                              return param3;
                            }
                          } else {
                            on.field_h = wh.field_f;
                            sb.a(((mf) this).g(0), true);
                            return param3;
                          }
                        } else {
                          on.field_h = wh.field_f;
                          sb.a(((mf) this).g(0), true);
                          return param3;
                        }
                      } else {
                        if (wh.field_f == 0) {
                          if (on.field_h == 0) {
                            on.field_h = wh.field_f;
                            sb.a(((mf) this).g(0), true);
                            return param3;
                          } else {
                            L5: {
                              ((mf) this).a(rf.field_b, (mf) this, param2, hn.field_k, 0, param1);
                              var6 = vj.field_a;
                              if (var6 == null) {
                                break L5;
                              } else {
                                if (!(var6.field_p instanceof cj)) {
                                  vj.field_a = null;
                                  break L5;
                                } else {
                                  ((cj) (Object) var6.field_p).a(var6, -10925, (ji) null);
                                  vj.field_a = null;
                                  break L5;
                                }
                              }
                            }
                            L6: {
                              if (var7 == 0) {
                                break L6;
                              } else {
                                if (var5 == 0) {
                                  break L6;
                                } else {
                                  if (th.field_d == 0) {
                                    break L6;
                                  } else {
                                    ((mf) this).d(102);
                                    break L6;
                                  }
                                }
                              }
                            }
                            on.field_h = wh.field_f;
                            sb.a(((mf) this).g(0), true);
                            return param3;
                          }
                        } else {
                          on.field_h = wh.field_f;
                          sb.a(((mf) this).g(0), true);
                          return param3;
                        }
                      }
                    }
                  }
                }
                if (0 != th.field_d) {
                  L7: {
                    L8: {
                      if (((mf) this).a(th.field_d, re.field_m, ag.field_f, (byte) 88, (mf) this, param1, param2)) {
                        break L8;
                      } else {
                        if (var5 != 0) {
                          ((mf) this).d(115);
                          if (var7 == 0) {
                            break L7;
                          } else {
                            break L8;
                          }
                        } else {
                          if (wh.field_f == 0) {
                            if (on.field_h != 0) {
                              ((mf) this).a(rf.field_b, (mf) this, param2, hn.field_k, 0, param1);
                              var6 = vj.field_a;
                              if (var6 == null) {
                                L9: {
                                  if (var7 == 0) {
                                    break L9;
                                  } else {
                                    if (var5 == 0) {
                                      break L9;
                                    } else {
                                      if (th.field_d == 0) {
                                        break L9;
                                      } else {
                                        ((mf) this).d(102);
                                        on.field_h = wh.field_f;
                                        sb.a(((mf) this).g(0), true);
                                        return param3;
                                      }
                                    }
                                  }
                                }
                                on.field_h = wh.field_f;
                                sb.a(((mf) this).g(0), true);
                                return param3;
                              } else {
                                if (!(var6.field_p instanceof cj)) {
                                  L10: {
                                    vj.field_a = null;
                                    if (var7 == 0) {
                                      break L10;
                                    } else {
                                      if (var5 == 0) {
                                        break L10;
                                      } else {
                                        if (th.field_d == 0) {
                                          break L10;
                                        } else {
                                          ((mf) this).d(102);
                                          break L10;
                                        }
                                      }
                                    }
                                  }
                                  on.field_h = wh.field_f;
                                  sb.a(((mf) this).g(0), true);
                                  return param3;
                                } else {
                                  ((cj) (Object) var6.field_p).a(var6, -10925, (ji) null);
                                  vj.field_a = null;
                                  if (var7 != 0) {
                                    if (var5 != 0) {
                                      if (th.field_d != 0) {
                                        ((mf) this).d(102);
                                        on.field_h = wh.field_f;
                                        sb.a(((mf) this).g(0), true);
                                        return param3;
                                      } else {
                                        on.field_h = wh.field_f;
                                        sb.a(((mf) this).g(0), true);
                                        return param3;
                                      }
                                    } else {
                                      on.field_h = wh.field_f;
                                      sb.a(((mf) this).g(0), true);
                                      return param3;
                                    }
                                  } else {
                                    on.field_h = wh.field_f;
                                    sb.a(((mf) this).g(0), true);
                                    return param3;
                                  }
                                }
                              }
                            } else {
                              on.field_h = wh.field_f;
                              sb.a(((mf) this).g(0), true);
                              return param3;
                            }
                          } else {
                            on.field_h = wh.field_f;
                            sb.a(((mf) this).g(0), true);
                            return param3;
                          }
                        }
                      }
                    }
                    param3 = false;
                    break L7;
                  }
                  if (wh.field_f != 0) {
                    break L0;
                  } else {
                    if (on.field_h != 0) {
                      ((mf) this).a(rf.field_b, (mf) this, param2, hn.field_k, 0, param1);
                      var6 = vj.field_a;
                      if (var6 == null) {
                        if (var7 == 0) {
                          break L0;
                        } else {
                          break L1;
                        }
                      } else {
                        if (!(var6.field_p instanceof cj)) {
                          L11: {
                            vj.field_a = null;
                            if (var7 == 0) {
                              break L11;
                            } else {
                              if (var5 == 0) {
                                break L11;
                              } else {
                                if (th.field_d == 0) {
                                  break L11;
                                } else {
                                  ((mf) this).d(102);
                                  on.field_h = wh.field_f;
                                  sb.a(((mf) this).g(0), true);
                                  return param3;
                                }
                              }
                            }
                          }
                          on.field_h = wh.field_f;
                          sb.a(((mf) this).g(0), true);
                          return param3;
                        } else {
                          ((cj) (Object) var6.field_p).a(var6, -10925, (ji) null);
                          L12: {
                            vj.field_a = null;
                            if (var7 == 0) {
                              break L12;
                            } else {
                              if (var5 == 0) {
                                break L12;
                              } else {
                                if (th.field_d == 0) {
                                  break L12;
                                } else {
                                  ((mf) this).d(102);
                                  on.field_h = wh.field_f;
                                  sb.a(((mf) this).g(0), true);
                                  return param3;
                                }
                              }
                            }
                          }
                          on.field_h = wh.field_f;
                          sb.a(((mf) this).g(0), true);
                          return param3;
                        }
                      }
                    } else {
                      on.field_h = wh.field_f;
                      sb.a(((mf) this).g(0), true);
                      return param3;
                    }
                  }
                } else {
                  if (wh.field_f == 0) {
                    if (on.field_h != 0) {
                      ((mf) this).a(rf.field_b, (mf) this, param2, hn.field_k, 0, param1);
                      var6 = vj.field_a;
                      if (var6 == null) {
                        if (var7 != 0) {
                          if (var5 != 0) {
                            if (th.field_d != 0) {
                              ((mf) this).d(102);
                              on.field_h = wh.field_f;
                              sb.a(((mf) this).g(0), true);
                              return param3;
                            } else {
                              on.field_h = wh.field_f;
                              sb.a(((mf) this).g(0), true);
                              return param3;
                            }
                          } else {
                            on.field_h = wh.field_f;
                            sb.a(((mf) this).g(0), true);
                            return param3;
                          }
                        } else {
                          on.field_h = wh.field_f;
                          sb.a(((mf) this).g(0), true);
                          return param3;
                        }
                      } else {
                        if (!(var6.field_p instanceof cj)) {
                          vj.field_a = null;
                          if (var7 != 0) {
                            if (var5 != 0) {
                              if (th.field_d == 0) {
                                on.field_h = wh.field_f;
                                sb.a(((mf) this).g(0), true);
                                return param3;
                              } else {
                                ((mf) this).d(102);
                                on.field_h = wh.field_f;
                                sb.a(((mf) this).g(0), true);
                                return param3;
                              }
                            } else {
                              on.field_h = wh.field_f;
                              sb.a(((mf) this).g(0), true);
                              return param3;
                            }
                          } else {
                            on.field_h = wh.field_f;
                            sb.a(((mf) this).g(0), true);
                            return param3;
                          }
                        } else {
                          ((cj) (Object) var6.field_p).a(var6, -10925, (ji) null);
                          vj.field_a = null;
                          if (var7 != 0) {
                            if (var5 != 0) {
                              if (th.field_d == 0) {
                                on.field_h = wh.field_f;
                                sb.a(((mf) this).g(0), true);
                                return param3;
                              } else {
                                ((mf) this).d(102);
                                on.field_h = wh.field_f;
                                sb.a(((mf) this).g(0), true);
                                return param3;
                              }
                            } else {
                              on.field_h = wh.field_f;
                              sb.a(((mf) this).g(0), true);
                              return param3;
                            }
                          } else {
                            on.field_h = wh.field_f;
                            sb.a(((mf) this).g(0), true);
                            return param3;
                          }
                        }
                      }
                    } else {
                      on.field_h = wh.field_f;
                      sb.a(((mf) this).g(0), true);
                      return param3;
                    }
                  } else {
                    on.field_h = wh.field_f;
                    sb.a(((mf) this).g(0), true);
                    return param3;
                  }
                }
              }
            }
            if (var5 == 0) {
              break L0;
            } else {
              if (th.field_d == 0) {
                break L0;
              } else {
                ((mf) this).d(102);
                on.field_h = wh.field_f;
                sb.a(((mf) this).g(0), true);
                return param3;
              }
            }
          }
          on.field_h = wh.field_f;
          sb.a(((mf) this).g(0), true);
          return param3;
        } else {
          return true;
        }
    }

    String g(int param0) {
        if (param0 != 0) {
            return null;
        }
        return !((mf) this).field_w ? null : ((mf) this).field_j;
    }

    void a(int param0, int param1, mf param2, int param3) {
        int var5 = 0;
        Object var6 = null;
        boolean stackIn_1_0 = false;
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        int stackIn_3_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        boolean stackOut_0_0 = false;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        boolean stackOut_1_0 = false;
        int stackOut_1_1 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        L0: {
          var5 = ((mf) this).a(rf.field_b, param3, param0, (byte) -117, hn.field_k) ? 1 : 0;
          stackOut_0_0 = ((mf) this).field_w;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (var5 != 0) {
            stackOut_2_0 = stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = stackIn_1_0;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        if ((stackIn_3_0 ? 1 : 0) == stackIn_3_1) {
          L1: {
            stackOut_8_0 = this;
            stackIn_10_0 = stackOut_8_0;
            stackIn_9_0 = stackOut_8_0;
            if (var5 == 0) {
              stackOut_10_0 = this;
              stackOut_10_1 = 0;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              break L1;
            } else {
              stackOut_9_0 = this;
              stackOut_9_1 = 1;
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              break L1;
            }
          }
          L2: {
            ((mf) this).field_w = stackIn_11_1 != 0;
            if (null == ((mf) this).field_p) {
              break L2;
            } else {
              if (((mf) this).field_p instanceof qg) {
                ((qg) (Object) ((mf) this).field_p).a((mf) this, var5 != 0, 92);
                break L2;
              } else {
                if (param1 <= -6) {
                  return;
                } else {
                  var6 = null;
                  boolean discarded$3 = ((mf) this).a(67, 95, -96, (mf) null, 27, -113, 105);
                  return;
                }
              }
            }
          }
          if (param1 > -6) {
            var6 = null;
            boolean discarded$4 = ((mf) this).a(67, 95, -96, (mf) null, 27, -113, 105);
            return;
          } else {
            return;
          }
        } else {
          if (param1 <= -6) {
            return;
          } else {
            var6 = null;
            boolean discarded$5 = ((mf) this).a(67, 95, -96, (mf) null, 27, -113, 105);
            return;
          }
        }
    }

    mf(String param0, rg param1) {
        this(param0, a.field_a.field_f, param1);
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param2 < -80) {
          if (param1 == 0) {
            if (null == ((mf) this).field_n) {
              return;
            } else {
              ((mf) this).field_n.a((byte) 126, param3, param0, true, (mf) this);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        Object var7 = null;
        ((mf) this).field_y = param3;
        ((mf) this).field_C = param2;
        if (param1 != 34) {
          var7 = null;
          ((mf) this).a(-106, (mf) null, 9, 48, 115, -76);
          ((mf) this).field_r = param0;
          ((mf) this).field_u = param4;
          return;
        } else {
          ((mf) this).field_r = param0;
          ((mf) this).field_u = param4;
          return;
        }
    }

    final boolean a(int param0, int param1, int param2, byte param3, int param4) {
        int stackIn_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_17_0 = 0;
        if (param3 == -117) {
          if (((mf) this).field_u + param2 <= param4) {
            if (param1 + ((mf) this).field_r > param0) {
              return false;
            } else {
              L0: {
                L1: {
                  if (((mf) this).field_y + (param2 - -((mf) this).field_u) <= param4) {
                    break L1;
                  } else {
                    if (param0 >= ((mf) this).field_C + (param1 - -((mf) this).field_r)) {
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
          mf.f(-121);
          if (((mf) this).field_u + param2 <= param4) {
            if (param1 + ((mf) this).field_r <= param0) {
              if (((mf) this).field_y + (param2 - -((mf) this).field_u) > param4) {
                if (param0 >= ((mf) this).field_C + (param1 - -((mf) this).field_r)) {
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

    boolean d(byte param0) {
        if (param0 != -67) {
            String discarded$0 = ((mf) this).toString();
            return false;
        }
        return false;
    }

    final static void e(int param0) {
        ld.a("", (String) null, 0);
        if (param0 < 76) {
            Object var2 = null;
            mf.a((pf) null, 89);
        }
    }

    final boolean a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        Object var6 = null;
        if (param3 < -3) {
          if (!param1.containsKey(this)) {
            Object discarded$8 = param1.put(this, this);
            return true;
          } else {
            StringBuilder discarded$9 = param2.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
            return false;
          }
        } else {
          var6 = null;
          ((mf) this).a((Hashtable) null, (StringBuilder) null, 58, false);
          if (!param1.containsKey(this)) {
            Object discarded$10 = param1.put(this, this);
            return true;
          } else {
            StringBuilder discarded$11 = param2.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
            return false;
          }
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (param2 == 8308) {
          if (param1 == 1) {
            if (!sh.a(14222, param0)) {
              return fj.field_f[param1];
            } else {
              return 29;
            }
          } else {
            return fj.field_f[param1];
          }
        } else {
          return -18;
        }
    }

    int a(boolean param0) {
        if (!param0) {
            Object var3 = null;
            StringBuilder discarded$0 = ((mf) this).a((Hashtable) null, -62, (StringBuilder) null, -111);
            return 0;
        }
        return 0;
    }

    StringBuilder a(Hashtable param0, int param1, StringBuilder param2, int param3) {
        if (param3 != 1) {
          return null;
        } else {
          L0: {
            if (((mf) this).a(param1, param0, param2, -34)) {
              ((mf) this).a(param0, param2, param1, false);
              break L0;
            } else {
              break L0;
            }
          }
          return param2;
        }
    }

    boolean a(char param0, int param1, int param2, mf param3) {
        if (param2 != -1) {
            return true;
        }
        return false;
    }

    final void a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        var6 = Chess.field_G;
        var4 = ((mf) this).a(param0);
        var5_int = 0;
        L0: while (true) {
          L1: {
            if (var4 < var5_int) {
              break L1;
            } else {
              ((mf) this).a(param1, var5_int, -84, param2);
              var5_int++;
              if (var6 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          var5 = lc.d((byte) 60);
          if (param0) {
            if (var5 != null) {
              a.field_a.a(var5, fm.field_S, 106, vn.field_Db);
              return;
            } else {
              return;
            }
          } else {
            mf.f(118);
            if (var5 == null) {
              return;
            } else {
              a.field_a.a(var5, fm.field_S, 106, vn.field_Db);
              return;
            }
          }
        }
    }

    protected mf() {
        ((mf) this).field_k = 0;
        ((mf) this).field_A = 0;
    }

    mf(String param0, jm param1, rg param2) {
        mg var4 = null;
        ((mf) this).field_k = 0;
        ((mf) this).field_A = 0;
        ((mf) this).field_p = param2;
        ((mf) this).field_v = param0;
        ((mf) this).field_n = param1;
        if (((mf) this).field_n instanceof mg) {
            var4 = (mg) (Object) ((mf) this).field_n;
            ((mf) this).field_y = var4.a((byte) -119, (mf) this);
            ((mf) this).field_C = var4.a(true, (mf) this);
        }
    }

    mf(int param0, int param1, int param2, int param3, jm param4, rg param5) {
        ((mf) this).field_k = 0;
        ((mf) this).field_A = 0;
        ((mf) this).field_u = param0;
        ((mf) this).field_n = param4;
        ((mf) this).field_y = param2;
        ((mf) this).field_C = param3;
        ((mf) this).field_r = param1;
        ((mf) this).field_p = param5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "Accept draw";
        field_B = "Please remove <%0> from your friend list first.";
        field_m = new hg(11, 0, 1, 2);
    }
}
