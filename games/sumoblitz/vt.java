/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vt extends nt {
    private int field_u;
    static int field_t;
    private int field_s;
    private int field_v;
    private int field_w;

    final boolean a(int param0) {
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (((vt) this).field_v > ((vt) this).field_p) {
          ((vt) this).field_o = ((vt) this).field_o + ((vt) this).field_s;
          ((vt) this).field_k = ((vt) this).field_k + ((vt) this).field_w;
          ((vt) this).field_s = ((vt) this).field_s * 251 / 300;
          ((vt) this).field_w = 251 * ((vt) this).field_w / 300;
          if (-1 >= (((vt) this).field_w ^ -1)) {
            ((vt) this).field_w = ((vt) this).field_w + 1;
            if ((((vt) this).field_s ^ -1) <= -1) {
              ((vt) this).field_s = ((vt) this).field_s + 1;
              if (param0 != -2567) {
                ((vt) this).field_w = -90;
                return super.a(-2567);
              } else {
                return super.a(-2567);
              }
            } else {
              ((vt) this).field_s = ((vt) this).field_s - 1;
              if (param0 != -2567) {
                ((vt) this).field_w = -90;
                return super.a(-2567);
              } else {
                return super.a(-2567);
              }
            }
          } else {
            ((vt) this).field_w = ((vt) this).field_w - 1;
            if ((((vt) this).field_s ^ -1) <= -1) {
              ((vt) this).field_s = ((vt) this).field_s + 1;
              if (param0 == -2567) {
                return super.a(-2567);
              } else {
                ((vt) this).field_w = -90;
                return super.a(-2567);
              }
            } else {
              ((vt) this).field_s = ((vt) this).field_s - 1;
              if (param0 == -2567) {
                return super.a(-2567);
              } else {
                ((vt) this).field_w = -90;
                return super.a(-2567);
              }
            }
          }
        } else {
          if (param0 == -2567) {
            return super.a(-2567);
          } else {
            ((vt) this).field_w = -90;
            return super.a(-2567);
          }
        }
    }

    final static int a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var5 = -14 + rm.b(-117, param2 ^ param2 >> -2022109441 | param3 ^ param3 >> 1163838815 | param0 >> -371796161 ^ param0);
          if (-1 <= (var5 ^ -1)) {
            break L0;
          } else {
            param3 = param3 >> var5;
            param0 = param0 >> var5;
            param2 = param2 >> var5;
            break L0;
          }
        }
        if (0 >= param3) {
          return -1;
        } else {
          var6 = -(param0 * (2 * param3)) + param2 * param2;
          if (param1 < -100) {
            if (var6 < 0) {
              return -1;
            } else {
              var7 = cb.b(-22415, var6);
              var8 = (var7 - param2 << param4) / param3;
              var9 = (-var7 - param2 << param4) / param3;
              if ((var8 ^ -1) <= -1) {
                if (var8 <= 1 << param4) {
                  if (0 <= var9) {
                    if (var8 <= var9) {
                      return var8;
                    } else {
                      return var9;
                    }
                  } else {
                    return var8;
                  }
                } else {
                  if ((var9 ^ -1) <= -1) {
                    if (1 << param4 < var9) {
                      return -1;
                    } else {
                      return var9;
                    }
                  } else {
                    return -1;
                  }
                }
              } else {
                if ((var9 ^ -1) <= -1) {
                  if (1 << param4 < var9) {
                    return -1;
                  } else {
                    return var9;
                  }
                } else {
                  return -1;
                }
              }
            }
          } else {
            return 115;
          }
        }
    }

    final void a(ha param0, int param1) {
        L0: {
          if (param1 < -121) {
            break L0;
          } else {
            boolean discarded$1 = ((vt) this).a(84);
            break L0;
          }
        }
        if (-1 == (((vt) this).field_u ^ -1)) {
          uc.field_a.a((float)(((vt) this).field_k >> -961265464), (float)(((vt) this).field_o >> -114542616), 1024, 0, 3, 16777215 + (256 / ((vt) this).field_v * ((vt) this).field_p << 41969176), 1);
          return;
        } else {
          im.field_a.a(((vt) this).field_k >> -179036440, ((vt) this).field_o >> -563123608, 0, (256 / ((vt) this).field_v * ((vt) this).field_p << 235218328) + ((vt) this).field_q, 1);
          return;
        }
    }

    vt(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        super(param0, param1, param2, param3);
        ((vt) this).field_v = param0;
        ((vt) this).field_s = param5;
        ((vt) this).field_u = param6;
        ((vt) this).field_w = param4;
    }

    final static void a(boolean param0, boolean param1) {
        if (!param1) {
            vt.a(false, false);
            rf.field_a.a(0, 0, false);
            return;
        }
        rf.field_a.a(0, 0, false);
    }

    static {
    }
}
