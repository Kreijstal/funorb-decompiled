/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ae {
    static String field_c;
    private int field_a;
    static vc field_f;
    private int field_g;
    static String field_b;
    static String field_e;
    private pf field_h;
    private pf field_d;

    public final String toString() {
        return "" + this.field_a;
    }

    final boolean a(int param0, int param1, byte[] param2, int param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          var5 = this.field_h;
          synchronized (var5) {
            if (param0 >= ~param1 &&
              this.field_g >= param1) {
              var6 = this.a(param2, true, param3, param1, (byte) -15) ? 1 : 0;
              if (var6 == 0) {
                var6 = this.a(param2, false, param3, param1, (byte) -15) ? 1 : 0;
              }
              stackIn_7_0 = var6;
            } else {
              throw new IllegalArgumentException();
            }
          }
          return stackIn_7_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_12_0 = var5_ref;
          stackIn_12_1 = new StringBuilder().append("ae.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean a(byte[] param0, boolean param1, int param2, int param3, byte param4) {
        try {
          RuntimeException stackIn_72_0 = null;
          StringBuilder stackIn_72_1 = null;
          String stackIn_73_2 = null;
          int decompiledRegionSelector0 = 0;
          int decompiledRegionSelector1 = 0;
          Throwable decompiledCaughtException = null;
          Object var6 = null;
          RuntimeException var6_ref = null;
          int var7_int = 0;
          IOException var7 = null;
          int var8 = 0;
          int var9 = 0;
          int var10 = 0;
          int var11 = 0;
          int var12 = 0;
          int var13 = 0;
          EOFException var14 = null;
          int var16 = 0;
          var16 = Confined.field_J ? 1 : 0;
          try {
            var6 = this.field_h;
            synchronized (var6) {
              try {
                if (param1) {
                  if ((long)(param2 * 6 + 6) > this.field_d.b((byte) 97)) {
                    return false;
                  }
                  this.field_d.a((byte) 123, (long)(6 * param2));
                  this.field_d.a(0, gi.field_db, (byte) 122, 6);
                  var7_int = (gi.field_db[5] & 255) + (gi.field_db[3] << 16 & 16711680) + (65280 & gi.field_db[4] << 8);
                  if (var7_int <= 0 ||
                    !((this.field_h.b((byte) 111) / 520L) >= (long)var7_int)) {
                    return false;
                  }
                } else {
                  var7_int = (int)((this.field_h.b((byte) 99) + 519L) / 520L);
                  if (var7_int == 0) {
                    var7_int = 1;
                  }
                }
                gi.field_db[2] = (byte)param3;
                gi.field_db[0] = (byte)(param3 >> 16);
                gi.field_db[4] = (byte)(var7_int >> 8);
                gi.field_db[1] = (byte)(param3 >> 8);
                gi.field_db[5] = (byte)var7_int;
                gi.field_db[3] = (byte)(var7_int >> 16);
                this.field_d.a((byte) 123, (long)(6 * param2));
                this.field_d.a(6, (byte) 9, 0, gi.field_db);
                var8 = 0;
                var9 = 0;
                L3: while (true) {
                  if (param3 > var8) {
                    boolean decompiledFrameRemainder0 = true;
                    var10 = 0;
                    if (param1) {
                      this.field_h.a((byte) 123, (long)(var7_int * 520));
                      if (65535 < param2) {
                        try {
                          this.field_h.a(0, gi.field_db, (byte) 107, 10);
                          decompiledRegionSelector0 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                        }
                        if (decompiledRegionSelector0 != 0) {
                          break L3;
                        }
                        var13 = gi.field_db[9] & 255;
                        var10 = (65280 & gi.field_db[7] << 8) + (((255 & gi.field_db[6]) << 16) + (gi.field_db[8] & 255));
                        var12 = (gi.field_db[5] & 255) + (65280 & gi.field_db[4] << 8);
                        var11 = (16711680 & gi.field_db[1] << 16) + (((gi.field_db[0] & 255) << 24) + (gi.field_db[2] << 8 & 65280)) + (255 & gi.field_db[3]);
                      } else {
                        try {
                          this.field_h.a(0, gi.field_db, (byte) 89, 8);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector1 = 1;
                        }
                        if (decompiledRegionSelector1 != 0) {
                          break L3;
                        }
                        var13 = gi.field_db[7] & 255;
                        var10 = (gi.field_db[6] & 255) + ((16711680 & gi.field_db[4] << 16) + ((255 & gi.field_db[5]) << 8));
                        var12 = (65280 & gi.field_db[2] << 8) + (255 & gi.field_db[3]);
                        var11 = ((255 & gi.field_db[0]) << 8) + (255 & gi.field_db[1]);
                      }
                      if ((var11 == param2 &&
                        var12 == var9 &&
                        this.field_a == var13) &&
                        (decompiledFrameRemainder0 = (!(var10 >= 0) ||
                        !((this.field_h.b((byte) 99) / 520L) >= (long)var10)))) {
                        return false;
                      }
                      if (decompiledFrameRemainder0) {
                        return false;
                      }
                    }
                    if (var10 == 0) {
                      param1 = false;
                      var10 = (int)((519L + this.field_h.b((byte) 113)) / 520L);
                      if (0 == var10) {
                        var10++;
                      }
                      if (var10 == var7_int) {
                        var10++;
                      }
                    }
                    if (-var8 + param3 <= 512) {
                      var10 = 0;
                    }
                    if (param2 > 65535) {
                      gi.field_db[7] = (byte)(var10 >> 8);
                      gi.field_db[1] = (byte)(param2 >> 16);
                      gi.field_db[4] = (byte)(var9 >> 8);
                      gi.field_db[3] = (byte)param2;
                      gi.field_db[0] = (byte)(param2 >> 24);
                      gi.field_db[5] = (byte)var9;
                      gi.field_db[6] = (byte)(var10 >> 16);
                      gi.field_db[8] = (byte)var10;
                      gi.field_db[9] = (byte)this.field_a;
                      gi.field_db[2] = (byte)(param2 >> 8);
                      this.field_h.a((byte) 123, (long)(520 * var7_int));
                      this.field_h.a(10, (byte) 9, 0, gi.field_db);
                      var11 = -var8 + param3;
                      if (510 < var11) {
                        var11 = 510;
                      }
                      this.field_h.a(var11, (byte) 9, var8, param0);
                      var8 = var8 + var11;
                    } else {
                      gi.field_db[2] = (byte)(var9 >> 8);
                      gi.field_db[4] = (byte)(var10 >> 16);
                      gi.field_db[7] = (byte)this.field_a;
                      gi.field_db[6] = (byte)var10;
                      gi.field_db[3] = (byte)var9;
                      gi.field_db[5] = (byte)(var10 >> 8);
                      gi.field_db[1] = (byte)param2;
                      gi.field_db[0] = (byte)(param2 >> 8);
                      this.field_h.a((byte) 123, (long)(520 * var7_int));
                      this.field_h.a(8, (byte) 9, 0, gi.field_db);
                      var11 = -var8 + param3;
                      if (512 < var11) {
                        var11 = 512;
                      }
                      this.field_h.a(var11, (byte) 9, var8, param0);
                      var8 = var8 + var11;
                    }
                    var7_int = var10;
                    var9++;
                    continue;
                  }
                  break;
                }
                if (param4 != -15) {
                  field_e = (String) null;
                }
                return true;
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var7 = (IOException) (Object) decompiledCaughtException;
                return false;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_72_0 = var6_ref;
            stackIn_72_1 = new StringBuilder().append("ae.A(");
            if (param0 == null) {
              stackIn_73_2 = "null";
            } else {
              stackIn_73_2 = "{...}";
            }
            throw sd.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final byte[] a(int param0, int param1) {
        try {
          int var16 = 0;
          int incrementValue$2 = 0;
          Object var3 = null;
          Object var3_ref = null;
          int var4_int = 0;
          IOException var4 = null;
          int var5 = 0;
          byte[] var6 = null;
          int var7 = 0;
          int var8 = 0;
          int var9 = 0;
          int var10 = 0;
          int var11 = 0;
          int var12 = 0;
          int var13 = 0;
          int var14 = 0;
          int var15 = 0;
          Throwable var17 = null;
          int var18 = 0;
          Object stackIn_3_0 = null;
          Object stackIn_9_0 = null;
          Object stackIn_21_0 = null;
          Object stackIn_42_0 = null;
          byte[] stackIn_49_0 = null;
          Object stackIn_52_0 = null;
          Throwable decompiledCaughtException = null;
          var18 = Confined.field_J ? 1 : 0;
          var3_ref = this.field_h;
          synchronized (var3_ref) {
            try {
              if ((long)(6 * param1 + 6) > this.field_d.b((byte) 107)) {
                stackIn_3_0 = null;
                return (byte[]) (stackIn_3_0);
              }
              this.field_d.a((byte) 123, (long)(6 * param1));
              this.field_d.a(0, gi.field_db, (byte) 95, 6);
              var4_int = (gi.field_db[2] & 255) + ((16711680 & gi.field_db[0] << 16) + ((255 & gi.field_db[1]) << 8));
              var5 = ((255 & gi.field_db[3]) << 16) + ((65280 & gi.field_db[param0] << 8) + (gi.field_db[5] & 255));
              if (var4_int < 0) {
                return null;
              }
              if (this.field_g < var4_int) {
                stackIn_9_0 = null;
                return (byte[]) (stackIn_9_0);
              }
              if (var5 <= 0) {
                return null;
              }
              if ((long)var5 > (this.field_h.b((byte) 98) / 520L)) {
                return null;
              }
              var6 = new byte[var4_int];
              var7 = 0;
              var8 = 0;
              while (var4_int > var7) {
                if (var5 == 0) {
                  stackIn_21_0 = null;
                  return (byte[]) (stackIn_21_0);
                }
                this.field_h.a((byte) 123, (long)(520 * var5));
                var9 = -var7 + var4_int;
                if (65535 >= param1) {
                  var14 = 8;
                  if (512 < var9) {
                    var9 = 512;
                  }
                  this.field_h.a(0, gi.field_db, (byte) 96, var9 + var14);
                  var11 = (gi.field_db[3] & 255) + (65280 & gi.field_db[2] << 8);
                  var10 = (255 & gi.field_db[1]) + ((gi.field_db[0] & 255) << 8);
                  var12 = (255 & gi.field_db[6]) + (gi.field_db[5] << 8 & 65280) + (16711680 & gi.field_db[4] << 16);
                  var13 = 255 & gi.field_db[7];
                } else {
                  var14 = 10;
                  if (var9 > 510) {
                    var9 = 510;
                  }
                  this.field_h.a(0, gi.field_db, (byte) 119, var14 + var9);
                  var11 = (255 & gi.field_db[5]) + (65280 & gi.field_db[4] << 8);
                  var12 = (gi.field_db[8] & 255) + (gi.field_db[7] << 8 & 65280) + (gi.field_db[6] << 16 & 16711680);
                  var13 = 255 & gi.field_db[9];
                  var10 = (gi.field_db[3] & 255) + (((255 & gi.field_db[1]) << 16) + ((255 & gi.field_db[0]) << 24) + (65280 & gi.field_db[2] << 8));
                }
                if (var10 != param1) {
                  return null;
                }
                if (var11 != var8) {
                  return null;
                }
                if (var13 != this.field_a) {
                  return null;
                }
                if (var12 < 0) {
                  return null;
                }
                if ((long)var12 > (this.field_h.b((byte) 106) / 520L)) {
                  stackIn_42_0 = null;
                  return (byte[]) (stackIn_42_0);
                }
                var15 = var9 + var14;
                for (var16 = var14; var15 > var16; var16++) {
                  incrementValue$2 = var7;
                  var7++;
                  var6[incrementValue$2] = gi.field_db[var16];
                }
                var8++;
                var5 = var12;
              }
              stackIn_49_0 = var6;
              return stackIn_49_0;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (IOException) (Object) decompiledCaughtException;
              stackIn_52_0 = null;
              return (byte[]) (stackIn_52_0);
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        if (param0 < 12) {
          String var2 = (String) null;
          ae.a((String) null, -84);
        }
        field_f = null;
        field_c = null;
        field_e = null;
        field_b = null;
    }

    final static void a(String param0, int param1) {
        try {
          if (param1 != 0) {
            String var3 = (String) null;
            ae.a((String) null, -38);
          }
          ag.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ae.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ae(int param0, pf param1, pf param2, int param3) {
        this.field_h = null;
        this.field_d = null;
        this.field_g = 65000;
        try {
          this.field_h = param1;
          this.field_a = param0;
          this.field_d = param2;
          this.field_g = param3;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ae.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_b = "Press <%0> to fire your nuclear missile when you most need it";
        field_e = "You already have spread fire";
        field_c = "<col=FFFFFF>Shield:</col> upgrade awarded every four levels or if you've missed one; restore awarded if your shield is low or lost.";
    }
}
