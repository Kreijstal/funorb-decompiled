/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qqb implements ntb {
    private wna[] field_a;
    static int field_b;

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        wna var5 = null;
        int var6 = 0;
        L0: {
          var6 = VoidHunters.field_G;
          if (null == ((qqb) this).field_a) {
            break L0;
          } else {
            if (((qqb) this).field_a.length == 0) {
              break L0;
            } else {
              L1: {
                var3 = 0;
                var4 = 0;
                if (param0 <= -49) {
                  break L1;
                } else {
                  qqb.a(-126);
                  break L1;
                }
              }
              L2: while (true) {
                if (((qqb) this).field_a.length <= var4) {
                  return var3;
                } else {
                  var5 = ((qqb) this).field_a[var4];
                  if (var5.field_d == param1) {
                    var3++;
                    var4++;
                    continue L2;
                  } else {
                    var4++;
                    continue L2;
                  }
                }
              }
            }
          }
        }
        return 0;
    }

    public final void b(byte param0, tv param1) {
        qqb var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              var3 = (qqb) (Object) param1;
              var3.field_a = (wna[]) (Object) sqb.a((tv[]) (Object) var3.field_a, (tv[]) (Object) var3.field_a, 1, lm.field_b, false);
              if (param0 >= 54) {
                break L1;
              } else {
                var4 = null;
                ((qqb) this).a((tv) null, 79);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var3_ref;
            stackOut_3_1 = new StringBuilder().append("qqb.D(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public final void b(faa param0, int param1) {
        faa var3 = null;
        RuntimeException var3_ref = null;
        wna[] var4 = null;
        int var5 = 0;
        wna[] var6 = null;
        int var7 = 0;
        wna var8 = null;
        int var9 = 0;
        int stackIn_6_0 = 0;
        faa stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        faa stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        faa stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        faa stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        faa stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        faa stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            var3 = param0;
            var4 = ((qqb) this).field_a;
            if (param1 < -109) {
              L1: {
                if (var4 == null) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = var4.length;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              L2: {
                var5 = stackIn_6_0;
                var3.a(-632, var5, 8);
                if (var5 == 0) {
                  break L2;
                } else {
                  var6 = var4;
                  var7 = 0;
                  L3: while (true) {
                    if (var6.length <= var7) {
                      break L2;
                    } else {
                      L4: {
                        var8 = var6[var7];
                        stackOut_9_0 = (faa) var3;
                        stackOut_9_1 = 86;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        if (var8 == null) {
                          stackOut_11_0 = (faa) (Object) stackIn_11_0;
                          stackOut_11_1 = stackIn_11_1;
                          stackOut_11_2 = 0;
                          stackIn_12_0 = stackOut_11_0;
                          stackIn_12_1 = stackOut_11_1;
                          stackIn_12_2 = stackOut_11_2;
                          break L4;
                        } else {
                          stackOut_10_0 = (faa) (Object) stackIn_10_0;
                          stackOut_10_1 = stackIn_10_1;
                          stackOut_10_2 = 1;
                          stackIn_12_0 = stackOut_10_0;
                          stackIn_12_1 = stackOut_10_1;
                          stackIn_12_2 = stackOut_10_2;
                          break L4;
                        }
                      }
                      L5: {
                        if (vq.a(stackIn_12_0, stackIn_12_1, stackIn_12_2 != 0)) {
                          stb.a(2, 1, var3, (tv) (Object) var8);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var7++;
                      continue L3;
                    }
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3_ref;
            stackOut_17_1 = new StringBuilder().append("qqb.B(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param1 + 41);
        }
    }

    public final boolean a(byte param0, tv param1) {
        qqb var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var4 = -100 / ((22 - param0) / 59);
            var3 = (qqb) (Object) param1;
            stackOut_0_0 = dn.a((tv[]) (Object) var3.field_a, false, 1, (tv[]) (Object) var3.field_a, -39);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("qqb.C(").append(param0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
        return stackIn_1_0;
    }

    public final void a(faa param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((qqb) this).field_a = (wna[]) (Object) kcb.a(8, lm.field_b, param0, 1, -62, (tv[]) (Object) ((qqb) this).field_a);
              if (!param1) {
                break L1;
              } else {
                field_b = 39;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("qqb.H(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    final int a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        wna var5 = null;
        int var6 = 0;
        Object var7 = null;
        L0: {
          var6 = VoidHunters.field_G;
          if (((qqb) this).field_a == null) {
            break L0;
          } else {
            if (((qqb) this).field_a.length == 0) {
              break L0;
            } else {
              var3 = 0;
              var4 = 0;
              L1: while (true) {
                if (((qqb) this).field_a.length <= var4) {
                  L2: {
                    if (param1 == -88) {
                      break L2;
                    } else {
                      var7 = null;
                      ((qqb) this).a((faa) null, false);
                      break L2;
                    }
                  }
                  return var3;
                } else {
                  var5 = ((qqb) this).field_a[var4];
                  if (param0 == var5.field_d) {
                    var3 = var3 + var5.field_b;
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            }
          }
        }
        return 0;
    }

    final void a(int param0, wna param1) {
        try {
            if (param0 < 87) {
                field_b = 57;
            }
            ((qqb) this).field_a = (wna[]) (Object) ija.a((Object) (Object) param1, (Object[]) (Object) ((qqb) this).field_a, 0, lm.field_b);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "qqb.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(int param0) {
        hla.field_a = null;
        if (param0 <= 36) {
            return;
        }
        iib.field_e = null;
        rlb.field_d = null;
        nhb.field_o = null;
        sh.field_a = null;
        so.field_f = null;
    }

    final int a(boolean param0) {
        int var2 = 0;
        int var3_int = 0;
        int[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        wna var6_ref_wna = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        wna var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        L0: {
          var10 = VoidHunters.field_G;
          js.field_o = 0;
          if (null == ((qqb) this).field_a) {
            break L0;
          } else {
            if (0 == ((qqb) this).field_a.length) {
              break L0;
            } else {
              L1: {
                var2 = unb.field_p + -1;
                var3_int = 0;
                if (param0) {
                  break L1;
                } else {
                  field_b = -113;
                  break L1;
                }
              }
              L2: while (true) {
                if (~((qqb) this).field_a.length >= ~var3_int) {
                  var17 = new int[1 + var2];
                  var15 = var17;
                  var14 = var15;
                  var13 = var14;
                  var3 = var13;
                  var18 = new int[var17.length];
                  var16 = var18;
                  var11 = var16;
                  var5 = 0;
                  L3: while (true) {
                    if (~((qqb) this).field_a.length >= ~var5) {
                      var5 = -1;
                      var6 = -2147483648;
                      js.field_o = 1;
                      var7 = 2147483647;
                      var8 = 0;
                      L4: while (true) {
                        if (~var8 <= ~var17.length) {
                          var8 = 0;
                          var9 = 0;
                          L5: while (true) {
                            L6: {
                              if (~var17.length >= ~var9) {
                                break L6;
                              } else {
                                L7: {
                                  if (var17[var9] != var6) {
                                    break L7;
                                  } else {
                                    var8++;
                                    if (var8 >= 2) {
                                      js.field_o = 2;
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                var9++;
                                continue L5;
                              }
                            }
                            L8: {
                              if (((qqb) this).field_a.length == 1) {
                                js.field_o = 0;
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            return var5;
                          }
                        } else {
                          L9: {
                            if (~var17[var8] < ~var6) {
                              var7 = var18[var8];
                              var5 = var8;
                              var6 = var17[var8];
                              break L9;
                            } else {
                              L10: {
                                if (var6 != var17[var8]) {
                                  break L10;
                                } else {
                                  if (var7 <= var18[var8]) {
                                    break L10;
                                  } else {
                                    var5 = var8;
                                    var7 = var18[var8];
                                    var6 = var17[var8];
                                    break L9;
                                  }
                                }
                              }
                              if (~var6 != ~var17[var8]) {
                                break L9;
                              } else {
                                if (~var18[var8] != ~var7) {
                                  break L9;
                                } else {
                                  var5 = -1;
                                  break L9;
                                }
                              }
                            }
                          }
                          var8++;
                          continue L4;
                        }
                      }
                    } else {
                      L11: {
                        var6_ref_wna = ((qqb) this).field_a[var5];
                        var7 = var6_ref_wna.field_d;
                        var8 = var6_ref_wna.field_b;
                        if (var7 < 0) {
                          break L11;
                        } else {
                          if (~var7 <= ~var17.length) {
                            break L11;
                          } else {
                            var3[var7] = var3[var7] + 1;
                            var11[var7] = var11[var7] + var8;
                            break L11;
                          }
                        }
                      }
                      var5++;
                      continue L3;
                    }
                  }
                } else {
                  L12: {
                    var12 = ((qqb) this).field_a[var3_int];
                    var5 = var12.field_d;
                    if (~var5 >= ~var2) {
                      break L12;
                    } else {
                      var2 = var5;
                      break L12;
                    }
                  }
                  var3_int++;
                  continue L2;
                }
              }
            }
          }
        }
        return -1;
    }

    public final void a(tv param0, int param1) {
        qqb var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -19) {
                break L1;
              } else {
                var5 = null;
                ((qqb) this).a(118, (wna) null);
                break L1;
              }
            }
            L2: {
              var3 = (qqb) (Object) param0;
              boolean discarded$2 = tja.a((ntb[]) (Object) var3.field_a, 1, (ntb[]) (Object) var3.field_a, false, 5547);
              var4 = 0;
              if (!dn.a((tv[]) (Object) var3.field_a, false, 1, (tv[]) (Object) var3.field_a, -12)) {
                break L2;
              } else {
                System.out.println("RoundResult[] results has changed. ");
                var4 = 1;
                break L2;
              }
            }
            L3: {
              if (var4 == 0) {
                break L3;
              } else {
                System.out.println("This instance of MatchResults has changed");
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3_ref;
            stackOut_7_1 = new StringBuilder().append("qqb.F(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 10;
    }
}
