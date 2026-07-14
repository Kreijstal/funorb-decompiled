/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf extends k {
    static int field_k;

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        Object var22 = null;
        L0: {
          var21 = BrickABrac.field_J ? 1 : 0;
          param12 = param12 + param7;
          var13 = 0;
          var14 = 0;
          var15 = -param4;
          if (param10 == 8) {
            break L0;
          } else {
            var22 = null;
            kf.a((int[]) null, 92, 50, 37, -19, 126, (int[]) null, 74, 68, -55, 33, -74, 59);
            break L0;
          }
        }
        L1: while (true) {
          if (-1 >= (var15 ^ -1)) {
            return;
          } else {
            var13 = var13 - param7;
            var16 = param5 >> 2126854952;
            var17 = 256 - var16;
            var18 = var16 * (param11 & 16711935);
            var19 = var16 * (param11 & 65280);
            L2: while (true) {
              if (param8 <= var13) {
                L3: while (true) {
                  if (param2 <= var13) {
                    param12 = param12 + lb.field_c;
                    param5 = param5 + param1;
                    var15++;
                    continue L1;
                  } else {
                    param9++;
                    param3 = param6[param9];
                    if (param3 > 0) {
                      var14 = 0;
                      L4: while (true) {
                        if (var14 >= param3) {
                          continue L3;
                        } else {
                          if (var13 < param2) {
                            var20 = param0[param12 - -var13];
                            param0[param12 - -var13] = ik.a(-16711936, var17 * ik.a(var20, 16711935) + var18) + ik.a(var19 + ik.a(var20, 65280) * var17, 16711680) >>> 977035464;
                            var13++;
                            var14++;
                            continue L4;
                          } else {
                            var13++;
                            var14++;
                            continue L4;
                          }
                        }
                      }
                    } else {
                      var13 = var13 - param3;
                      continue L3;
                    }
                  }
                }
              } else {
                param9++;
                param3 = param6[param9];
                if (-1 > (param3 ^ -1)) {
                  var14 = 0;
                  L5: while (true) {
                    if (var14 >= param3) {
                      continue L2;
                    } else {
                      if (var13 >= param8) {
                        var20 = param0[param12 - -var13];
                        param0[param12 - -var13] = ik.a(var17 * ik.a(65280, var20) - -var19, 16711680) + ik.a(ik.a(var20, 16711935) * var17 + var18, -16711936) >>> -1313728280;
                        var13++;
                        var14++;
                        continue L5;
                      } else {
                        var13++;
                        var14++;
                        continue L5;
                      }
                    }
                  }
                } else {
                  var13 = var13 - param3;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final qh a(String param0, byte param1) {
        CharSequence var5 = (CharSequence) (Object) param0;
        if (!dc.a(var5, -125)) {
            return lp.field_xb;
        }
        CharSequence var6 = (CharSequence) (Object) param0;
        int var3 = fl.a(var6, -28734);
        if (param1 != 106) {
            Object var4 = null;
            jp[] discarded$0 = kf.a((String) null, (String) null, (mf) null, -17);
        }
        if (var3 < -1) {
            // if_icmplt L80
        } else {
            return lp.field_xb;
        }
        return ae.field_c;
    }

    kf(vb param0) {
        super(param0);
    }

    final String a(int param0, String param1) {
        if (!(((kf) this).a(param1, (byte) 106) != lp.field_xb)) {
            return qb.field_y;
        }
        int var3 = -11 / ((param0 - -16) / 50);
        return null;
    }

    final static String a(boolean param0, CharSequence param1, int param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = BrickABrac.field_J ? 1 : 0;
        if (param1 == null) {
          return km.field_o;
        } else {
          L0: {
            var3 = param1.length();
            if (var3 < 1) {
              break L0;
            } else {
              if (12 >= var3) {
                L1: {
                  var4 = gb.a(param1, param2 + 111);
                  if (var4 == null) {
                    break L1;
                  } else {
                    if ((var4.length() ^ -1) <= -2) {
                      L2: {
                        if (ik.a((byte) -9, var4.charAt(0))) {
                          break L2;
                        } else {
                          if (ik.a((byte) -9, var4.charAt(-1 + var4.length()))) {
                            break L2;
                          } else {
                            var5 = 0;
                            if (param2 == 3) {
                              var6 = 0;
                              L3: while (true) {
                                if (var6 >= param1.length()) {
                                  if ((var5 ^ -1) < -1) {
                                    return q.field_g;
                                  } else {
                                    return null;
                                  }
                                } else {
                                  L4: {
                                    var7 = param1.charAt(var6);
                                    if (ik.a((byte) -9, (char) var7)) {
                                      var5++;
                                      break L4;
                                    } else {
                                      var5 = 0;
                                      break L4;
                                    }
                                  }
                                  if (2 <= var5) {
                                    if (!param0) {
                                      return pq.field_n;
                                    } else {
                                      var6++;
                                      continue L3;
                                    }
                                  } else {
                                    var6++;
                                    continue L3;
                                  }
                                }
                              }
                            } else {
                              return null;
                            }
                          }
                        }
                      }
                      return q.field_g;
                    } else {
                      break L1;
                    }
                  }
                }
                return km.field_o;
              } else {
                break L0;
              }
            }
          }
          return km.field_o;
        }
    }

    final static void a(String param0, byte param1, java.applet.Applet param2) {
        try {
            java.net.URL var3 = null;
            if (param1 > -111) {
                return;
            }
            try {
                var3 = new java.net.URL(param2.getCodeBase(), param0);
                var3 = hg.a(param2, var3, -1);
                fk.a((byte) 94, param2, var3.toString(), true);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static jp[] a(String param0, String param1, mf param2, int param3) {
        jp[] var6 = cr.a(param1, param2, param0, 2);
        jp[] var4 = var6;
        var6[3].field_z = var6[3].field_C;
        var6[1].field_x = var6[1].field_D;
        var6[5].field_z = var6[5].field_C;
        var6[7].field_x = var6[7].field_D;
        var6[1] = qb.a(var6[1], false, 8);
        var6[7] = qb.a(var6[7], false, 8);
        var6[3] = k.a(var6[3], 101, 8);
        var6[5] = k.a(var6[5], 89, 8);
        int var5 = -92 / ((-45 - param3) / 34);
        return var4;
    }

    static {
    }
}
