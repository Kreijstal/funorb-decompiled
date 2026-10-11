/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj {
    static md field_g;
    static vd field_a;
    static kc field_b;
    static ta field_c;
    ug field_f;
    static float field_h;
    static String field_d;
    private ug field_e;

    final void b(byte param0) {
        ug var2;
        int var3;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        while (true) {
          var2 = this.field_f.field_d;
          if (this.field_f != var2) {
            var2.c(param0 - 19943);
            continue;
          }
          break;
        }
        if (param0 == 121) {
          this.field_e = null;
          return;
        }
        field_b = (kc) null;
        this.field_e = null;
        return;
    }

    final static byte[] a(int param0, CharSequence param1) {
        byte[] stackIn_68_0 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var2_int = param1.length();
          var3 = new byte[var2_int];
          var4 = 0;
          if (param0 != 3231) {
            field_a = (vd) null;
          }
          while (var2_int > var4) {
            {
              var5 = param1.charAt(var4);
              if ((0 >= var5 ||
                128 <= var5) && (var5 < 160 ||
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
                  case 376:
                    var3[var4] = (byte)-97;
                    break;
                  default:
                    var3[var4] = (byte)63;
                    break;
                }
              } else {
                var3[var4] = (byte)var5;
              }
            }
            var4++;
          }
          stackIn_68_0 = var3;
          return stackIn_68_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_71_0 = var2;
          stackIn_71_1 = new StringBuilder().append("pj.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(')').toString());
        }
    }

    final static void a(int param0, d param1, boolean param2) {
        hb var7 = null;
        hb var8 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var7 = gf.field_c;
          var8 = var7;
          var8.b(param2, param0);
          var8.field_h = var8.field_h + 1;
          var4 = var8.field_h;
          var8.b(1, -49152);
          var8.c(param1.field_n, 121);
          var8.c(param1.field_m, 88);
          var8.c(param1.field_p, 62);
          var8.a(-803539344, param1.field_o);
          var8.a(-803539344, param1.field_i);
          var8.a(-803539344, param1.field_j);
          var8.a(-803539344, param1.field_l);
          var8.b(param1.field_f.length, -49152);
          for (var5 = 0; param1.field_f.length > var5; var5++) {
            var7.a(-803539344, param1.field_f[var5]);
          }
          var8.a((byte) -108, var4);
          var8.a(var8.field_h - var4, (byte) -124);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "pj.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(ug param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != param0.field_c) {
            param0.c(-19822);
          }
          param0.field_d = this.field_f.field_d;
          param0.field_c = this.field_f;
          param0.field_c.field_d = param0;
          param0.field_d.field_c = param0;
          if (param1 == 13) {
            return;
          }
          this.a((byte) -120);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("pj.H(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final ug c(byte param0) {
        ug var2 = this.field_f.field_c;
        if (var2 == this.field_f) {
          return null;
        }
        var2.c(-19822);
        if (param0 == -66) {
          return var2;
        }
        field_h = -1.0866156816482544f;
        return var2;
    }

    final ug d(int param0) {
        ug var2 = null;
        ug var2Lifetime1;
        if (param0 != 4011) {
          field_c = (ta) null;
          var2 = this.field_f.field_d;
          if (var2 != this.field_f) {
            var2.c(param0 - 23833);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.field_f.field_d;
        if (var2Lifetime1 != this.field_f) {
          var2Lifetime1.c(param0 - 23833);
          return var2Lifetime1;
        }
        return null;
    }

    final static vk a(byte param0, byte[] param1) {
        vk var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        vk stackIn_5_0 = null;
        vk stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            stackIn_2_0 = null;
            return (vk) (stackIn_2_0);
          }
          if (param0 <= 9) {
            stackIn_5_0 = (vk) null;
            return stackIn_5_0;
          }
          var2 = new vk(param1, qc.field_P, mb.field_b, da.field_c, ra.field_ab, cb.field_b);
          gb.a(-63);
          stackIn_7_0 = var2;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_10_0 = var2_ref;
          stackIn_10_1 = new StringBuilder().append("pj.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 >= 37) {
          field_c = null;
          field_b = null;
          field_a = null;
          field_g = null;
          return;
        }
        field_h = 1.3061877489089966f;
        field_c = null;
        field_b = null;
        field_a = null;
        field_g = null;
    }

    final int b(int param0) {
        int var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        int var2 = 0;
        ug var3 = this.field_f.field_d;
        while (this.field_f != var3) {
          var3 = var3.field_d;
          var2++;
        }
        int var4 = 61 / ((param0 - 78) / 46);
        return var2;
    }

    final ug a(boolean param0) {
        ug var2 = this.field_e;
        if (this.field_f == var2) {
          this.field_e = null;
          return null;
        }
        this.field_e = var2.field_c;
        if (param0) {
          return var2;
        }
        field_h = -0.11541689187288284f;
        return var2;
    }

    final ug d(byte param0) {
        ug var2 = this.field_e;
        if (this.field_f == var2) {
          this.field_e = null;
          return null;
        }
        if (param0 == 63) {
          this.field_e = var2.field_d;
          return var2;
        }
        return (ug) null;
    }

    final ug c(int param0) {
        ug var2 = this.field_f.field_c;
        if (var2 == this.field_f) {
          this.field_e = null;
          return null;
        }
        if (param0 == -1) {
          this.field_e = var2.field_c;
          return var2;
        }
        return (ug) null;
    }

    final boolean e(int param0) {
        if (param0 == 11253) {
          return this.field_f == this.field_f.field_d ? true : false;
        }
        this.field_f = (ug) null;
        return this.field_f == this.field_f.field_d ? true : false;
    }

    final ug a(byte param0) {
        ug var2 = null;
        ug var2Lifetime1;
        if (param0 != -117) {
          pj.a(false, 11);
          var2 = this.field_f.field_d;
          if (this.field_f == var2) {
            this.field_e = null;
            return null;
          }
          this.field_e = var2.field_d;
          return var2;
        }
        var2Lifetime1 = this.field_f.field_d;
        if (this.field_f == var2Lifetime1) {
          this.field_e = null;
          return null;
        }
        this.field_e = var2Lifetime1.field_d;
        return var2Lifetime1;
    }

    private final void a(int param0, pj param1, ug param2) {
        ug var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -16293) {
            field_d = (String) null;
          }
          var4 = this.field_f.field_c;
          this.field_f.field_c = param2.field_c;
          param2.field_c.field_d = this.field_f;
          if (param2 == this.field_f) {
            return;
          }
          param2.field_c = param1.field_f.field_c;
          param2.field_c.field_d = param2;
          param1.field_f.field_c = var4;
          var4.field_d = param1.field_f;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_8_0 = var4_ref;
          stackIn_8_1 = new StringBuilder().append("pj.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void a(pj param0, int param1) {
        if (param1 != 0) {
          return;
        }
        try {
          this.a(-16293, param0, this.field_f.field_d);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "pj.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static String b(boolean param0) {
        if (!param0) {
          field_d = (String) null;
          return hf.field_b;
        }
        return hf.field_b;
    }

    final static String a(byte param0, CharSequence param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        byte[] var3 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = mk.a(sd.a(37, param1), 480);
          if (param0 < 78) {
            var3 = (byte[]) null;
            pj.a((byte) -73, (byte[]) null);
          }
          if (var2 == null) {
            var2 = "";
          }
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("pj.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        vl var11 = null;
        int var8Lifetime1;
        var10 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (param1 != 31645) {
            field_b = (kc) null;
          }
          jk.field_B = jk.field_B + 1;
          if (kc.field_d != 0) {
            var2_int = -116 + qg.field_c;
            var3 = ab.field_e - 90;
            var4 = ee.field_F;
            var5 = 0;
            if (!param0) {
              stackIn_8_0 = kg.field_c;
            } else {
              stackIn_8_0 = fg.field_b;
            }
            var6 = stackIn_8_0;
            var7 = 0;
            if (param0) {
              for (var8 = 9; var8 >= 0; var8--) {
                if (0 == (var6 & 1 << var8)) {
                  var7 += 20;
                }
              }
            }
            var8Lifetime1 = var7 + 10;
            var9 = 0;
            while (true) {
              if (var9 < 10) {
                if ((!param0 ||
                  (1 << var9 & var6) != 0) &&
                  lf.a(-19864, var2_int, var3, 40, 40, var8Lifetime1, 10)) {
                  ee.field_F = var9;
                  var5 = 1;
                } else {
                  if (!param0 ||
                    (var6 & 1 << var9) != 0) {
                    var8Lifetime1 += 40;
                  }
                  var9++;
                  continue;
                }
              }
              if (var5 == 0) {
                break;
              }
              if (ee.field_F != var4) {
                break;
              }
              jk.field_B = 0;
              ee.field_F = -1;
              break;
            }
          }
          if (uk.field_r < 0 &&
            fj.field_E != null &&
            fj.field_E.field_j) {
            uk.field_r = fj.field_E.field_e;
            fg.field_b = fg.field_b & ~uk.field_r;
            fj.field_E = null;
            k.field_i = true;
            kg.field_c = kg.field_c | uk.field_r;
          }
          if (ok.a(false)) {
            return;
          }
          while (true) {
            var11 = (vl) (em.field_C.d(4011));
            if (var11 == null) {
              return;
            }
            mh.a(var11, param1 - 31645, 4);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "pj.T(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, ug param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != param1.field_c) {
            param1.c(-19822);
          }
          param1.field_c = this.field_f.field_c;
          param1.field_d = this.field_f;
          param1.field_c.field_d = param1;
          param1.field_d.field_c = param1;
          if (param0 == -8212) {
            return;
          }
          field_b = (kc) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("pj.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public pj() {
        this.field_f = new ug();
        this.field_f.field_c = this.field_f;
        this.field_f.field_d = this.field_f;
    }

    static {
        field_b = null;
        field_d = "You have <%0> unread messages!";
    }
}
