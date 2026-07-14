/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qt {
    static il field_a;

    public static void b(int param0) {
        try {
            field_a = null;
            if (param0 != -25809) {
                boolean discarded$0 = qt.a((String) null, true, 14, (String) null, (String) null, (mr) null, true);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "qt.B(" + param0 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int stackIn_13_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        pd.field_p[ola.field_Eb] = param3;
                        boa.field_n[ola.field_Eb] = ola.field_Eb;
                        jk.field_h[ola.field_Eb] = param4;
                        if (ap.field_d >= param4) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        ma.field_g = param4;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((ota.field_c ^ -1) < (param4 ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        kc.field_a = param4;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        cu.field_o[ola.field_Eb] = param0;
                        bq.field_h[ola.field_Eb] = param1;
                        im.field_o[ola.field_Eb] = param2;
                        var6_int = param2 + (param1 + param0);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (-1 != (var6_int ^ -1)) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = 0;
                        stackIn_13_0 = stackOut_10_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = 1000 * param0 / var6_int;
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var7 = stackIn_13_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        ic.field_c[ola.field_Eb] = var7;
                        ola.field_Eb = ola.field_Eb + 1;
                        if ((ma.field_g ^ -1) <= (var7 ^ -1)) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        ma.field_g = var7;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if ((var7 ^ -1) <= (kc.field_a ^ -1)) {
                            statePc = 22;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        kc.field_a = var7;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (param5 <= -9) {
                            statePc = 28;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        qt.a(-106);
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 27: {
                    var6 = (RuntimeException) (Object) caughtException;
                    throw tba.a((Throwable) (Object) var6, "qt.A(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
                }
                case 28: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0) {
        kh var1 = null;
        int var2 = 0;
        pha var3_ref_pha = null;
        int var3 = 0;
        long var3_long = 0L;
        ht var3_ref_ht = null;
        ht var4 = null;
        ht var4_ref = null;
        int var4_int = 0;
        int var5 = 0;
        String var5_ref = null;
        ht var5_ref_ht = null;
        pha var6 = null;
        String var7 = null;
        pha var8_ref = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_16_0 = 0;
        pha stackIn_23_0 = null;
        pha stackIn_24_0 = null;
        pha stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        String stackIn_84_0 = null;
        String stackIn_85_0 = null;
        String stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        boolean stackIn_169_0 = false;
        boolean stackIn_170_0 = false;
        int stackIn_181_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        pha stackOut_22_0 = null;
        pha stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        pha stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        String stackOut_83_0 = null;
        String stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        String stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        boolean stackOut_168_0 = false;
        boolean stackOut_169_0 = false;
        int stackOut_180_0 = 0;
        var11 = TombRacer.field_G ? 1 : 0;
        if (param0 <= -10) {
          L0: {
            L1: {
              L2: {
                var1 = vc.field_q;
                var2 = ((uia) (Object) var1).h(255);
                if ((var2 ^ -1) == -1) {
                  break L2;
                } else {
                  if ((var2 ^ -1) == -2) {
                    break L2;
                  } else {
                    if (2 == var2) {
                      break L2;
                    } else {
                      if (3 == var2) {
                        break L2;
                      } else {
                        if (var2 == 4) {
                          break L2;
                        } else {
                          L3: {
                            if (5 != var2) {
                              break L3;
                            } else {
                              L4: {
                                var3_long = ((uia) (Object) var1).b(290646880);
                                var5_ref = ((uia) (Object) var1).e((byte) -76);
                                var6 = (pha) (Object) ((uia) (Object) var1).e((byte) -76);
                                var7 = ((uia) (Object) var1).e((byte) -76);
                                var8_ref = nl.a(true, var3_long);
                                if (((String) (Object) var6).equals((Object) (Object) "")) {
                                  stackOut_15_0 = 0;
                                  stackIn_16_0 = stackOut_15_0;
                                  break L4;
                                } else {
                                  stackOut_14_0 = 1;
                                  stackIn_16_0 = stackOut_14_0;
                                  break L4;
                                }
                              }
                              L5: {
                                L6: {
                                  var9 = stackIn_16_0;
                                  if (null == var8_ref) {
                                    break L6;
                                  } else {
                                    if (var9 != 0) {
                                      var8_ref.a(var7, 75, var5_ref);
                                      if (var11 == 0) {
                                        break L5;
                                      } else {
                                        break L6;
                                      }
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                                var8_ref = new pha(var5_ref, var7, var3_long);
                                fua.field_a.a(-1, (od) (Object) var8_ref, var3_long);
                                break L5;
                              }
                              L7: {
                                var8_ref.field_Mb = bva.b((byte) -107) + -(long)((uia) (Object) var1).e(-87);
                                var8_ref.field_Jb = ((uia) (Object) var1).d(121);
                                var10 = ((uia) (Object) var1).b((byte) 100);
                                stackOut_22_0 = (pha) var8_ref;
                                stackIn_24_0 = stackOut_22_0;
                                stackIn_23_0 = stackOut_22_0;
                                if ((1 & var10 ^ -1) == -1) {
                                  stackOut_24_0 = (pha) (Object) stackIn_24_0;
                                  stackOut_24_1 = 0;
                                  stackIn_25_0 = stackOut_24_0;
                                  stackIn_25_1 = stackOut_24_1;
                                  break L7;
                                } else {
                                  stackOut_23_0 = (pha) (Object) stackIn_23_0;
                                  stackOut_23_1 = 1;
                                  stackIn_25_0 = stackOut_23_0;
                                  stackIn_25_1 = stackOut_23_1;
                                  break L7;
                                }
                              }
                              stackIn_25_0.field_tb = stackIn_25_1 != 0;
                              var8_ref.field_zb = var10 >> -661366271;
                              var8_ref.field_Ab = ((uia) (Object) var1).h(255);
                              var8_ref.field_Eb = ((uia) (Object) var1).h(255);
                              ql.a(110, var8_ref);
                              if (var11 == 0) {
                                break L1;
                              } else {
                                break L3;
                              }
                            }
                          }
                          L8: {
                            if ((var2 ^ -1) == -7) {
                              break L8;
                            } else {
                              L9: {
                                if (-8 != (var2 ^ -1)) {
                                  break L9;
                                } else {
                                  var3_ref_pha = (pha) (Object) uma.field_b.f(-80);
                                  L10: while (true) {
                                    L11: {
                                      L12: {
                                        if (var3_ref_pha == null) {
                                          break L12;
                                        } else {
                                          var3_ref_pha.p(70);
                                          var3_ref_pha.c(-7975);
                                          var3_ref_pha = (pha) (Object) uma.field_b.e(118);
                                          if (var11 != 0) {
                                            break L11;
                                          } else {
                                            if (var11 == 0) {
                                              continue L10;
                                            } else {
                                              break L12;
                                            }
                                          }
                                        }
                                      }
                                      so.field_K = 0;
                                      break L11;
                                    }
                                    if (var11 == 0) {
                                      break L1;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                              }
                              L13: {
                                if (-9 == (var2 ^ -1)) {
                                  break L13;
                                } else {
                                  L14: {
                                    if ((var2 ^ -1) != -10) {
                                      break L14;
                                    } else {
                                      L15: {
                                        var3 = ((uia) (Object) var1).d(121);
                                        var4_int = ((uia) (Object) var1).h(255);
                                        var5_ref_ht = (ht) (Object) jb.field_K.a(-107, (long)var3);
                                        if (var5_ref_ht == null) {
                                          break L15;
                                        } else {
                                          L16: {
                                            L17: {
                                              if (0 != var4_int) {
                                                break L17;
                                              } else {
                                                var5_ref_ht.p(52);
                                                if (var11 == 0) {
                                                  break L16;
                                                } else {
                                                  break L17;
                                                }
                                              }
                                            }
                                            var5_ref_ht.field_zb = qsa.field_a;
                                            var5_ref_ht.field_Ib = var4_int;
                                            break L16;
                                          }
                                          var5_ref_ht.c(-7975);
                                          break L15;
                                        }
                                      }
                                      if (var11 == 0) {
                                        break L1;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  L18: {
                                    if (-11 == (var2 ^ -1)) {
                                      break L18;
                                    } else {
                                      L19: {
                                        L20: {
                                          if (var2 == 11) {
                                            break L20;
                                          } else {
                                            if (-13 != (var2 ^ -1)) {
                                              break L19;
                                            } else {
                                              break L20;
                                            }
                                          }
                                        }
                                        L21: {
                                          var3 = ((uia) (Object) var1).d(123);
                                          var4 = (ht) (Object) jb.field_K.a(-111, (long)var3);
                                          if (null != var4) {
                                            L22: {
                                              L23: {
                                                if ((var2 ^ -1) == -12) {
                                                  break L23;
                                                } else {
                                                  var4.field_Sb = true;
                                                  if (var11 == 0) {
                                                    break L22;
                                                  } else {
                                                    break L23;
                                                  }
                                                }
                                              }
                                              var4.field_gc = true;
                                              break L22;
                                            }
                                            cua.a(var4, (byte) -97);
                                            break L21;
                                          } else {
                                            break L21;
                                          }
                                        }
                                        if (var11 == 0) {
                                          break L1;
                                        } else {
                                          break L19;
                                        }
                                      }
                                      L24: {
                                        if (13 != var2) {
                                          break L24;
                                        } else {
                                          L25: {
                                            var3 = ((uia) (Object) var1).d(127);
                                            var4_int = ((uia) (Object) var1).h(255);
                                            var5_ref_ht = (ht) (Object) jb.field_K.a(-112, (long)var3);
                                            if (null == var5_ref_ht) {
                                              break L25;
                                            } else {
                                              L26: {
                                                var6 = (pha) (Object) var5_ref_ht;
                                                var5_ref_ht.field_Sb = false;
                                                if (0 != var4_int) {
                                                  var5_ref_ht.field_zb = qsa.field_a;
                                                  var5_ref_ht.field_Ib = var4_int;
                                                  break L26;
                                                } else {
                                                  break L26;
                                                }
                                              }
                                              ((ht) (Object) var6).field_gc = false;
                                              cua.a(var5_ref_ht, (byte) 48);
                                              break L25;
                                            }
                                          }
                                          if (var11 == 0) {
                                            break L1;
                                          } else {
                                            break L24;
                                          }
                                        }
                                      }
                                      L27: {
                                        if (-15 == (var2 ^ -1)) {
                                          break L27;
                                        } else {
                                          if ((var2 ^ -1) == -17) {
                                            break L27;
                                          } else {
                                            L28: {
                                              if ((var2 ^ -1) == -16) {
                                                break L28;
                                              } else {
                                                if (-18 == (var2 ^ -1)) {
                                                  break L28;
                                                } else {
                                                  L29: {
                                                    if (var2 != 18) {
                                                      break L29;
                                                    } else {
                                                      L30: {
                                                        var3_long = ((uia) (Object) var1).b(290646880);
                                                        var5_ref = ((uia) (Object) var1).e((byte) -76);
                                                        var6 = (pha) (Object) ((uia) (Object) var1).e((byte) -76);
                                                        var7 = (String) (Object) vba.a((byte) -40, var3_long);
                                                        if (null != var7) {
                                                          break L30;
                                                        } else {
                                                          var7 = (String) (Object) new pha(var5_ref, (String) (Object) var6, var3_long);
                                                          tc.field_d.a(-1, (od) (Object) var7, var3_long);
                                                          uu.field_a.field_Mb = uu.field_a.field_Mb + 1;
                                                          break L30;
                                                        }
                                                      }
                                                      L31: {
                                                        ((pha) (Object) var7).field_Jb = ((uia) (Object) var1).d(122);
                                                        var8 = ((uia) (Object) var1).b((byte) -123);
                                                        stackOut_83_0 = (String) var7;
                                                        stackIn_85_0 = stackOut_83_0;
                                                        stackIn_84_0 = stackOut_83_0;
                                                        if ((1 & var8) == 0) {
                                                          stackOut_85_0 = (String) (Object) stackIn_85_0;
                                                          stackOut_85_1 = 0;
                                                          stackIn_86_0 = stackOut_85_0;
                                                          stackIn_86_1 = stackOut_85_1;
                                                          break L31;
                                                        } else {
                                                          stackOut_84_0 = (String) (Object) stackIn_84_0;
                                                          stackOut_84_1 = 1;
                                                          stackIn_86_0 = stackOut_84_0;
                                                          stackIn_86_1 = stackOut_84_1;
                                                          break L31;
                                                        }
                                                      }
                                                      ((pha) (Object) stackIn_86_0).field_tb = stackIn_86_1 != 0;
                                                      ((pha) (Object) var7).field_zb = var8 >> -1498095583;
                                                      ((pha) (Object) var7).field_Ab = ((uia) (Object) var1).h(255);
                                                      ((pha) (Object) var7).field_Eb = ((uia) (Object) var1).h(255);
                                                      qha.field_g.b((byte) -54, (vg) (Object) var7);
                                                      if (var11 == 0) {
                                                        break L1;
                                                      } else {
                                                        break L29;
                                                      }
                                                    }
                                                  }
                                                  L32: {
                                                    if (var2 == 19) {
                                                      break L32;
                                                    } else {
                                                      L33: {
                                                        if ((var2 ^ -1) != -21) {
                                                          break L33;
                                                        } else {
                                                          ed.a(32, uu.field_a, false, (uia) (Object) var1);
                                                          if (var11 == 0) {
                                                            break L1;
                                                          } else {
                                                            break L33;
                                                          }
                                                        }
                                                      }
                                                      L34: {
                                                        if (21 != var2) {
                                                          break L34;
                                                        } else {
                                                          L35: {
                                                            L36: {
                                                              var3 = ((uia) (Object) var1).d(124);
                                                              if ((var3 ^ -1) == -1) {
                                                                break L36;
                                                              } else {
                                                                uq.field_d = bva.b((byte) -107) + (long)var3;
                                                                if (var11 == 0) {
                                                                  break L35;
                                                                } else {
                                                                  break L36;
                                                                }
                                                              }
                                                            }
                                                            uq.field_d = 0L;
                                                            break L35;
                                                          }
                                                          if (var11 == 0) {
                                                            break L1;
                                                          } else {
                                                            break L34;
                                                          }
                                                        }
                                                      }
                                                      L37: {
                                                        if (-23 != (var2 ^ -1)) {
                                                          break L37;
                                                        } else {
                                                          qb.field_f = ((uia) (Object) var1).d(123);
                                                          bha.field_z = ((uia) (Object) var1).b((byte) 114);
                                                          if (var11 == 0) {
                                                            break L1;
                                                          } else {
                                                            break L37;
                                                          }
                                                        }
                                                      }
                                                      L38: {
                                                        if (var2 != 23) {
                                                          break L38;
                                                        } else {
                                                          rb.field_r = ((uia) (Object) var1).b(290646880);
                                                          if (var11 == 0) {
                                                            break L1;
                                                          } else {
                                                            break L38;
                                                          }
                                                        }
                                                      }
                                                      ssa.a("L1: " + kk.a(32), (byte) 118, (Throwable) null);
                                                      dea.a(60);
                                                      if (var11 == 0) {
                                                        break L1;
                                                      } else {
                                                        break L32;
                                                      }
                                                    }
                                                  }
                                                  L39: {
                                                    var3_long = ((uia) (Object) var1).b(290646880);
                                                    var5 = ((uia) (Object) var1).h(255);
                                                    var6 = vba.a((byte) -40, var3_long);
                                                    if (null != var6) {
                                                      L40: {
                                                        L41: {
                                                          if ((var5 ^ -1) == -1) {
                                                            break L41;
                                                          } else {
                                                            var6.field_xb = qsa.field_a;
                                                            var6.field_Lb = var5;
                                                            if (var11 == 0) {
                                                              break L40;
                                                            } else {
                                                              break L41;
                                                            }
                                                          }
                                                        }
                                                        var6.p(85);
                                                        break L40;
                                                      }
                                                      var6.c(-7975);
                                                      uu.field_a.field_Mb = uu.field_a.field_Mb - 1;
                                                      break L39;
                                                    } else {
                                                      break L39;
                                                    }
                                                  }
                                                  if (var11 == 0) {
                                                    break L1;
                                                  } else {
                                                    break L28;
                                                  }
                                                }
                                              }
                                            }
                                            L42: {
                                              var3_long = ((uia) (Object) var1).b(290646880);
                                              var5 = ((uia) (Object) var1).h(255);
                                              var6 = nl.a(true, var3_long);
                                              if (var6 != null) {
                                                L43: {
                                                  if ((var5 ^ -1) != -1) {
                                                    var6.field_xb = qsa.field_a;
                                                    var6.field_Lb = var5;
                                                    break L43;
                                                  } else {
                                                    break L43;
                                                  }
                                                }
                                                L44: {
                                                  L45: {
                                                    if (15 == var2) {
                                                      break L45;
                                                    } else {
                                                      if (!var6.field_Fb) {
                                                        break L44;
                                                      } else {
                                                        so.field_K = so.field_K - 1;
                                                        var6.field_Fb = false;
                                                        if (var11 == 0) {
                                                          break L44;
                                                        } else {
                                                          break L45;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  var6.field_Hb = false;
                                                  break L44;
                                                }
                                                ql.a(-42, var6);
                                                break L42;
                                              } else {
                                                break L42;
                                              }
                                            }
                                            if (var11 == 0) {
                                              break L1;
                                            } else {
                                              break L27;
                                            }
                                          }
                                        }
                                      }
                                      L46: {
                                        var3_long = ((uia) (Object) var1).b(290646880);
                                        var5_ref = (String) (Object) nl.a(true, var3_long);
                                        if (var5_ref != null) {
                                          L47: {
                                            L48: {
                                              if (-15 == (var2 ^ -1)) {
                                                break L48;
                                              } else {
                                                if (!((pha) (Object) var5_ref).field_Fb) {
                                                  so.field_K = so.field_K + 1;
                                                  ((pha) (Object) var5_ref).field_Fb = true;
                                                  if (var11 == 0) {
                                                    break L47;
                                                  } else {
                                                    break L48;
                                                  }
                                                } else {
                                                  break L47;
                                                }
                                              }
                                            }
                                            ((pha) (Object) var5_ref).field_Hb = true;
                                            break L47;
                                          }
                                          ql.a(112, (pha) (Object) var5_ref);
                                          break L46;
                                        } else {
                                          break L46;
                                        }
                                      }
                                      if (var11 == 0) {
                                        break L1;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                  var3_ref_ht = (ht) (Object) asa.field_j.f(-80);
                                  L49: while (true) {
                                    L50: {
                                      if (null == var3_ref_ht) {
                                        break L50;
                                      } else {
                                        var3_ref_ht.p(122);
                                        var3_ref_ht.c(-7975);
                                        var3_ref_ht = (ht) (Object) asa.field_j.e(127);
                                        if (var11 != 0) {
                                          break L1;
                                        } else {
                                          if (var11 == 0) {
                                            continue L49;
                                          } else {
                                            break L50;
                                          }
                                        }
                                      }
                                    }
                                    if (var11 == 0) {
                                      break L1;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                              }
                              L51: {
                                var3 = ((uia) (Object) var1).d(125);
                                var4 = (ht) (Object) jb.field_K.a(-126, (long)var3);
                                if (var4 != null) {
                                  break L51;
                                } else {
                                  var4_ref = new ht(fk.field_b);
                                  jb.field_K.a(-1, (od) (Object) var4_ref, (long)var3);
                                  break L51;
                                }
                              }
                              ed.a(32, var4_ref, true, (uia) (Object) var1);
                              cua.a(var4_ref, (byte) 80);
                              if (var11 == 0) {
                                break L1;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L52: {
                            var3_long = ((uia) (Object) var1).b(290646880);
                            var5 = ((uia) (Object) var1).h(255);
                            var6 = nl.a(true, var3_long);
                            if (var6 != null) {
                              L53: {
                                if (var6.field_Fb) {
                                  so.field_K = so.field_K - 1;
                                  var6.field_Fb = false;
                                  break L53;
                                } else {
                                  break L53;
                                }
                              }
                              L54: {
                                L55: {
                                  if (0 == var5) {
                                    break L55;
                                  } else {
                                    var6.field_xb = qsa.field_a;
                                    var6.field_Lb = var5;
                                    if (var11 == 0) {
                                      break L54;
                                    } else {
                                      break L55;
                                    }
                                  }
                                }
                                var6.p(63);
                                break L54;
                              }
                              var6.c(-7975);
                              break L52;
                            } else {
                              break L52;
                            }
                          }
                          if (var11 == 0) {
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
              }
              var3_ref_pha = (pha) (Object) qha.field_g.f(-80);
              L56: while (true) {
                L57: {
                  L58: {
                    if (null == var3_ref_pha) {
                      break L58;
                    } else {
                      var3_ref_pha.p(63);
                      var3_ref_pha.c(-7975);
                      var3_ref_pha = (pha) (Object) qha.field_g.e(117);
                      if (var11 != 0) {
                        break L57;
                      } else {
                        if (var11 == 0) {
                          continue L56;
                        } else {
                          break L58;
                        }
                      }
                    }
                  }
                  var3_ref_pha = (pha) (Object) fua.field_a.b(-119);
                  break L57;
                }
                L59: while (true) {
                  L60: {
                    L61: {
                      if (null == var3_ref_pha) {
                        break L61;
                      } else {
                        stackOut_168_0 = var3_ref_pha.field_Hb;
                        stackIn_181_0 = stackOut_168_0 ? 1 : 0;
                        stackIn_169_0 = stackOut_168_0;
                        if (var11 != 0) {
                          break L60;
                        } else {
                          stackOut_169_0 = stackIn_169_0;
                          stackIn_170_0 = stackOut_169_0;
                          L62: {
                            L63: {
                              if (stackIn_170_0) {
                                break L63;
                              } else {
                                if (var3_ref_pha.field_Fb) {
                                  break L63;
                                } else {
                                  break L62;
                                }
                              }
                            }
                            L64: {
                              var3_ref_pha.field_Hb = false;
                              if (var3_ref_pha.field_Fb) {
                                so.field_K = so.field_K - 1;
                                var3_ref_pha.field_Fb = false;
                                break L64;
                              } else {
                                break L64;
                              }
                            }
                            ql.a(114, var3_ref_pha);
                            break L62;
                          }
                          var3_ref_pha = (pha) (Object) fua.field_a.a((byte) -112);
                          if (var11 == 0) {
                            continue L59;
                          } else {
                            break L61;
                          }
                        }
                      }
                    }
                    stackOut_180_0 = var2;
                    stackIn_181_0 = stackOut_180_0;
                    break L60;
                  }
                  L65: {
                    if (stackIn_181_0 != 1) {
                      break L65;
                    } else {
                      if (uu.field_a != null) {
                        wra.field_b = uu.field_a.field_tb;
                        break L65;
                      } else {
                        break L65;
                      }
                    }
                  }
                  L66: {
                    if (-5 != (var2 ^ -1)) {
                      uu.field_a = null;
                      break L66;
                    } else {
                      var3 = ((uia) (Object) var1).d(125);
                      uu.field_a = new ht(fk.field_b);
                      uu.field_a.a(false, (long)var3);
                      ed.a(32, uu.field_a, false, (uia) (Object) var1);
                      uq.field_d = 0L;
                      break L66;
                    }
                  }
                  L67: {
                    L68: {
                      L69: {
                        if (var2 == 2) {
                          break L69;
                        } else {
                          if (var2 != 3) {
                            break L68;
                          } else {
                            break L69;
                          }
                        }
                      }
                      if (ifa.field_n == null) {
                        ifa.field_n = new ht(fk.field_b);
                        if (var11 == 0) {
                          break L67;
                        } else {
                          break L68;
                        }
                      } else {
                        break L67;
                      }
                    }
                    ifa.field_n = null;
                    break L67;
                  }
                  L70: {
                    if ((var2 ^ -1) == -4) {
                      break L70;
                    } else {
                      qa.field_o = false;
                      if (var11 == 0) {
                        break L1;
                      } else {
                        break L70;
                      }
                    }
                  }
                  qa.field_o = true;
                  var3 = 0;
                  L71: while (true) {
                    L72: {
                      L73: {
                        if (vk.field_b.length <= var3) {
                          break L73;
                        } else {
                          vk.field_b[var3] = ((uia) (Object) var1).c((byte) 48);
                          var3++;
                          if (var11 != 0) {
                            break L72;
                          } else {
                            if (var11 == 0) {
                              continue L71;
                            } else {
                              break L73;
                            }
                          }
                        }
                      }
                      aja.field_H = ((uia) (Object) var1).h(255);
                      mua.field_b = ((uia) (Object) var1).h(255);
                      break L72;
                    }
                    var3 = 0;
                    L74: while (true) {
                      if ((var3 ^ -1) <= (tqa.field_e.length ^ -1)) {
                        break L1;
                      } else {
                        tqa.field_e[var3] = ((uia) (Object) var1).c((byte) 108);
                        var3++;
                        if (var11 != 0) {
                          break L0;
                        } else {
                          if (var11 == 0) {
                            continue L74;
                          } else {
                            break L1;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            break L0;
          }
          return;
        } else {
          return;
        }
    }

    final static boolean a(String param0, boolean param1, int param2, String param3, String param4, mr param5, boolean param6) {
        rua var7 = null;
        RuntimeException var7_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int stackOut_1_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (fta.field_c == kl.field_a) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = 0;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return stackIn_2_0 != 0;
                }
                case 3: {
                    try {
                        if (param1) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        field_a = null;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var7 = new rua(ej.field_a, param5);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ej.field_a.c((ae) (Object) var7, 88);
                        if (!rg.f(7)) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var7.h(param1);
                        if (!TombRacer.field_G) {
                            statePc = 15;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        kl.field_a = gsa.field_y;
                        ub.field_i = param0;
                        al.field_j = param6;
                        wua.field_n = param2;
                        osa.field_p = param4;
                        ki.field_n = null;
                        faa.field_g = param3;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = 1;
                        stackIn_16_0 = stackOut_15_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return stackIn_16_0 != 0;
                }
                case 17: {
                    var7_ref = (RuntimeException) (Object) caughtException;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    try {
                        stackOut_18_0 = (RuntimeException) var7_ref;
                        stackOut_18_1 = new StringBuilder().append("qt.C(");
                        stackIn_21_0 = stackOut_18_0;
                        stackIn_21_1 = stackOut_18_1;
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        if (param0 == null) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                        stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                        stackOut_19_2 = "{...}";
                        stackIn_22_0 = stackOut_19_0;
                        stackIn_22_1 = stackOut_19_1;
                        stackIn_22_2 = stackOut_19_2;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 21: {
                    stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                    stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                    stackOut_21_2 = "null";
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    stackIn_22_2 = stackOut_21_2;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    try {
                        stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
                        stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44).append(param1).append(44).append(param2).append(44);
                        stackIn_25_0 = stackOut_22_0;
                        stackIn_25_1 = stackOut_22_1;
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        if (param3 == null) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
                        stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
                        stackOut_23_2 = "{...}";
                        stackIn_26_0 = stackOut_23_0;
                        stackIn_26_1 = stackOut_23_1;
                        stackIn_26_2 = stackOut_23_2;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 24: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 25: {
                    stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
                    stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
                    stackOut_25_2 = "null";
                    stackIn_26_0 = stackOut_25_0;
                    stackIn_26_1 = stackOut_25_1;
                    stackIn_26_2 = stackOut_25_2;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    try {
                        stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
                        stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(44);
                        stackIn_29_0 = stackOut_26_0;
                        stackIn_29_1 = stackOut_26_1;
                        stackIn_27_0 = stackOut_26_0;
                        stackIn_27_1 = stackOut_26_1;
                        if (param4 == null) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
                        stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
                        stackOut_27_2 = "{...}";
                        stackIn_30_0 = stackOut_27_0;
                        stackIn_30_1 = stackOut_27_1;
                        stackIn_30_2 = stackOut_27_2;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 28: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 29: {
                    stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
                    stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
                    stackOut_29_2 = "null";
                    stackIn_30_0 = stackOut_29_0;
                    stackIn_30_1 = stackOut_29_1;
                    stackIn_30_2 = stackOut_29_2;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    try {
                        stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
                        stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(44);
                        stackIn_33_0 = stackOut_30_0;
                        stackIn_33_1 = stackOut_30_1;
                        stackIn_31_0 = stackOut_30_0;
                        stackIn_31_1 = stackOut_30_1;
                        if (param5 == null) {
                            statePc = 33;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
                        stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
                        stackOut_31_2 = "{...}";
                        stackIn_34_0 = stackOut_31_0;
                        stackIn_34_1 = stackOut_31_1;
                        stackIn_34_2 = stackOut_31_2;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 32: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 33: {
                    stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
                    stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
                    stackOut_33_2 = "null";
                    stackIn_34_0 = stackOut_33_0;
                    stackIn_34_1 = stackOut_33_1;
                    stackIn_34_2 = stackOut_33_2;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    throw tba.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 44 + param6 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private qt() throws Throwable {
        RuntimeException var1 = null;
        int statePc = 1;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 1: {
                    try {
                        throw new Error();
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 2: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw tba.a((Throwable) (Object) var1, "qt.<init>()");
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
    }
}
