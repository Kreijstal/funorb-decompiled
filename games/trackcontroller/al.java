/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

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
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5_ref_byte__ = null;
        int var5 = 0;
        byte[] var6 = null;
        be var9 = null;
        byte[] stackIn_7_0 = null;
        byte[] stackIn_10_0 = null;
        byte[] stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        try {
          L0: {
            L1: {
              var9 = new be(param1);
              var3 = var9.h(16383);
              var4 = var9.e((byte) 113);
              if (0 > var4) {
                break L1;
              } else {
                L2: {
                  if (-1 == (he.field_b ^ -1)) {
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
                      var5 = var9.e((byte) 113);
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
                          var6 = new byte[var5];
                          if (1 == var3) {
                            b.a(var6, var5, param1, var4, 9);
                            break L5;
                          } else {
                            var7 = bd.field_b;
                            synchronized (var7) {
                              L6: {
                                bd.field_b.a((byte) 28, var6, var9);
                                break L6;
                              }
                            }
                            break L5;
                          }
                        }
                        stackIn_24_0 = (byte[]) (var6);
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                    throw new RuntimeException();
                  } else {
                    var5_ref_byte__ = new byte[var4];
                    var9.a(96, var5_ref_byte__, 0, var4);
                    stackIn_10_0 = (byte[]) (var5_ref_byte__);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  stackIn_7_0 = (byte[]) null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var2);

            stackIn_27_1 = new StringBuilder().append("al.AB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L7;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L7;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_24_0;
          }
        }
    }

    void f(int param0) {
        if (param0 != -24174) {
            field_v = (String) null;
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != -3050) {
            this.c((byte) -123);
        }
        this.field_p = param4;
        this.field_m = param2;
        this.field_x = param3;
        this.field_u = param0;
    }

    al(String param0, tg param1) {
        this(param0, lb.field_O.field_k, param1);
    }

    final void g(int param0) {
        if (param0 < 33) {
            return;
        }
        this.a(this.field_u, -3050, this.field_m, this.field_x, this.field_p);
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param3 != 29221) {
            this.a(38, false, true, 115);
        }
        if (-1 == (param0 ^ -1) && null != this.field_y) {
            this.field_y.a(-24969, (al) (this), param2, true, param1);
        }
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final boolean a(int param0, boolean param1, boolean param2, int param3) {
        int var5;
        fj var6;
        int var7;
        L0: {
          var7 = TrackController.field_F ? 1 : 0;
          this.a(param3, param0, (byte) -124, (al) (this));
          var5 = this.h(-96) ? 1 : 0;
          if (!param2) {
            break L0;
          } else {
            this.field_n = (String) null;
            break L0;
          }
        }
        L1: {
          if (param1) {
            L2: {
              if (-1 == (ee.field_c ^ -1)) {
                break L2;
              } else {
                if (var5 != 0) {
                  this.a(kf.field_b, param3, ee.field_c, param0, fg.field_a, (al) (this), (byte) 127);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (uk.field_a == 0) {
                break L3;
              } else {
                if (!this.a((al) (this), wg.field_e, db.field_X, uk.field_a, 0, param0, param3)) {
                  if (var5 == 0) {
                    break L3;
                  } else {
                    this.f(-24174);
                    break L3;
                  }
                } else {
                  param1 = false;
                  break L3;
                }
              }
            }
            if (0 != rj.field_a) {
              break L1;
            } else {
              if (sc.field_h != 0) {
                this.a((al) (this), false, fg.field_a, param3, kf.field_b, param0);
                var6 = rf.field_e;
                if (var6 != null) {
                  L4: {
                    if (var6.field_l instanceof n) {
                      ((n) ((Object) var6.field_l)).a(var6, (mc) null, 21277);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  rf.field_e = null;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                sc.field_h = rj.field_a;
                aj.a((byte) -127, this.e(0));
                return param1;
              }
            }
          } else {
            if (var5 == 0) {
              break L1;
            } else {
              if (uk.field_a == 0) {
                break L1;
              } else {
                this.f(-24174);
                break L1;
              }
            }
          }
        }
        sc.field_h = rj.field_a;
        aj.a((byte) -127, this.e(0));
        return param1;
    }

    final boolean a(byte param0, int param1, StringBuilder param2, Hashtable param3) {
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
            if (param0 >= 114) {
              if (param3.containsKey(this)) {
                discarded$1 = param2.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                param3.put(this, this);
                stackIn_5_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("al.VA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

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
          throw sl.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
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

    boolean h(int param0) {
        if (param0 >= -83) {
            this.c((byte) 69);
            return false;
        }
        return false;
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, al param5, byte param6) {
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
            if (param6 == 127) {
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

            stackIn_7_1 = new StringBuilder().append("al.PA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
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
          throw sl.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    final boolean a(int param0, int param1, int param2, boolean param3, int param4) {
        int stackIn_8_0 = 0;
        L0: {
          if (!param3) {
            break L0;
          } else {
            this.field_A = -82;
            break L0;
          }
        }
        L1: {
          L2: {
            if (param0 + this.field_p > param2) {
              break L2;
            } else {
              if (param4 < param1 - -this.field_m) {
                break L2;
              } else {
                if (this.field_p + param0 - -this.field_x <= param2) {
                  break L2;
                } else {
                  if (param1 + this.field_m + this.field_u <= param4) {
                    break L2;
                  } else {
                    stackIn_8_0 = 1;
                    break L1;
                  }
                }
              }
            }
          }
          stackIn_8_0 = 0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    void a(int param0, int param1, byte param2, al param3) {
        int var5_int = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            if (param2 == -124) {
              L1: {
                var5_int = this.a(param1, param0, kf.field_b, false, fg.field_a) ? 1 : 0;
                if (var5_int != (this.field_q ? 1 : 0)) {
                  L2: {
                    stackIn_6_0 = this;

                    if (var5_int == 0) {
                      stackIn_7_0 = this;
                      stackIn_7_1 = 0;
                      break L2;
                    } else {
                      stackIn_7_0 = this;
                      stackIn_7_1 = 1;
                      break L2;
                    }
                  }
                  ((al) (this)).field_q = stackIn_7_1 != 0;
                  if (this.field_l == null) {
                    break L1;
                  } else {
                    if (this.field_l instanceof vc) {
                      ((vc) ((Object) this.field_l)).a(-11809, (al) (this), var5_int != 0);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
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
          L3: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("al.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, StringBuilder param1, int param2, Hashtable param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              discarded$0 = param1.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_p).append(",").append(this.field_m).append(" ").append(this.field_x).append("x").append(this.field_u);
              if (this.field_s != null) {
                discarded$1 = param1.append(" text=\"").append(this.field_s).append('"');
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_q) {
                discarded$2 = param1.append(" mouseover");
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!this.h(-113)) {
                break L3;
              } else {
                discarded$3 = param1.append(" focused");
                break L3;
              }
            }
            L4: {
              if (null != this.field_y) {
                discarded$4 = param1.append(" renderer=");
                if (this.field_y instanceof al) {
                  param1 = this.a(false, param3, param1, 1 + param2);
                  break L4;
                } else {
                  discarded$5 = param1.append(this.field_y);
                  break L4;
                }
              } else {
                break L4;
              }
            }
            L5: {
              if (param0 == 34) {
                break L5;
              } else {
                field_t = (qj) null;
                break L5;
              }
            }
            L6: {
              if (this.field_l == null) {
                break L6;
              } else {
                discarded$6 = param1.append(" listener=");
                if (this.field_l instanceof al) {
                  param1 = this.a(false, param3, param1, 1 + param2);
                  break L6;
                } else {
                  discarded$7 = param1.append(this.field_l);
                  break L6;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var5);

            stackIn_23_1 = new StringBuilder().append("al.DB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_24_0), stackIn_27_2 + ')');
        }
    }

    final boolean a(char param0, int param1, int param2) {
        if (this.h(-122)) {
            if (!(!this.a((byte) 78, param0, (al) (this), param2))) {
                return true;
            }
        }
        int var4 = param2;
        if (!(var4 != 80)) {
            return this.a((byte) -123, (al) (this));
        }
        if (param1 != 3931) {
            this.e(-29);
            return false;
        }
        return false;
    }

    void a(al param0, boolean param1, int param2, int param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_r = 0;
              if (!param1) {
                break L1;
              } else {
                this.field_o = 76;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("al.GB(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8, int param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        byte[] var17 = null;
        int[] var18 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10_ref = null;
        var16 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param7 == -1) {
                break L1;
              } else {
                var17 = (byte[]) null;
                al.a(103, (byte[]) null);
                break L1;
              }
            }
            L2: while (true) {
              param1--;
              if (-1 < (param1 ^ -1)) {
                break L0;
              } else {
                var18 = param6;
                var10 = var18;
                var11 = param8;
                var12 = param2;
                var13 = param9;
                var14 = param3;
                var15 = 8355711 & var18[var11] >> -1365299103;
                var10[var11] = var15 + ((tc.a(var14, 33501438) >> 204378737) + tc.a(65280, var13 >> -804317111)) + tc.a(16711680, var12 >> 902227937);
                param8++;
                param9 = param9 + param4;
                param2 = param2 + param5;
                param3 = param3 + param0;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var10_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var10_ref);

            stackIn_8_1 = new StringBuilder().append("al.FB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        int var5_int = 0;
        int var6 = TrackController.field_F ? 1 : 0;
        int var4 = this.c((byte) -14);
        for (var5_int = param0; var5_int <= var4; var5_int++) {
            this.a(var5_int, param1, param2, 29221);
        }
        String var5 = qg.b(32);
        if (!(var5 == null)) {
            lb.field_O.a((byte) -86, r.field_j, aj.field_m, var5);
        }
    }

    public final String toString() {
        return this.a(false, new Hashtable(), new StringBuilder(), 0).toString();
    }

    boolean a(al param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        byte[] var9 = null;
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
              if (param4 == 0) {
                break L1;
              } else {
                var9 = (byte[]) null;
                al.a(85, (byte[]) null);
                break L1;
              }
            }
            if (this.a(param5, param6, param2, false, param1)) {
              this.field_r = param3;
              stackIn_5_0 = 0;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var8);

            stackIn_8_1 = new StringBuilder().append("al.R(");

            if (param0 == null) {
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
          throw sl.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_5_0 != 0;
    }

    StringBuilder a(boolean param0, Hashtable param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        al var6 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.a((byte) 121, param3, param2, param1)) {
                break L1;
              } else {
                this.a(34, param2, param3, param1);
                break L1;
              }
            }
            L2: {
              if (!param0) {
                break L2;
              } else {
                var6 = (al) null;
                this.a((byte) -107, 'ﾔ', (al) null, 124);
                break L2;
              }
            }
            stackIn_5_0 = (StringBuilder) (param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("al.BB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ',' + param3 + ')');
        }
        return stackIn_5_0;
    }

    String e(int param0) {
        if (param0 != 0) {
            this.field_m = 111;
        }
        return !this.field_q ? null : this.field_n;
    }

    public static void d(int param0) {
        field_j = null;
        field_t = null;
        if (param0 > -30) {
            al.d(17);
        }
        field_w = null;
        field_v = null;
        field_z = null;
        field_i = null;
    }

    boolean a(byte param0, al param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 < -104) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              this.field_u = 109;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("al.QA(").append(param0).append(',');

            if (param1 == null) {
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
          throw sl.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
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
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = 45 % ((17 - param0) / 51);
            stackIn_1_0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var5);

            stackIn_4_1 = new StringBuilder().append("al.GA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param3 + ')');
        }
        return stackIn_1_0 != 0;
    }

    protected al() {
        this.field_A = 0;
        this.field_o = 0;
    }

    al(String param0, t param1, tg param2) {
        RuntimeException runtimeException = null;
        dl var4 = null;
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
        this.field_A = 0;
        this.field_o = 0;
        try {
          L0: {
            L1: {
              this.field_s = param0;
              this.field_l = param2;
              this.field_y = param1;
              if (!(this.field_y instanceof dl)) {
                break L1;
              } else {
                var4 = (dl) ((Object) this.field_y);
                this.field_x = var4.a(false, (al) (this));
                this.field_u = var4.a(89, (al) (this));
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

            stackIn_6_1 = new StringBuilder().append("al.<init>(");

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
          throw sl.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
    }

    al(int param0, int param1, int param2, int param3, t param4, tg param5) {
        this.field_A = 0;
        this.field_o = 0;
        try {
            this.field_l = param5;
            this.field_m = param1;
            this.field_y = param4;
            this.field_p = param0;
            this.field_u = param3;
            this.field_x = param2;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "al.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_v = "Go Back";
        field_i = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
