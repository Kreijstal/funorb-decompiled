/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb extends nb implements jk {
    private String[] field_D;
    private ag field_L;
    private kf[] field_G;
    static m field_J;
    static volatile int field_I;
    static String field_K;
    static String[] field_F;
    static db field_C;

    final void a(byte param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (param3 != 0) {
            return;
        }
        le var5 = ql.field_Q;
        if (null != ((bb) this).field_D) {
            int discarded$0 = var5.a(ka.field_a, ((bb) this).field_t + param2, param1 + ((bb) this).field_o, ((bb) this).field_j, 20, 16777215, -1, 0, 0, var5.field_G + var5.field_E);
        }
    }

    final void a(String[] param0, boolean param1) {
        int var3 = 0;
        int var4_int = 0;
        uj var4 = null;
        int var5 = 0;
        int var6 = 0;
        kf stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        kf stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        kf stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_14_3 = 0;
        kf stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        kf stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        kf stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_18_3 = 0;
        kf stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        kf stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        kf stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        kf stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        kf stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        kf stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        L0: {
          var6 = Lexicominos.field_L ? 1 : 0;
          ((bb) this).field_A.g(-81);
          if (param0 == null) {
            break L0;
          } else {
            if (param0.length == 0) {
              break L0;
            } else {
              var3 = param0.length;
              ((bb) this).field_D = new String[var3];
              var4_int = 0;
              L1: while (true) {
                if (var3 <= var4_int) {
                  L2: {
                    if (!param1) {
                      break L2;
                    } else {
                      field_J = null;
                      break L2;
                    }
                  }
                  var4 = new uj(ql.field_Q, 0, 1);
                  ((bb) this).field_G = new kf[1 + var3];
                  var5 = 0;
                  L3: while (true) {
                    if (var3 <= var5) {
                      L4: {
                        ((bb) this).field_G[var3] = new kf(bc.field_J, (vd) this);
                        ((bb) this).field_G[var3].field_i = (rd) (Object) var4;
                        stackOut_15_0 = ((bb) this).field_G[var3];
                        stackOut_15_1 = 15;
                        stackOut_15_2 = 100;
                        stackIn_17_0 = stackOut_15_0;
                        stackIn_17_1 = stackOut_15_1;
                        stackIn_17_2 = stackOut_15_2;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        stackIn_16_2 = stackOut_15_2;
                        if (param1) {
                          stackOut_17_0 = (kf) (Object) stackIn_17_0;
                          stackOut_17_1 = stackIn_17_1;
                          stackOut_17_2 = stackIn_17_2;
                          stackOut_17_3 = 0;
                          stackIn_18_0 = stackOut_17_0;
                          stackIn_18_1 = stackOut_17_1;
                          stackIn_18_2 = stackOut_17_2;
                          stackIn_18_3 = stackOut_17_3;
                          break L4;
                        } else {
                          stackOut_16_0 = (kf) (Object) stackIn_16_0;
                          stackOut_16_1 = stackIn_16_1;
                          stackOut_16_2 = stackIn_16_2;
                          stackOut_16_3 = 1;
                          stackIn_18_0 = stackOut_16_0;
                          stackIn_18_1 = stackOut_16_1;
                          stackIn_18_2 = stackOut_16_2;
                          stackIn_18_3 = stackOut_16_3;
                          break L4;
                        }
                      }
                      ((kf) (Object) stackIn_18_0).a(stackIn_18_1, stackIn_18_2, stackIn_18_3 != 0, (1 + var3) * 16 + 20, 0);
                      ((bb) this).b((byte) -80, (w) (Object) ((bb) this).field_G[var3]);
                      return;
                    } else {
                      L5: {
                        ((bb) this).field_G[var5] = new kf(((bb) this).field_D[var5], (vd) this);
                        ((bb) this).field_G[var5].field_i = (rd) (Object) var4;
                        ((bb) this).field_G[var5].field_q = cb.field_A;
                        stackOut_11_0 = ((bb) this).field_G[var5];
                        stackOut_11_1 = 15;
                        stackOut_11_2 = 80;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        stackIn_13_2 = stackOut_11_2;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        stackIn_12_2 = stackOut_11_2;
                        if (param1) {
                          stackOut_13_0 = (kf) (Object) stackIn_13_0;
                          stackOut_13_1 = stackIn_13_1;
                          stackOut_13_2 = stackIn_13_2;
                          stackOut_13_3 = 0;
                          stackIn_14_0 = stackOut_13_0;
                          stackIn_14_1 = stackOut_13_1;
                          stackIn_14_2 = stackOut_13_2;
                          stackIn_14_3 = stackOut_13_3;
                          break L5;
                        } else {
                          stackOut_12_0 = (kf) (Object) stackIn_12_0;
                          stackOut_12_1 = stackIn_12_1;
                          stackOut_12_2 = stackIn_12_2;
                          stackOut_12_3 = 1;
                          stackIn_14_0 = stackOut_12_0;
                          stackIn_14_1 = stackOut_12_1;
                          stackIn_14_2 = stackOut_12_2;
                          stackIn_14_3 = stackOut_12_3;
                          break L5;
                        }
                      }
                      ((kf) (Object) stackIn_14_0).a(stackIn_14_1, stackIn_14_2, stackIn_14_3 != 0, 20 + 16 * var5, 0);
                      ((bb) this).b((byte) 112, (w) (Object) ((bb) this).field_G[var5]);
                      var5++;
                      continue L3;
                    }
                  }
                } else {
                  ((bb) this).field_D[var4_int] = pj.a((CharSequence) (Object) param0[var4_int], (byte) -126).replace(' ', ' ');
                  var4_int++;
                  continue L1;
                }
              }
            }
          }
        }
        ((bb) this).field_D = null;
    }

    final boolean a(char param0, int param1, w param2, byte param3) {
        int var5 = 120 % ((param3 - -13) / 55);
        if (!(!super.a(param0, param1, param2, (byte) 42))) {
            return true;
        }
        if (!((param1 ^ -1) != -99)) {
            return ((bb) this).a(0, param2);
        }
        if (99 != param1) {
            return false;
        }
        return ((bb) this).c((byte) 119, param2);
    }

    public final void a(int param0, int param1, int param2, int param3, kf param4) {
        int var6 = 0;
        int var7 = 0;
        var7 = Lexicominos.field_L ? 1 : 0;
        var6 = 0;
        L0: while (true) {
          if (var6 >= ((bb) this).field_D.length) {
            L1: {
              if (((bb) this).field_G[((bb) this).field_D.length] == param4) {
                ((bb) this).field_L.a((byte) -12);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param2 == 215535458) {
                break L2;
              } else {
                field_F = null;
                break L2;
              }
            }
            return;
          } else {
            if (((bb) this).field_G[var6] == param4) {
              ((bb) this).field_L.a(((bb) this).field_D[var6], (byte) 110);
              var6++;
              continue L0;
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    final static boolean a(CharSequence param0, boolean param1, int param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        var8 = Lexicominos.field_L ? 1 : 0;
        if (param0 == null) {
          return false;
        } else {
          L0: {
            var3 = param0.length();
            if (1 > var3) {
              break L0;
            } else {
              if (-13 > (var3 ^ -1)) {
                break L0;
              } else {
                var4 = ck.a(param0, (byte) -48);
                if (var4 == null) {
                  return false;
                } else {
                  if (var4.length() >= 1) {
                    L1: {
                      if (cf.a(var4.charAt(0), (byte) 78)) {
                        break L1;
                      } else {
                        if (cf.a(var4.charAt(-1 + var4.length()), (byte) 78)) {
                          break L1;
                        } else {
                          var5 = 0;
                          var6 = 0;
                          L2: while (true) {
                            if (var6 >= param0.length()) {
                              L3: {
                                if ((var5 ^ -1) < param2) {
                                  stackOut_28_0 = 0;
                                  stackIn_29_0 = stackOut_28_0;
                                  break L3;
                                } else {
                                  stackOut_27_0 = 1;
                                  stackIn_29_0 = stackOut_27_0;
                                  break L3;
                                }
                              }
                              return stackIn_29_0 != 0;
                            } else {
                              L4: {
                                var7 = param0.charAt(var6);
                                if (!cf.a((char) var7, (byte) 78)) {
                                  var5 = 0;
                                  break L4;
                                } else {
                                  var5++;
                                  break L4;
                                }
                              }
                              if (2 <= var5) {
                                if (!param1) {
                                  return false;
                                } else {
                                  var6++;
                                  continue L2;
                                }
                              } else {
                                var6++;
                                continue L2;
                              }
                            }
                          }
                        }
                      }
                    }
                    return false;
                  } else {
                    return false;
                  }
                }
              }
            }
          }
          return false;
        }
    }

    public static void a(byte param0) {
        field_F = null;
        field_C = null;
        field_K = null;
        if (param0 != -26) {
            field_C = null;
        }
        field_J = null;
    }

    bb(ag param0) {
        super(0, 0, 0, 0, (rd) null);
        ((bb) this).field_L = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = 0;
        field_J = new m("email");
        field_K = "Create";
        field_F = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_C = new db(311, 450);
    }
}
