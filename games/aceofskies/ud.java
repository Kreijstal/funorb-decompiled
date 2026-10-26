/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ud extends IntrusiveNode {
    static int field_g;
    static int[] field_e;
    static SpriteData[] explosionSpriteData;

    public static void a(boolean param0) {
        if (param0) {
          field_e = (int[]) null;
          field_e = null;
          explosionSpriteData = null;
          return;
        }
        field_e = null;
        explosionSpriteData = null;
    }

    final static void a(SoundPlayback param0, int param1) {
        if (param1 >= -93) {
          return;
        }
        try {
          qn.pcmMixer.removeSubstream(param0.field_g);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ud.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ud(int param0, boolean param1) {
    }

    final static void a(int param0, int param1, int param2) {
        if (null == BitmapFontMetrics.field_b) {
          BitmapFontMetrics.field_b = new int[param0 * 2];
        } else if (param0 > BitmapFontMetrics.field_b.length) {
          BitmapFontMetrics.field_b = new int[param0 * 2];
          if (null == js.field_c ||
            !(param0 <= js.field_c.length)) {
            js.field_c = new int[2 * param0];
          }
          if (null == hg.field_C ||
            !(hg.field_C.length >= param0)) {
            hg.field_C = new int[param0 * 2];
          }
          if (null == qd.field_p ||
            !(qd.field_p.length >= param0)) {
            qd.field_p = new int[param0 * 2];
          }
          if (null == dd.field_c ||
            !(param0 <= dd.field_c.length)) {
            dd.field_c = new int[param0 * 2];
          }
          if (param2 != 2) {
            return;
          }
          if (ai.field_a == null ||
            !(param0 <= ai.field_a.length)) {
            ai.field_a = new int[param0 * 2];
          }
          if (uf.field_d == null ||
            !(param1 + param0 <= uf.field_d.length)) {
            uf.field_d = new int[2 * (param1 + param0)];
          }
          if (null == sg.field_a ||
            !(param0 <= sg.field_a.length)) {
            sg.field_a = new boolean[2 * param0];
          }
          op.field_a = 2147483647;
          ft.field_o = -2147483648;
          nh.field_a = 2147483647;
          os.field_w = 0;
          fj.field_d = -2147483648;
          return;
        }
        if (null == js.field_c) {
          js.field_c = new int[2 * param0];
          if (null == hg.field_C) {
            hg.field_C = new int[param0 * 2];
            if (null == qd.field_p ||
              !(qd.field_p.length >= param0)) {
              qd.field_p = new int[param0 * 2];
            }
            if (null == dd.field_c ||
              !(param0 <= dd.field_c.length)) {
              dd.field_c = new int[param0 * 2];
            }
            if (param2 != 2) {
              return;
            }
            if (ai.field_a == null ||
              !(param0 <= ai.field_a.length)) {
              ai.field_a = new int[param0 * 2];
            }
            if (uf.field_d == null ||
              !(param1 + param0 <= uf.field_d.length)) {
              uf.field_d = new int[2 * (param1 + param0)];
            }
            if (null == sg.field_a ||
              !(param0 <= sg.field_a.length)) {
              sg.field_a = new boolean[2 * param0];
            }
          } else if (hg.field_C.length < param0) {
            hg.field_C = new int[param0 * 2];
            if (null == qd.field_p ||
              !(qd.field_p.length >= param0)) {
              qd.field_p = new int[param0 * 2];
            }
            if (null == dd.field_c ||
              !(param0 <= dd.field_c.length)) {
              dd.field_c = new int[param0 * 2];
            }
            if (param2 != 2) {
              return;
            }
            if (ai.field_a == null ||
              !(param0 <= ai.field_a.length)) {
              ai.field_a = new int[param0 * 2];
            }
            if (uf.field_d == null ||
              !(param1 + param0 <= uf.field_d.length)) {
              uf.field_d = new int[2 * (param1 + param0)];
            }
            if (null == sg.field_a ||
              !(param0 <= sg.field_a.length)) {
              sg.field_a = new boolean[2 * param0];
            }
          } else {
            if (null == qd.field_p ||
              !(qd.field_p.length >= param0)) {
              qd.field_p = new int[param0 * 2];
            }
            if (null == dd.field_c ||
              !(param0 <= dd.field_c.length)) {
              dd.field_c = new int[param0 * 2];
            }
            if (param2 != 2) {
              return;
            }
            if (ai.field_a == null ||
              !(param0 <= ai.field_a.length)) {
              ai.field_a = new int[param0 * 2];
            }
            if (uf.field_d == null ||
              !(param1 + param0 <= uf.field_d.length)) {
              uf.field_d = new int[2 * (param1 + param0)];
            }
            if (null == sg.field_a) {
              sg.field_a = new boolean[2 * param0];
            } else if (param0 > sg.field_a.length) {
              sg.field_a = new boolean[2 * param0];
            }
          }
        } else if (param0 > js.field_c.length) {
          js.field_c = new int[2 * param0];
          if (null == hg.field_C ||
            !(hg.field_C.length >= param0)) {
            hg.field_C = new int[param0 * 2];
          }
          if (null == qd.field_p ||
            !(qd.field_p.length >= param0)) {
            qd.field_p = new int[param0 * 2];
          }
          if (null == dd.field_c ||
            !(param0 <= dd.field_c.length)) {
            dd.field_c = new int[param0 * 2];
          }
          if (param2 != 2) {
            return;
          }
          if (ai.field_a == null ||
            !(param0 <= ai.field_a.length)) {
            ai.field_a = new int[param0 * 2];
          }
          if (uf.field_d == null) {
            uf.field_d = new int[2 * (param1 + param0)];
            if (null == sg.field_a ||
              !(param0 <= sg.field_a.length)) {
              sg.field_a = new boolean[2 * param0];
            }
          } else if (param1 + param0 > uf.field_d.length) {
            uf.field_d = new int[2 * (param1 + param0)];
            if (null == sg.field_a ||
              !(param0 <= sg.field_a.length)) {
              sg.field_a = new boolean[2 * param0];
            }
          } else if (null == sg.field_a) {
            sg.field_a = new boolean[2 * param0];
          } else if (param0 > sg.field_a.length) {
            sg.field_a = new boolean[2 * param0];
          }
        } else {
          if (null == hg.field_C) {
            hg.field_C = new int[param0 * 2];
            if (null == qd.field_p ||
              !(qd.field_p.length >= param0)) {
              qd.field_p = new int[param0 * 2];
            }
            if (null == dd.field_c ||
              !(param0 <= dd.field_c.length)) {
              dd.field_c = new int[param0 * 2];
            }
            if (param2 != 2) {
              return;
            }
            if (ai.field_a == null ||
              !(param0 <= ai.field_a.length)) {
              ai.field_a = new int[param0 * 2];
            }
            if (uf.field_d == null ||
              !(param1 + param0 <= uf.field_d.length)) {
              uf.field_d = new int[2 * (param1 + param0)];
            }
          } else if (hg.field_C.length >= param0) {
            if (null == qd.field_p ||
              !(qd.field_p.length >= param0)) {
              qd.field_p = new int[param0 * 2];
            }
            if (null == dd.field_c ||
              !(param0 <= dd.field_c.length)) {
              dd.field_c = new int[param0 * 2];
            }
            if (param2 != 2) {
              return;
            }
            if (ai.field_a == null ||
              !(param0 <= ai.field_a.length)) {
              ai.field_a = new int[param0 * 2];
            }
            if (uf.field_d == null ||
              !(param1 + param0 <= uf.field_d.length)) {
              uf.field_d = new int[2 * (param1 + param0)];
            }
          } else {
            hg.field_C = new int[param0 * 2];
            if (null == qd.field_p ||
              !(qd.field_p.length >= param0)) {
              qd.field_p = new int[param0 * 2];
            }
            if (null == dd.field_c ||
              !(param0 <= dd.field_c.length)) {
              dd.field_c = new int[param0 * 2];
            }
            if (param2 != 2) {
              return;
            }
            if (ai.field_a == null ||
              !(param0 <= ai.field_a.length)) {
              ai.field_a = new int[param0 * 2];
            }
            if (uf.field_d == null ||
              !(param1 + param0 <= uf.field_d.length)) {
              uf.field_d = new int[2 * (param1 + param0)];
            }
          }
          if (null == sg.field_a) {
            sg.field_a = new boolean[2 * param0];
          } else if (param0 > sg.field_a.length) {
            sg.field_a = new boolean[2 * param0];
          }
        }
        op.field_a = 2147483647;
        ft.field_o = -2147483648;
        nh.field_a = 2147483647;
        os.field_w = 0;
        fj.field_d = -2147483648;
    }

    static {
    }
}
