/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class gna extends elb {
    private int field_j;
    private int field_l;
    static String field_m;
    private byte[] field_i;
    private int[] field_k;

    final void a(int param0, int param1, int param2) {
        int var4 = -50 / ((-53 - param0) / 48);
        this.field_j = this.field_j + (param2 * this.field_k[param1] >> 761290252);
    }

    final static void a(Throwable param0, String param1, int param2) {
        try {
            eab stackIn_13_0;
            java.net.URL stackIn_13_1;
            java.net.URL stackIn_13_2;
            java.net.URL stackIn_13_3;
            StringBuilder stackIn_13_4;
            eab stackIn_14_0;
            java.net.URL stackIn_14_1;
            java.net.URL stackIn_14_2;
            java.net.URL stackIn_14_3;
            StringBuilder stackIn_14_4;
            String stackIn_14_5;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var3 = null;
            Exception var3_ref = null;
            mob var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            var6 = VoidHunters.field_G;
            try {
              L0: {
                L1: {
                  var3 = "";
                  if (param0 != null) {
                    var3 = eva.a(true, param0);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param1 == null) {
                    break L2;
                  } else {
                    L3: {
                      if (param0 == null) {
                        break L3;
                      } else {
                        var3 = var3 + " | ";
                        break L3;
                      }
                    }
                    var3 = var3 + param1;
                    break L2;
                  }
                }
                pa.a(var3, 3);
                var7 = sh.a("%3a", ":", var3, param2 + param2);
                var8 = sh.a("%40", "@", var7, param2 + 0);
                var9 = sh.a("%26", "&", var8, 0);
                var10 = sh.a("%23", "#", var9, param2 + 0);
                if (null == qv.field_p) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  L4: {
                    stackIn_13_0 = vpa.field_b;

                    stackIn_13_1 = null;

                    stackIn_13_2 = null;

                    stackIn_13_3 = qv.field_p.getCodeBase();

                    stackIn_13_4 = new StringBuilder().append("clienterror.ws?c=").append(w.field_y).append("&u=");

                    if (null != ku.field_d) {
                      stackIn_14_0 = (eab) ((Object) stackIn_13_0);
                      stackIn_14_1 = null;
                      stackIn_14_2 = null;
                      stackIn_14_3 = (java.net.URL) ((Object) stackIn_13_3);
                      stackIn_14_4 = (StringBuilder) ((Object) stackIn_13_4);
                      stackIn_14_5 = ku.field_d;
                      break L4;
                    } else {
                      stackIn_14_0 = (eab) ((Object) stackIn_13_0);
                      stackIn_14_1 = null;
                      stackIn_14_2 = null;
                      stackIn_14_3 = (java.net.URL) ((Object) stackIn_13_3);
                      stackIn_14_4 = (StringBuilder) ((Object) stackIn_13_4);
                      stackIn_14_5 = "" + tia.field_C;
                      break L4;
                    }
                  }
                  var4 = ((eab) (Object) stackIn_14_0).a(new java.net.URL(stackIn_14_3, stackIn_14_5 + "&v1=" + eab.field_w + "&v2=" + eab.field_r + "&e=" + var10), 108);
                  L5: while (true) {
                    if (var4.field_f != 0) {
                      L6: {
                        if (var4.field_f != 1) {
                          break L6;
                        } else {
                          var5 = (DataInputStream) (var4.field_d);
                          var5.read();
                          var5.close();
                          break L6;
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      gdb.b(120, 1L);
                      continue L5;
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L7: {
                var3_ref = (Exception) (Object) decompiledCaughtException;
                decompiledRegionSelector0 = 1;
                break L7;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    void a(int param0, int param1, byte param2) {
        int fieldTemp$0 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_i[fieldTemp$0] = (byte)((dla.a((int) param2, 255) >> 1111320769) + 127);
        if (param0 != 1111320769) {
            this.a(-23, -5, 87);
        }
    }

    final void a(int param0) {
        int fieldTemp$0 = 0;
        this.field_j = Math.abs(this.field_j);
        if (-4097 >= (this.field_j ^ -1)) {
            this.field_j = 4095;
            fieldTemp$0 = this.field_l;
            this.field_l = this.field_l + 1;
            this.a(1111320769, fieldTemp$0, (byte)(this.field_j >> -36128892));
            if (param0 != 1424903724) {
                return;
            }
            this.field_j = 0;
            return;
        }
        int fieldTemp$1 = this.field_l;
        this.field_l = this.field_l + 1;
        this.a(1111320769, fieldTemp$1, (byte)(this.field_j >> -36128892));
        if (param0 != 1424903724) {
            return;
        }
        this.field_j = 0;
    }

    final void a(boolean param0) {
        this.field_j = 0;
        if (!param0) {
            return;
        }
        this.field_l = 0;
    }

    gna(int param0, int param1, int param2, int param3, int param4, float param5) {
        super(param0, param1, param2, param3, param4);
        int var7 = 0;
        this.field_k = new int[this.field_a];
        for (var7 = 0; var7 < this.field_a; var7++) {
            this.field_k[var7] = (short)(int)(Math.pow((double)param5, (double)var7) * 4096.0);
        }
    }

    public static void b(boolean param0) {
        if (param0) {
            gna.b(false);
            field_m = null;
            return;
        }
        field_m = null;
    }

    static {
        field_m = "Enter the name you'd prefer. This is the name displayed to other players.";
    }
}
