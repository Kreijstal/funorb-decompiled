/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vi extends qm {
    static String[] field_p;
    private sc field_q;
    static String field_n;
    private sc[] field_o;

    final static void a(byte param0, String param1, java.applet.Applet param2) {
        try {
          String stackIn_9_2 = null;
          String stackIn_12_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              if (param0 != 103) {
                return;
              }
              java.net.URL var3 = new java.net.URL(param2.getCodeBase(), param1);
              var3 = jf.a(param2, var3, param0 ^ 54);
              wc.a(var3.toString(), param2, param0 + 14198, true);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              Exception var3_ref = (Exception) (Object) decompiledCaughtException;
              var3_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            RuntimeException var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_8_0 = var3_ref2;
            StringBuilder stackIn_8_1 = new StringBuilder().append("vi.P(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            StringBuilder stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
            if (param2 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            throw pn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(boolean param0, vi param1, boolean param2) {
        sc stackIn_11_1 = null;
        String stackIn_18_2 = null;
        int var7 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param2) {
            return;
          }
          super.a(param1, 27529);
          if (param0) {
            for (int var4_int = 0; 6 > var4_int; var4_int++) {
              sc var5 = this.field_o[var4_int];
              if (var5 == null) {
                param1.field_o[var4_int] = null;
              } else {
                sc var6 = param1.field_o[var4_int];
                sc stackIn_10_0 = var5;
                if (var6 != null) {
                  stackIn_11_1 = var6;
                } else {
                  sc dupTemp$0 = new sc();
                  param1.field_o[var4_int] = dupTemp$0;
                  stackIn_11_1 = dupTemp$0;
                }
                ((sc) (Object) stackIn_10_0).a(stackIn_11_1, (byte) -22);
              }
            }
            return;
          }
          au.a(this.field_o, 0, param1.field_o, 0, 6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var4;
          StringBuilder stackIn_17_1 = new StringBuilder().append("vi.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    final sc a(int param0, int param1) {
        if (param0 >= -40) {
          PacketBuffer var4 = (PacketBuffer) null;
          vi.a((byte) 62, (PacketBuffer) null);
        }
        sc dupTemp$0 = new sc();
        this.field_o[param1] = dupTemp$0;
        return dupTemp$0;
    }

    public static void a(boolean param0) {
        field_p = null;
        field_n = null;
        if (param0) {
          field_p = (String[]) null;
        }
    }

    public vi() {
        this.field_o = new sc[6];
        this.field_q = new sc();
        sc dupTemp$0 = new sc();
        this.field_o[0] = dupTemp$0;
        sc var1 = dupTemp$0;
        var1.a(-70);
    }

    public final void a(boolean param0, int param1, int param2, ea param3, int param4) {
        ea stackIn_5_0 = null;
        String stackIn_32_2 = null;
        try {
          if (param1 != -7592) {
            PacketBuffer var10 = (PacketBuffer) null;
            vi.a((byte) -20, (PacketBuffer) null);
          }
          if (param3 instanceof mi) {
            stackIn_5_0 = (ea) (param3);
          } else {
            stackIn_5_0 = null;
          }
          mi var11 = (mi) (stackIn_5_0);
          fp.a((byte) 67, param4 + param3.field_h, param3.field_n + param3.field_h + param4, param3.field_q + (param2 + param3.field_p), param3.field_p + param2);
          if (var11 != null) {
            param0 = param0 & var11.field_u;
          }
          sc var7 = this.field_o[0];
          this.field_q.a(-93);
          var7.a(this, param4, (byte) -107, param2, param3, this.field_q);
          if (var11 != null) {
            if (var11.field_s) {
              sc var12 = this.field_o[1];
              if (var12 != null) {
                var12.a(this, param4, (byte) -107, param2, param3, this.field_q);
              }
            }
            if (var11.field_g) {
              sc var13 = this.field_o[3];
              if (var11.field_i != 0 &&
                var13 != null) {
                var13.a(this, param4, (byte) -107, param2, param3, this.field_q);
              } else {
                sc var9 = this.field_o[2];
                if (var9 != null) {
                  var9.a(this, param4, (byte) -107, param2, param3, this.field_q);
                }
              }
            }
          }
          if (param3.e(28660)) {
            sc var14 = this.field_o[5];
            if (var14 != null) {
              var14.a(this, param4, (byte) -107, param2, param3, this.field_q);
            }
          }
          if (!param0) {
            sc var15 = this.field_o[4];
            if (var15 != null) {
              var15.a(this, param4, (byte) -107, param2, param3, this.field_q);
            }
          }
          this.field_q.a(param3, true, param2, this, param4);
          sl.c(2765);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_31_0 = var6;
          StringBuilder stackIn_31_1 = new StringBuilder().append("vi.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param4).append(')').toString());
        }
    }

    final void a(byte param0, Sprite param1) {
        String stackIn_13_2 = null;
        int var6 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          sc[] var8 = this.field_o;
          sc[] var3 = var8;
          for (int var4 = 0; var8.length > var4; var4++) {
            sc var5 = var8[var4];
            if (var5 != null) {
              var5.field_f = param1;
            }
          }
          if (param0 != -90) {
            Sprite[] var7 = (Sprite[]) null;
            this.a(65, (Sprite[]) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var3_ref;
          StringBuilder stackIn_12_1 = new StringBuilder().append("vi.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, Sprite[] param2) {
        try {
          int var4_int = param0;
          if (param1 != 0) {
            field_p = (String[]) null;
          }
          if (null == this.field_o[var4_int]) {
            this.field_o[var4_int] = new sc();
          }
          this.field_o[param0].field_d = param2;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "vi.R(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    vi(vi param0, boolean param1) {
        this();
        try {
          param0.a(param1, this, false);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "vi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, Sprite[] param1) {
        String stackIn_12_2 = null;
        int var6 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          sc[] var8 = this.field_o;
          sc[] var3 = var8;
          for (int var4 = 0; var8.length > var4; var4++) {
            sc var5 = var8[var4];
            if (var5 != null) {
              var5.field_d = param1;
            }
          }
          if (param0 > -32) {
            Sprite var7 = (Sprite) null;
            this.a((byte) -114, (Sprite) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_11_0 = var3_ref;
          StringBuilder stackIn_11_1 = new StringBuilder().append("vi.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static void a(byte param0, PacketBuffer param1) {
        try {
          int var3_int = 0;
          String stackIn_22_2 = null;
          Throwable decompiledCaughtException = null;
          int var5 = AceOfSkies.obfuscationControl ? 1 : 0;
          try {
            byte[] var10 = new byte[24];
            byte[] var8 = var10;
            byte[] var7 = var8;
            byte[] var11 = var7;
            byte[] var9 = var11;
            byte[] var2 = var9;
            if (BitmapFontMetrics.field_g != null) {
              try {
                BitmapFontMetrics.field_g.a(true, 0L);
                BitmapFontMetrics.field_g.a(var10, param0 ^ -13542);
                for (var3_int = 0; var3_int < 24; var3_int++) {
                  if (0 == var11[var3_int]) {
                    continue;
                  }
                  break;
                }
                if (var3_int >= 24) {
                  throw new IOException();
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                Exception var3 = (Exception) (Object) decompiledCaughtException;
                for (int var4 = 0; var4 < 24; var4++) {
                  var2[var4] = (byte)-1;
                }
              }
            }
            if (param0 != -1) {
              PacketBuffer var6 = (PacketBuffer) null;
              vi.a((byte) -110, (PacketBuffer) null);
            }
            param1.a(true, 24, 0, var11);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            RuntimeException runtimeException = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_21_0 = runtimeException;
            StringBuilder stackIn_21_1 = new StringBuilder().append("vi.S(").append(param0).append(',');
            if (param1 == null) {
              stackIn_22_2 = "null";
            } else {
              stackIn_22_2 = "{...}";
            }
            throw pn.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_p = new String[100];
        field_n = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
    }
}
