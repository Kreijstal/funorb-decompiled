/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj extends o {
    static String field_o;
    static String field_m;
    static String field_l;
    static ci field_j;
    static int field_n;
    static int[][] field_k;

    final static void a(int param0, java.awt.Component param1) {
        try {
          param1.removeMouseListener(bj.field_cb);
          param1.removeMouseMotionListener(bj.field_cb);
          param1.removeFocusListener(bj.field_cb);
          nd.field_l = param0;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "uj.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static char a(char param0, byte param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = Chess.field_G;
        if (param1 >= 15) {
          var2 = param0;
          if (var2 != 32) {
            if (var2 == 160) {
              return '_';
            }
            if (var2 != 95 &&
              var2 != 45) {
              if (var2 == 91) {
                return param0;
              }
              if (93 != var2 &&
                35 != var2) {
                if (224 == var2) {
                  return 'a';
                }
                if (var2 == 225) {
                  return 'a';
                }
                if (var2 != 226 &&
                  var2 != 228 &&
                  var2 != 227 &&
                  192 != var2 &&
                  var2 != 193 &&
                  194 != var2 &&
                  196 != var2 &&
                  var2 != 195) {
                  if (232 != var2 &&
                    var2 != 233 &&
                    234 != var2 &&
                    235 != var2 &&
                    var2 != 200 &&
                    var2 != 201 &&
                    202 != var2 &&
                    203 != var2) {
                    if (237 != var2 &&
                      var2 != 238 &&
                      239 != var2 &&
                      var2 != 205 &&
                      206 != var2 &&
                      var2 != 207) {
                      if (var2 != 242 &&
                        var2 != 243 &&
                        var2 != 244 &&
                        var2 != 246 &&
                        var2 != 245 &&
                        var2 != 210 &&
                        var2 != 211 &&
                        var2 != 212 &&
                        var2 != 214 &&
                        var2 != 213) {
                        if (249 != var2 &&
                          var2 != 250 &&
                          var2 != 251 &&
                          var2 != 252 &&
                          var2 != 217) {
                          if (218 == var2) {
                            return 'u';
                          }
                          if (var2 == 219) {
                            return 'u';
                          }
                          if (var2 == 220) {
                            return 'u';
                          }
                          if (231 == var2) {
                            return 'c';
                          }
                          if (var2 == 199) {
                            return 'c';
                          }
                          if (255 == var2) {
                            return 'y';
                          }
                          if (var2 == 376) {
                            return 'y';
                          }
                          if (var2 != 241 &&
                            var2 != 209) {
                            if (var2 != 223) {
                              return Character.toLowerCase(param0);
                            }
                            return 'b';
                          }
                          return 'n';
                        }
                        return 'u';
                      }
                      return 'o';
                    }
                    return 'i';
                  }
                  return 'e';
                }
                return 'a';
              }
              return param0;
            }
          }
          return '_';
        }
        uj.a('w', (byte) 121);
        var2Lifetime1 = param0;
        if (var2Lifetime1 != 32) {
          if (var2Lifetime1 == 160) {
            return '_';
          }
          if (var2Lifetime1 != 95 &&
            var2Lifetime1 != 45) {
            if (var2Lifetime1 != 91 &&
              93 != var2Lifetime1 &&
              35 != var2Lifetime1) {
              if (224 != var2Lifetime1 &&
                var2Lifetime1 != 225 &&
                var2Lifetime1 != 226 &&
                var2Lifetime1 != 228 &&
                var2Lifetime1 != 227 &&
                192 != var2Lifetime1 &&
                var2Lifetime1 != 193 &&
                194 != var2Lifetime1 &&
                196 != var2Lifetime1 &&
                var2Lifetime1 != 195) {
                if (232 != var2Lifetime1 &&
                  var2Lifetime1 != 233 &&
                  234 != var2Lifetime1 &&
                  235 != var2Lifetime1 &&
                  var2Lifetime1 != 200 &&
                  var2Lifetime1 != 201 &&
                  202 != var2Lifetime1 &&
                  203 != var2Lifetime1) {
                  if (237 != var2Lifetime1 &&
                    var2Lifetime1 != 238) {
                    if (239 == var2Lifetime1) {
                      return 'i';
                    }
                    if (var2Lifetime1 == 205) {
                      return 'i';
                    }
                    if (206 == var2Lifetime1) {
                      return 'i';
                    }
                    if (var2Lifetime1 == 207) {
                      return 'i';
                    }
                    if (var2Lifetime1 == 242) {
                      return 'o';
                    }
                    if (var2Lifetime1 != 243) {
                      if (var2Lifetime1 == 244) {
                        return 'o';
                      }
                      if (var2Lifetime1 == 246) {
                        return 'o';
                      }
                      if (var2Lifetime1 != 245 &&
                        var2Lifetime1 != 210 &&
                        var2Lifetime1 != 211) {
                        if (var2Lifetime1 == 212) {
                          return 'o';
                        }
                        if (var2Lifetime1 != 214) {
                          if (var2Lifetime1 == 213) {
                            return 'o';
                          }
                          if (249 != var2Lifetime1 &&
                            var2Lifetime1 != 250) {
                            if (var2Lifetime1 == 251) {
                              return 'u';
                            }
                            if (var2Lifetime1 == 252) {
                              return 'u';
                            }
                            if (var2Lifetime1 == 217) {
                              return 'u';
                            }
                            if (218 == var2Lifetime1) {
                              return 'u';
                            }
                            if (var2Lifetime1 == 219) {
                              return 'u';
                            }
                            if (var2Lifetime1 == 220) {
                              return 'u';
                            }
                            if (231 == var2Lifetime1) {
                              return 'c';
                            }
                            if (var2Lifetime1 == 199) {
                              return 'c';
                            }
                            if (255 == var2Lifetime1) {
                              return 'y';
                            }
                            if (var2Lifetime1 == 376) {
                              return 'y';
                            }
                            if (var2Lifetime1 != 241 &&
                              var2Lifetime1 != 209) {
                              if (var2Lifetime1 != 223) {
                                return Character.toLowerCase(param0);
                              }
                              return 'b';
                            }
                            return 'n';
                          }
                          return 'u';
                        }
                      }
                    }
                    return 'o';
                  }
                  return 'i';
                }
                return 'e';
              }
              return 'a';
            }
            return param0;
          }
        }
        return '_';
    }

    final static void a(int param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        pa var4_ref_pa = null;
        dc var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int var8 = 0;
        nk var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var8 = Chess.field_G;
        try {
          if (param0 != -243) {
            return;
          }
          var9 = tk.field_h;
          var2 = var9.i(-128);
          var3 = var9.i(-128);
          if (var2 == 0) {
            var4_ref_pa = (pa) (ve.field_Nb.g(-18110));
            if (var4_ref_pa == null) {
              si.d(65280);
              return;
            }
            var5_int = -var9.field_l + sb.field_sb;
            var11 = var4_ref_pa.field_q;
            var10 = var11;
            var6 = var10;
            if (var5_int > var11.length << 2) {
              var5_int = var11.length << 2;
            }
            for (var7 = 0; var5_int > var7; var7++) {
              var6[var7 >> 2] = var6[var7 >> 2] + (var9.i(-80) << (ce.a(3, var7) << 8));
            }
            var4_ref_pa.c(param0 ^ 2146);
            return;
          }
          if (1 == var2) {
            var4 = var9.a(false);
            var5 = (dc) (fa.field_j.g(-18110));
            while (var5 != null) {
              if (~var5.field_j != ~var3 ||
                var4 != var5.field_l) {
                var5 = (dc) (fa.field_j.a((byte) -128));
                continue;
              }
              break;
            }
            if (var5 == null) {
              si.d(param0 + 65523);
              return;
            }
            var5.c(-2193);
            return;
          }
          fg.a((Throwable) null, (byte) -77, "LR1: " + tm.b((byte) -127));
          si.d(65280);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var1), "uj.A(" + param0 + ')');
        }
    }

    private uj() throws Throwable {
        throw new Error();
    }

    public static void c(byte param0) {
        field_l = null;
        field_m = null;
        field_j = null;
        field_o = null;
        if (param0 < -115) {
          field_k = (int[][]) null;
          return;
        }
        field_k = (int[][]) null;
        field_k = (int[][]) null;
    }

    static {
        field_m = "Quick Chat game";
        field_l = "Average rating";
        field_o = "You have entered another game.";
    }
}
