/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih extends ge {
    final fsa a(boolean param0, int param1, la param2) {
        fsa var9 = new fsa(param2, param0);
        var9.b((byte) -11, ((ih) this).field_k, ((ih) this).field_l);
        var9.h(param1, 0);
        var9.a((byte) 83, (nv) (Object) new eq(param2, param0));
        ov var5 = new ov(param2, param0);
        up var6 = new up(1, 10);
        var6.b(1, 13);
        var5.a(var6, true);
        ((ih) this).a((byte) 43, (mra) (Object) var5, param2);
        var9.a((byte) 83, (nv) (Object) var5);
        mfa var7 = rm.field_a;
        boa var8 = (boa) (Object) var7.a(7, 100);
        var8.b(114, 16);
        var9.a((gr) (Object) var5, (byte) 124, (dg) (Object) var8);
        ((ih) this).a(var9, param1 ^ 3, (nv) (Object) var5, 16777130);
        return var9;
    }

    ih(la param0, int param1) {
        super(param0, param1);
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
    }

    final static boolean a(CharSequence param0, boolean param1, char param2) {
        int var3 = 0;
        if (!ov.a(62, param2)) {
          return false;
        } else {
          if (param0 != null) {
            var3 = param0.length();
            if (-13 >= (var3 ^ -1)) {
              return false;
            } else {
              if (!hf.a(114, param2)) {
                if (!param1) {
                  ih.D(97);
                  return true;
                } else {
                  return true;
                }
              } else {
                if (0 != var3) {
                  if (param1) {
                    return true;
                  } else {
                    ih.D(97);
                    return true;
                  }
                } else {
                  return false;
                }
              }
            }
          } else {
            return false;
          }
        }
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            return true;
        }
        return false;
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            return true;
        }
        return true;
    }

    ih(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            int discarded$0 = ((ih) this).t(60);
            return false;
        }
        return false;
    }

    final static mi[] a(byte param0, String param1) {
        vna var2 = null;
        mi[] var3 = null;
        int var4 = 0;
        mi var5 = null;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        if (!param1.equals((Object) (Object) cf.field_e)) {
          var2 = lp.a((byte) 48, param1);
          var3 = new mi[var2.a((byte) -16)];
          var4 = 0;
          var5 = (mi) (Object) var2.f(-80);
          L0: while (true) {
            if (var5 == null) {
              if (param0 != 126) {
                return null;
              } else {
                opa.field_n = var3;
                cf.field_e = param1;
                return var3;
              }
            } else {
              var4++;
              var3[var4] = var5;
              var5 = (mi) (Object) var2.e(124);
              continue L0;
            }
          }
        } else {
          return opa.field_n;
        }
    }

    final int t(int param0) {
        if (param0 != 8) {
            return -4;
        }
        return 7;
    }

    final boolean B(int param0) {
        if (param0 != -23309) {
            return false;
        }
        return true;
    }

    final boolean C(int param0) {
        if (param0 != 128) {
            return true;
        }
        return true;
    }

    final static void D(int param0) {
        if (param0 == 17229) {
          if (null != baa.field_d) {
            if (!baa.field_d.b(100663296)) {
              if (tga.field_a == null) {
                if (null != baa.field_d.field_i) {
                  nia.d(-25405);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              nia.d(-25405);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void q(byte param0) {
        super.q(param0);
        ((ih) this).b(112, 2097152, 2097152);
    }

    final boolean A(int param0) {
        if (param0 != -1) {
            return true;
        }
        return true;
    }

    static {
    }
}
