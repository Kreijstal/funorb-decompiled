/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he extends ug {
    static String[] field_f;
    int field_h;
    static te field_e;
    static int[] field_g;

    final static void e(int param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        ki var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var1_int = param0;
            L1: while (true) {
              L2: {
                L3: {
                  if (1000 <= var1_int) {
                    break L3;
                  } else {
                    var2 = new ki(-1, 0, var1_int);
                    ri.field_b.a(-8212, var2);
                    e.field_a[var1_int] = var2;
                    aj.field_b.a(param0 ^ -8212, new il((ki) null, (ki) null, 32.0f));
                    var1_int++;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                nd.field_b.e();
                ge.f(nd.field_b.field_m >> 201508321, nd.field_b.field_n >> 1889488833, (nd.field_b.field_m >> 1731254689) + -1, 16711680);
                ac.field_a.a((byte) 115);
                ek.field_b = 0;
                dc.field_e = 0;
                ok.field_d = false;
                sc.field_c = 0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw la.a((Throwable) ((Object) runtimeException), "he.C(" + param0 + ')');
        }
    }

    he(int param0) {
        this.field_h = param0;
    }

    final static void f(int param0) {
        if (param0 != 0) {
            field_f = (String[]) null;
            ne.a(true);
            return;
        }
        ne.a(true);
    }

    public static void a(int param0) {
        field_e = null;
        field_f = null;
        if (param0 != 4) {
            return;
        }
        field_g = null;
    }

    final static le[] a(byte param0, int param1, int param2, int param3, int param4) {
        le dupTemp$4 = null;
        le dupTemp$5 = null;
        le dupTemp$6 = null;
        le dupTemp$7 = null;
        le[] var5 = null;
        le[] var6 = null;
        if (param0 != 67) {
          L0: {
            he.f(3);
            var6 = new le[9];
            var5 = var6;
            dupTemp$4 = sj.a(param1, 74, param3);
            var6[6] = dupTemp$4;
            var5[3] = dupTemp$4;
            var5[2] = dupTemp$4;
            var5[1] = dupTemp$4;
            var5[0] = dupTemp$4;
            dupTemp$5 = sj.a(param1, 74, param2);
            var6[8] = dupTemp$5;
            var5[7] = dupTemp$5;
            var5[5] = dupTemp$5;
            if (0 != param4) {
              var6[4] = sj.a(64, 74, param4);
              break L0;
            } else {
              break L0;
            }
          }
          return var5;
        } else {
          L1: {
            var6 = new le[9];
            var5 = var6;
            dupTemp$6 = sj.a(param1, 74, param3);
            var6[6] = dupTemp$6;
            var5[3] = dupTemp$6;
            var5[2] = dupTemp$6;
            var5[1] = dupTemp$6;
            var5[0] = dupTemp$6;
            dupTemp$7 = sj.a(param1, 74, param2);
            var6[8] = dupTemp$7;
            var5[7] = dupTemp$7;
            var5[5] = dupTemp$7;
            if (0 != param4) {
              var6[4] = sj.a(64, 74, param4);
              break L1;
            } else {
              break L1;
            }
          }
          return var5;
        }
    }

    static {
        field_f = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_e = new te(15, 0, 1, 0);
        field_g = new int[8192];
    }
}
