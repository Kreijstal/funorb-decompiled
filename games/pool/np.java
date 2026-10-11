/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class np {
    private int field_h;
    private ir field_i;
    static String field_a;
    static int field_d;
    static String field_c;
    private ir field_f;
    static String field_g;
    private int field_b;
    static String field_e;

    public static void a(boolean param0) {
        field_c = null;
        field_e = null;
        field_g = null;
        field_a = null;
        if (!param0) {
          String var2 = (String) null;
          np.a(true, (String) null, true, true, -64, (String) null);
        }
    }

    final byte[] a(byte param0, int param1) {
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
          byte[] stackIn_7_0 = null;
          Object stackIn_19_0 = null;
          Object stackIn_47_0 = null;
          byte[] stackIn_54_0 = null;
          Object stackIn_57_0 = null;
          Throwable decompiledCaughtException = null;
          var18 = Pool.field_O;
          var3_ref = this.field_i;
          synchronized (var3_ref) {
            try {
              if (this.field_f.d((byte) 17) < (long)(6 + param1 * 6)) {
                stackIn_3_0 = null;
                return (byte[]) (stackIn_3_0);
              }
              this.field_f.a(0, (long)(param1 * 6));
              if (param0 != -110) {
                stackIn_7_0 = (byte[]) null;
                return stackIn_7_0;
              }
              this.field_f.a((byte) -111, 6, 0, dg.field_S);
              var4_int = (dg.field_S[2] & 255) + (16711680 & dg.field_S[0] << 16) + (dg.field_S[1] << 8 & 65280);
              var5 = (255 & dg.field_S[5]) + (dg.field_S[3] << 16 & 16711680) + (dg.field_S[4] << 8 & 65280);
              if (var4_int < 0) {
                return null;
              }
              if (var4_int > this.field_b) {
                return null;
              }
              if (var5 <= 0) {
                return null;
              }
              if (this.field_i.d((byte) 17) / 520L < (long)var5) {
                stackIn_19_0 = null;
                return (byte[]) (stackIn_19_0);
              }
              var6 = new byte[var4_int];
              var7 = 0;
              var8 = 0;
              while (var7 < var4_int) {
                if (var5 == 0) {
                  return null;
                }
                this.field_i.a(param0 ^ -110, (long)(520 * var5));
                var9 = var4_int - var7;
                if (65535 >= param1) {
                  if (var9 > 512) {
                    var9 = 512;
                  }
                  var14 = 8;
                  this.field_i.a((byte) -115, var14 + var9, 0, dg.field_S);
                  var12 = (dg.field_S[5] << 8 & 65280) + (dg.field_S[4] << 16 & 16711680) + (dg.field_S[6] & 255);
                  var11 = ((dg.field_S[2] & 255) << 8) + (dg.field_S[3] & 255);
                  var13 = dg.field_S[7] & 255;
                  var10 = (dg.field_S[1] & 255) + (65280 & dg.field_S[0] << 8);
                } else {
                  if (var9 > 510) {
                    var9 = 510;
                  }
                  var14 = 10;
                  this.field_i.a((byte) -126, var9 + var14, 0, dg.field_S);
                  var12 = (dg.field_S[7] << 8 & 65280) + (16711680 & dg.field_S[6] << 16) + (255 & dg.field_S[8]);
                  var13 = dg.field_S[9] & 255;
                  var11 = (255 & dg.field_S[5]) + (dg.field_S[4] << 8 & 65280);
                  var10 = (dg.field_S[3] & 255) + (-16777216 & dg.field_S[0] << 24) + ((dg.field_S[1] & 255) << 16) + ((dg.field_S[2] & 255) << 8);
                }
                if (var10 != param1) {
                  return null;
                }
                if (var11 != var8) {
                  return null;
                }
                if (var13 != this.field_h) {
                  return null;
                }
                if (var12 < 0) {
                  return null;
                }
                if ((long)var12 > this.field_i.d((byte) 17) / 520L) {
                  stackIn_47_0 = null;
                  return (byte[]) (stackIn_47_0);
                }
                var15 = var14 + var9;
                for (var16 = var14; var15 > var16; var16++) {
                  incrementValue$2 = var7;
                  var7++;
                  var6[incrementValue$2] = dg.field_S[var16];
                }
                var8++;
                var5 = var12;
              }
              stackIn_54_0 = var6;
              return stackIn_54_0;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (IOException) (Object) decompiledCaughtException;
              stackIn_57_0 = null;
              return (byte[]) (stackIn_57_0);
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(boolean param0, oq param1) {
        int var3 = 0;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder var2 = null;
        RuntimeException var2_ref = null;
        int var4 = 0;
        StringBuilder var5 = null;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          var5 = new StringBuilder(2 * param1.field_v);
          var2 = var5;
          for (var3 = 0; param1.field_v > var3; var3++) {
            var4 = 255 & param1.field_t[var3];
            discarded$2 = var5.append(ec.field_j[var4 >> 4 & 15]);
            discarded$3 = var5.append(ec.field_j[15 & var4]);
          }
          stackIn_7_0 = var2.toString();
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_10_0 = var2_ref;
          stackIn_10_1 = new StringBuilder().append("np.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2, byte[] param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          var5 = this.field_i;
          synchronized (var5) {
            if (param1 != -12875) {
              field_d = 96;
            }
            if (param2 >= 0 &&
              param2 <= this.field_b) {
              var6 = this.a(param0, param2, true, param3, (byte) 93) ? 1 : 0;
              if (var6 == 0) {
                var6 = this.a(param0, param2, false, param3, (byte) 93) ? 1 : 0;
              }
              stackIn_11_0 = var6;
            } else {
              throw new IllegalArgumentException();
            }
          }
          return stackIn_11_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_16_0 = var5_ref;
          stackIn_16_1 = new StringBuilder().append("np.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final boolean a(int param0, int param1, boolean param2, byte[] param3, byte param4) {
        try {
          RuntimeException stackIn_70_0 = null;
          StringBuilder stackIn_70_1 = null;
          String stackIn_71_2 = null;
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
          var16 = Pool.field_O;
          try {
            var6 = this.field_i;
            synchronized (var6) {
              try {
                if (param2) {
                  if ((long)(6 + param0 * 6) > this.field_f.d((byte) 17)) {
                    return false;
                  }
                  this.field_f.a(0, (long)(param0 * 6));
                  this.field_f.a((byte) -110, 6, 0, dg.field_S);
                  var7_int = (dg.field_S[5] & 255) + (16711680 & dg.field_S[3] << 16) + (dg.field_S[4] << 8 & 65280);
                  if (var7_int <= 0 ||
                    !((long)var7_int <= this.field_i.d((byte) 17) / 520L)) {
                    return false;
                  }
                } else {
                  var7_int = (int)((519L + this.field_i.d((byte) 17)) / 520L);
                  if (var7_int == 0) {
                    var7_int = 1;
                  }
                }
                dg.field_S[3] = (byte)(var7_int >> 16);
                dg.field_S[2] = (byte)param1;
                dg.field_S[0] = (byte)(param1 >> 16);
                dg.field_S[1] = (byte)(param1 >> 8);
                dg.field_S[4] = (byte)(var7_int >> 8);
                dg.field_S[5] = (byte)var7_int;
                this.field_f.a(0, (long)(param0 * 6));
                this.field_f.a(6, dg.field_S, 0, -1);
                var8 = 0;
                var9 = 0;
                L3: while (true) {
                  if (var8 < param1) {
                    boolean decompiledFrameRemainder0 = true;
                    var10 = 0;
                    if (param2) {
                      this.field_i.a(param4 ^ 93, (long)(520 * var7_int));
                      if (65535 >= param0) {
                        try {
                          this.field_i.a((byte) -110, 8, 0, dg.field_S);
                          decompiledRegionSelector0 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                        }
                        if (decompiledRegionSelector0 != 0) {
                          break L3;
                        }
                        var12 = (dg.field_S[3] & 255) + (65280 & dg.field_S[2] << 8);
                        var10 = ((255 & dg.field_S[5]) << 8) + ((16711680 & dg.field_S[4] << 16) + (255 & dg.field_S[6]));
                        var11 = (dg.field_S[0] << 8 & 65280) + (255 & dg.field_S[1]);
                        var13 = dg.field_S[7] & 255;
                      } else {
                        try {
                          this.field_i.a((byte) -118, 10, 0, dg.field_S);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector1 = 1;
                        }
                        if (decompiledRegionSelector1 != 0) {
                          break L3;
                        }
                        var11 = (dg.field_S[3] & 255) + ((65280 & dg.field_S[2] << 8) + ((dg.field_S[0] << 24 & -16777216) + (16711680 & dg.field_S[1] << 16)));
                        var12 = (65280 & dg.field_S[4] << 8) + (dg.field_S[5] & 255);
                        var10 = (16711680 & dg.field_S[6] << 16) - (-(65280 & dg.field_S[7] << 8) - (dg.field_S[8] & 255));
                        var13 = 255 & dg.field_S[9];
                      }
                      if ((var11 == param0 &&
                        var12 == var9 &&
                        var13 == this.field_h) &&
                        (decompiledFrameRemainder0 = (!(0 <= var10) ||
                        !(this.field_i.d((byte) 17) / 520L >= (long)var10)))) {
                        return false;
                      }
                      if (decompiledFrameRemainder0) {
                        return false;
                      }
                    }
                    if (var10 == 0) {
                      param2 = false;
                      var10 = (int)((this.field_i.d((byte) 17) + 519L) / 520L);
                      if (var10 == 0) {
                        var10++;
                      }
                      if (var10 == var7_int) {
                        var10++;
                      }
                    }
                    if (param1 - var8 <= 512) {
                      var10 = 0;
                    }
                    if (param0 <= 65535) {
                      dg.field_S[0] = (byte)(param0 >> 8);
                      dg.field_S[1] = (byte)param0;
                      dg.field_S[5] = (byte)(var10 >> 8);
                      dg.field_S[6] = (byte)var10;
                      dg.field_S[2] = (byte)(var9 >> 8);
                      dg.field_S[3] = (byte)var9;
                      dg.field_S[7] = (byte)this.field_h;
                      dg.field_S[4] = (byte)(var10 >> 16);
                      this.field_i.a(0, (long)(520 * var7_int));
                      this.field_i.a(8, dg.field_S, 0, -1);
                      var11 = -var8 + param1;
                      if (var11 > 512) {
                        var11 = 512;
                      }
                      this.field_i.a(var11, param3, var8, -1);
                      var8 = var8 + var11;
                    } else {
                      dg.field_S[7] = (byte)(var10 >> 8);
                      dg.field_S[9] = (byte)this.field_h;
                      dg.field_S[3] = (byte)param0;
                      dg.field_S[8] = (byte)var10;
                      dg.field_S[2] = (byte)(param0 >> 8);
                      dg.field_S[4] = (byte)(var9 >> 8);
                      dg.field_S[0] = (byte)(param0 >> 24);
                      dg.field_S[1] = (byte)(param0 >> 16);
                      dg.field_S[6] = (byte)(var10 >> 16);
                      dg.field_S[5] = (byte)var9;
                      this.field_i.a(0, (long)(520 * var7_int));
                      this.field_i.a(10, dg.field_S, 0, param4 - 94);
                      var11 = -var8 + param1;
                      if (var11 > 510) {
                        var11 = 510;
                      }
                      this.field_i.a(var11, param3, var8, -1);
                      var8 = var8 + var11;
                    }
                    var7_int = var10;
                    var9++;
                    continue;
                  }
                  break;
                }
                if (param4 != 93) {
                  np.a(false);
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
            stackIn_70_0 = var6_ref;
            stackIn_70_1 = new StringBuilder().append("np.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_71_2 = "null";
            } else {
              stackIn_71_2 = "{...}";
            }
            throw wm.a((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(boolean param0, String param1, boolean param2, boolean param3, int param4, String param5) {
        try {
          int stackIn_5_0 = 0;
          int stackIn_32_0 = 0;
          boolean stackIn_44_0 = false;
          boolean stackIn_48_0 = false;
          boolean stackIn_51_0 = false;
          boolean stackIn_54_0 = false;
          ml stackIn_67_0 = null;
          java.applet.Applet stackIn_67_1 = null;
          boolean stackIn_68_2 = false;
          int stackIn_86_0 = 0;
          int stackIn_98_0 = 0;
          int stackIn_100_0 = 0;
          int stackIn_107_0 = 0;
          int stackIn_110_0 = 0;
          RuntimeException stackIn_113_0 = null;
          StringBuilder stackIn_113_1 = null;
          String stackIn_114_2 = null;
          StringBuilder stackIn_116_1 = null;
          String stackIn_117_2 = null;
          Throwable decompiledCaughtException = null;
          int var6_int = 0;
          RuntimeException var6 = null;
          int var7 = 0;
          int var8 = 0;
          Throwable var8_ref_Throwable = null;
          int var9 = 0;
          String var10 = null;
          String var11 = null;
          String var12 = null;
          CharSequence var13 = null;
          int var6_intLifetime1;
          int var6_intLifetime2;
          int var8Lifetime1;
          var9 = Pool.field_O;
          try {
            if (null == jd.field_c &&
              !sa.a((byte) 65, param2)) {
              stackIn_5_0 = -1;
              return stackIn_5_0;
            }
            if (tl.field_J == no.field_h) {
              if (!param2) {
                hn.field_c = kb.a(false, param1, -5790, param5);
              } else {
                var11 = (String) null;
                hn.field_c = bi.a(hm.field_a, -16595, param5, false, (String) null);
              }
              ej.field_j.field_v = 0;
              ej.field_j.a(14, false);
              ej.field_j.a(hn.field_c.b((byte) -101).field_c, false);
              de.a(-1, 0);
              tl.field_J = vn.field_d;
            }
            if (vn.field_d == tl.field_J &&
              lq.b((byte) 87, 1)) {
              var6_int = kn.field_e.g(-82);
              if (var6_int == 0) {
                tl.field_J = fr.field_o;
              } else {
                uq.field_c = var6_int;
                of.field_Pb = -1;
                tl.field_J = hm.field_k;
              }
              kn.field_e.field_v = 0;
            }
            if (fr.field_o == tl.field_J &&
              lq.b((byte) 43, 8)) {
              Pool.field_Q = kn.field_e.h(-412303328);
              kn.field_e.field_v = 0;
              pj.a(param2, hn.field_c, param3, -98300704, param4);
              tl.field_J = wo.field_g;
            }
            boolean decompiledFrameRemainder0 = true;
            if (tl.field_J == wo.field_g &&
              lq.b((byte) 79, 1)) {
              var6_intLifetime1 = kn.field_e.g(-110);
              kn.field_e.field_v = 0;
              ri.field_N = null;
              uq.field_c = var6_intLifetime1;
              if (var6_intLifetime1 != 0 &&
                1 != var6_intLifetime1) {
                if (var6_intLifetime1 != 8) {
                  tl.field_J = hm.field_k;
                  of.field_Pb = -1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  dn.c(-115);
                  we.field_e = false;
                  stackIn_32_0 = var6_intLifetime1;
                  return stackIn_32_0;
                }
              }
              if (decompiledFrameRemainder0) {
                of.field_Pb = -1;
                tl.field_J = ff.field_b;
              }
            }
            if (ff.field_b == tl.field_J &&
              wf.a((byte) 39)) {
              hm.field_a = kn.field_e.h(-412303328);
              ei.field_E = param5;
              hq.field_i = kn.field_e.g(-68);
              ta.field_f = kn.field_e.g(-105);
              mp.field_V = kn.field_e.d(-1034);
              var12 = kn.field_e.m(108);
              var7 = kn.field_e.g(-76);
              if (0 != (1 & var7)) {
                ke.a(100);
              }
              stackIn_44_0 = ((16 & var7) != 0);
              nm.field_b = stackIn_44_0;
              if (!param2) {
                stackIn_48_0 = ((8 & var7) != 0);
                ea.field_z = stackIn_48_0;
                stackIn_51_0 = ((4 & var7) != 0);
                fq.field_Gb = stackIn_51_0;
                stackIn_54_0 = ((2 & var7) != 0);
                hr.field_y = stackIn_54_0;
                if (ea.field_z) {
                  hr.field_y = true;
                }
              }
              if (hk.field_s) {
                kn.field_e.g(-114);
                kn.field_e.g(-99);
                kn.field_e.b(true);
                va.field_X = kn.field_e.d(-1034);
                sn.field_n = new byte[va.field_X];
                for (var8 = 0; va.field_X > var8; var8++) {
                  sn.field_n[var8] = kn.field_e.e((byte) 105);
                }
              }
              di.field_j = kn.field_e.j(-22);
              var13 = (CharSequence) ((Object) di.field_j);
              oj.field_y = hq.a(101, var13);
              no.field_l = kn.field_e.g(-126);
              tl.field_J = ta.field_a;
              if (hn.field_c.b((byte) -110) == dg.field_L) {
                stackIn_67_0 = eo.field_Xb;
                stackIn_67_1 = hk.d(78);
                stackIn_68_2 = !(param0);
                ((ml) (Object) stackIn_67_0).a(stackIn_67_1, stackIn_68_2);
              } else {
                if (hn.field_c.b((byte) 37) == rp.field_b) {
                  ug.field_v.a(hk.d(105), true);
                }
              }
              we.field_e = false;
              if (var12 != null) {
                fg.a(hk.d(100), -124, var12);
              }
              if (mp.field_V <= 0 &&
                !fq.field_Gb) {
                try {
                  mo.a((byte) 126, "unzap", hk.d(125));
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  mo.a("zap", new Object[]{sl.a(false, hm.field_a)}, 105, hk.d(107));
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (mp.field_V > 0) {
                bf.field_g = true;
              }
              ej.field_j.b(32, Pool.field_L);
              for (var8Lifetime1 = 0; var8Lifetime1 < 4; var8Lifetime1++) {
                Pool.field_L[var8Lifetime1] = Pool.field_L[var8Lifetime1] + 50;
              }
              kn.field_e.b(32, Pool.field_L);
              stackIn_86_0 = uq.field_c;
              return stackIn_86_0;
            }
            if (param0) {
              var10 = (String) null;
              np.a(true, (String) null, false, false, 59, (String) null);
            }
            if (tl.field_J == hm.field_k &&
              wf.a((byte) 39)) {
              dn.c(-64);
              if (uq.field_c == 7 &&
                !we.field_e) {
                we.field_e = true;
                stackIn_100_0 = -1;
                return stackIn_100_0;
              }
              if (uq.field_c == 7) {
                uq.field_c = 3;
              }
              ke.field_g = kn.field_e.j(-51);
              we.field_e = false;
              stackIn_98_0 = uq.field_c;
              return stackIn_98_0;
            }
            if (null == jd.field_c) {
              if (we.field_e) {
                if (30000L >= bf.d((byte) 118)) {
                  ke.field_g = er.field_Q;
                } else {
                  ke.field_g = wd.field_Rb;
                }
                we.field_e = false;
                stackIn_107_0 = 3;
                return stackIn_107_0;
              }
              var6_intLifetime2 = vj.field_d;
              vj.field_d = cq.field_a;
              we.field_e = true;
              cq.field_a = var6_intLifetime2;
            }
            stackIn_110_0 = -1;
            return stackIn_110_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_113_0 = var6;
            stackIn_113_1 = new StringBuilder().append("np.F(").append(param0).append(',');
            if (param1 == null) {
              stackIn_114_2 = "null";
            } else {
              stackIn_114_2 = "{...}";
            }
            stackIn_116_1 = ((StringBuilder) (Object) stackIn_113_1).append(stackIn_114_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            if (param5 == null) {
              stackIn_117_2 = "null";
            } else {
              stackIn_117_2 = "{...}";
            }
            throw wm.a((Throwable) ((Object) stackIn_113_0), ((StringBuilder) (Object) stackIn_116_1).append(stackIn_117_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        return "" + this.field_h;
    }

    np(int param0, ir param1, ir param2, int param3) {
        this.field_f = null;
        this.field_i = null;
        this.field_b = 65000;
        try {
          this.field_i = param1;
          this.field_f = param2;
          this.field_h = param0;
          this.field_b = param3;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "np.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_c = "<%0> has dropped out.";
        field_g = "No options available";
        field_e = "Achieved";
    }
}
