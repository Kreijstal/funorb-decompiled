/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class gi implements Iterable {
    IntrusiveNode[] field_a;
    static int avatarBlinkClockTicks;
    static gk field_d;
    private IntrusiveNode field_f;
    int field_c;
    static int[] field_b;

    public final Iterator iterator() {
        return (Iterator) ((Object) new k((gi) (this)));
    }

    final static void b(int param0) {
        int var1;
        int var2;
        var2 = Geoblox.field_C;
        va.field_d = false;
        if (param0 == -12618) {
          ff.field_d = null;
          if (!cf.field_i) {
            var1 = ik.field_a;
            if (var1 > 0) {
              if (1 == var1) {
                ff.field_d = ih.ticketingOneUnreadText;
                ff.field_d = gg.a(-11455, new CharSequence[]{(CharSequence) ((Object) ff.field_d), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) ne.ticketingGoToWebsiteText)});
                Geoblox.field_y.h((byte) -104);
                rd.c(520);
                return;
              } else {
                ff.field_d = wj.a(ra.ticketingUnreadCountText, new String[]{Integer.toString(var1)}, (byte) -124);
                ff.field_d = gg.a(-11455, new CharSequence[]{(CharSequence) ((Object) ff.field_d), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) ne.ticketingGoToWebsiteText)});
                Geoblox.field_y.h((byte) -104);
                rd.c(520);
                return;
              }
            } else {
              Geoblox.field_y.h((byte) -104);
              rd.c(520);
              return;
            }
          } else {
            Geoblox.field_y.c(false);
            return;
          }
        } else {
          return;
        }
    }

    final void a(long param0, int param1, IntrusiveNode param2) {
        IntrusiveNode var5 = null;
        try {
            if (!(param2.previousNode == null)) {
                param2.unlinkNode(false);
            }
            var5 = this.field_a[(int)((long)(-1 + this.field_c) & param0)];
            param2.previousNode = var5.previousNode;
            if (param1 > -48) {
                field_b = (int[]) null;
            }
            param2.nextNode = var5;
            param2.previousNode.nextNode = param2;
            param2.field_a = param0;
            param2.nextNode.previousNode = param2;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "gi.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static bg a(rh param0, int param1, rh param2, String param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        bg stackIn_3_0 = null;
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
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param2.a((byte) 126, param4);
          if (param1 != 1) {
            field_b = (int[]) null;
          }
          var6 = param2.a(param3, param1 ^ -82, var5_int);
          stackIn_3_0 = rb.a(var6, 0, param2, var5_int, param0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = (RuntimeException) (var5);

          stackIn_6_1 = new StringBuilder().append("gi.E(");

          if (param0 == null) {
            stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
            stackIn_7_2 = "null";
          } else {
            stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
            stackIn_7_2 = "{...}";
          }


          stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

          if (param2 == null) {
            stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
            stackIn_10_2 = "null";
          } else {
            stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
            stackIn_10_2 = "{...}";
          }


          stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

          if (param3 == null) {
            stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
            stackIn_13_2 = "null";
          } else {
            stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
            stackIn_13_2 = "{...}";
          }


          stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

          if (param4 == null) {
            stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
            stackIn_16_2 = "null";
          } else {
            stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(')').toString());
        }
        return stackIn_3_0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9;
        var9 = Geoblox.field_C;
        if (param6 >= param3) {
          if (param2 > param6) {
            sd.a(param5, param4, param7, 110, SoftwareRasterizer.framebuffer, param2, param0, param6, param3);
            if (param1 >= -102) {
              gi.a(-38);
              return;
            } else {
              return;
            }
          } else {
            if (param3 < param2) {
              sd.a(param0, param4, param7, 127, SoftwareRasterizer.framebuffer, param6, param5, param2, param3);
              if (param1 >= -102) {
                gi.a(-38);
                return;
              } else {
                return;
              }
            } else {
              sd.a(param4, param0, param7, 120, SoftwareRasterizer.framebuffer, param6, param5, param3, param2);
              if (param1 >= -102) {
                gi.a(-38);
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if (param3 >= param2) {
            if (param2 > param6) {
              sd.a(param0, param5, param7, -110, SoftwareRasterizer.framebuffer, param3, param4, param2, param6);
              if (param1 < -102) {
                return;
              } else {
                gi.a(-38);
                return;
              }
            } else {
              sd.a(param5, param0, param7, -102, SoftwareRasterizer.framebuffer, param3, param4, param6, param2);
              if (param1 < -102) {
                return;
              } else {
                gi.a(-38);
                return;
              }
            }
          } else {
            sd.a(param4, param5, param7, 116, SoftwareRasterizer.framebuffer, param2, param0, param3, param6);
            if (param1 >= -102) {
              gi.a(-38);
              return;
            } else {
              return;
            }
          }
        }
    }

    final static void a(Throwable param0, String param1, byte param2) {
        try {
            d stackIn_13_0;
            int stackIn_13_1;
            java.net.URL stackIn_13_2;
            java.net.URL stackIn_13_3;
            java.net.URL stackIn_13_4;
            StringBuilder stackIn_13_5;
            d stackIn_14_0;
            int stackIn_14_1;
            java.net.URL stackIn_14_2;
            java.net.URL stackIn_14_3;
            java.net.URL stackIn_14_4;
            StringBuilder stackIn_14_5;
            String stackIn_14_6;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var3 = null;
            Exception var3_ref = null;
            cb var4 = null;
            DataInputStream var5 = null;
            String var6 = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            try {
              L0: {
                var3 = "";
                if (param0 != null) {
                  var3 = ch.a(param0, param2 + -124);
                }
                if (param1 != null) {
                  if (param0 != null) {
                    var3 = var3 + " | ";
                  }
                  var3 = var3 + param1;
                }
                gb.a(var3, (byte) -75);
                var6 = og.a(var3, "%3a", true, ":");
                var7 = og.a(var6, "%40", true, "@");
                var8 = og.a(var7, "%26", true, "&");
                var9 = og.a(var8, "%23", true, "#");
                if (null == GameScreen.field_x) {
                  decompiledRegionSelector0 = 0;
                } else {
                  stackIn_13_0 = ml.field_s;

                  stackIn_13_1 = -14;

                  stackIn_13_2 = null;

                  stackIn_13_3 = null;

                  stackIn_13_4 = GameScreen.field_x.getCodeBase();

                  stackIn_13_5 = new StringBuilder().append("clienterror.ws?c=").append(kk.field_t).append("&u=");

                  if (null == uk.field_p) {
                    stackIn_14_0 = (d) ((Object) stackIn_13_0);
                    stackIn_14_1 = stackIn_13_1;
                    stackIn_14_2 = null;
                    stackIn_14_3 = null;
                    stackIn_14_4 = (java.net.URL) ((Object) stackIn_13_4);
                    stackIn_14_5 = (StringBuilder) ((Object) stackIn_13_5);
                    stackIn_14_6 = "" + vi.field_H;
                  } else {
                    stackIn_14_0 = (d) ((Object) stackIn_13_0);
                    stackIn_14_1 = stackIn_13_1;
                    stackIn_14_2 = null;
                    stackIn_14_3 = null;
                    stackIn_14_4 = (java.net.URL) ((Object) stackIn_13_4);
                    stackIn_14_5 = (StringBuilder) ((Object) stackIn_13_5);
                    stackIn_14_6 = uk.field_p;
                  }
                  var4 = ((d) (Object) stackIn_14_0).a(stackIn_14_1, new java.net.URL(stackIn_14_4, ((StringBuilder) (Object) stackIn_14_5).append(stackIn_14_6).append("&v1=").append(d.field_o).append("&v2=").append(d.field_t).append("&e=").append(var9).toString()));
                  L5: while (var4.field_a == 0) {
                    bc.a(param2 + -125, 1L);
                  }
                  if (var4.field_a == 1) {
                    var5 = (DataInputStream) (var4.field_b);
                    var5.read();
                    var5.close();
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = (Exception) (Object) decompiledCaughtException;
              decompiledRegionSelector0 = 1;
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              if (param2 != 125) {
                gi.a(-109);
                return;
              } else {
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 1;
            L1: while (param0 > 1) {
              if (0 != (param0 & 1)) {
                var3_int = var3_int * param2;
              }
              param0 = param0 >> 1;
              param2 = param2 * param2;
            }
            var4 = 28 % ((-75 - param1) / 49);
            if (param0 != 1) {
              stackIn_10_0 = var3_int;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_8_0 = param2 * var3_int;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var3), "gi.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          return stackIn_10_0;
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
            return;
        }
        field_d = null;
        field_b = null;
    }

    private gi() throws Throwable {
        throw new Error();
    }

    final IntrusiveNode a(long param0, byte param1) {
        int var4;
        IntrusiveNode var5;
        IntrusiveNode var6;
        int var7;
        var7 = Geoblox.field_C;
        var4 = -95 / ((param1 - -9) / 43);
        var5 = this.field_a[(int)((long)(-1 + this.field_c) & param0)];
        this.field_f = var5.nextNode;
        L0: while (true) {
          if (this.field_f != var5) {
            if (~this.field_f.field_a != ~param0) {
              this.field_f = this.field_f.nextNode;
              continue L0;
            } else {
              var6 = this.field_f;
              this.field_f = this.field_f.nextNode;
              return var6;
            }
          } else {
            this.field_f = null;
            return null;
          }
        }
    }

    static {
        avatarBlinkClockTicks = 0;
        field_d = new gk();
        field_b = new int[8192];
    }
}
