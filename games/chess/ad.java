/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad {
    static km[] field_c;
    static String field_d;
    private l field_g;
    static boolean field_b;
    private l field_e;
    static int field_a;
    static dd[] field_f;

    final int c(int param0) {
        int var2 = 0;
        l var3 = null;
        int var4 = 0;
        var4 = Chess.field_G;
        var2 = 0;
        var3 = ((ad) this).field_g.field_p;
        if (param0 == -19099) {
          L0: while (true) {
            if (var3 == ((ad) this).field_g) {
              return var2;
            } else {
              var2++;
              var3 = var3.field_p;
              continue L0;
            }
          }
        } else {
          field_f = null;
          L1: while (true) {
            if (var3 == ((ad) this).field_g) {
              return var2;
            } else {
              var2++;
              var3 = var3.field_p;
              continue L1;
            }
          }
        }
    }

    final l a(byte param0) {
        l var2 = null;
        Object var3 = null;
        var2 = ((ad) this).field_g.field_p;
        if (param0 == -75) {
          if (((ad) this).field_g == var2) {
            return null;
          } else {
            var2.d(-1);
            return var2;
          }
        } else {
          var3 = null;
          String discarded$4 = ad.a(74, (byte[]) null);
          if (((ad) this).field_g == var2) {
            return null;
          } else {
            var2.d(-1);
            return var2;
          }
        }
    }

    final static String a(int param0, byte[] param1) {
        if (param0 != -29410) {
          field_a = 13;
          return gh.a(param1, 0, param0 + 29249, param1.length);
        } else {
          return gh.a(param1, 0, param0 + 29249, param1.length);
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_c = null;
        int var1 = 51 % ((param0 - -16) / 59);
        field_d = null;
    }

    final static vj a(java.awt.Component param0, byte param1, int param2, int param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            vj var5 = null;
            si var5_ref = null;
            int var6 = 0;
            vj stackIn_1_0 = null;
            Throwable decompiledCaughtException = null;
            vj stackOut_0_0 = null;
            try {
              var4 = Class.forName("mb");
              var5 = (vj) var4.newInstance();
              var6 = 99 % ((param1 - 68) / 40);
              var5.a(param0, 84, param2, param3);
              stackOut_0_0 = (vj) var5;
              stackIn_1_0 = stackOut_0_0;
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return (vj) (Object) stackIn_1_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    final void a(int param0, l param1) {
        L0: {
          if (param1.field_m != null) {
            param1.d(-1);
            break L0;
          } else {
            break L0;
          }
        }
        param1.field_m = ((ad) this).field_g.field_m;
        param1.field_p = ((ad) this).field_g;
        param1.field_m.field_p = param1;
        param1.field_p.field_m = param1;
        if (param0 == 0) {
          return;
        } else {
          l discarded$2 = ((ad) this).b(2);
          return;
        }
    }

    public ad() {
        ((ad) this).field_g = new l();
        ((ad) this).field_g.field_p = ((ad) this).field_g;
        ((ad) this).field_g.field_m = ((ad) this).field_g;
    }

    final l b(int param0) {
        l var2 = null;
        var2 = ((ad) this).field_g.field_p;
        if (var2 != ((ad) this).field_g) {
          ((ad) this).field_e = var2.field_p;
          if (param0 != -22585) {
            field_b = false;
            return var2;
          } else {
            return var2;
          }
        } else {
          ((ad) this).field_e = null;
          return null;
        }
    }

    final static String a(CharSequence param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        StringBuilder var10 = null;
        StringBuilder var11 = null;
        var9 = Chess.field_G;
        if (param0 != null) {
          var2 = 0;
          var3 = param0.length();
          L0: while (true) {
            if (var3 > var2) {
              if (cg.a(2, param0.charAt(var2))) {
                var2++;
                continue L0;
              } else {
                L1: while (true) {
                  L2: {
                    if (var3 <= var2) {
                      break L2;
                    } else {
                      if (!cg.a(2, param0.charAt(var3 + -1))) {
                        break L2;
                      } else {
                        var3--;
                        continue L1;
                      }
                    }
                  }
                  var4 = var3 + -var2;
                  if (var4 <= param1) {
                    if (-13 >= var4) {
                      L3: {
                        var11 = new StringBuilder(var4);
                        var6 = var2;
                        if (var3 <= var6) {
                          break L3;
                        } else {
                          L4: {
                            var7 = param0.charAt(var6);
                            if (gm.a((char) var7, (byte) -84)) {
                              L5: {
                                var8 = uj.a((char) var7, (byte) 118);
                                if (var8 != 0) {
                                  StringBuilder discarded$2 = var11.append(var8);
                                  break L5;
                                } else {
                                  var6++;
                                  break L5;
                                }
                              }
                              var6++;
                              break L4;
                            } else {
                              var6++;
                              break L4;
                            }
                          }
                          var6++;
                          var6++;
                          var6++;
                          var6++;
                          break L3;
                        }
                      }
                      if (-1 == (var11.length() ^ -1)) {
                        return null;
                      } else {
                        return var11.toString();
                      }
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              L6: while (true) {
                L7: {
                  if (var3 <= var2) {
                    break L7;
                  } else {
                    if (!cg.a(2, param0.charAt(var3 + -1))) {
                      break L7;
                    } else {
                      var3--;
                      continue L6;
                    }
                  }
                }
                var4 = var3 + -var2;
                if (var4 <= param1) {
                  if (-13 >= var4) {
                    L8: {
                      var10 = new StringBuilder(var4);
                      var6 = var2;
                      if (var3 <= var6) {
                        break L8;
                      } else {
                        L9: {
                          var7 = param0.charAt(var6);
                          if (gm.a((char) var7, (byte) -84)) {
                            L10: {
                              var8 = uj.a((char) var7, (byte) 118);
                              if (var8 != 0) {
                                StringBuilder discarded$3 = var10.append(var8);
                                break L10;
                              } else {
                                var6++;
                                break L10;
                              }
                            }
                            var6++;
                            break L9;
                          } else {
                            var6++;
                            break L9;
                          }
                        }
                        var6++;
                        var6++;
                        var6++;
                        var6++;
                        break L8;
                      }
                    }
                    if (-1 == (var10.length() ^ -1)) {
                      return null;
                    } else {
                      return var10.toString();
                    }
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    final l b(byte param0) {
        l var2 = null;
        Object var3 = null;
        var2 = ((ad) this).field_e;
        if (var2 != ((ad) this).field_g) {
          if (param0 > -64) {
            var3 = null;
            ((ad) this).a(-31, (l) null);
            ((ad) this).field_e = var2.field_p;
            return var2;
          } else {
            ((ad) this).field_e = var2.field_p;
            return var2;
          }
        } else {
          ((ad) this).field_e = null;
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = true;
        field_f = new dd[7];
    }
}
