/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cja {
    private vna field_a;

    final void a(byte param0) {
        no var2 = (no) (Object) ((cja) this).field_a.f(-80);
        if (param0 >= -76) {
            Object var3 = null;
            ((cja) this).a((byte) -64, (int[]) null);
        }
        if (var2 == null) {
            return;
        }
        var2.b((byte) -38);
    }

    final static void a(int param0, int param1, ht param2, int param3, int param4, int param5, int param6, boolean param7) {
        int var8_int = 0;
        tv[] var8 = null;
        int var9 = 0;
        int[] var10_ref_int__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        tv var13 = null;
        int var14 = 0;
        int var15 = 0;
        tv[] var16 = null;
        int[] var17 = null;
        tv[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        tv[][] stackIn_36_0 = null;
        tv[][] stackIn_37_0 = null;
        tv[][] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_57_0 = 0;
        int stackIn_72_0 = 0;
        tv[][] stackOut_35_0 = null;
        tv[][] stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        tv[][] stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_70_0 = 0;
        L0: {
          var15 = TombRacer.field_G ? 1 : 0;
          if (param1 > param5) {
            L1: {
              stackOut_35_0 = bf.field_b;
              stackIn_37_0 = stackOut_35_0;
              stackIn_36_0 = stackOut_35_0;
              if (0 == (param5 ^ -1)) {
                stackOut_37_0 = (tv[][]) (Object) stackIn_37_0;
                stackOut_37_1 = 1;
                stackIn_38_0 = stackOut_37_0;
                stackIn_38_1 = stackOut_37_1;
                break L1;
              } else {
                stackOut_36_0 = (tv[][]) (Object) stackIn_36_0;
                stackOut_36_1 = 4 - -param5;
                stackIn_38_0 = stackOut_36_0;
                stackIn_38_1 = stackOut_36_1;
                break L1;
              }
            }
            L2: {
              var16 = stackIn_38_0[stackIn_38_1];
              var18 = var16;
              var8 = var18;
              var9 = 1;
              if (!param7) {
                break L2;
              } else {
                if ((param5 ^ -1) == 0) {
                  var10 = 0;
                  L3: while (true) {
                    if (sg.field_u.length <= var10) {
                      break L2;
                    } else {
                      if (-1 != (vk.field_b[var10 / 8] & 1 << (7 & var10) ^ -1)) {
                        var9 = 0;
                        break L2;
                      } else {
                        var10++;
                        continue L3;
                      }
                    }
                  }
                } else {
                  var10 = 0;
                  L4: while (true) {
                    L5: {
                      if (var10 >= -1 + var16.length) {
                        break L5;
                      } else {
                        if (0 != (tqa.field_e[(var10 + param3) / 8] & 1 << (param3 - -var10 & 7))) {
                          var9 = 0;
                          break L5;
                        } else {
                          var10++;
                          continue L4;
                        }
                      }
                    }
                    param3 = param3 + (um.field_m[param5] & 255);
                    break L2;
                  }
                }
              }
            }
            var10 = 0;
            var11 = 0;
            L6: while (true) {
              L7: {
                if (param5 != 0) {
                  var18 = var8;
                  stackOut_56_0 = var18.length - 1;
                  stackIn_57_0 = stackOut_56_0;
                  break L7;
                } else {
                  stackOut_55_0 = sg.field_u.length;
                  stackIn_57_0 = stackOut_55_0;
                  break L7;
                }
              }
              if (stackIn_57_0 <= var11) {
                if (var10 == 0) {
                  var11 = 0;
                  L8: while (true) {
                    if (var11 >= -1 + var18.length) {
                      break L0;
                    } else {
                      L9: {
                        if (param5 != -1) {
                          tba.field_m[param5] = (byte)var11;
                          break L9;
                        } else {
                          param6 = var11;
                          break L9;
                        }
                      }
                      cja.a(24, param1, param2, param3, param4, param5 + 1, param6, param7);
                      if (rh.field_s) {
                        return;
                      } else {
                        var11++;
                        continue L8;
                      }
                    }
                  }
                } else {
                  break L0;
                }
              } else {
                L10: {
                  if (0 == param5) {
                    param6 = var11;
                    break L10;
                  } else {
                    tba.field_m[param5] = (byte)var11;
                    break L10;
                  }
                }
                L11: {
                  L12: {
                    if (-1 != param5) {
                      break L12;
                    } else {
                      if (1 == sg.field_u.length) {
                        var12 = 1;
                        break L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                  var13 = var8[var11 + 1];
                  if (param7) {
                    if (!var13.field_cb) {
                      if (var9 != 0) {
                        if (var13.field_X) {
                          var12 = 1;
                          break L11;
                        } else {
                          var12 = 0;
                          break L11;
                        }
                      } else {
                        var12 = 0;
                        break L11;
                      }
                    } else {
                      var12 = 1;
                      break L11;
                    }
                  } else {
                    if (-1 == param5) {
                      L13: {
                        if (sg.field_u[var11] != uu.field_a.field_Jb) {
                          stackOut_71_0 = 0;
                          stackIn_72_0 = stackOut_71_0;
                          break L13;
                        } else {
                          stackOut_70_0 = 1;
                          stackIn_72_0 = stackOut_70_0;
                          break L13;
                        }
                      }
                      var12 = stackIn_72_0;
                      break L11;
                    } else {
                      if (var11 != (255 & uu.field_a.field_ac[param5])) {
                        var12 = 0;
                        break L11;
                      } else {
                        var12 = 1;
                        break L11;
                      }
                    }
                  }
                }
                L14: {
                  if (var12 == 0) {
                    break L14;
                  } else {
                    cja.a(127, param1, param2, param3, param4, 1 + param5, param6, param7);
                    var10 = 1;
                    break L14;
                  }
                }
                if (rh.field_s) {
                  return;
                } else {
                  var11++;
                  continue L6;
                }
              }
            }
          } else {
            var8_int = 1;
            var9 = 0;
            L15: while (true) {
              if (var9 >= ce.field_A.length) {
                if (var8_int == 0) {
                  break L0;
                } else {
                  rh.field_s = true;
                  break L0;
                }
              } else {
                var21 = ce.field_A[var9];
                var20 = var21;
                var19 = var20;
                var17 = var19;
                var10_ref_int__ = var17;
                var11 = 0;
                var12 = 0;
                L16: while (true) {
                  if (var12 >= var21.length) {
                    L17: {
                      if (var11 != 0) {
                        break L17;
                      } else {
                        if (param5 == fk.field_b) {
                          break L17;
                        } else {
                          var9++;
                          continue L15;
                        }
                      }
                    }
                    var8_int = 0;
                    var12 = 0;
                    L18: while (true) {
                      if (var21.length > var12) {
                        var13_int = var21[var12];
                        if ((var13_int ^ -1) == 0) {
                          mm.field_g = true;
                          var12 += 2;
                          continue L18;
                        } else {
                          if (var13_int < param5) {
                            sda.field_f[var13_int] = true;
                            var12 += 2;
                            continue L18;
                          } else {
                            var12 += 2;
                            continue L18;
                          }
                        }
                      } else {
                        var9++;
                        continue L15;
                      }
                    }
                  } else {
                    var13_int = var21[var12];
                    var14 = var10_ref_int__[var12 + 1];
                    if (0 == (var13_int ^ -1)) {
                      if (sg.field_u[param6] == var14) {
                        var12 += 2;
                        continue L16;
                      } else {
                        var9++;
                        continue L15;
                      }
                    } else {
                      L19: {
                        if (var13_int != param5) {
                          break L19;
                        } else {
                          if (param4 == var14) {
                            var11 = 1;
                            var12 += 2;
                            continue L16;
                          } else {
                            break L19;
                          }
                        }
                      }
                      if (var13_int < param5) {
                        if (var14 != (tba.field_m[var13_int] & 255)) {
                          var12 = var12;
                          var9++;
                          continue L15;
                        } else {
                          var12 += 2;
                          continue L16;
                        }
                      } else {
                        var9++;
                        continue L15;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        if (param0 >= 1) {
          return;
        } else {
          return;
        }
    }

    final static String a(int param0) {
        if (param0 != 0) {
            String discarded$0 = cja.a(117);
        }
        if (!(gsa.field_y != kl.field_a)) {
            return osa.field_p;
        }
        return rsa.field_u;
    }

    final void a(byte param0, int[] param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        if (param0 <= 5) {
            ((cja) this).field_a = null;
        }
        int[] var7 = param1;
        int[] var3 = var7;
        for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            ((cja) this).field_a.b((byte) -104, (vg) (Object) new no(rba.field_a, var5));
        }
    }

    final void b(byte param0) {
        qh var2 = null;
        no var3 = null;
        L0: {
          if (vpa.a(param0 ^ -48)) {
            break L0;
          } else {
            if (dma.field_l.a(param0 + -60)) {
              var2 = rba.field_a;
              if (var2 != null) {
                if (param0 == -66) {
                  var3 = (no) (Object) ((cja) this).field_a.f(param0 + -14);
                  if (var3 == null) {
                    return;
                  } else {
                    var3.a((byte) -109);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              break L0;
            }
          }
        }
    }

    cja() {
        ((cja) this).field_a = new vna();
    }

    static {
    }
}
