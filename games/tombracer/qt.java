/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qt {
    static il field_a;

    public static void b() {
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5) {
        pd.field_p[ola.field_Eb] = param3;
        boa.field_n[ola.field_Eb] = ola.field_Eb;
        jk.field_h[ola.field_Eb] = param4;
        if (ap.field_d < param4) {
            ma.field_g = param4;
        }
        if (!(ota.field_c <= param4)) {
            kc.field_a = param4;
        }
        cu.field_o[ola.field_Eb] = param0;
        bq.field_h[ola.field_Eb] = param1;
        im.field_o[ola.field_Eb] = param2;
        int var6 = param2 + (param1 + param0);
        int var7 = var6 == 0 ? 0 : 1000 * param0 / var6;
        ic.field_c[ola.field_Eb] = var7;
        ola.field_Eb = ola.field_Eb + 1;
        if (ma.field_g < var7) {
            ma.field_g = var7;
        }
        if (var7 < kc.field_a) {
            kc.field_a = var7;
        }
        if (param5 > -9) {
            qt.a(-106);
        }
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        kh var1_ref = null;
        int var2 = 0;
        Object var3_ref = null;
        pha var3_ref_pha = null;
        long var3_long = 0L;
        int var3 = 0;
        ht var3_ref_ht = null;
        ht var4 = null;
        int var4_int = 0;
        String var5_ref_String = null;
        int var5 = 0;
        ht var5_ref_ht = null;
        pha var5_ref_pha = null;
        String var6 = null;
        pha var6_ref = null;
        ht var6_ref2 = null;
        String var7 = null;
        pha var7_ref = null;
        pha var8_ref_pha = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_12_0 = 0;
        pha stackIn_18_0 = null;
        pha stackIn_19_0 = null;
        pha stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        pha stackIn_60_0 = null;
        pha stackIn_61_0 = null;
        pha stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        RuntimeException decompiledCaughtException = null;
        pha stackOut_59_0 = null;
        pha stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        pha stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        pha stackOut_17_0 = null;
        pha stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        pha stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        var3_ref = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 <= -10) {
              L1: {
                L2: {
                  L3: {
                    var1_ref = vc.field_q;
                    var2 = ((uia) (Object) var1_ref).h(255);
                    if (var2 == 0) {
                      break L3;
                    } else {
                      if (var2 == 1) {
                        break L3;
                      } else {
                        if (2 == var2) {
                          break L3;
                        } else {
                          if (3 == var2) {
                            break L3;
                          } else {
                            if (var2 == 4) {
                              break L3;
                            } else {
                              if (5 != var2) {
                                if (var2 == 6) {
                                  var3_long = ((uia) (Object) var1_ref).b(290646880);
                                  var5 = ((uia) (Object) var1_ref).h(255);
                                  var6_ref = nl.a(true, var3_long);
                                  if (var6_ref != null) {
                                    L4: {
                                      if (var6_ref.field_Fb) {
                                        so.field_K = so.field_K - 1;
                                        var6_ref.field_Fb = false;
                                        break L4;
                                      } else {
                                        break L4;
                                      }
                                    }
                                    L5: {
                                      if (0 == var5) {
                                        var6_ref.p(63);
                                        break L5;
                                      } else {
                                        var6_ref.field_xb = qsa.field_a;
                                        var6_ref.field_Lb = var5;
                                        break L5;
                                      }
                                    }
                                    var6_ref.c(-7975);
                                    break L1;
                                  } else {
                                    break L1;
                                  }
                                } else {
                                  if (var2 != 7) {
                                    if (var2 == 8) {
                                      L6: {
                                        var3 = ((uia) (Object) var1_ref).d(125);
                                        var4 = (ht) (Object) jb.field_K.a(-126, (long)var3);
                                        if (var4 != null) {
                                          break L6;
                                        } else {
                                          var4 = new ht(fk.field_b);
                                          jb.field_K.a(-1, (od) (Object) var4, (long)var3);
                                          break L6;
                                        }
                                      }
                                      ed.a(32, var4, true, (uia) (Object) var1_ref);
                                      cua.a(var4, (byte) 80);
                                      break L1;
                                    } else {
                                      if (var2 != 9) {
                                        if (var2 == 10) {
                                          var3_ref_ht = (ht) (Object) asa.field_j.f(-80);
                                          L7: while (true) {
                                            if (var3_ref_ht == null) {
                                              break L2;
                                            } else {
                                              var3_ref_ht.p(122);
                                              var3_ref_ht.c(-7975);
                                              var3_ref_ht = (ht) (Object) asa.field_j.e(127);
                                              continue L7;
                                            }
                                          }
                                        } else {
                                          L8: {
                                            if (var2 == 11) {
                                              break L8;
                                            } else {
                                              if (var2 != 12) {
                                                if (13 != var2) {
                                                  L9: {
                                                    if (var2 == 14) {
                                                      break L9;
                                                    } else {
                                                      if (var2 == 16) {
                                                        break L9;
                                                      } else {
                                                        L10: {
                                                          if (var2 == 15) {
                                                            break L10;
                                                          } else {
                                                            if (var2 == 17) {
                                                              break L10;
                                                            } else {
                                                              if (var2 != 18) {
                                                                if (var2 == 19) {
                                                                  var3_long = ((uia) (Object) var1_ref).b(290646880);
                                                                  var5 = ((uia) (Object) var1_ref).h(255);
                                                                  var6_ref = vba.a((byte) -40, var3_long);
                                                                  if (var6_ref != null) {
                                                                    L11: {
                                                                      if (var5 == 0) {
                                                                        var6_ref.p(85);
                                                                        break L11;
                                                                      } else {
                                                                        var6_ref.field_xb = qsa.field_a;
                                                                        var6_ref.field_Lb = var5;
                                                                        break L11;
                                                                      }
                                                                    }
                                                                    var6_ref.c(-7975);
                                                                    uu.field_a.field_Mb = uu.field_a.field_Mb - 1;
                                                                    break L1;
                                                                  } else {
                                                                    break L1;
                                                                  }
                                                                } else {
                                                                  if (var2 != 20) {
                                                                    if (21 != var2) {
                                                                      if (var2 != 22) {
                                                                        if (var2 != 23) {
                                                                          ssa.a("L1: " + kk.a(32), (byte) 118, (Throwable) null);
                                                                          int discarded$1 = 60;
                                                                          dea.a();
                                                                          break L1;
                                                                        } else {
                                                                          rb.field_r = ((uia) (Object) var1_ref).b(290646880);
                                                                          break L1;
                                                                        }
                                                                      } else {
                                                                        qb.field_f = ((uia) (Object) var1_ref).d(123);
                                                                        bha.field_z = ((uia) (Object) var1_ref).b((byte) 114);
                                                                        break L1;
                                                                      }
                                                                    } else {
                                                                      var3 = ((uia) (Object) var1_ref).d(124);
                                                                      if (var3 == 0) {
                                                                        uq.field_d = 0L;
                                                                        break L1;
                                                                      } else {
                                                                        uq.field_d = bva.b((byte) -107) + (long)var3;
                                                                        break L1;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    ed.a(32, uu.field_a, false, (uia) (Object) var1_ref);
                                                                    break L1;
                                                                  }
                                                                }
                                                              } else {
                                                                L12: {
                                                                  var3_long = ((uia) (Object) var1_ref).b(290646880);
                                                                  var5_ref_String = ((uia) (Object) var1_ref).e((byte) -76);
                                                                  var6 = ((uia) (Object) var1_ref).e((byte) -76);
                                                                  var7_ref = vba.a((byte) -40, var3_long);
                                                                  if (var7_ref != null) {
                                                                    break L12;
                                                                  } else {
                                                                    var7_ref = new pha(var5_ref_String, var6, var3_long);
                                                                    tc.field_d.a(-1, (od) (Object) var7_ref, var3_long);
                                                                    uu.field_a.field_Mb = uu.field_a.field_Mb + 1;
                                                                    break L12;
                                                                  }
                                                                }
                                                                L13: {
                                                                  var7_ref.field_Jb = ((uia) (Object) var1_ref).d(122);
                                                                  var8 = ((uia) (Object) var1_ref).b((byte) -123);
                                                                  stackOut_59_0 = (pha) var7_ref;
                                                                  stackIn_61_0 = stackOut_59_0;
                                                                  stackIn_60_0 = stackOut_59_0;
                                                                  if ((1 & var8) == 0) {
                                                                    stackOut_61_0 = (pha) (Object) stackIn_61_0;
                                                                    stackOut_61_1 = 0;
                                                                    stackIn_62_0 = stackOut_61_0;
                                                                    stackIn_62_1 = stackOut_61_1;
                                                                    break L13;
                                                                  } else {
                                                                    stackOut_60_0 = (pha) (Object) stackIn_60_0;
                                                                    stackOut_60_1 = 1;
                                                                    stackIn_62_0 = stackOut_60_0;
                                                                    stackIn_62_1 = stackOut_60_1;
                                                                    break L13;
                                                                  }
                                                                }
                                                                stackIn_62_0.field_tb = stackIn_62_1 != 0;
                                                                var7_ref.field_zb = var8 >> 1;
                                                                var7_ref.field_Ab = ((uia) (Object) var1_ref).h(255);
                                                                var7_ref.field_Eb = ((uia) (Object) var1_ref).h(255);
                                                                qha.field_g.b((byte) -54, (vg) (Object) var7_ref);
                                                                break L1;
                                                              }
                                                            }
                                                          }
                                                        }
                                                        var3_long = ((uia) (Object) var1_ref).b(290646880);
                                                        var5 = ((uia) (Object) var1_ref).h(255);
                                                        var6_ref = nl.a(true, var3_long);
                                                        if (var6_ref != null) {
                                                          L14: {
                                                            if (var5 != 0) {
                                                              var6_ref.field_xb = qsa.field_a;
                                                              var6_ref.field_Lb = var5;
                                                              break L14;
                                                            } else {
                                                              break L14;
                                                            }
                                                          }
                                                          L15: {
                                                            if (15 == var2) {
                                                              var6_ref.field_Hb = false;
                                                              break L15;
                                                            } else {
                                                              if (!var6_ref.field_Fb) {
                                                                break L15;
                                                              } else {
                                                                so.field_K = so.field_K - 1;
                                                                var6_ref.field_Fb = false;
                                                                break L15;
                                                              }
                                                            }
                                                          }
                                                          ql.a(-42, var6_ref);
                                                          break L1;
                                                        } else {
                                                          break L1;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  var3_long = ((uia) (Object) var1_ref).b(290646880);
                                                  var5_ref_pha = nl.a(true, var3_long);
                                                  if (var5_ref_pha != null) {
                                                    L16: {
                                                      if (var2 == 14) {
                                                        var5_ref_pha.field_Hb = true;
                                                        break L16;
                                                      } else {
                                                        if (!var5_ref_pha.field_Fb) {
                                                          so.field_K = so.field_K + 1;
                                                          var5_ref_pha.field_Fb = true;
                                                          break L16;
                                                        } else {
                                                          break L16;
                                                        }
                                                      }
                                                    }
                                                    ql.a(112, var5_ref_pha);
                                                    break L1;
                                                  } else {
                                                    break L1;
                                                  }
                                                } else {
                                                  L17: {
                                                    var3 = ((uia) (Object) var1_ref).d(127);
                                                    var4_int = ((uia) (Object) var1_ref).h(255);
                                                    var5_ref_ht = (ht) (Object) jb.field_K.a(-112, (long)var3);
                                                    if (var5_ref_ht == null) {
                                                      break L17;
                                                    } else {
                                                      L18: {
                                                        var6_ref2 = var5_ref_ht;
                                                        var5_ref_ht.field_Sb = false;
                                                        if (0 != var4_int) {
                                                          var5_ref_ht.field_zb = qsa.field_a;
                                                          var5_ref_ht.field_Ib = var4_int;
                                                          break L18;
                                                        } else {
                                                          break L18;
                                                        }
                                                      }
                                                      var6_ref2.field_gc = false;
                                                      cua.a(var5_ref_ht, (byte) 48);
                                                      break L17;
                                                    }
                                                  }
                                                  break L1;
                                                }
                                              } else {
                                                break L8;
                                              }
                                            }
                                          }
                                          var3 = ((uia) (Object) var1_ref).d(123);
                                          var4 = (ht) (Object) jb.field_K.a(-111, (long)var3);
                                          if (var4 != null) {
                                            L19: {
                                              if (var2 == 11) {
                                                var4.field_gc = true;
                                                break L19;
                                              } else {
                                                var4.field_Sb = true;
                                                break L19;
                                              }
                                            }
                                            cua.a(var4, (byte) -97);
                                            break L1;
                                          } else {
                                            break L1;
                                          }
                                        }
                                      } else {
                                        L20: {
                                          var3 = ((uia) (Object) var1_ref).d(121);
                                          var4_int = ((uia) (Object) var1_ref).h(255);
                                          var5_ref_ht = (ht) (Object) jb.field_K.a(-107, (long)var3);
                                          if (var5_ref_ht == null) {
                                            break L20;
                                          } else {
                                            L21: {
                                              if (0 != var4_int) {
                                                var5_ref_ht.field_zb = qsa.field_a;
                                                var5_ref_ht.field_Ib = var4_int;
                                                break L21;
                                              } else {
                                                var5_ref_ht.p(52);
                                                break L21;
                                              }
                                            }
                                            var5_ref_ht.c(-7975);
                                            break L20;
                                          }
                                        }
                                        break L1;
                                      }
                                    }
                                  } else {
                                    var3_ref_pha = (pha) (Object) uma.field_b.f(-80);
                                    L22: while (true) {
                                      if (var3_ref_pha == null) {
                                        so.field_K = 0;
                                        break L1;
                                      } else {
                                        var3_ref_pha.p(70);
                                        var3_ref_pha.c(-7975);
                                        var3_ref_pha = (pha) (Object) uma.field_b.e(118);
                                        continue L22;
                                      }
                                    }
                                  }
                                }
                              } else {
                                L23: {
                                  var3_long = ((uia) (Object) var1_ref).b(290646880);
                                  var5_ref_String = ((uia) (Object) var1_ref).e((byte) -76);
                                  var6 = ((uia) (Object) var1_ref).e((byte) -76);
                                  var7 = ((uia) (Object) var1_ref).e((byte) -76);
                                  var8_ref_pha = nl.a(true, var3_long);
                                  if (var6.equals((Object) (Object) "")) {
                                    stackOut_11_0 = 0;
                                    stackIn_12_0 = stackOut_11_0;
                                    break L23;
                                  } else {
                                    stackOut_10_0 = 1;
                                    stackIn_12_0 = stackOut_10_0;
                                    break L23;
                                  }
                                }
                                L24: {
                                  var9 = stackIn_12_0;
                                  if (var8_ref_pha == null) {
                                    var8_ref_pha = new pha(var5_ref_String, var7, var3_long);
                                    fua.field_a.a(-1, (od) (Object) var8_ref_pha, var3_long);
                                    break L24;
                                  } else {
                                    if (var9 != 0) {
                                      var8_ref_pha.a(var7, 75, var5_ref_String);
                                      break L24;
                                    } else {
                                      break L24;
                                    }
                                  }
                                }
                                L25: {
                                  var8_ref_pha.field_Mb = bva.b((byte) -107) + -(long)((uia) (Object) var1_ref).e(-87);
                                  var8_ref_pha.field_Jb = ((uia) (Object) var1_ref).d(121);
                                  var10 = ((uia) (Object) var1_ref).b((byte) 100);
                                  stackOut_17_0 = (pha) var8_ref_pha;
                                  stackIn_19_0 = stackOut_17_0;
                                  stackIn_18_0 = stackOut_17_0;
                                  if ((1 & var10) == 0) {
                                    stackOut_19_0 = (pha) (Object) stackIn_19_0;
                                    stackOut_19_1 = 0;
                                    stackIn_20_0 = stackOut_19_0;
                                    stackIn_20_1 = stackOut_19_1;
                                    break L25;
                                  } else {
                                    stackOut_18_0 = (pha) (Object) stackIn_18_0;
                                    stackOut_18_1 = 1;
                                    stackIn_20_0 = stackOut_18_0;
                                    stackIn_20_1 = stackOut_18_1;
                                    break L25;
                                  }
                                }
                                stackIn_20_0.field_tb = stackIn_20_1 != 0;
                                var8_ref_pha.field_zb = var10 >> 1;
                                var8_ref_pha.field_Ab = ((uia) (Object) var1_ref).h(255);
                                var8_ref_pha.field_Eb = ((uia) (Object) var1_ref).h(255);
                                ql.a(110, var8_ref_pha);
                                break L1;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  var3_ref_pha = (pha) (Object) qha.field_g.f(-80);
                  L26: while (true) {
                    if (var3_ref_pha == null) {
                      var3_ref_pha = (pha) (Object) fua.field_a.b(-119);
                      L27: while (true) {
                        if (var3_ref_pha == null) {
                          L28: {
                            if (var2 != 1) {
                              break L28;
                            } else {
                              if (uu.field_a != null) {
                                wra.field_b = uu.field_a.field_tb;
                                break L28;
                              } else {
                                break L28;
                              }
                            }
                          }
                          L29: {
                            if (var2 != 4) {
                              uu.field_a = null;
                              break L29;
                            } else {
                              var3 = ((uia) (Object) var1_ref).d(125);
                              uu.field_a = new ht(fk.field_b);
                              uu.field_a.a(false, (long)var3);
                              ed.a(32, uu.field_a, false, (uia) (Object) var1_ref);
                              uq.field_d = 0L;
                              break L29;
                            }
                          }
                          L30: {
                            L31: {
                              if (var2 == 2) {
                                break L31;
                              } else {
                                if (var2 != 3) {
                                  ifa.field_n = null;
                                  break L30;
                                } else {
                                  break L31;
                                }
                              }
                            }
                            if (ifa.field_n == null) {
                              ifa.field_n = new ht(fk.field_b);
                              break L30;
                            } else {
                              break L30;
                            }
                          }
                          if (var2 == 3) {
                            qa.field_o = true;
                            var3 = 0;
                            L32: while (true) {
                              if (vk.field_b.length <= var3) {
                                aja.field_H = ((uia) (Object) var1_ref).h(255);
                                mua.field_b = ((uia) (Object) var1_ref).h(255);
                                var3 = 0;
                                L33: while (true) {
                                  if (~var3 <= ~tqa.field_e.length) {
                                    break L2;
                                  } else {
                                    tqa.field_e[var3] = ((uia) (Object) var1_ref).c((byte) 108);
                                    var3++;
                                    continue L33;
                                  }
                                }
                              } else {
                                vk.field_b[var3] = ((uia) (Object) var1_ref).c((byte) 48);
                                var3++;
                                continue L32;
                              }
                            }
                          } else {
                            qa.field_o = false;
                            break L1;
                          }
                        } else {
                          L34: {
                            L35: {
                              if (var3_ref_pha.field_Hb) {
                                break L35;
                              } else {
                                if (var3_ref_pha.field_Fb) {
                                  break L35;
                                } else {
                                  break L34;
                                }
                              }
                            }
                            L36: {
                              var3_ref_pha.field_Hb = false;
                              if (var3_ref_pha.field_Fb) {
                                so.field_K = so.field_K - 1;
                                var3_ref_pha.field_Fb = false;
                                break L36;
                              } else {
                                break L36;
                              }
                            }
                            ql.a(114, var3_ref_pha);
                            break L34;
                          }
                          var3_ref_pha = (pha) (Object) fua.field_a.a((byte) -112);
                          continue L27;
                        }
                      }
                    } else {
                      var3_ref_pha.p(63);
                      var3_ref_pha.c(-7975);
                      var3_ref_pha = (pha) (Object) qha.field_g.e(117);
                      continue L26;
                    }
                  }
                }
                break L1;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "qt.D(" + param0 + 41);
        }
    }

    final static boolean a(String param0, boolean param1, int param2, String param3, String param4, mr param5, boolean param6) {
        rua var7 = null;
        RuntimeException var7_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            if (fta.field_c == kl.field_a) {
              var7 = new rua(ej.field_a, param5);
              ej.field_a.c((ae) (Object) var7, 88);
              int discarded$16 = 7;
              if (!rg.f()) {
                L1: {
                  kl.field_a = gsa.field_y;
                  ub.field_i = param0;
                  if (!param6) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L1;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L1;
                  }
                }
                al.field_j = stackIn_8_0 != 0;
                wua.field_n = param2;
                osa.field_p = param4;
                ki.field_n = null;
                faa.field_g = param3;
                return true;
              } else {
                var7.h(true);
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var7_ref;
            stackOut_11_1 = new StringBuilder().append("qt.C(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          L3: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44).append(1).append(44).append(param2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          L4: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param4 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          L5: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param5 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param6 + 41);
        }
        return stackIn_10_0 != 0;
    }

    private qt() throws Throwable {
        throw new Error();
    }

    static {
    }
}
