/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl extends gg {
    int field_q;
    int field_m;
    int field_p;
    static ka field_r;
    int field_n;
    static int field_k;
    int field_s;
    int field_l;
    static String field_o;

    public static void c(byte param0) {
        field_o = null;
        if (param0 != -106) {
          kl.a(true);
        }
        field_r = null;
    }

    final static void a(boolean param0) {
        int var3 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        String stackIn_28_0 = null;
        String stackIn_34_0 = null;
        int stackIn_40_0 = 0;
        String stackIn_40_1 = null;
        boolean stackIn_41_2 = false;
        qc stackIn_46_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        qc var9 = null;
        int var10 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var10 = stellarshard.field_B;
        try {
          var1_int = rg.field_F;
          var2 = 0;
          if (!param0) {
            field_r = (ka) null;
          }
          if (rb.field_s == 2) {
            var3_long = -jj.field_p + ih.a((byte) -98);
            var2 = (int)((10999L - var3_long) / 1000L);
            if (0 > var2) {
              var2 = 0;
            }
          }
          for (var3 = 0; stellarshard.field_L.length > var3; var3++) {
            var4 = sj.field_J[var3];
            if (var4 < 0) {
              var5 = ul.field_G;
            } else {
              if (var4 == ua.field_i.field_f) {
                var5 = field_k;
              } else {
                var5 = lg.field_b;
              }
            }
            var6 = stellarshard.field_L[var3];
            if (2 == rb.field_s &&
              var2 == 1) {
              if (pd.field_g.length < bb.field_k.length) {
                stackIn_19_0 = bb.field_k.length;
              } else {
                stackIn_19_0 = pd.field_g.length;
              }
              var7 = stackIn_19_0;
              if (o.field_g.length <= fb.field_e.length) {
                stackIn_22_0 = fb.field_e.length;
              } else {
                stackIn_22_0 = o.field_g.length;
              }
              var8 = stackIn_22_0;
              if (6 <= var3 &&
                var3 < 6 + var7) {
                if (-6 + var3 + pd.field_g.length - var7 >= 0) {
                  stackIn_28_0 = pd.field_g[-var7 + var3 + (-6 + pd.field_g.length)];
                } else {
                  stackIn_28_0 = "";
                }
                var6 = stackIn_28_0;
              }
              if (7 + var7 <= var3 &&
                var8 + var7 + 7 > var3) {
                if (fb.field_e.length <= var3 + (-7 - var7)) {
                  stackIn_34_0 = "";
                } else {
                  stackIn_34_0 = fb.field_e[-var7 - 7 + var3];
                }
                var6 = stackIn_34_0;
              }
            }
            if (var4 == -2) {
              var6 = Integer.toString(var2);
            }
            stackIn_40_0 = -112;
            stackIn_40_1 = var6;
            stackIn_41_2 = !(var4 < 0);
            var7Lifetime1 = qe.$cfr$intArgs$a$590e95718a07(stackIn_40_0, stackIn_40_1, stackIn_41_2);
            var8Lifetime1 = s.field_b - (var7Lifetime1 >> 1);
            if (var4 >= 0) {
              if (var4 == ua.field_i.field_f) {
                stackIn_46_0 = ld.field_y;
              } else {
                stackIn_46_0 = pk.field_a;
              }
              var9 = stackIn_46_0;
              var1_int = var1_int + nh.field_f;
              if (var9 != null) {
                var9.a(true, var7Lifetime1 + (le.field_k << 1), na.field_a + (nh.field_h << 1), var1_int, var8Lifetime1 - le.field_k);
              }
              var1_int = var1_int + nh.field_h;
            }
            if (var4 < 0) {
              pe.field_c.a(var6, var8Lifetime1, var1_int + mc.field_a, var5, -1);
              var1_int = var1_int + l.field_e;
            } else {
              mj.field_E.a(var6, var8Lifetime1, var1_int + fg.field_M, var5, -1);
              var1_int = var1_int + (na.field_a + (nh.field_f + nh.field_h));
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "kl.B(" + param0 + ')');
        }
    }

    final static byte[] a(CharSequence param0, int param1) {
        int var4 = 0;
        byte[] stackIn_69_0 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = stellarshard.field_B;
        try {
          if (param1 != -20650) {
            field_k = 12;
          }
          var2_int = param0.length();
          var3 = new byte[var2_int];
          for (var4 = 0; var4 < var2_int; var4++) {
            {
              var5 = param0.charAt(var4);
              if ((0 >= var5 ||
                var5 >= 128) && (var5 < 160 ||
                var5 > 255)) {
                switch (var5) {
                  case 8364:
                    var3[var4] = (byte)-128;
                    break;
                  case 8218:
                    var3[var4] = (byte)-126;
                    break;
                  case 402:
                    var3[var4] = (byte)-125;
                    break;
                  case 8222:
                    var3[var4] = (byte)-124;
                    break;
                  case 8230:
                    var3[var4] = (byte)-123;
                    break;
                  case 8224:
                    var3[var4] = (byte)-122;
                    break;
                  case 8225:
                    var3[var4] = (byte)-121;
                    break;
                  case 710:
                    var3[var4] = (byte)-120;
                    break;
                  case 8240:
                    var3[var4] = (byte)-119;
                    break;
                  case 352:
                    var3[var4] = (byte)-118;
                    break;
                  case 8249:
                    var3[var4] = (byte)-117;
                    break;
                  case 338:
                    var3[var4] = (byte)-116;
                    break;
                  case 381:
                    var3[var4] = (byte)-114;
                    break;
                  case 8216:
                    var3[var4] = (byte)-111;
                    break;
                  case 8217:
                    var3[var4] = (byte)-110;
                    break;
                  case 8220:
                    var3[var4] = (byte)-109;
                    break;
                  case 8221:
                    var3[var4] = (byte)-108;
                    break;
                  case 8226:
                    var3[var4] = (byte)-107;
                    break;
                  case 8211:
                    var3[var4] = (byte)-106;
                    break;
                  case 8212:
                    var3[var4] = (byte)-105;
                    break;
                  case 732:
                    var3[var4] = (byte)-104;
                    break;
                  case 8482:
                    var3[var4] = (byte)-103;
                    break;
                  case 353:
                    var3[var4] = (byte)-102;
                    break;
                  case 8250:
                    var3[var4] = (byte)-101;
                    break;
                  case 339:
                    var3[var4] = (byte)-100;
                    break;
                  case 382:
                    var3[var4] = (byte)-98;
                    break;
                  default:
                    var3[var4] = (byte)63;
                    break;
                  case 376:
                    var3[var4] = (byte)-97;
                    break;
                }
              } else {
                var3[var4] = (byte)var5;
              }
            }
          }
          stackIn_69_0 = var3;
          return stackIn_69_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_72_0 = var2;
          stackIn_72_1 = new StringBuilder().append("kl.A(");
          if (param0 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(byte param0) {
        String var1 = "";
        if (null != af.field_r) {
          var1 = af.field_r.f((byte) -76);
        }
        if (param0 != 124) {
          kl.a((byte) 55);
        }
        if (var1.length() == 0) {
          var1 = of.i(195);
        }
        if (var1.length() == 0) {
          var1 = mg.field_k;
        }
        return var1;
    }

    kl(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_s = param1;
        this.field_l = param0;
        this.field_p = param5;
        this.field_m = param2;
        this.field_q = param4;
        this.field_n = param3;
    }

    static {
        field_o = null;
    }
}
