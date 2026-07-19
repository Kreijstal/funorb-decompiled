/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class id {
    static ba field_a;
    static volatile int field_b;

    final static void a(int param0) {
        int var1 = 0;
        L0: {
          if ((ck.field_f ^ -1) >= -33) {
            break L0;
          } else {
            L1: {
              var1 = ck.field_f % 32;
              if (var1 == 0) {
                var1 = 32;
                break L1;
              } else {
                break L1;
              }
            }
            ce.a(ck.field_f - var1, (byte) -122);
            if (!OrbDefence.field_D) {
              if (param0 < 64) {
                field_b = -78;
                return;
              } else {
                return;
              }
            } else {
              break L0;
            }
          }
        }
        ce.a(0, (byte) -120);
        if (param0 >= 64) {
          return;
        } else {
          field_b = -78;
          return;
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 >= -81) {
            field_a = (ba) null;
        }
    }

    final static void a(boolean param0) {
        int var1 = 0;
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var2 = OrbDefence.field_D ? 1 : 0;
          if (!param0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        oe.field_p = stackIn_3_0 != 0;
        bm.field_a = null;
        if (!vh.field_j) {
          var1 = cb.field_j;
          if (var1 > 0) {
            if (1 == var1) {
              bm.field_a = gi.field_d;
              bm.field_a = wb.a(new CharSequence[]{(CharSequence) ((Object) bm.field_a), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) ci.field_p)}, (byte) -123);
              oj.field_q.q(4210752);
              o.d(-1);
              if (var2 != 0) {
                oj.field_q.d((byte) -62);
                return;
              } else {
                return;
              }
            } else {
              bm.field_a = t.a(-415993727, new String[]{Integer.toString(var1)}, cd.field_x);
              if (var2 == 0) {
                bm.field_a = wb.a(new CharSequence[]{(CharSequence) ((Object) bm.field_a), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) ci.field_p)}, (byte) -123);
                oj.field_q.q(4210752);
                o.d(-1);
                if (var2 == 0) {
                  return;
                } else {
                  oj.field_q.d((byte) -62);
                  return;
                }
              } else {
                bm.field_a = gi.field_d;
                bm.field_a = wb.a(new CharSequence[]{(CharSequence) ((Object) bm.field_a), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) ci.field_p)}, (byte) -123);
                oj.field_q.q(4210752);
                o.d(-1);
                if (var2 != 0) {
                  oj.field_q.d((byte) -62);
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            oj.field_q.q(4210752);
            o.d(-1);
            if (var2 == 0) {
              return;
            } else {
              oj.field_q.d((byte) -62);
              return;
            }
          }
        } else {
          oj.field_q.d((byte) -62);
          return;
        }
    }

    final static void b(boolean param0) {
        if (ji.field_b != -ol.field_h + 0) {
          if (ji.field_b != -ol.field_h + 250) {
            if (param0) {
              field_b = 78;
              ji.field_b = ji.field_b + 1;
              return;
            } else {
              ji.field_b = ji.field_b + 1;
              return;
            }
          } else {
            if (param0) {
              field_b = 78;
              ji.field_b = ji.field_b + 1;
              return;
            } else {
              ji.field_b = ji.field_b + 1;
              return;
            }
          }
        } else {
          if (param0) {
            field_b = 78;
            ji.field_b = ji.field_b + 1;
            return;
          } else {
            ji.field_b = ji.field_b + 1;
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != 734) {
          id.a(92, -81, -78, 79, -42);
          h.k(125);
          ul.i(param1, param3, param0, param2);
          return;
        } else {
          h.k(125);
          ul.i(param1, param3, param0, param2);
          return;
        }
    }

    static {
        field_a = new ba(10, 2, 2, 0);
        field_b = 0;
    }
}
