/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fo extends sp implements ai {
    private wp field_C;
    private wp field_A;
    private wp field_B;

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        if (param2 > -35) {
          ((fo) this).field_B = null;
          var5 = ((fo) this).field_r - -param0;
          var6 = param1 + ((fo) this).field_v;
          int discarded$2 = kw.field_b.a(qn.field_h, 20 + var5, var6 - -20, ((fo) this).field_q - 40, -50 + ((fo) this).field_p, 16777215, -1, 1, 0, kw.field_b.field_s);
          super.a(param0, param1, (byte) -96, param3);
          return;
        } else {
          var5 = ((fo) this).field_r - -param0;
          var6 = param1 + ((fo) this).field_v;
          int discarded$3 = kw.field_b.a(qn.field_h, 20 + var5, var6 - -20, ((fo) this).field_q - 40, -50 + ((fo) this).field_p, 16777215, -1, 1, 0, kw.field_b.field_s);
          super.a(param0, param1, (byte) -96, param3);
          return;
        }
    }

    public final void a(int param0, int param1, wp param2, int param3, int param4) {
        int var7 = 0;
        var7 = Sumoblitz.field_L ? 1 : 0;
        if (param2 == ((fo) this).field_A) {
          mu.e(0);
          if (param1 != 710) {
            ((fo) this).field_A = null;
            return;
          } else {
            return;
          }
        } else {
          if (param2 != ((fo) this).field_B) {
            if (((fo) this).field_C != param2) {
              if (param1 != 710) {
                ((fo) this).field_A = null;
                return;
              } else {
                return;
              }
            } else {
              vi.e(4);
              if (param1 == 710) {
                return;
              } else {
                ((fo) this).field_A = null;
                return;
              }
            }
          } else {
            rv.a((byte) 114);
            if (param1 == 710) {
              return;
            } else {
              ((fo) this).field_A = null;
              return;
            }
          }
        }
    }

    public fo() {
        super(0, 0, 476, 225, (mh) null);
        ((fo) this).field_B = new wp(ms.field_i, (qm) null);
        ((fo) this).field_A = new wp(jc.field_e, (qm) null);
        ((fo) this).field_C = new wp(tm.field_b, (qm) null);
        ue var1 = new ue();
        ((fo) this).field_B.field_w = (mh) (Object) var1;
        ((fo) this).field_A.field_w = (mh) (Object) var1;
        ((fo) this).field_C.field_w = (mh) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> 2029173025;
        ((fo) this).field_A.a(97, ((fo) this).field_q - var3 >> 943912193, -var2 + (-48 + ((fo) this).field_p), 30, var4);
        ((fo) this).field_C.a(-86, (((fo) this).field_q + -var3 >> 234156993) - -var4 + var2, -48 + ((fo) this).field_p + -var2, 30, var4);
        ((fo) this).field_B.a(-112, -var3 + ((fo) this).field_q >> 145011937, -(var2 * 2) + ((fo) this).field_p + -78, 30, var3);
        ((fo) this).field_A.field_o = (qm) this;
        ((fo) this).field_B.field_o = (qm) this;
        ((fo) this).field_B.field_t = aj.field_x;
        ((fo) this).field_C.field_o = (qm) this;
        ((fo) this).field_C.field_t = hg.field_t;
        ((fo) this).a((pk) (Object) ((fo) this).field_A, 120);
        ((fo) this).a((pk) (Object) ((fo) this).field_B, 70);
        ((fo) this).a((pk) (Object) ((fo) this).field_C, 83);
    }

    final boolean a(pk param0, char param1, byte param2, int param3) {
        if (param2 >= 9) {
          if (!super.a(param0, param1, (byte) 20, param3)) {
            if ((param3 ^ -1) == -99) {
              return ((fo) this).a((byte) 123, param0);
            } else {
              if (param3 == 99) {
                return ((fo) this).a(param0, false);
              } else {
                return false;
              }
            }
          } else {
            return true;
          }
        } else {
          ((fo) this).a(-128, -68, (byte) -69, -31);
          if (!super.a(param0, param1, (byte) 20, param3)) {
            if ((param3 ^ -1) == -99) {
              return ((fo) this).a((byte) 123, param0);
            } else {
              if (param3 == 99) {
                return ((fo) this).a(param0, false);
              } else {
                return false;
              }
            }
          } else {
            return true;
          }
        }
    }

    static {
    }
}
