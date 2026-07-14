/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij extends gf {
    static long field_l;
    private tk field_m;
    static int[] field_o;
    private tk field_n;

    public static void f(int param0) {
        if (param0 > -73) {
            Object var2 = null;
            boolean discarded$0 = ij.a(true, 89, (CharSequence) null, 107);
        }
        field_o = null;
    }

    final String a(byte param0, String param1) {
        String var6 = ((ij) this).field_m.field_m.toLowerCase();
        String var4 = param1.toLowerCase();
        if (0 == var4.length()) {
            return null;
        }
        if (param0 != -121) {
            ((ij) this).field_n = null;
        }
        String var5 = var4;
        if (!(!va.b(var5, 25326))) {
            return dj.field_b;
        }
        if (!(!hk.a(true, var5))) {
            return nh.field_q;
        }
        if (fm.a((byte) -98, var5)) {
            return jg.field_u;
        }
        if (this.b((byte) -6, param1)) {
            return fi.field_f;
        }
        if (var6.length() > 0) {
            if (!(!tm.a(true, var5, var6))) {
                return jn.field_a;
            }
            if (rh.a(true, var6, var5)) {
                return nh.field_o;
            }
            if (vk.a(var6, 4096, var5)) {
                return jn.field_a;
            }
            return dj.field_b;
        }
        return ci.field_b;
    }

    private final boolean b(byte param0, String param1) {
        int var6 = 0;
        String var7 = null;
        String var8 = null;
        int var4 = 15 % ((79 - param0) / 43);
        String var3 = ((ij) this).field_n.field_m.toLowerCase();
        String var5 = param1.toLowerCase();
        if ((var3.length() ^ -1) < -1) {
            if (var5.length() <= 0) {
                return false;
            }
            var6 = var3.lastIndexOf("@");
            if (0 <= var6) {
                if (-1 + var3.length() > var6) {
                    var7 = var3.substring(0, var6);
                    var8 = var3.substring(var6 + 1);
                    if (!(-1 < (var5.indexOf(var7) ^ -1))) {
                        return true;
                    }
                    if ((var5.indexOf(var8) ^ -1) <= -1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    final cd a(int param0, String param1) {
        String var3 = ((ij) this).field_m.field_m.toLowerCase();
        if (param0 <= 62) {
            return null;
        }
        String var4 = param1.toLowerCase();
        if (!(var4.length() != 0)) {
            return so.field_u;
        }
        if (!cd.a(var4, 18, var3)) {
            return so.field_u;
        }
        if (this.b((byte) -56, param1)) {
            return so.field_u;
        }
        return so.field_s;
    }

    final static void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        ni var4_ref_ni = null;
        int var4 = 0;
        Object var5 = null;
        int var6 = 0;
        qa var9 = null;
        df var10 = null;
        byte[] var14 = null;
        L0: {
          var6 = Torquing.field_u;
          var10 = kj.field_d;
          var2 = var10.i((byte) -101);
          if (var2 == 0) {
            var9 = (qa) (Object) qf.field_a.b(0);
            if (var9 == null) {
              ih.b(true);
              return;
            } else {
              L1: {
                var4 = var10.i((byte) -101);
                if (var4 != 0) {
                  var14 = new byte[var4];
                  var10.a(48, var4, var14, 0);
                  break L1;
                } else {
                  var5 = null;
                  break L1;
                }
              }
              var10.field_n = var10.field_n + 4;
              if (var10.h(-31017)) {
                var9.f(0);
                break L0;
              } else {
                ih.b(true);
                return;
              }
            }
          } else {
            if (1 == var2) {
              var3 = var10.c((byte) -59);
              var4_ref_ni = (ni) (Object) vb.field_f.b(param0 ^ 10078);
              L2: while (true) {
                L3: {
                  if (var4_ref_ni == null) {
                    break L3;
                  } else {
                    if (var3 == var4_ref_ni.field_k) {
                      break L3;
                    } else {
                      var4_ref_ni = (ni) (Object) vb.field_f.f(-24059);
                      continue L2;
                    }
                  }
                }
                if (var4_ref_ni == null) {
                  ih.b(true);
                  return;
                } else {
                  var4_ref_ni.f(0);
                  break L0;
                }
              }
            } else {
              nn.a("A1: " + me.a(-1), (Throwable) null, -9958);
              ih.b(true);
              break L0;
            }
          }
        }
        L4: {
          if (param0 == 10078) {
            break L4;
          } else {
            field_l = 30L;
            break L4;
          }
        }
    }

    ij(tk param0, tk param1, tk param2) {
        super(param0);
        ((ij) this).field_m = param1;
        ((ij) this).field_n = param2;
    }

    final static boolean a(boolean param0, int param1, CharSequence param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = Torquing.field_u;
          if (param1 < 2) {
            break L0;
          } else {
            if (36 >= param1) {
              L1: {
                var4 = 0;
                var5 = 0;
                var6 = 0;
                var7 = param2.length();
                if (param3 == -98) {
                  break L1;
                } else {
                  field_l = -68L;
                  break L1;
                }
              }
              var8 = 0;
              L2: while (true) {
                if (var8 >= var7) {
                  return var5 != 0;
                } else {
                  L3: {
                    var9 = param2.charAt(var8);
                    if (0 != var8) {
                      break L3;
                    } else {
                      if (45 != var9) {
                        if (var9 != 43) {
                          break L3;
                        } else {
                          if (!param0) {
                            break L3;
                          } else {
                            var8++;
                            continue L2;
                          }
                        }
                      } else {
                        var4 = 1;
                        var8++;
                        continue L2;
                      }
                    }
                  }
                  L4: {
                    L5: {
                      if (48 > var9) {
                        break L5;
                      } else {
                        if (var9 > 57) {
                          break L5;
                        } else {
                          var9 -= 48;
                          break L4;
                        }
                      }
                    }
                    L6: {
                      if (var9 < 65) {
                        break L6;
                      } else {
                        if (var9 > 90) {
                          break L6;
                        } else {
                          var9 -= 55;
                          break L4;
                        }
                      }
                    }
                    if (var9 < 97) {
                      return false;
                    } else {
                      if (var9 <= 122) {
                        var9 -= 87;
                        break L4;
                      } else {
                        return false;
                      }
                    }
                  }
                  if (param1 > var9) {
                    L7: {
                      if (var4 == 0) {
                        break L7;
                      } else {
                        var9 = -var9;
                        break L7;
                      }
                    }
                    var10 = var6 * param1 + var9;
                    if (var10 / param1 != var6) {
                      return false;
                    } else {
                      var6 = var10;
                      var5 = 1;
                      var8++;
                      continue L2;
                    }
                  } else {
                    return false;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("" + param1);
    }

    static {
    }
}
