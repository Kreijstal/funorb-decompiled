/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bc {
    private int field_c;
    static String field_h;
    static String field_d;
    private ue field_g;
    static String field_f;
    static IndexedSprite[][] field_j;
    static String field_k;
    private ue field_l;
    private int field_b;
    static GameplayController field_a;
    static boolean field_e;
    static String field_i;

    final boolean a(int param0, int param1, byte[] param2, int param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        Throwable var8 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          var5 = this.field_l;
          synchronized (var5) {
            if (param1 >= 0 &&
              this.field_c >= param1) {
              var6 = this.a(param3, param2, true, param1, (byte) -52) ? 1 : 0;
              var7 = -85 % ((param0 + 68) / 56);
              if (var6 == 0) {
                var6 = this.a(param3, param2, false, param1, (byte) 104) ? 1 : 0;
              }
              stackIn_8_0 = var6;
            } else {
              throw new IllegalArgumentException();
            }
          }
          return stackIn_8_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_13_0 = var5_ref;
          stackIn_13_1 = new StringBuilder().append("bc.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (param0 != 2858) {
          mo var2 = (mo) null;
          bc.a(-95, (mo) null);
        }
        ng.x(90);
    }

    final static void a(int param0, mo param1) {
        int dupTemp$3 = 0;
        int dupTemp$0 = 0;
        int var3 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          for (var2_int = 0; var2_int < 3; var2_int++) {
            MoveAttackRequest.field_D[var2_int] = 0;
          }
          for (var2_intLifetime1 = 0; var2_intLifetime1 < lk.field_h; var2_intLifetime1++) {
            if (param1.field_b == an.field_F[var2_intLifetime1].field_b) {
              dupTemp$3 = an.field_F[var2_intLifetime1].a(true);
              MoveAttackRequest.field_D[dupTemp$3] = MoveAttackRequest.field_D[dupTemp$3] + 1;
            }
          }
          dupTemp$0 = param1.a(true);
          MoveAttackRequest.field_D[dupTemp$0] = MoveAttackRequest.field_D[dupTemp$0] + 1;
          var2_intLifetime2 = 0;
          for (var3 = 0; var3 < lk.field_h; var3++) {
            boolean decompiledFrameRemainder0 = true;
            if (~param1.field_b == ~an.field_F[var3].field_b) {
              var4 = an.field_F[var3].a(true);
              if (MoveAttackRequest.field_D[var4] > AnimationPlayer.field_g) {
                MoveAttackRequest.field_D[var4] = MoveAttackRequest.field_D[var4] - 1;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              incrementValue$2 = var2_intLifetime2;
              var2_intLifetime2++;
              an.field_F[incrementValue$2] = an.field_F[var3];
            }
          }
          lk.field_h = var2_intLifetime2;
          if (param0 != 3208) {
            field_k = (String) null;
          }
          fieldTemp$1 = lk.field_h;
          lk.field_h = lk.field_h + 1;
          an.field_F[fieldTemp$1] = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("bc.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    private final boolean a(int param0, byte[] param1, boolean param2, int param3, byte param4) {
        try {
          RuntimeException stackIn_69_0 = null;
          StringBuilder stackIn_69_1 = null;
          String stackIn_70_2 = null;
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
          int var14 = 0;
          EOFException var15 = null;
          int var17 = 0;
          var17 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
          try {
            var6 = this.field_l;
            synchronized (var6) {
              try {
                if (param2) {
                  if (this.field_g.a(true) < (long)(6 * param0 + 6)) {
                    return false;
                  }
                  this.field_g.a(-1, (long)(param0 * 6));
                  this.field_g.a(0, tn.field_db, (byte) -103, 6);
                  var7_int = ((255 & tn.field_db[3]) << 16) + (tn.field_db[4] << 8 & 65280) + (tn.field_db[5] & 255);
                  if (var7_int <= 0 ||
                    !((long)var7_int <= this.field_l.a(true) / 520L)) {
                    return false;
                  }
                } else {
                  var7_int = (int)((519L + this.field_l.a(true)) / 520L);
                  if (var7_int == 0) {
                    var7_int = 1;
                  }
                }
                tn.field_db[2] = (byte)param3;
                tn.field_db[5] = (byte)var7_int;
                tn.field_db[3] = (byte)(var7_int >> 16);
                tn.field_db[1] = (byte)(param3 >> 8);
                tn.field_db[4] = (byte)(var7_int >> 8);
                var8 = 27 / ((66 - param4) / 35);
                tn.field_db[0] = (byte)(param3 >> 16);
                this.field_g.a(-1, (long)(param0 * 6));
                this.field_g.a(6, 0, (byte) 56, tn.field_db);
                var9 = 0;
                var10 = 0;
                scanLoop1: while (true) {
                  if (param3 > var9) {
                    boolean decompiledFrameRemainder0 = true;
                    var11 = 0;
                    if (param2) {
                      this.field_l.a(-1, (long)(520 * var7_int));
                      if (65535 >= param0) {
                        try {
                          this.field_l.a(0, tn.field_db, (byte) -103, 8);
                          decompiledRegionSelector0 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var15 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                        }
                        if (decompiledRegionSelector0 != 0) {
                          break scanLoop1;
                        }
                        var13 = (tn.field_db[3] & 255) + (65280 & tn.field_db[2] << 8);
                        var11 = (255 & tn.field_db[6]) + ((16711680 & tn.field_db[4] << 16) + (tn.field_db[5] << 8 & 65280));
                        var12 = (255 & tn.field_db[1]) + ((255 & tn.field_db[0]) << 8);
                        var14 = tn.field_db[7] & 255;
                      } else {
                        try {
                          this.field_l.a(0, tn.field_db, (byte) -103, 10);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          var15 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector1 = 1;
                        }
                        if (decompiledRegionSelector1 != 0) {
                          break scanLoop1;
                        }
                        var11 = (255 & tn.field_db[8]) + (16711680 & tn.field_db[6] << 16) + (65280 & tn.field_db[7] << 8);
                        var12 = (255 & tn.field_db[3]) + ((tn.field_db[1] << 16 & 16711680) + (((255 & tn.field_db[0]) << 24) + ((255 & tn.field_db[2]) << 8)));
                        var14 = tn.field_db[9] & 255;
                        var13 = ((255 & tn.field_db[4]) << 8) + (tn.field_db[5] & 255);
                      }
                      if ((param0 == var12 &&
                        var10 == var13 &&
                        var14 == this.field_b) &&
                        (decompiledFrameRemainder0 = (!(var11 >= 0) ||
                        !(this.field_l.a(true) / 520L >= (long)var11)))) {
                        return false;
                      }
                      if (decompiledFrameRemainder0) {
                        return false;
                      }
                    }
                    if (var11 == 0) {
                      var11 = (int)((this.field_l.a(true) + 519L) / 520L);
                      param2 = false;
                      if (var11 == 0) {
                        var11++;
                      }
                      if (var7_int == var11) {
                        var11++;
                      }
                    }
                    if (param3 - var9 <= 512) {
                      var11 = 0;
                    }
                    if (param0 > 65535) {
                      tn.field_db[6] = (byte)(var11 >> 16);
                      tn.field_db[0] = (byte)(param0 >> 24);
                      tn.field_db[3] = (byte)param0;
                      tn.field_db[4] = (byte)(var10 >> 8);
                      tn.field_db[9] = (byte)this.field_b;
                      tn.field_db[1] = (byte)(param0 >> 16);
                      tn.field_db[7] = (byte)(var11 >> 8);
                      tn.field_db[2] = (byte)(param0 >> 8);
                      tn.field_db[5] = (byte)var10;
                      tn.field_db[8] = (byte)var11;
                      this.field_l.a(-1, (long)(var7_int * 520));
                      this.field_l.a(10, 0, (byte) 63, tn.field_db);
                      var12 = -var9 + param3;
                      if (510 < var12) {
                        var12 = 510;
                      }
                      this.field_l.a(var12, var9, (byte) 110, param1);
                      var9 = var9 + var12;
                    } else {
                      tn.field_db[2] = (byte)(var10 >> 8);
                      tn.field_db[0] = (byte)(param0 >> 8);
                      tn.field_db[3] = (byte)var10;
                      tn.field_db[1] = (byte)param0;
                      tn.field_db[7] = (byte)this.field_b;
                      tn.field_db[4] = (byte)(var11 >> 16);
                      tn.field_db[6] = (byte)var11;
                      tn.field_db[5] = (byte)(var11 >> 8);
                      this.field_l.a(-1, (long)(var7_int * 520));
                      this.field_l.a(8, 0, (byte) 44, tn.field_db);
                      var12 = param3 - var9;
                      if (var12 > 512) {
                        var12 = 512;
                      }
                      this.field_l.a(var12, var9, (byte) 78, param1);
                      var9 = var9 + var12;
                    }
                    var7_int = var11;
                    var10++;
                    continue;
                  }
                  break;
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
            stackIn_69_0 = var6_ref;
            stackIn_69_1 = new StringBuilder().append("bc.F(").append(param0).append(',');
            if (param1 == null) {
              stackIn_70_2 = "null";
            } else {
              stackIn_70_2 = "{...}";
            }
            throw ig.addExceptionContext((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        return "" + this.field_b;
    }

    final byte[] a(int param0, int param1) {
        try {
          int var16 = 0;
          int incrementValue$2 = 0;
          Object var3 = null;
          Object var3_ref = null;
          int var4_int = 0;
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
          int var18 = 0;
          Object stackIn_3_0 = null;
          Object stackIn_43_0 = null;
          byte[] stackIn_49_0 = null;
          Object stackIn_52_0 = null;
          Throwable decompiledCaughtException = null;
          IOException var4 = null;
          var18 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
          var3_ref = this.field_l;
          synchronized (var3_ref) {
            try {
              if ((long)(6 * param1 + 6) > this.field_g.a(true)) {
                stackIn_3_0 = null;
                return (byte[]) (stackIn_3_0);
              }
              this.field_g.a(-1, (long)(6 * param1));
              this.field_g.a(0, tn.field_db, (byte) -103, 6);
              var4_int = (tn.field_db[0] << 16 & 16711680) + (tn.field_db[1] << 8 & 65280) + (tn.field_db[2] & 255);
              var5 = (tn.field_db[3] << 16 & 16711680) - (-(65280 & tn.field_db[4] << 8) - (255 & tn.field_db[5]));
              if (0 > var4_int) {
                return null;
              }
              if (var4_int > this.field_c) {
                return null;
              }
              if (param0 >= var5) {
                return null;
              }
              if ((long)var5 > this.field_l.a(true) / 520L) {
                return null;
              }
              var6 = new byte[var4_int];
              var7 = 0;
              var8 = 0;
              while (var4_int > var7) {
                if (var5 == 0) {
                  return null;
                }
                this.field_l.a(-1, (long)(var5 * 520));
                var9 = var4_int - var7;
                if (65535 < param1) {
                  if (var9 > 510) {
                    var9 = 510;
                  }
                  var14 = 10;
                  this.field_l.a(0, tn.field_db, (byte) -103, var9 + var14);
                  var11 = (65280 & tn.field_db[4] << 8) + (tn.field_db[5] & 255);
                  var13 = tn.field_db[9] & 255;
                  var12 = ((tn.field_db[7] & 255) << 8) + (16711680 & tn.field_db[6] << 16) + (255 & tn.field_db[8]);
                  var10 = ((tn.field_db[0] & 255) << 24) - (-((tn.field_db[1] & 255) << 16) - ((tn.field_db[2] & 255) << 8)) + (tn.field_db[3] & 255);
                } else {
                  var14 = 8;
                  if (var9 > 512) {
                    var9 = 512;
                  }
                  this.field_l.a(0, tn.field_db, (byte) -103, var14 + var9);
                  var10 = (255 & tn.field_db[1]) + ((tn.field_db[0] & 255) << 8);
                  var11 = (255 & tn.field_db[3]) + ((tn.field_db[2] & 255) << 8);
                  var13 = tn.field_db[7] & 255;
                  var12 = (tn.field_db[6] & 255) + ((255 & tn.field_db[5]) << 8) + (16711680 & tn.field_db[4] << 16);
                }
                if (var10 != param1) {
                  return null;
                }
                if (var8 != var11) {
                  return null;
                }
                if (var13 != this.field_b) {
                  return null;
                }
                if (0 > var12) {
                  return null;
                }
                if ((long)var12 > this.field_l.a(true) / 520L) {
                  stackIn_43_0 = null;
                  return (byte[]) (stackIn_43_0);
                }
                var15 = var9 + var14;
                var8++;
                var5 = var12;
                for (var16 = var14; var16 < var15; var16++) {
                  incrementValue$2 = var7;
                  var7++;
                  var6[incrementValue$2] = tn.field_db[var16];
                }
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

    bc(int param0, ue param1, ue param2, int param3) {
        this.field_c = 65000;
        this.field_l = null;
        this.field_g = null;
        try {
          this.field_l = param1;
          this.field_g = param2;
          this.field_b = param0;
          this.field_c = param3;
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "bc.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void b(int param0) {
        field_a = null;
        field_k = null;
        if (param0 != 1) {
          bc.b(11);
        }
        field_f = null;
        field_h = null;
        field_j = (IndexedSprite[][]) null;
        field_i = null;
        field_d = null;
    }

    static {
        field_d = "Invalid name";
        field_h = "Talons are of no use to ground units.";
        field_f = "Please wait";
        field_k = "Spectate <%0>'s game";
        field_i = "Unpacking graphics";
    }
}
