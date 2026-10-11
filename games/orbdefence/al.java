/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class al extends java.awt.Canvas {
    static hj field_d;
    static dd field_c;
    static int field_b;
    private java.awt.Component field_a;

    public final void paint(java.awt.Graphics param0) {
        try {
          this.field_a.paint(param0);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "al.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var17Lifetime2;
        var19 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param8 >= 0 &&
            param6 < wi.field_a) {
            if (0 > param5 &&
              param3 < 0 &&
              0 > param2) {
              return;
            }
            if (wi.field_c <= param5 &&
              param3 >= wi.field_c &&
              param2 >= wi.field_c) {
              return;
            }
            var14 = -param6 + param8;
            if (param1 == param6) {
              if (param8 != param6) {
                var15 = -param1 + param8;
                if (param3 > param5) {
                  var9_int = param5 << 16;
                  var10 = param3 << 16;
                  var12 = (-param3 + param2 << 16) / var15;
                  var11 = (-param5 + param2 << 16) / var14;
                } else {
                  var9_int = param3 << 16;
                  var11 = (-param3 + param2 << 16) / var15;
                  var10 = param5 << 16;
                  var12 = (param2 - param5 << 16) / var14;
                }
              } else {
                var10 = param3 << 16;
                var11 = 0;
                var9_int = param5 << 16;
                var12 = 0;
              }
              var13 = 0;
              if (0 > param6) {
                param6 = Math.min(-param6, -param6 + param1);
                var10 = var10 + var12 * param6;
                var9_int = var9_int + var11 * param6;
                param6 = 0;
              }
            } else {
              var10 = param5 << 16;
              var9_int = param5 << 16;
              var15 = param1 - param6;
              var11 = (-param5 + param3 << 16) / var15;
              var12 = (-param5 + param2 << 16) / var14;
              if (var11 < var12) {
                var13 = 0;
              } else {
                var16 = var11;
                var11 = var12;
                var12 = var16;
                var13 = 1;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param6 < 0) {
                if (param1 < 0) {
                  param6 = param1 - param6;
                  var9_int = var9_int + var11 * param6;
                  var10 = var10 + var12 * param6;
                  param6 = param1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param6 = -param6;
                  var9_int = var9_int + var11 * param6;
                  var10 = var10 + param6 * var12;
                  param6 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var16Lifetime2 = wi.field_i[param6];
                while (param1 > param6) {
                  var17 = var9_int >> 16;
                  if (var17 < wi.field_c) {
                    var18 = -(var9_int >> 16) + (var10 >> 16);
                    if (var18 == 0) {
                      if (var17 >= 0 &&
                        var17 < wi.field_c) {
                        mb.a(var18, var17 + var16Lifetime2, param0, param7, true);
                      }
                    } else {
                      if (wi.field_c <= var18 + var17) {
                        var18 = -1 + (-var17 + wi.field_c);
                      }
                      if (var17 >= 0) {
                        mb.a(var18, var17 + var16Lifetime2, param0, param7, true);
                      } else {
                        mb.a(var18 + var17, var16Lifetime2, param0, param7, true);
                      }
                    }
                  }
                  param6++;
                  if (param6 >= wi.field_a) {
                    return;
                  }
                  var9_int = var9_int + var11;
                  var10 = var10 + var12;
                  var16Lifetime2 = var16Lifetime2 + ul.field_f;
                }
              }
              var16Lifetime3 = param8 - param1;
              if (var16Lifetime3 == 0) {
                var11 = 0;
                var12 = 0;
              } else {
                if (var13 == 0) {
                  var9_int = param3 << 16;
                } else {
                  var10 = param3 << 16;
                }
                var17Lifetime2 = param2 << 16;
                var12 = (var17Lifetime2 - var10) / var16Lifetime3;
                var11 = (-var9_int + var17Lifetime2) / var16Lifetime3;
              }
            }
            if (param6 < 0) {
              param6 = -param6;
              var10 = var10 + param6 * var12;
              var9_int = var9_int + var11 * param6;
              param6 = 0;
            }
            var15Lifetime1 = wi.field_i[param6];
            if (param4 != 30979) {
              field_d = (hj) null;
            }
            while (param6 < param8) {
              var16Lifetime1 = var9_int >> 16;
              if (wi.field_c > var16Lifetime1) {
                var17Lifetime1 = -(var9_int >> 16) + (var10 >> 16);
                if (var17Lifetime1 != 0) {
                  if (wi.field_c <= var17Lifetime1 + var16Lifetime1) {
                    var17Lifetime1 = wi.field_c - var16Lifetime1 - 1;
                  }
                  if (var16Lifetime1 < 0) {
                    mb.a(var16Lifetime1 + var17Lifetime1, var15Lifetime1, param0, param7, true);
                  } else {
                    mb.a(var17Lifetime1, var15Lifetime1 + var16Lifetime1, param0, param7, true);
                  }
                } else {
                  if (var16Lifetime1 >= 0 &&
                    var16Lifetime1 < wi.field_c) {
                    mb.a(var17Lifetime1, var16Lifetime1 + var15Lifetime1, param0, param7, true);
                  }
                }
              }
              param6++;
              if (param6 >= wi.field_a) {
                return;
              }
              var9_int = var9_int + var11;
              var10 = var10 + var12;
              var15Lifetime1 = var15Lifetime1 + ul.field_f;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_75_0 = var9;
          stackIn_75_1 = new StringBuilder().append("al.A(");
          if (param0 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_75_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_d = null;
        int var1 = -70 % ((-53 - param0) / 56);
        field_c = null;
    }

    public final void update(java.awt.Graphics param0) {
        try {
          this.field_a.update(param0);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "al.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static ki a(boolean param0, int param1, int param2, int param3, boolean param4, boolean param5) {
        try {
          Object var6 = null;
          Object var7 = null;
          ak var8 = null;
          ki stackIn_17_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param1 != 5200) {
              field_d = (hj) null;
            }
            var6 = null;
            var7 = null;
            if (lh.field_b.field_u != null) {
              vg.field_q = new dj(lh.field_b.field_u, 5200, 0);
              lh.field_b.field_u = null;
              var6 = new eh(255, vg.field_q, new dj(lh.field_b.field_g, 12000, 0), 2097152);
            }
            if (null != vg.field_q) {
              if (null == ok.field_a) {
                ok.field_a = new dj[lh.field_b.field_p.length];
              }
              if (null == ok.field_a[param2]) {
                ok.field_a[param2] = new dj(lh.field_b.field_p[param2], 12000, 0);
                lh.field_b.field_p[param2] = null;
              }
              var7 = new eh(param2, vg.field_q, ok.field_a[param2], 2097152);
            }
            var8 = ed.field_b.a(param5, param2, false, (eh) (var6), (eh) (var7));
            if (param4) {
              var8.d((byte) 111);
            }
            stackIn_17_0 = new ki(var8, param0, param3);
            return stackIn_17_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (IOException) (Object) decompiledCaughtException;
            throw new RuntimeException(((IOException) (var6)).toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    al(java.awt.Component param0) {
        try {
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "al.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = 0;
    }
}
