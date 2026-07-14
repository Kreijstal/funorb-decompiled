/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rua extends ij implements tsa {
    static String field_jb;
    static String field_hb;
    static jea field_gb;
    private mr field_fb;
    private boolean field_eb;
    private boolean field_ib;

    public final void a(int param0, int param1, rj param2, int param3, byte param4) {
        if (param4 < 44) {
            Object var7 = null;
            this.a(-122, true, (jua) null);
        }
        if (!(!((rua) this).field_ib)) {
            gl.a(true, false, (byte) 101);
            return;
        }
        qr.d(-7694);
        ((rua) this).i((byte) 13);
    }

    rua(jta param0, mr param1) {
        super(param0, ft.field_c, dsa.field_d, false, false);
        ((rua) this).field_fb = param1;
    }

    final void h(boolean param0) {
        this.a(7, param0, doa.a(qp.field_v, 248, (byte) 114));
    }

    final static String a(String param0, int param1) {
        int var4 = TombRacer.field_G ? 1 : 0;
        int var2 = 0;
        int var3 = 114 % ((param1 - 34) / 44);
        while (var2 < 4) {
            if (rf.field_c[var2].equalsIgnoreCase(param0)) {
                er.b(1, var2);
                return "Playing track " + param0;
            }
            var2++;
        }
        return "Learn to spell";
    }

    public static void g(boolean param0) {
        field_jb = null;
        if (param0) {
            field_hb = null;
        }
        field_hb = null;
        field_gb = null;
    }

    private final void a(int param0, boolean param1, jua param2) {
        String var4 = null;
        sr var5 = null;
        int var6 = 0;
        L0: {
          var6 = TombRacer.field_G ? 1 : 0;
          ((rua) this).field_eb = true;
          if (!param2.field_e) {
            if (param2.field_c == null) {
              var4 = param2.field_b;
              if (param2.field_f != 248) {
                break L0;
              } else {
                L1: {
                  if (param1) {
                    break L1;
                  } else {
                    jp.a(false);
                    break L1;
                  }
                }
                ((rua) this).field_ib = true;
                var4 = qp.field_v;
                break L0;
              }
            } else {
              var4 = qma.field_f;
              if (((rua) this).field_fb != null) {
                ((rua) this).field_fb.a(10000536);
                break L0;
              } else {
                break L0;
              }
            }
          } else {
            var4 = jo.field_K;
            break L0;
          }
        }
        var5 = new sr((ij) this, ft.field_c, var4);
        if (param0 == 7) {
          L2: {
            if (param2.field_e) {
              if (!param2.field_a) {
                rj discarded$2 = var5.a(aua.field_d, (byte) -102, (qc) this);
                break L2;
              } else {
                ((rua) this).a(param0 ^ 86, (ae) (Object) new pg((rua) this));
                return;
              }
            } else {
              L3: {
                if (!((rua) this).field_ib) {
                  if (param2.field_f != 5) {
                    var5.a(sm.field_o, -1, 40);
                    break L3;
                  } else {
                    var5.a(sba.field_n, 11, 102);
                    var5.a(nj.field_q, 17, 59);
                    break L3;
                  }
                } else {
                  rj discarded$3 = var5.a(aua.field_d, (byte) -102, (qc) this);
                  break L3;
                }
              }
              if (param2.field_f != 3) {
                if (-7 != (param2.field_f ^ -1)) {
                  break L2;
                } else {
                  var5.a(vf.field_a, 9, -126);
                  break L2;
                }
              } else {
                var5.a(tca.field_M, 7, 58);
                break L2;
              }
            }
          }
          ((rua) this).a(param0 + 80, (ae) (Object) var5);
          return;
        } else {
          return;
        }
    }

    final static ha a(boolean param0, d param1, cn param2, java.awt.Canvas param3, int param4) {
        if (!mja.a((byte) -50)) {
            throw new RuntimeException("");
        }
        if (!in.a("jaggl", 480)) {
            throw new RuntimeException("");
        }
        jaggl.OpenGL var9 = new jaggl.OpenGL();
        long var6 = var9.init(param3, 8, 8, 8, 24, 0, param4);
        if (-1L == (var6 ^ -1L)) {
            throw new RuntimeException("");
        }
        if (!param0) {
            return null;
        }
        kda var8 = new kda(var9, param3, var6, param1, param2, param4);
        var8.K(-74);
        return (ha) (Object) var8;
    }

    final boolean a(int param0) {
        jua var2 = null;
        if (((rua) this).field_B) {
            if (!(((rua) this).field_eb)) {
                var2 = dqa.a(3239);
                if (var2 != null) {
                    this.a(7, false, var2);
                }
            }
        }
        if (param0 < 126) {
            ((rua) this).field_fb = null;
        }
        return super.a(127);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_hb = "Mobile Lindemann totems";
        field_jb = "Breaking real-world laws";
    }
}
