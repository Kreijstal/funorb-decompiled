/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lla {
    private int field_g;
    static int field_h;
    static int field_e;
    private java.util.zip.Inflater field_j;
    ds field_f;
    private java.util.zip.Deflater field_i;
    private java.util.zip.CRC32 field_a;
    private int field_d;
    static int field_b;
    private int field_c;

    final byte[] a(int param0, byte[] param1) {
        ds var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = new ds(param1);
            var3.field_e = -4 + param1.length;
            var4 = var3.i(11468);
            var3.field_e = param0;
            var5 = new byte[var4];
            this.a(20773, var5, var3);
            stackIn_1_0 = (byte[]) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3_ref);

            stackIn_4_1 = new StringBuilder().append("lla.C(").append(param0).append(',');

            if (param1 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    public lla() {
        this(-1, 1000000, 1000000);
    }

    final void a(int param0, byte[] param1, ds param2) {
        try {
            try {
                if (param2.field_h[param2.field_e] != 31 || -117 != param2.field_h[param2.field_e + 1]) {
                    throw new RuntimeException("");
                }
                if (!(this.field_j != null)) {
                    this.field_j = new java.util.zip.Inflater(true);
                }
                try {
                    this.field_j.setInput(param2.field_h, param2.field_e + 10, -10 - (param2.field_e - -8) + param2.field_h.length);
                    if (param0 != 20773) {
                        field_e = 59;
                    }
                    this.field_j.inflate(param1);
                } catch (Exception exception) {
                    this.field_j.reset();
                    throw new RuntimeException("");
                }
                this.field_j.reset();
            } catch (RuntimeException runtimeException) {
                throw rta.a((Throwable) ((Object) runtimeException), "lla.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        byte[] var7 = null;
        int var8 = 0;
        byte[] var9 = null;
        byte[] var10 = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (null == this.field_f) {
                this.field_i = new java.util.zip.Deflater(this.field_c, true);
                this.field_a = new java.util.zip.CRC32();
                this.field_f = new ds(this.field_g);
                this.field_f.a(0, pb.field_f, -1, pb.field_f.length);
                break L1;
              } else {
                this.field_f.field_e = pb.field_f.length;
                break L1;
              }
            }
            this.field_a.update(param2, param1, param3);
            this.field_i.setInput(param2, param1, param3);
            this.field_i.finish();
            var5_int = 1;
            L2: while (true) {
              L3: {
                var6 = this.field_f.field_h.length + -this.field_f.field_e;
                if ((var6 ^ -1) > -9) {
                  var10 = new byte[this.field_d + this.field_f.field_h.length];
                  var9 = var10;
                  var7 = var9;
                  cua.a(this.field_f.field_h, 0, var10, 0, this.field_f.field_e);
                  var6 = var6 + this.field_d;
                  this.field_f.field_h = var7;
                  if (var5_int == 0) {
                    break L3;
                  } else {
                    var5_int = 0;
                    System.out.println("[blue]Warning: GZIP deflate buffer required expanding[/blue]");
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              if (this.field_i.finished()) {
                this.field_f.a((byte) 103, (int)this.field_a.getValue());
                if (param0 >= 72) {
                  this.field_f.a((byte) 93, this.field_i.getTotalIn());
                  this.field_i.reset();
                  this.field_a.reset();
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                this.field_f.field_e = this.field_f.field_e + this.field_i.deflate(this.field_f.field_h, this.field_f.field_e, var6);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var5);

            stackIn_17_1 = new StringBuilder().append("lla.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private lla(int param0, int param1, int param2) {
        this.field_d = param2;
        this.field_g = param1;
        this.field_c = param0;
    }

    static {
        field_h = 2;
        field_b = 200;
        field_e = field_b / 2;
    }
}
