/*
 * Decompiled by CFR-JS 0.4.0.
 */
class nk extends hf implements vg {
    private uc field_Bb;
    static String field_Lb;
    private boolean field_Mb;
    static ae field_Jb;
    static g field_Ib;
    private boolean field_Db;
    private boolean field_Gb;
    static int field_Kb;
    static boolean field_Hb;
    private se field_Cb;
    static int[] field_Fb;
    private boolean field_Eb;

    final void a(int param0, String param1, int param2) {
        boolean stackIn_6_1 = false;
        kc stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        String stackIn_14_3;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        kc var6 = null;
        var5 = DungeonAssault.field_K;
        try {
          if (this.field_Eb) {
            return;
          }
          stackIn_6_1 = (param2 == 256);
          this.field_Db = stackIn_6_1;
          if (param0 != 26889) {
            field_Fb = (int[]) null;
          }
          this.field_Eb = true;
          this.field_Bb.b(4210752, (byte) 94, 8405024);
          var6 = new kc(this, this.field_Cb, param1);
          if (param2 != 5) {
            if (param2 == 256) {
              var6.a(kn.field_a, (pg) (this), (byte) -80);
            } else {
              stackIn_13_0 = var6;
              stackIn_13_1 = -1;
              stackIn_13_2 = 6824;
              if (!this.field_Mb) {
                stackIn_14_3 = gk.field_O;
              } else {
                stackIn_14_3 = kn.field_a;
              }
              ((kc) (Object) stackIn_13_0).a(stackIn_13_1, stackIn_13_2, stackIn_14_3);
            }
          } else {
            var6.a(11, 6824, oh.field_b);
            var6.a(17, param0 - 20065, db.field_u);
          }
          if (param2 != 3) {
            if (4 == param2) {
              var6.a(8, 6824, ho.field_f);
            } else {
              if (param2 != 6) {
                if (9 != param2) {
                  this.b(1, var6);
                  return;
                }
                var6.a(df.field_a, (pg) (this), (byte) -97);
              } else {
                var6.a(9, 6824, ip.field_i);
              }
            }
          } else {
            var6.a(7, 6824, mo.field_d);
          }
          this.b(1, var6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_29_0 = var4;
          stackIn_29_1 = new StringBuilder().append("nk.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean a(lm param0, char param1, int param2, byte param3) {
        RuntimeException var5 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 13) {
            this.j((byte) 115);
            return true;
          }
          if (param3 >= 55) {
            stackIn_8_0 = super.a(param0, param1, param2, (byte) 92);
            return stackIn_8_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("nk.W(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void j(byte param0) {
        if (!this.field_T) {
          return;
        }
        if (param0 < 48) {
          lm var3 = (lm) null;
          this.a((lm) null, 'ﾷ', 86, (byte) -102);
          this.field_T = false;
          if (this.field_Mb) {
            gg.b(0);
            return;
          }
          if (this.field_Gb) {
            np.d((byte) 95);
            return;
          }
          return;
        }
        this.field_T = false;
        if (this.field_Mb) {
          gg.b(0);
          return;
        }
        if (!this.field_Gb) {
          return;
        }
        np.d((byte) 95);
    }

    public static void n(int param0) {
        field_Jb = null;
        field_Ib = null;
        field_Fb = null;
        field_Lb = null;
        if (param0 != 2121792) {
          nk.n(57);
        }
    }

    nk(ji param0, se param1, String param2, boolean param3, boolean param4) {
        super(param0, new kc((nk) null, param1, param2), 77, 10, 10);
        try {
          this.field_Mb = param3 ? true : false;
          this.field_Cb = param1;
          this.field_Eb = false;
          this.field_Db = false;
          this.field_Gb = param4 ? true : false;
          this.field_Bb = new uc(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_Bb.field_R = true;
          this.b((byte) -63, (lm) (this.field_Bb));
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "nk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public void a(ck param0, byte param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 98) {
            return;
          }
          if (!this.field_Db) {
            oe.a("tochangedisplayname.ws", m.c(true), (byte) 96);
            return;
          }
          sn.a(param1 ^ 60, 3);
          this.j((byte) 123);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("nk.FA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void o(int param0) {
        this.field_Bb.b(param0, (byte) 94, 2121792);
        kc var2 = new kc(this, this.field_Cb, gd.field_J);
        var2.a(15, 6824, me.field_c);
        this.b(param0 - 4210751, var2);
    }

    final static void a(String param0, byte param1) {
        int stackIn_18_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var2_intLifetime1;
        var3 = DungeonAssault.field_K;
        try {
          if (mm.field_q == -1 &&
            vl.field_m == -1) {
            mm.field_q = hj.field_S;
            vl.field_m = eh.field_h;
          }
          boolean decompiledFrameRemainder0 = true;
          no.field_a = no.field_a + 1;
          if (param0 == null) {
            decompiledFrameRemainder0 = (vj.field_c == null);
          } else {
            decompiledFrameRemainder0 = !(param0.equals(vj.field_c));
          }
          if (decompiledFrameRemainder0) {
            if (!ti.field_f) {
              if (no.field_a >= lp.field_z) {
                stackIn_18_0 = (no.field_a < ga.field_p + lp.field_z) ? 1 : 0;
              } else {
                stackIn_18_0 = 0;
              }
            } else {
              stackIn_18_0 = 0;
            }
            var2_int = stackIn_18_0;
            if (param0 == null) {
              no.field_a = 0;
            } else {
              if (ti.field_f) {
                no.field_a = lp.field_z;
              } else {
                if (var2_int == 0) {
                  no.field_a = 0;
                } else {
                  no.field_a = lp.field_z;
                }
              }
            }
            wa.field_c = mm.field_q;
            if (param0 == null) {
              if (var2_int != 0) {
                ti.field_f = true;
              }
            } else {
              ti.field_f = false;
            }
            fl.field_l = vl.field_m;
          }
          if (!ti.field_f &&
            no.field_a < lp.field_z &&
            cp.field_U) {
            fl.field_l = vl.field_m;
            no.field_a = 0;
            wa.field_c = mm.field_q;
          }
          vj.field_c = param0;
          if (ti.field_f &&
            fg.field_i == no.field_a) {
            no.field_a = 0;
            ti.field_f = false;
          }
          vl.field_m = -1;
          var2_intLifetime1 = 76 % ((param1 + 27) / 44);
          mm.field_q = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_44_0 = var2;
          stackIn_44_1 = new StringBuilder().append("nk.O(");
          if (param0 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_Lb = "Exit without saving";
        field_Hb = false;
        field_Fb = new int[]{18, 10, 19, 24, 25, 26, 27};
        field_Jb = new ae(field_Fb.length);
    }
}
