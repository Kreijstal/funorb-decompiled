/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cna extends llb {
    static String field_wb;
    private llb field_vb;
    static String field_xb;
    llb field_yb;
    static int[] field_zb;

    public static void h(int param0) {
        field_zb = null;
        if (param0 != 1) {
            field_wb = (String) null;
            field_xb = null;
            field_wb = null;
            return;
        }
        field_xb = null;
        field_wb = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.a(param1, -79, param5, param0, param6);
        this.a((byte) -98, param3, param4);
        if (param2 >= -114) {
            this.a(14, -14, 125, -124, -11, -99, -44);
        }
    }

    cna(long param0, llb param1, llb param2, llb param3, phb param4, String param5) {
        super(param0, param1);
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        try {
          L0: {
            L1: {
              if (param4 == null) {
                break L1;
              } else {
                this.field_vb = new llb(0L, param2);
                this.field_vb.field_tb = param4;
                this.b(-561, this.field_vb);
                break L1;
              }
            }
            L2: {
              if (param5 != null) {
                this.field_yb = new llb(0L, param3, param5);
                this.b(-561, this.field_yb);
                this.g(109);
                break L2;
              } else {
                this.g(109);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var8);

            stackIn_9_1 = new StringBuilder().append("cna.<init>(").append(param0).append(',');

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


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
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
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param5 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), stackIn_22_2 + ')');
        }
    }

    final int a(int param0, int param1, int param2) {
        int var4;
        int var5;
        L0: {
          var4 = -param0;
          if (this.field_vb == null) {
            break L0;
          } else {
            var4 = this.field_vb.e(58);
            break L0;
          }
        }
        if (param2 >= -52) {
          return 23;
        } else {
          L1: {
            var5 = -param0;
            if (null != this.field_yb) {
              var5 = this.field_yb.e(17);
              break L1;
            } else {
              break L1;
            }
          }
          return var5 + (param0 + param1 - -var4) - -param1;
        }
    }

    private final void a(byte param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        L0: {
          var5 = 60 % ((param0 - -53) / 39);
          var4 = -param2;
          var6 = -param2;
          if (null == this.field_vb) {
            break L0;
          } else {
            var4 = this.field_vb.e(6);
            break L0;
          }
        }
        L1: {
          if (this.field_yb != null) {
            var6 = this.field_yb.a(-param1 + -param2 + (-var4 + -param1 + this.field_hb), (byte) 114);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var7 = var6 + (param1 - -var4) + (param2 + param1);
          if (this.field_hb < var7) {
            var6 = var6 + (this.field_hb + -var7);
            var7 = this.field_hb;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (this.field_F != 1) {
            break L3;
          } else {
            param1 = param1 + (this.field_hb + -var7) / 2;
            break L3;
          }
        }
        L4: {
          if (2 == this.field_F) {
            param1 = param1 + (this.field_hb - var7);
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (null != this.field_vb) {
            this.field_vb.a(param1, 126, var4, 0, this.field_G);
            this.field_vb.field_B = this.field_B;
            break L5;
          } else {
            break L5;
          }
        }
        if (this.field_yb != null) {
          this.field_yb.a(param2 + var4 + param1, 34, var6, 0, this.field_G);
          if (null != this.field_vb) {
            this.field_yb.field_F = 0;
            this.field_yb.field_B = this.field_B;
            return;
          } else {
            this.field_yb.field_F = this.field_F;
            this.field_yb.field_B = this.field_B;
            return;
          }
        } else {
          return;
        }
    }

    static {
        field_wb = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_xb = "Press TAB to chat or F10 to open Quick Chat.";
        field_zb = new int[]{1, 50, 50, 50, 50, 50, 1, 1, 1, 1, 1, 1};
    }
}
