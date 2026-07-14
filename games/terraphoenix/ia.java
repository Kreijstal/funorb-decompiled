/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia extends di {
    static String field_p;
    private String field_o;
    static String field_n;
    private boolean field_m;
    static String[] field_r;
    static String field_q;

    ia(ej param0) {
        super(param0);
        ((ia) this).field_m = false;
    }

    final im b(String param0, int param1) {
        CharSequence var8 = null;
        pd var6 = null;
        pd var7 = null;
        if (param1 != 0) {
            field_n = null;
            var8 = (CharSequence) (Object) param0;
            if (!(be.a(var8, 112))) {
                return qf.field_d;
            }
            if (!(param0.equals((Object) (Object) ((ia) this).field_o))) {
                var6 = ta.a(true, param0);
                if (var6 == null) {
                    return oh.field_b;
                }
                if (var6.field_b == null) {
                    ((ia) this).field_o = param0;
                    ((ia) this).field_m = var6.field_i;
                    return ((ia) this).field_m ? dg.field_c : qf.field_d;
                }
                return oh.field_b;
            }
            return ((ia) this).field_m ? dg.field_c : qf.field_d;
        }
        CharSequence var9 = (CharSequence) (Object) param0;
        if (!(be.a(var9, 112))) {
            return qf.field_d;
        }
        if (param0.equals((Object) (Object) ((ia) this).field_o)) {
        } else {
            var7 = ta.a(true, param0);
            if (var7 != null) {
                // ifnonnull L218
            } else {
                return oh.field_b;
            }
            ((ia) this).field_o = param0;
            ((ia) this).field_m = var7.field_i;
        }
        return ((ia) this).field_m ? dg.field_c : qf.field_d;
    }

    final String a(String param0, int param1) {
        int var3 = 0;
        String var4 = null;
        pd var5 = null;
        CharSequence var6 = null;
        var3 = -100 % ((26 - param1) / 56);
        var6 = (CharSequence) (Object) param0;
        var4 = hf.a(var6, (byte) -97);
        if (var4 == null) {
          L0: {
            if (!param0.equals((Object) (Object) ((ia) this).field_o)) {
              var5 = ta.a(true, param0);
              if (var5 != null) {
                if (var5.field_b == null) {
                  ((ia) this).field_o = param0;
                  ((ia) this).field_m = var5.field_i;
                  break L0;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          if (!((ia) this).field_m) {
            return mg.field_m;
          } else {
            return lk.field_e;
          }
        } else {
          return var4;
        }
    }

    final static void a(int param0, java.awt.Canvas param1, int param2, byte param3) {
        java.awt.Graphics var4 = null;
        try {
            var4 = param1.getGraphics();
            k.field_f.a(param2, param0, var4, 101);
            if (param3 <= 103) {
                Object var5 = null;
                ia.a(95, (dh) null, (byte) 67, (java.math.BigInteger) null, (java.math.BigInteger) null, 39, (byte[]) null);
            }
            var4.dispose();
        } catch (Exception exception) {
            param1.repaint();
        }
    }

    final static void e(byte param0) {
        if (jl.field_I == null) {
          if (vi.field_n == null) {
            if (param0 < 29) {
              field_r = null;
              wb.b(107);
              return;
            } else {
              wb.b(107);
              return;
            }
          } else {
            vi.field_n.h((byte) -81);
            if (param0 < 29) {
              field_r = null;
              wb.b(107);
              return;
            } else {
              wb.b(107);
              return;
            }
          }
        } else {
          jl.field_I.h((byte) -28);
          if (vi.field_n != null) {
            vi.field_n.h((byte) -81);
            if (param0 >= 29) {
              wb.b(107);
              return;
            } else {
              field_r = null;
              wb.b(107);
              return;
            }
          } else {
            if (param0 < 29) {
              field_r = null;
              wb.b(107);
              return;
            } else {
              wb.b(107);
              return;
            }
          }
        }
    }

    final void g(int param0) {
        ((ia) this).field_o = null;
        if (param0 != -4328) {
            Object var3 = null;
            String discarded$0 = ((ia) this).a((String) null, 24);
        }
    }

    final static void a(int param0, dh param1, byte param2, java.math.BigInteger param3, java.math.BigInteger param4, int param5, byte[] param6) {
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        L0: {
          var10 = Terraphoenix.field_V;
          var7 = ic.a((byte) 122, param5);
          if (vk.field_b != null) {
            var12 = new int[4];
            var11 = var12;
            var8 = var11;
            var9 = 0;
            break L0;
          } else {
            vk.field_b = new java.security.SecureRandom();
            var12 = new int[4];
            var11 = var12;
            var8 = var11;
            var9 = 0;
            break L0;
          }
        }
        L1: while (true) {
          if (4 <= var9) {
            if (ie.field_b == null) {
              ie.field_b = new dh(var7);
              ie.field_b.field_k = 0;
              ie.field_b.a(-222449912, param6, param5, param0);
              ie.field_b.f(var7, -2108648176);
              ie.field_b.a(-6716, var12);
              if (null == jc.field_z) {
                jc.field_z = new dh(100);
                jc.field_z.field_k = 0;
                jc.field_z.i(10, 92);
                var9 = 0;
                L2: while (true) {
                  if (-5 >= (var9 ^ -1)) {
                    jc.field_z.h(-1564407352, param5);
                    jc.field_z.a(param4, (byte) -52, param3);
                    param1.a(-222449912, jc.field_z.field_i, jc.field_z.field_k, 0);
                    var9 = 39 % ((param2 - 0) / 61);
                    param1.a(-222449912, ie.field_b.field_i, ie.field_b.field_k, 0);
                    return;
                  } else {
                    jc.field_z.e(var12[var9], 8959);
                    var9++;
                    continue L2;
                  }
                }
              } else {
                L3: {
                  if (100 <= jc.field_z.field_i.length) {
                    jc.field_z.field_k = 0;
                    jc.field_z.i(10, 92);
                    var9 = 0;
                    break L3;
                  } else {
                    jc.field_z = new dh(100);
                    jc.field_z.field_k = 0;
                    jc.field_z.i(10, 92);
                    var9 = 0;
                    break L3;
                  }
                }
                L4: while (true) {
                  if (-5 >= (var9 ^ -1)) {
                    jc.field_z.h(-1564407352, param5);
                    jc.field_z.a(param4, (byte) -52, param3);
                    param1.a(-222449912, jc.field_z.field_i, jc.field_z.field_k, 0);
                    var9 = 39 % ((param2 - 0) / 61);
                    param1.a(-222449912, ie.field_b.field_i, ie.field_b.field_k, 0);
                    return;
                  } else {
                    jc.field_z.e(var12[var9], 8959);
                    var9++;
                    continue L4;
                  }
                }
              }
            } else {
              if (ie.field_b.field_i.length < var7) {
                ie.field_b = new dh(var7);
                ie.field_b.field_k = 0;
                ie.field_b.a(-222449912, param6, param5, param0);
                ie.field_b.f(var7, -2108648176);
                ie.field_b.a(-6716, var12);
                if (null != jc.field_z) {
                  if (100 <= jc.field_z.field_i.length) {
                    jc.field_z.field_k = 0;
                    jc.field_z.i(10, 92);
                    var9 = 0;
                    L5: while (true) {
                      if (-5 >= (var9 ^ -1)) {
                        jc.field_z.h(-1564407352, param5);
                        jc.field_z.a(param4, (byte) -52, param3);
                        param1.a(-222449912, jc.field_z.field_i, jc.field_z.field_k, 0);
                        var9 = 39 % ((param2 - 0) / 61);
                        param1.a(-222449912, ie.field_b.field_i, ie.field_b.field_k, 0);
                        return;
                      } else {
                        jc.field_z.e(var12[var9], 8959);
                        var9++;
                        continue L5;
                      }
                    }
                  } else {
                    jc.field_z = new dh(100);
                    jc.field_z.field_k = 0;
                    jc.field_z.i(10, 92);
                    var9 = 0;
                    L6: while (true) {
                      if (-5 >= (var9 ^ -1)) {
                        jc.field_z.h(-1564407352, param5);
                        jc.field_z.a(param4, (byte) -52, param3);
                        param1.a(-222449912, jc.field_z.field_i, jc.field_z.field_k, 0);
                        var9 = 39 % ((param2 - 0) / 61);
                        param1.a(-222449912, ie.field_b.field_i, ie.field_b.field_k, 0);
                        return;
                      } else {
                        jc.field_z.e(var12[var9], 8959);
                        var9++;
                        continue L6;
                      }
                    }
                  }
                } else {
                  jc.field_z = new dh(100);
                  jc.field_z.field_k = 0;
                  jc.field_z.i(10, 92);
                  var9 = 0;
                  L7: while (true) {
                    if (-5 >= (var9 ^ -1)) {
                      jc.field_z.h(-1564407352, param5);
                      jc.field_z.a(param4, (byte) -52, param3);
                      param1.a(-222449912, jc.field_z.field_i, jc.field_z.field_k, 0);
                      var9 = 39 % ((param2 - 0) / 61);
                      param1.a(-222449912, ie.field_b.field_i, ie.field_b.field_k, 0);
                      return;
                    } else {
                      jc.field_z.e(var12[var9], 8959);
                      var9++;
                      continue L7;
                    }
                  }
                }
              } else {
                L8: {
                  L9: {
                    ie.field_b.field_k = 0;
                    ie.field_b.a(-222449912, param6, param5, param0);
                    ie.field_b.f(var7, -2108648176);
                    ie.field_b.a(-6716, var12);
                    if (null == jc.field_z) {
                      break L9;
                    } else {
                      if (100 <= jc.field_z.field_i.length) {
                        jc.field_z.field_k = 0;
                        jc.field_z.i(10, 92);
                        var9 = 0;
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  jc.field_z = new dh(100);
                  jc.field_z.field_k = 0;
                  jc.field_z.i(10, 92);
                  var9 = 0;
                  break L8;
                }
                L10: while (true) {
                  if (-5 >= (var9 ^ -1)) {
                    jc.field_z.h(-1564407352, param5);
                    jc.field_z.a(param4, (byte) -52, param3);
                    param1.a(-222449912, jc.field_z.field_i, jc.field_z.field_k, 0);
                    var9 = 39 % ((param2 - 0) / 61);
                    param1.a(-222449912, ie.field_b.field_i, ie.field_b.field_k, 0);
                    return;
                  } else {
                    jc.field_z.e(var12[var9], 8959);
                    var9++;
                    continue L10;
                  }
                }
              }
            }
          } else {
            var8[var9] = vk.field_b.nextInt();
            var9++;
            continue L1;
          }
        }
    }

    final static pd a(int param0, boolean param1) {
        pd var2 = null;
        pd stackIn_2_0 = null;
        pd stackIn_3_0 = null;
        pd stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        pd stackIn_6_0 = null;
        pd stackIn_7_0 = null;
        pd stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        pd stackOut_5_0 = null;
        pd stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        pd stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        pd stackOut_1_0 = null;
        pd stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        pd stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param0 != 4) {
          L0: {
            field_r = null;
            var2 = new pd(true);
            stackOut_5_0 = (pd) var2;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param1) {
              stackOut_7_0 = (pd) (Object) stackIn_7_0;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = (pd) (Object) stackIn_6_0;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          stackIn_8_0.field_a = stackIn_8_1 != 0;
          return var2;
        } else {
          L1: {
            var2 = new pd(true);
            stackOut_1_0 = (pd) var2;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param1) {
              stackOut_3_0 = (pd) (Object) stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = (pd) (Object) stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          stackIn_4_0.field_a = stackIn_4_1 != 0;
          return var2;
        }
    }

    final static void a(int param0, cc param1, int param2) {
        uc var3 = null;
        int var4 = 0;
        uc var5 = null;
        var5 = di.field_l;
        var3 = var5;
        var5.k(-17410, param0);
        var5.field_k = var5.field_k + 1;
        if (param2 <= -51) {
          var4 = var5.field_k;
          var5.i(1, -114);
          if (param1.field_h != null) {
            var5.i(param1.field_h.length, -108);
            var5.a(-222449912, param1.field_h, param1.field_h.length, 0);
            int discarded$4 = var5.d(var4, 8600);
            var5.field_k = var5.field_k - 4;
            param1.field_k = var5.f((byte) -107);
            var5.j(var5.field_k + -var4, -119);
            return;
          } else {
            var5.i(0, -119);
            int discarded$5 = var5.d(var4, 8600);
            var5.field_k = var5.field_k - 4;
            param1.field_k = var5.f((byte) -107);
            var5.j(var5.field_k + -var4, -119);
            return;
          }
        } else {
          return;
        }
    }

    public static void f(byte param0) {
        Object var2 = null;
        field_q = null;
        field_p = null;
        if (param0 != -48) {
          var2 = null;
          ia.a(-110, (dh) null, (byte) 46, (java.math.BigInteger) null, (java.math.BigInteger) null, -122, (byte[]) null);
          field_n = null;
          field_r = null;
          return;
        } else {
          field_n = null;
          field_r = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "(Including <%0>)";
        field_q = "Unpacking sound effects";
        field_n = "Exit Research Screen";
    }
}
