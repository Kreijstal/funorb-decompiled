/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class he extends k {
    static String field_q;
    static Calendar field_s;
    static String field_v;
    private ef[] field_w;
    static eh field_r;
    static int field_y;
    private ef field_t;
    static mf field_u;
    static int field_x;

    final ef a(int param0, byte param1) {
        ef dupTemp$2 = null;
        ef dupTemp$3 = null;
        if (param1 != -53) {
          this.field_t = (ef) null;
          dupTemp$2 = new ef();
          this.field_w[param0] = dupTemp$2;
          return dupTemp$2;
        } else {
          dupTemp$3 = new ef();
          this.field_w[param0] = dupTemp$3;
          return dupTemp$3;
        }
    }

    final static te a(mf param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        te stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -18109) {
                break L1;
              } else {
                field_v = (String) null;
                break L1;
              }
            }
            if (uc.a(param0, 96, param3, param2)) {
              stackIn_6_0 = da.b((byte) 8);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("he.Q(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (te) ((Object) stackIn_4_0);
        } else {
          return stackIn_6_0;
        }
    }

    final void a(ed[] param0, int param1) {
        ef[] var3 = null;
        int var4 = 0;
        ef var5 = null;
        int var6 = 0;
        ef[] var7 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = EscapeVector.field_A;
        try {
          L0: {
            var7 = this.field_w;
            var3 = var7;
            var4 = 0;
            L1: while (true) {
              if (var7.length <= var4) {
                if (param1 == 6) {
                  break L0;
                } else {
                  field_v = (String) null;
                  return;
                }
              } else {
                L2: {
                  var5 = var7[var4];
                  if (var5 != null) {
                    var5.field_i = param0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("he.O(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
    }

    public final void a(int param0, int param1, int param2, hm param3, boolean param4) {
        hm stackIn_3_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        ef var7 = null;
        ef var9 = null;
        hc var10 = null;
        ef var11 = null;
        ef var12 = null;
        ef var13 = null;
        ef var14 = null;
        try {
          L0: {
            L1: {
              if (!(param3 instanceof hc)) {
                stackIn_3_0 = null;
                break L1;
              } else {
                stackIn_3_0 = (hm) (param3);
                break L1;
              }
            }
            L2: {
              var10 = (hc) ((Object) stackIn_3_0);
              rd.a(param3.field_g + param3.field_k + param0, param0 - -param3.field_k, param3.field_j + (param1 + param3.field_x), 19807, param1 - -param3.field_j);
              if (var10 != null) {
                param4 = param4 & var10.field_y;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = this.field_w[0];
              this.field_t.a(true);
              var7.a(param0, this.field_t, param3, param1, 63, (he) (this));
              if (var10 == null) {
                break L3;
              } else {
                L4: {
                  if (!var10.field_z) {
                    break L4;
                  } else {
                    var11 = this.field_w[1];
                    if (var11 != null) {
                      var11.a(param0, this.field_t, param3, param1, -106, (he) (this));
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                if (!var10.field_u) {
                  break L3;
                } else {
                  L5: {
                    var12 = this.field_w[3];
                    if (0 == var10.field_t) {
                      break L5;
                    } else {
                      if (var12 == null) {
                        break L5;
                      } else {
                        var12.a(param0, this.field_t, param3, param1, -124, (he) (this));
                        break L3;
                      }
                    }
                  }
                  var9 = this.field_w[2];
                  if (var9 != null) {
                    var9.a(param0, this.field_t, param3, param1, -101, (he) (this));
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
            }
            L6: {
              if (param3.h(0)) {
                var13 = this.field_w[5];
                if (var13 == null) {
                  break L6;
                } else {
                  var13.a(param0, this.field_t, param3, param1, 51, (he) (this));
                  break L6;
                }
              } else {
                break L6;
              }
            }
            L7: {
              if (!param4) {
                var14 = this.field_w[4];
                if (var14 != null) {
                  var14.a(param0, this.field_t, param3, param1, -94, (he) (this));
                  break L7;
                } else {
                  break L7;
                }
              } else {
                break L7;
              }
            }
            L8: {
              if (param2 < -14) {
                break L8;
              } else {
                he.a(true);
                break L8;
              }
            }
            this.field_t.a((he) (this), param3, param0, param1, (byte) 21);
            dl.a((byte) -8);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var6);

            stackIn_33_1 = new StringBuilder().append("he.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L9;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L9;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param4 + ')');
        }
    }

    final void a(ed param0, byte param1) {
        ef[] var3 = null;
        int var4 = 0;
        ef var5 = null;
        int var6 = 0;
        ef[] var7 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = EscapeVector.field_A;
        try {
          L0: {
            var7 = this.field_w;
            var3 = var7;
            var4 = 0;
            L1: while (true) {
              if (var7.length <= var4) {
                if (param1 > 65) {
                  break L0;
                } else {
                  he.a(true);
                  return;
                }
              } else {
                L2: {
                  var5 = var7[var4];
                  if (var5 != null) {
                    var5.field_g = param0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("he.R(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
    }

    he(he param0, boolean param1) {
        this();
        try {
            param0.a(param1, 123, (he) (this));
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "he.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static kb a(String param0, int param1, byte param2) {
        jb var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        jb stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = new jb();
            var4 = -90 / ((param2 - -5) / 40);
            ((kb) ((Object) var3)).field_b = param1;
            ((kb) ((Object) var3)).field_a = param0;
            stackIn_1_0 = (jb) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3_ref);

            stackIn_4_1 = new StringBuilder().append("he.S(");

            if (param0 == null) {
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
          throw t.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ')');
        }
        return (kb) ((Object) stackIn_1_0);
    }

    public static void a(boolean param0) {
        field_v = null;
        field_u = null;
        field_q = null;
        if (!param0) {
            return;
        }
        field_s = null;
    }

    public he() {
        this.field_w = new ef[6];
        this.field_t = new ef();
        ef dupTemp$0 = new ef();
        this.field_w[0] = dupTemp$0;
        ef var1 = dupTemp$0;
        var1.a(true);
    }

    private final void a(boolean param0, int param1, he param2) {
        ef dupTemp$2 = null;
        int var4_int = 0;
        ef var5 = null;
        ef var6 = null;
        int var7 = 0;
        ef stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        ef stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        ef stackIn_9_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              super.a(param2, 127);
              if (!param0) {
                qg.a(this.field_w, 0, param2.field_w, 0, 6);
                break L1;
              } else {
                var4_int = 0;
                L2: while (true) {
                  if (-7 >= (var4_int ^ -1)) {
                    break L1;
                  } else {
                    L3: {
                      var5 = this.field_w[var4_int];
                      if (var5 != null) {
                        L4: {
                          var6 = param2.field_w[var4_int];
                          stackIn_8_0 = (ef) (var5);

                          stackIn_8_1 = -2;

                          if (var6 == null) {
                            dupTemp$2 = new ef();
                            param2.field_w[var4_int] = dupTemp$2;
                            stackIn_9_0 = (ef) ((Object) stackIn_8_0);
                            stackIn_9_1 = stackIn_8_1;
                            stackIn_9_2 = (ef) (dupTemp$2);
                            break L4;
                          } else {
                            stackIn_9_0 = (ef) ((Object) stackIn_8_0);
                            stackIn_9_1 = stackIn_8_1;
                            stackIn_9_2 = (ef) (var6);
                            break L4;
                          }
                        }
                        ((ef) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_9_2);
                        break L3;
                      } else {
                        param2.field_w[var4_int] = null;
                        break L3;
                      }
                    }
                    var4_int++;
                    continue L2;
                  }
                }
              }
            }
            if (param1 > 120) {
              break L0;
            } else {
              field_r = (eh) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var4);

            stackIn_18_1 = new StringBuilder().append("he.T(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
    }

    final void a(ed[] param0, int param1, byte param2) {
        int var4_int = 0;
        try {
            var4_int = param1;
            if (param2 != -117) {
                he var5 = (he) null;
                this.a(false, -105, (he) null);
            }
            if (this.field_w[var4_int] == null) {
                this.field_w[var4_int] = new ef();
            }
            this.field_w[param1].field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "he.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_v = "Tutorial";
        field_r = null;
        field_q = "Not yet achieved";
        field_s = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
