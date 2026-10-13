/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dn extends h {
    static mh field_K;
    private int field_H;
    static String field_J;
    private int field_O;
    private int field_G;
    private int field_I;
    static mh field_N;
    private boolean field_L;
    private boolean field_M;

    final boolean a(oc param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
          if (var8_int != 0 &&
            this.field_M) {
            return true;
          }
          if (!this.a(param5, param3, param2, param6 ^ 3, param1)) {
            stackIn_9_0 = var8_int;
            return stackIn_9_0 != 0;
          }
          this.field_n = param4;
          if (1 != param4) {
            return true;
          }
          this.field_H = -param3 + (-this.field_w + param5);
          gd.field_c = this;
          this.field_G = -param2 - this.field_o + param1;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_14_0 = var8;
          stackIn_14_1 = new StringBuilder().append("dn.MA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static void a(int param0, String param1, ml param2, int param3, TextFont param4) {
        int var7 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          var5_int = 0;
          var6 = -1;
          if (param0 != 25293) {
            field_N = (mh) null;
          }
          for (var7 = 1; var7 < param1.length(); var7++) {
            var8 = param1.charAt(var7);
            if (60 == var8) {
              var6 = param2.field_g[0] + (var5_int >> 8) + param4.measureText(param1.substring(0, var7));
            }
            if (-1 != var6) {
              param2.field_g[var7] = var6;
            } else {
              if (32 == var8) {
                var5_int = var5_int + param3;
              }
              param2.field_g[var7] = (var5_int >> 8) - (-param2.field_g[0] - param4.measureText(param1.substring(0, var7 + 1))) - param4.getAdvance((char) var8);
            }
            if (var8 == 62) {
              var6 = -1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("dn.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final void a(byte param0) {
        super.a((byte) -39);
        this.field_E.a(this.field_s, 0, 0, (byte) -119, this.field_t);
        if (param0 > -7) {
          dn.g(1);
        }
        this.field_I = this.field_o;
        this.field_O = this.field_w;
    }

    private dn(int param0, int param1, int param2, int param3, ub param4, uh param5, oc param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_O = 2147483647;
        this.field_I = 2147483647;
        try {
          this.field_L = param7 ? true : false;
          this.field_E = param6;
          this.field_M = param8 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "dn.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void a(oc param0, byte param1, int param2, int param3) {
        int stackIn_11_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_19_1 = 0;
        int stackIn_22_2 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          if ((!(this.field_E instanceof d) ||
            ((d) (this.field_E)).field_J) &&
            1 == this.field_n) {
            var5_int = pq.pointerX - this.field_G - param2;
            var6 = po.pointerY + (-this.field_H - param3);
            if (this.field_o == var5_int &&
              var6 == this.field_w) {
              super.a(param0, param1, param2, param3);
              return;
            }
            this.field_w = var6;
            this.field_o = var5_int;
            if (this.field_i instanceof li) {
              ((li) (this.field_i)).a((byte) -68, param3, param2, this);
            }
          } else {
            if (this.field_L) {
              if (this.field_o != this.field_I) {
                var5_int = this.field_I - this.field_o;
                stackIn_11_1 = this.field_o;
                if (Math.abs(var5_int) <= 2) {
                  if (var5_int <= 0) {
                    stackIn_14_2 = -1;
                  } else {
                    stackIn_14_2 = 1;
                  }
                } else {
                  stackIn_14_2 = var5_int >> 1;
                }
                this.field_o = stackIn_11_1 + stackIn_14_2;
              }
              if (this.field_O != this.field_w) {
                var5_int = this.field_O - this.field_w;
                stackIn_19_1 = this.field_w;
                if (2 >= Math.abs(var5_int)) {
                  if (var5_int <= 0) {
                    stackIn_22_2 = -1;
                  } else {
                    stackIn_22_2 = 1;
                  }
                } else {
                  stackIn_22_2 = var5_int >> 1;
                }
                this.field_w = stackIn_19_1 + stackIn_22_2;
              }
            }
          }
          super.a(param0, param1, param2, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_33_0 = var5;
          stackIn_33_1 = new StringBuilder().append("dn.WA(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_J = null;
        if (param0 != 1) {
          dn.g(-43);
        }
        field_N = null;
        field_K = null;
    }

    final static um g(int param0) {
        if (param0 != -23009) {
          field_J = (String) null;
        }
        if (CappedUrlRequest.field_e == null) {
          CappedUrlRequest.field_e = new um(og.field_Yb, 20, 0, 0, 0, 11579568, -1, 0, 0, og.field_Yb.ascent, -1, 2147483647, true);
        }
        return CappedUrlRequest.field_e;
    }

    final void a(int param0, int param1, int param2, oc param3, int param4, int param5) {
        try {
          super.a(param0, param1, param2, param3, param4, param5);
          this.field_n = 0;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "dn.GA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void b(int param0, int param1, int param2) {
        int var3 = -51 / ((-23 - param1) / 62);
        BitPacketBuffer var4 = k.outgoingPackets;
        var4.writeCipheredOpcode(-13413, param2);
        var4.writeByte(-100, 3);
        var4.writeByte(-15, 10);
        var4.writeShort((byte) 122, param0);
    }

    final StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        StringBuilder discarded$64 = null;
        StringBuilder discarded$65 = null;
        RuntimeException var5 = null;
        StringBuilder var6 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param3, 1595637992, param0, param1)) {
            this.a(param1, param0, 0, param3);
            this.a(param3, true, param1, param0);
            discarded$64 = param3.append(" revert=").append(this.field_L);
            if (this.field_I != 2147483647 &&
              this.field_O != 2147483647) {
              discarded$65 = param3.append(" to ").append(this.field_I).append(',').append(this.field_O);
            }
          }
          if (param2 != 24) {
            var6 = (StringBuilder) null;
            this.a(-94, (Hashtable) null, 17, (StringBuilder) null);
          }
          stackIn_8_0 = (StringBuilder) (param3);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("dn.UA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_J = "<%0> is already on your ignore list.";
    }
}
