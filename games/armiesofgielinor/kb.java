/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class kb extends tc {
    static int field_A;
    static int[] field_o;
    int field_p;
    qo field_x;
    static me field_y;
    boolean field_t;
    int field_l;
    int field_z;
    kh field_k;
    int field_w;
    int field_q;
    int field_B;
    ju field_u;
    String field_s;
    String field_v;
    int field_r;
    static int field_n;
    static int[] field_m;

    boolean b(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_18_0 = 0;
        if (param0 == 1) {
          if (param1 - -this.field_B <= param3) {
            if (param2 < param4 + this.field_p) {
              return false;
            } else {
              L0: {
                L1: {
                  if (this.field_l + (param1 - -this.field_B) <= param3) {
                    break L1;
                  } else {
                    if (this.field_p + param4 + this.field_w <= param2) {
                      break L1;
                    } else {
                      stackIn_18_0 = 1;
                      break L0;
                    }
                  }
                }
                stackIn_18_0 = 0;
                break L0;
              }
              return stackIn_18_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          this.a(27, 29, 59, (kb) null);
          if (param1 - -this.field_B <= param3) {
            if (param2 >= param4 + this.field_p) {
              if (this.field_l + (param1 - -this.field_B) > param3) {
                if (this.field_p + param4 + this.field_w <= param2) {
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

    void a(int param0, kb param1, int param2, byte param3, int param4, int param5) {
        try {
            this.field_q = 0;
            int var7_int = 122 / ((param3 - -58) / 53);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "kb.JA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    boolean a(boolean param0) {
        if (param0) {
            this.a((Hashtable) null, 105, (byte) 68, (StringBuilder) null);
            return false;
        }
        return false;
    }

    final void a(int param0, Hashtable param1, boolean param2, StringBuilder param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              discarded$0 = param3.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_B).append(",").append(this.field_p).append(" ").append(this.field_l).append("x").append(this.field_w);
              if (this.field_v == null) {
                break L1;
              } else {
                discarded$1 = param3.append(" text=\"").append(this.field_v).append('"');
                break L1;
              }
            }
            L2: {
              if (this.field_t) {
                discarded$2 = param3.append(" mouseover");
                break L2;
              } else {
                break L2;
              }
            }
            if (param2) {
              L3: {
                if (!this.a(false)) {
                  break L3;
                } else {
                  discarded$3 = param3.append(" focused");
                  break L3;
                }
              }
              L4: {
                if (this.field_k == null) {
                  break L4;
                } else {
                  L5: {
                    discarded$4 = param3.append(" renderer=");
                    if (!(this.field_k instanceof kb)) {
                      break L5;
                    } else {
                      param3 = this.a(1 + param0, param3, 26477, param1);
                      if (var6 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  discarded$5 = param3.append(this.field_k);
                  break L4;
                }
              }
              L6: {
                L7: {
                  if (null == this.field_x) {
                    break L7;
                  } else {
                    L8: {
                      discarded$6 = param3.append(" listener=");
                      if (!(this.field_x instanceof kb)) {
                        break L8;
                      } else {
                        param3 = this.a(1 + param0, param3, 26477, param1);
                        if (var6 == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    discarded$7 = param3.append(this.field_x);
                    break L6;
                  }
                }
                break L6;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var5);

            stackIn_21_1 = new StringBuilder().append("kb.BB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L9;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L10;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L10;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    int g(int param0) {
        if (param0 != -31989) {
            return 112;
        }
        return 0;
    }

    boolean a(int param0, int param1, int param2, int param3, kb param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 >= 103) {
                break L1;
              } else {
                field_A = -35;
                break L1;
              }
            }
            if (!this.b(1, param1, param5, param0, param2)) {
              stackIn_5_0 = 0;
              break L0;
            } else {
              this.field_q = param6;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var8);

            stackIn_8_1 = new StringBuilder().append("kb.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_5_0 != 0;
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, int param5, kb param6) {
        RuntimeException var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param5 >= 93) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var8);

            stackIn_7_1 = new StringBuilder().append("kb.RA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    public static void c(byte param0) {
        field_o = null;
        field_m = null;
        int var1 = 53 / ((-78 - param0) / 43);
        field_y = null;
    }

    final void e(int param0) {
        if (param0 != 0) {
            return;
        }
        this.a(this.field_B, this.field_l, this.field_p, 8192, this.field_w);
    }

    kb(String param0, qo param1) {
        this(param0, t.field_c.field_t, param1);
    }

    final boolean a(int param0, char param1, int param2) {
        int var4;
        if (this.a(false)) {
          if (!this.a((kb) (this), param0, param1, param2 + -12295)) {
            var4 = param0;
            if (var4 == 80) {
              return this.a(param2 ^ 91, (kb) (this));
            } else {
              if (param2 != 80) {
                field_y = (me) null;
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
            return this.a(param2 ^ 91, (kb) (this));
          } else {
            if (param2 != 80) {
              field_y = (me) null;
              return false;
            } else {
              return false;
            }
          }
        }
    }

    String h(int param0) {
        String stackIn_4_0 = null;
        String stackIn_8_0 = null;
        if (param0 != 21384) {
          L0: {
            this.field_l = 36;
            if (this.field_t) {
              stackIn_8_0 = this.field_s;
              break L0;
            } else {
              stackIn_8_0 = null;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (this.field_t) {
              stackIn_4_0 = this.field_s;
              break L1;
            } else {
              stackIn_4_0 = null;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    StringBuilder a(int param0, StringBuilder param1, int param2, Hashtable param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.a(param3, param0, (byte) 74, param1)) {
                this.a(param0, param3, true, param1);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param2 == 26477) {
                break L2;
              } else {
                this.field_B = -116;
                break L2;
              }
            }
            stackIn_6_0 = (StringBuilder) (param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("kb.OA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    final boolean a(boolean param0, int param1, int param2, int param3) {
        int var5;
        wc var6;
        int var7;
        wc var8;
        wc var10;
        wc var15;
        wc var18;
        wc var21;
        wc var23;
        wc var27;
        wc var28;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.a(32722, param2, param3, (kb) (this));
        if (param1 == -6226) {
          L0: {
            L1: {
              var5 = this.a(false) ? 1 : 0;
              if (!param0) {
                break L1;
              } else {
                L2: {
                  if (-1 == (el.field_d ^ -1)) {
                    break L2;
                  } else {
                    if (var5 != 0) {
                      this.a(sm.field_d, param2, param3, ko.field_b, el.field_d, param1 + 6327, (kb) (this));
                      break L2;
                    } else {
                      L3: {
                        if (tr.field_A == 0) {
                          break L3;
                        } else {
                          if (this.a(iu.field_t, param2, param3, 113, (kb) (this), ur.field_z, tr.field_A)) {
                            param0 = false;
                            break L3;
                          } else {
                            if (-1 == (ro.field_ub ^ -1)) {
                              if (au.field_Ob != 0) {
                                L4: {
                                  this.a(param3, (kb) (this), sm.field_d, (byte) -127, ko.field_b, param2);
                                  var21 = bn.field_f;
                                  if (var21 == null) {
                                    break L4;
                                  } else {
                                    L5: {
                                      if (var21.field_x instanceof ch) {
                                        ((ch) ((Object) var21.field_x)).a(var21, -14486, (ku) null);
                                        break L5;
                                      } else {
                                        break L5;
                                      }
                                    }
                                    bn.field_f = null;
                                    break L4;
                                  }
                                }
                                L6: {
                                  if (var7 == 0) {
                                    break L6;
                                  } else {
                                    if (var5 == 0) {
                                      break L6;
                                    } else {
                                      if (-1 == (tr.field_A ^ -1)) {
                                        break L6;
                                      } else {
                                        this.f(1);
                                        break L6;
                                      }
                                    }
                                  }
                                }
                                au.field_Ob = ro.field_ub;
                                as.a(param1 ^ 6225, this.h(21384));
                                return param0;
                              } else {
                                au.field_Ob = ro.field_ub;
                                as.a(param1 ^ 6225, this.h(21384));
                                return param0;
                              }
                            } else {
                              au.field_Ob = ro.field_ub;
                              as.a(param1 ^ 6225, this.h(21384));
                              return param0;
                            }
                          }
                        }
                      }
                      if (-1 == (ro.field_ub ^ -1)) {
                        if (au.field_Ob != 0) {
                          L7: {
                            this.a(param3, (kb) (this), sm.field_d, (byte) -127, ko.field_b, param2);
                            var23 = bn.field_f;
                            if (var23 == null) {
                              break L7;
                            } else {
                              L8: {
                                if (var23.field_x instanceof ch) {
                                  ((ch) ((Object) var23.field_x)).a(var23, -14486, (ku) null);
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                              bn.field_f = null;
                              break L7;
                            }
                          }
                          if (var7 != 0) {
                            if (var5 != 0) {
                              if (-1 != (tr.field_A ^ -1)) {
                                this.f(1);
                                au.field_Ob = ro.field_ub;
                                as.a(param1 ^ 6225, this.h(21384));
                                return param0;
                              } else {
                                au.field_Ob = ro.field_ub;
                                as.a(param1 ^ 6225, this.h(21384));
                                return param0;
                              }
                            } else {
                              au.field_Ob = ro.field_ub;
                              as.a(param1 ^ 6225, this.h(21384));
                              return param0;
                            }
                          } else {
                            au.field_Ob = ro.field_ub;
                            as.a(param1 ^ 6225, this.h(21384));
                            return param0;
                          }
                        } else {
                          au.field_Ob = ro.field_ub;
                          as.a(param1 ^ 6225, this.h(21384));
                          return param0;
                        }
                      } else {
                        au.field_Ob = ro.field_ub;
                        as.a(param1 ^ 6225, this.h(21384));
                        return param0;
                      }
                    }
                  }
                }
                L9: {
                  if (tr.field_A == 0) {
                    break L9;
                  } else {
                    L10: {
                      if (this.a(iu.field_t, param2, param3, 113, (kb) (this), ur.field_z, tr.field_A)) {
                        break L10;
                      } else {
                        if (var5 != 0) {
                          this.f(1);
                          if (var7 == 0) {
                            break L9;
                          } else {
                            break L10;
                          }
                        } else {
                          L11: {
                            if (-1 != (ro.field_ub ^ -1)) {
                              break L11;
                            } else {
                              if (au.field_Ob != 0) {
                                L12: {
                                  this.a(param3, (kb) (this), sm.field_d, (byte) -127, ko.field_b, param2);
                                  var27 = bn.field_f;
                                  var6 = var27;
                                  if (var27 == null) {
                                    break L12;
                                  } else {
                                    L13: {
                                      if (var27.field_x instanceof ch) {
                                        ((ch) ((Object) var27.field_x)).a(var27, -14486, (ku) null);
                                        break L13;
                                      } else {
                                        break L13;
                                      }
                                    }
                                    bn.field_f = null;
                                    break L12;
                                  }
                                }
                                if (var7 == 0) {
                                  break L11;
                                } else {
                                  if (var5 == 0) {
                                    break L11;
                                  } else {
                                    if (-1 == (tr.field_A ^ -1)) {
                                      break L11;
                                    } else {
                                      this.f(1);
                                      au.field_Ob = ro.field_ub;
                                      as.a(param1 ^ 6225, this.h(21384));
                                      return param0;
                                    }
                                  }
                                }
                              } else {
                                au.field_Ob = ro.field_ub;
                                as.a(param1 ^ 6225, this.h(21384));
                                return param0;
                              }
                            }
                          }
                          au.field_Ob = ro.field_ub;
                          as.a(param1 ^ 6225, this.h(21384));
                          return param0;
                        }
                      }
                    }
                    param0 = false;
                    break L9;
                  }
                }
                if (-1 != (ro.field_ub ^ -1)) {
                  break L0;
                } else {
                  if (au.field_Ob != 0) {
                    L14: {
                      this.a(param3, (kb) (this), sm.field_d, (byte) -127, ko.field_b, param2);
                      var28 = bn.field_f;
                      if (var28 == null) {
                        break L14;
                      } else {
                        L15: {
                          if (var28.field_x instanceof ch) {
                            ((ch) ((Object) var28.field_x)).a(var28, -14486, (ku) null);
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        bn.field_f = null;
                        break L14;
                      }
                    }
                    if (var7 == 0) {
                      break L0;
                    } else {
                      break L1;
                    }
                  } else {
                    au.field_Ob = ro.field_ub;
                    as.a(param1 ^ 6225, this.h(21384));
                    return param0;
                  }
                }
              }
            }
            if (var5 == 0) {
              break L0;
            } else {
              if (-1 == (tr.field_A ^ -1)) {
                break L0;
              } else {
                this.f(1);
                au.field_Ob = ro.field_ub;
                as.a(param1 ^ 6225, this.h(21384));
                return param0;
              }
            }
          }
          au.field_Ob = ro.field_ub;
          as.a(param1 ^ 6225, this.h(21384));
          return param0;
        } else {
          L16: {
            field_n = 69;
            var5 = this.a(false) ? 1 : 0;
            if (!param0) {
              break L16;
            } else {
              if (-1 != (el.field_d ^ -1)) {
                L17: {
                  if (var5 != 0) {
                    this.a(sm.field_d, param2, param3, ko.field_b, el.field_d, param1 + 6327, (kb) (this));
                    break L17;
                  } else {
                    break L17;
                  }
                }
                if (tr.field_A != 0) {
                  L18: {
                    L19: {
                      if (this.a(iu.field_t, param2, param3, 113, (kb) (this), ur.field_z, tr.field_A)) {
                        break L19;
                      } else {
                        if (var5 != 0) {
                          this.f(1);
                          if (var7 == 0) {
                            break L18;
                          } else {
                            break L19;
                          }
                        } else {
                          if (-1 == (ro.field_ub ^ -1)) {
                            if (au.field_Ob == 0) {
                              au.field_Ob = ro.field_ub;
                              as.a(param1 ^ 6225, this.h(21384));
                              return param0;
                            } else {
                              L20: {
                                this.a(param3, (kb) (this), sm.field_d, (byte) -127, ko.field_b, param2);
                                var15 = bn.field_f;
                                if (var15 == null) {
                                  break L20;
                                } else {
                                  L21: {
                                    if (var15.field_x instanceof ch) {
                                      ((ch) ((Object) var15.field_x)).a(var15, -14486, (ku) null);
                                      break L21;
                                    } else {
                                      break L21;
                                    }
                                  }
                                  bn.field_f = null;
                                  break L20;
                                }
                              }
                              L22: {
                                if (var7 == 0) {
                                  break L22;
                                } else {
                                  if (var5 == 0) {
                                    break L22;
                                  } else {
                                    if (-1 == (tr.field_A ^ -1)) {
                                      break L22;
                                    } else {
                                      this.f(1);
                                      break L22;
                                    }
                                  }
                                }
                              }
                              au.field_Ob = ro.field_ub;
                              as.a(param1 ^ 6225, this.h(21384));
                              return param0;
                            }
                          } else {
                            au.field_Ob = ro.field_ub;
                            as.a(param1 ^ 6225, this.h(21384));
                            return param0;
                          }
                        }
                      }
                    }
                    param0 = false;
                    break L18;
                  }
                  if (-1 == (ro.field_ub ^ -1)) {
                    if (au.field_Ob != 0) {
                      L23: {
                        this.a(param3, (kb) (this), sm.field_d, (byte) -127, ko.field_b, param2);
                        var18 = bn.field_f;
                        if (var18 == null) {
                          break L23;
                        } else {
                          L24: {
                            if (var18.field_x instanceof ch) {
                              ((ch) ((Object) var18.field_x)).a(var18, -14486, (ku) null);
                              break L24;
                            } else {
                              break L24;
                            }
                          }
                          bn.field_f = null;
                          break L23;
                        }
                      }
                      if (var7 != 0) {
                        break L16;
                      } else {
                        au.field_Ob = ro.field_ub;
                        as.a(param1 ^ 6225, this.h(21384));
                        return param0;
                      }
                    } else {
                      au.field_Ob = ro.field_ub;
                      as.a(param1 ^ 6225, this.h(21384));
                      return param0;
                    }
                  } else {
                    au.field_Ob = ro.field_ub;
                    as.a(param1 ^ 6225, this.h(21384));
                    return param0;
                  }
                } else {
                  if (-1 == (ro.field_ub ^ -1)) {
                    if (au.field_Ob == 0) {
                      au.field_Ob = ro.field_ub;
                      as.a(param1 ^ 6225, this.h(21384));
                      return param0;
                    } else {
                      L25: {
                        this.a(param3, (kb) (this), sm.field_d, (byte) -127, ko.field_b, param2);
                        var10 = bn.field_f;
                        var6 = var10;
                        if (var10 != null) {
                          L26: {
                            if (var10.field_x instanceof ch) {
                              ((ch) ((Object) var10.field_x)).a(var10, -14486, (ku) null);
                              break L26;
                            } else {
                              break L26;
                            }
                          }
                          bn.field_f = null;
                          if (var7 == 0) {
                            break L25;
                          } else {
                            if (var5 == 0) {
                              break L25;
                            } else {
                              if (-1 == (tr.field_A ^ -1)) {
                                break L25;
                              } else {
                                this.f(1);
                                break L25;
                              }
                            }
                          }
                        } else {
                          if (var7 == 0) {
                            break L25;
                          } else {
                            if (var5 == 0) {
                              break L25;
                            } else {
                              if (-1 == (tr.field_A ^ -1)) {
                                break L25;
                              } else {
                                this.f(1);
                                break L25;
                              }
                            }
                          }
                        }
                      }
                      au.field_Ob = ro.field_ub;
                      as.a(param1 ^ 6225, this.h(21384));
                      return param0;
                    }
                  } else {
                    au.field_Ob = ro.field_ub;
                    as.a(param1 ^ 6225, this.h(21384));
                    return param0;
                  }
                }
              } else {
                L27: {
                  if (tr.field_A == 0) {
                    break L27;
                  } else {
                    L28: {
                      if (this.a(iu.field_t, param2, param3, 113, (kb) (this), ur.field_z, tr.field_A)) {
                        break L28;
                      } else {
                        if (var5 != 0) {
                          this.f(1);
                          if (var7 == 0) {
                            break L27;
                          } else {
                            break L28;
                          }
                        } else {
                          break L27;
                        }
                      }
                    }
                    param0 = false;
                    break L27;
                  }
                }
                if (-1 == (ro.field_ub ^ -1)) {
                  if (au.field_Ob == 0) {
                    au.field_Ob = ro.field_ub;
                    as.a(param1 ^ 6225, this.h(21384));
                    return param0;
                  } else {
                    L29: {
                      this.a(param3, (kb) (this), sm.field_d, (byte) -127, ko.field_b, param2);
                      var8 = bn.field_f;
                      var6 = var8;
                      if (var8 != null) {
                        L30: {
                          if (var8.field_x instanceof ch) {
                            ((ch) ((Object) var8.field_x)).a(var8, -14486, (ku) null);
                            break L30;
                          } else {
                            break L30;
                          }
                        }
                        bn.field_f = null;
                        if (var7 == 0) {
                          break L29;
                        } else {
                          if (var5 == 0) {
                            break L29;
                          } else {
                            if (-1 == (tr.field_A ^ -1)) {
                              break L29;
                            } else {
                              this.f(1);
                              break L29;
                            }
                          }
                        }
                      } else {
                        if (var7 == 0) {
                          break L29;
                        } else {
                          if (var5 == 0) {
                            break L29;
                          } else {
                            if (-1 == (tr.field_A ^ -1)) {
                              break L29;
                            } else {
                              this.f(1);
                              break L29;
                            }
                          }
                        }
                      }
                    }
                    au.field_Ob = ro.field_ub;
                    as.a(param1 ^ 6225, this.h(21384));
                    return param0;
                  }
                } else {
                  au.field_Ob = ro.field_ub;
                  as.a(param1 ^ 6225, this.h(21384));
                  return param0;
                }
              }
            }
          }
          if (var5 != 0) {
            if (-1 == (tr.field_A ^ -1)) {
              au.field_Ob = ro.field_ub;
              as.a(param1 ^ 6225, this.h(21384));
              return param0;
            } else {
              this.f(1);
              au.field_Ob = ro.field_ub;
              as.a(param1 ^ 6225, this.h(21384));
              return param0;
            }
          } else {
            au.field_Ob = ro.field_ub;
            as.a(param1 ^ 6225, this.h(21384));
            return param0;
          }
        }
    }

    void f(int param0) {
        if (param0 != 1) {
            this.h(93);
        }
    }

    final boolean a(Hashtable param0, int param1, byte param2, StringBuilder param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 >= 29) {
              if (param0.containsKey(this)) {
                discarded$1 = param3.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                param0.put(this, this);
                stackIn_5_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("kb.FB(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            return stackIn_7_0 != 0;
          }
        }
    }

    public final String toString() {
        return this.a(0, new StringBuilder(), 26477, new Hashtable()).toString();
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        this.field_B = param0;
        if (param3 != 8192) {
            return;
        }
        this.field_p = param2;
        this.field_l = param1;
        this.field_w = param4;
    }

    void a(int param0, int param1, byte param2, int param3) {
        L0: {
          if (0 != param3) {
            break L0;
          } else {
            if (this.field_k != null) {
              this.field_k.a((kb) (this), param0, -89, true, param1);
              break L0;
            } else {
              if (param2 <= -82) {
                return;
              } else {
                this.field_t = false;
                return;
              }
            }
          }
        }
        if (param2 > -82) {
          this.field_t = false;
          return;
        } else {
          return;
        }
    }

    boolean a(kb param0, int param1, char param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 == -12215) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              this.field_z = -5;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("kb.F(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0 != 0;
    }

    boolean a(int param0, kb param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 11) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("kb.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    void a(int param0, int param1, int param2, kb param3) {
        int var5_int = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            if (param0 == 32722) {
              L1: {
                var5_int = this.b(param0 + -32721, param1, ko.field_b, sm.field_d, param2) ? 1 : 0;
                stackIn_4_0 = var5_int;

                if (this.field_t) {
                  stackIn_5_0 = stackIn_4_0;
                  stackIn_5_1 = 0;
                  break L1;
                } else {
                  stackIn_5_0 = stackIn_4_0;
                  stackIn_5_1 = 1;
                  break L1;
                }
              }
              L2: {
                L3: {
                  if (stackIn_5_0 != stackIn_5_1) {
                    break L3;
                  } else {
                    L4: {
                      stackIn_8_0 = this;

                      if (var5_int == 0) {
                        stackIn_9_0 = this;
                        stackIn_9_1 = 0;
                        break L4;
                      } else {
                        stackIn_9_0 = this;
                        stackIn_9_1 = 1;
                        break L4;
                      }
                    }
                    ((kb) (this)).field_t = stackIn_9_1 != 0;
                    if (null == this.field_x) {
                      break L3;
                    } else {
                      if (!(this.field_x instanceof o)) {
                        break L3;
                      } else {
                        ((o) ((Object) this.field_x)).a(var5_int != 0, false, (kb) (this));
                        break L2;
                      }
                    }
                  }
                }
                break L2;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("kb.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4;
        int var5_int;
        String var5;
        int var6;
        String var7;
        String var9;
        String var12;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param1 <= -117) {
          var4 = this.g(-31989);
          var5_int = 0;
          L0: while (true) {
            L1: {
              if (var5_int > var4) {
                break L1;
              } else {
                this.a(param0, param2, (byte) -115, var5_int);
                var5_int++;
                if (var6 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            var5 = bl.b(2);
            var7 = var5;
            var9 = var7;
            var5 = var9;
            var9 = var5;
            var5 = var9;
            if (var5 == null) {
              return;
            } else {
              t.field_c.a(cc.field_b, -127, var5, lq.field_e);
              return;
            }
          }
        } else {
          field_A = 34;
          var4 = this.g(-31989);
          var5_int = 0;
          L2: while (true) {
            L3: {
              if (var5_int > var4) {
                break L3;
              } else {
                this.a(param0, param2, (byte) -115, var5_int);
                var5_int++;
                if (var6 == 0) {
                  continue L2;
                } else {
                  break L3;
                }
              }
            }
            var5 = bl.b(2);
            var12 = var5;
            var5 = var12;
            var12 = var5;
            var5 = var12;
            if (var5 == null) {
              return;
            } else {
              t.field_c.a(cc.field_b, -127, var5, lq.field_e);
              return;
            }
          }
        }
    }

    protected kb() {
        this.field_z = 0;
        this.field_r = 0;
    }

    kb(String param0, kh param1, qo param2) {
        RuntimeException runtimeException = null;
        pm var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_z = 0;
        this.field_r = 0;
        try {
          L0: {
            L1: {
              this.field_k = param1;
              this.field_v = param0;
              this.field_x = param2;
              if (!(this.field_k instanceof pm)) {
                break L1;
              } else {
                var4 = (pm) ((Object) this.field_k);
                this.field_l = var4.a((kb) (this), (byte) -120);
                this.field_w = var4.a((kb) (this), -2);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("kb.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
    }

    kb(int param0, int param1, int param2, int param3, kh param4, qo param5) {
        this.field_z = 0;
        this.field_r = 0;
        try {
            this.field_B = param0;
            this.field_p = param1;
            this.field_l = param2;
            this.field_w = param3;
            this.field_x = param5;
            this.field_k = param4;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "kb.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_y = new me(11, 0, 1, 2);
        field_n = 0;
        field_m = new int[8192];
    }
}
