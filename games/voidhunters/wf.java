/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wf {
    static int field_e;
    private int field_c;
    static int field_d;
    static phb field_a;
    private ae field_b;

    private final void b(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = VoidHunters.field_G;
          var3 = 20;
          if (0 != ((wf) this).field_c) {
            L1: {
              if (((wf) this).field_c == 1) {
                break L1;
              } else {
                if (2 == ((wf) this).field_c) {
                  break L1;
                } else {
                  if (((wf) this).field_c == 3) {
                    break L1;
                  } else {
                    if (((wf) this).field_c == 4) {
                      break L1;
                    } else {
                      if (((wf) this).field_c != 9) {
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
            }
            var3 = 200;
            break L0;
          } else {
            var3 += 60;
            break L0;
          }
        }
        L2: {
          var4 = 36;
          var5 = (-dma.field_g + ip.field_p.width) / 2;
          var3 = var3 + var5;
          var6 = (ip.field_p.height + -dma.field_j) / 2;
          var4 = var4 + var6;
          var7 = pob.field_b;
          if (param1 == -61) {
            break L2;
          } else {
            ((wf) this).field_b = null;
            break L2;
          }
        }
        L3: {
          var8 = 0;
          if (var7 < 16) {
            if (var7 > 0) {
              var8 = 4 * mg.f(param1 ^ -196);
              break L3;
            } else {
              break L3;
            }
          } else {
            var8 = -(mg.f(255) * 4) + 1020;
            break L3;
          }
        }
        ga.a(param0, false, var3 - -var8, var4, -(2 * var4) + ip.field_p.height, ip.field_p.width - var3 * 2, 0);
    }

    private final String a(String param0, byte param1, String param2, int param3) {
        RuntimeException var5 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
              if (param1 > 34) {
                break L1;
              } else {
                ((wf) this).a(true, 114, 76);
                break L1;
              }
            }
            stackOut_2_0 = jd.a(param2, param0, 0, "<col=ffaa00>" + bpb.field_q[param3] + "</col>");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("wf.M(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param3 + 41);
        }
        return stackIn_3_0;
    }

    final void b(byte param0) {
        if (param0 != 49) {
            field_e = 99;
        }
    }

    public static void a(int param0) {
        field_a = null;
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          var4 = VoidHunters.field_G;
          if (param0 == 132) {
            break L0;
          } else {
            ((wf) this).field_c = 86;
            break L0;
          }
        }
        L1: {
          if (this.a(0, 115)) {
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        L2: {
          var2 = stackIn_5_0;
          if (!this.a(2, 120)) {
            stackOut_7_0 = 1;
            stackIn_8_0 = stackOut_7_0;
            break L2;
          } else {
            stackOut_6_0 = 2;
            stackIn_8_0 = stackOut_6_0;
            break L2;
          }
        }
        L3: {
          var3 = stackIn_8_0;
          if (!((wf) this).field_b.b((byte) 123)) {
            L4: {
              if (pma.field_o != 96) {
                break L4;
              } else {
                if (((wf) this).field_b.field_j > var2) {
                  ((wf) this).field_b.a((byte) -17, -1 + ((wf) this).field_b.field_j);
                  break L4;
                } else {
                  ((wf) this).field_b.a((byte) -17, var3);
                  break L4;
                }
              }
            }
            if (pma.field_o == 97) {
              L5: {
                if (((wf) this).field_b.field_j < 0) {
                  break L5;
                } else {
                  if (var3 <= ((wf) this).field_b.field_j) {
                    break L5;
                  } else {
                    ((wf) this).field_b.a((byte) -17, 1 + ((wf) this).field_b.field_j);
                    ((wf) this).field_b.c(-19255);
                    break L3;
                  }
                }
              }
              ((wf) this).field_b.a((byte) -17, var2);
              ((wf) this).field_b.c(-19255);
              break L3;
            } else {
              ((wf) this).field_b.c(-19255);
              break L3;
            }
          } else {
            ((wf) this).field_b.a((byte) -17, var2);
            break L3;
          }
        }
    }

    private final int c(int param0, int param1) {
        int var4 = 0;
        int var3 = (ip.field_p.height - dma.field_j) / 2;
        if (param1 != 17915) {
            ((wf) this).a(false, -15, 108);
        }
        if (0 != ((wf) this).field_c) {
        } else {
            if (param0 >= 2) {
                param0 -= 2;
            } else {
                var4 = ct.a(param1 ^ 3900, 128);
                return var3 + vba.field_s[((wf) this).field_c] + (5 + var4) * param0;
            }
        }
        if (5 == ((wf) this).field_c) {
            return vba.field_s[((wf) this).field_c] + var3;
        }
        return vba.field_s[((wf) this).field_c] + var3 - -(param0 * vba.field_o[((wf) this).field_c]);
    }

    private final void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        String var9_ref_String = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        float var15_float = 0.0f;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        String var28 = null;
        String var29 = null;
        int stackIn_63_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_90_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_82_0 = 0;
        L0: {
          var27 = VoidHunters.field_G;
          var4 = pob.field_b;
          var5 = 2;
          var6 = vba.field_p[((wf) this).field_c][param0];
          var7 = vba.field_p[((wf) this).field_c].length;
          var8 = ifa.field_g[var6];
          if (var6 != 6) {
            break L0;
          } else {
            L1: {
              if (he.field_o == 0) {
                break L1;
              } else {
                if (wgb.field_f == 0) {
                  break L1;
                } else {
                  if (7 == he.field_o) {
                    break L1;
                  } else {
                    if (wgb.field_f == 7) {
                      break L1;
                    } else {
                      L2: {
                        if (he.field_o == 1) {
                          break L2;
                        } else {
                          if (wgb.field_f != 1) {
                            L3: {
                              if (he.field_o == 2) {
                                break L3;
                              } else {
                                if (wgb.field_f == 2) {
                                  break L3;
                                } else {
                                  if (he.field_o == 3) {
                                    break L3;
                                  } else {
                                    if (wgb.field_f == 3) {
                                      break L3;
                                    } else {
                                      if (he.field_o == 4) {
                                        break L3;
                                      } else {
                                        if (4 != wgb.field_f) {
                                          break L0;
                                        } else {
                                          break L3;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var8 = aj.field_p.toUpperCase();
                            break L0;
                          } else {
                            break L2;
                          }
                        }
                      }
                      var8 = nd.field_q.toUpperCase();
                      break L0;
                    }
                  }
                }
              }
            }
            var8 = ifa.field_g[5];
            var9_ref_String = var8;
            var9_ref_String = var8;
            break L0;
          }
        }
        L4: {
          if (19 == var6) {
            L5: {
              if (2 != jha.field_p) {
                if (jha.field_p == 1) {
                  var9_ref_String = jhb.field_o;
                  break L5;
                } else {
                  var9_ref_String = wva.field_a;
                  break L5;
                }
              } else {
                var9_ref_String = dv.field_d;
                break L5;
              }
            }
            var28 = var9_ref_String.toUpperCase();
            var9_ref_String = var28;
            var8 = var9_ref_String;
            var9_ref_String = var28;
            var8 = var8 + var28;
            var9_ref_String = var8;
            var8 = var9_ref_String;
            var9_ref_String = var8;
            break L4;
          } else {
            break L4;
          }
        }
        L6: {
          if (24 != var6) {
            break L6;
          } else {
            L7: {
              if (3 != eaa.field_q) {
                if (eaa.field_q != 1) {
                  if (0 != eaa.field_q) {
                    var9_ref_String = vk.field_o;
                    var8 = var9_ref_String;
                    var8 = var9_ref_String;
                    break L7;
                  } else {
                    var9_ref_String = kja.field_C;
                    break L7;
                  }
                } else {
                  var9_ref_String = ot.field_a;
                  break L7;
                }
              } else {
                var9_ref_String = msa.field_p;
                break L7;
              }
            }
            var29 = var9_ref_String.toUpperCase();
            var8 = var29;
            var8 = var29;
            var8 = var8 + var29;
            break L6;
          }
        }
        L8: {
          if (var6 != 22) {
            break L8;
          } else {
            if (ji.b(true)) {
              var8 = tqa.field_o.toUpperCase();
              break L8;
            } else {
              break L8;
            }
          }
        }
        L9: {
          var9 = 0;
          var11 = -10 / ((param2 - 55) / 34);
          if (var6 != 23) {
            break L9;
          } else {
            L10: {
              if (!fwa.field_g.field_a) {
                break L10;
              } else {
                if (ssa.b(2)) {
                  break L10;
                } else {
                  L11: {
                    if (param1) {
                      kwa.a(fla.field_o, -33);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  var9 = 1;
                  break L10;
                }
              }
            }
            if (wh.field_n > 0) {
              var9 = 1;
              var8 = pu.field_b.toUpperCase();
              break L9;
            } else {
              L12: {
                var8 = gmb.field_b.toUpperCase();
                if (bm.field_o == null) {
                  break L12;
                } else {
                  if (null == vqa.field_g) {
                    break L12;
                  } else {
                    if (null == vqa.field_g.field_m.b(1).field_g.d(vqa.field_g.field_L, 107)) {
                      break L12;
                    } else {
                      break L9;
                    }
                  }
                }
              }
              var9 = 1;
              break L9;
            }
          }
        }
        L13: {
          var10 = tea.a(var5, var8, 13879);
          var12 = this.b(31488, param0);
          var13 = this.a((byte) -60, param0);
          var14 = 0;
          if (var4 < 16) {
            if (0 < var4) {
              var15_float = (float)(var7 * 2 + -param0) * 0.800000011920929f;
              var14 = (int)(var15_float * (float)mg.f(255));
              break L13;
            } else {
              break L13;
            }
          } else {
            var15_float = (float)(param0 - -var7) * 0.800000011920929f;
            var14 = (int)(var15_float * (float)(-mg.f(255) + 255));
            break L13;
          }
        }
        L14: {
          L15: {
            var13 = var13 + var14;
            var12 = var12 + var14;
            var15 = this.c(param0, 17915);
            if (var6 == 13) {
              break L15;
            } else {
              if (var6 != 14) {
                stackOut_62_0 = 0;
                stackIn_63_0 = stackOut_62_0;
                break L14;
              } else {
                break L15;
              }
            }
          }
          stackOut_61_0 = 1;
          stackIn_63_0 = stackOut_61_0;
          break L14;
        }
        L16: {
          var16 = stackIn_63_0;
          if (var16 == 0) {
            break L16;
          } else {
            var10 = wrb.a(100, 132);
            break L16;
          }
        }
        L17: {
          var17 = -var10 + var12 + var13 >> 1;
          var18 = this.a(param0, (byte) 70);
          var19 = var13 - var12;
          var20 = this.a(param0, (byte) 70);
          var21 = 0;
          if (!param1) {
            break L17;
          } else {
            var21 = 1;
            break L17;
          }
        }
        L18: {
          var22 = 125;
          if (((wf) this).field_c == 5) {
            var22 = 129;
            break L18;
          } else {
            break L18;
          }
        }
        L19: {
          L20: {
            if (var6 == 0) {
              break L20;
            } else {
              if (var6 == 1) {
                break L20;
              } else {
                if (var6 != 13) {
                  if (14 == var6) {
                    var22 = 133;
                    break L19;
                  } else {
                    break L19;
                  }
                } else {
                  var22 = 135;
                  break L19;
                }
              }
            }
          }
          var22 = 127;
          break L19;
        }
        L21: {
          if (var21 != 1) {
            break L21;
          } else {
            var22++;
            break L21;
          }
        }
        L22: {
          var23 = wrb.a(100, var22);
          var24 = ct.a(19143, var22);
          if (var16 != 0) {
            L23: {
              var25 = var15 + var18 / 2 + -1;
              bn.a(131, var17, (byte) 93, var25);
              if (var6 != 13) {
                stackOut_89_0 = var10 * hlb.field_p / 256;
                stackIn_90_0 = stackOut_89_0;
                break L23;
              } else {
                stackOut_88_0 = var10 * kt.field_l / 256;
                stackIn_90_0 = stackOut_88_0;
                break L23;
              }
            }
            L24: {
              var26 = stackIn_90_0;
              if (var21 == 1) {
                fpa.a(var25, ct.a(19143, 131) + var25, true, var17 + var26, var17);
                bn.a(132, var17, (byte) 122, var25);
                tm.a(126);
                break L24;
              } else {
                break L24;
              }
            }
            bn.a(var22, -1 + var17 - (-var26 - -(var23 / 2)), (byte) 92, var25 - -((ct.a(19143, 132) - var24) / 2));
            break L22;
          } else {
            L25: {
              bn.a(var22, var19 / 2 + (var12 - var23 / 2), (byte) 108, var15 + var20 / 2 + -(var24 / 2));
              uoa.a(var22, 250, -(var24 / 2) + (var20 / 2 + var15), 0, -(var23 / 2) + var12 + var19 / 2);
              if (param1) {
                stackOut_83_0 = 15658751;
                stackIn_84_0 = stackOut_83_0;
                break L25;
              } else {
                stackOut_82_0 = 13421772;
                stackIn_84_0 = stackOut_82_0;
                break L25;
              }
            }
            L26: {
              var25 = stackIn_84_0;
              if (var9 == 0) {
                break L26;
              } else {
                var25 = 7829367;
                break L26;
              }
            }
            pm.a(var17, -1, -12 + var18 / 2 + var15 + tib.a(true, var5), var8, var5, var25, (byte) -88);
            break L22;
          }
        }
    }

    final void a(boolean param0, int param1, int param2) {
        if (param1 != 320) {
            field_a = null;
        }
        if (((wf) this).field_b.field_j != -1) {
            if (this.a(((wf) this).field_b.field_j, 117)) {
                param2 = ((wf) this).field_b.field_j;
            }
        }
        ((wf) this).field_b.a(param0, -1, param2, ((wf) this).a(uia.field_b, kc.field_b, param1 ^ 7060));
        mba.field_b = kdb.field_o;
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = VoidHunters.field_G;
          var4 = 0;
          if (param2 == 6868) {
            break L0;
          } else {
            field_d = 97;
            break L0;
          }
        }
        L1: while (true) {
          if (vba.field_p[((wf) this).field_c].length <= var4) {
            return -1;
          } else {
            var5 = this.c(var4, 17915);
            if (this.a(var4, 116)) {
              if (this.b(31488, var4) <= param1) {
                if (param1 < this.a((byte) -9, var4)) {
                  if (param0 >= var5) {
                    if (var5 + this.a(var4, (byte) 70) > param0) {
                      return var4;
                    } else {
                      var4++;
                      continue L1;
                    }
                  } else {
                    var4++;
                    continue L1;
                  }
                } else {
                  var4++;
                  continue L1;
                }
              } else {
                var4++;
                continue L1;
              }
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    private final void d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var19 = 0;
        String var20 = null;
        String var21 = null;
        L0: {
          var19 = VoidHunters.field_G;
          var2 = 4;
          var3 = pob.field_b;
          var4 = 0;
          if (var3 >= 16) {
            var4 = (-mg.f(255) + 255) * 4;
            break L0;
          } else {
            if (0 >= var3) {
              break L0;
            } else {
              var4 = mg.f(255) * 4;
              break L0;
            }
          }
        }
        L1: {
          var5 = var4 + (ip.field_p.width + -dma.field_g) / 2;
          var6 = (-dma.field_j + ip.field_p.height) / 2;
          var7 = 20;
          var8 = 20;
          var10 = 0;
          af.a((byte) -115, 200, var8 * 2 + ko.field_e[6].field_n + (ko.field_e[0].field_n + 235), 80 - -var5 + (-ko.field_e[0].field_m + -var7), -var8 + (160 + var6 - ko.field_e[0].field_n) - 55, 2 * var7 + (480 - -ko.field_e[0].field_m) + ko.field_e[2].field_m);
          var9 = 16;
          var11 = 50;
          var12 = var11 + (-55 + -ko.field_e[0].field_n) + (var6 + 160) + -var8;
          var13 = 2 * var8 + 180 - -ko.field_e[0].field_n + (ko.field_e[6].field_n - 10);
          ga.a(150, false, -var7 + var5 + 80 - (ko.field_e[0].field_m - var9), var12, var13, -(var9 * 2) + ko.field_e[0].field_m + 480 - (-ko.field_e[2].field_m + -(2 * var7)), 1);
          var14 = 50;
          var15 = -var7 + (-ko.field_e[0].field_m + (var5 + 80 + var9)) + var14;
          var16 = 2 * var7 + (ko.field_e[0].field_m + 480 + -(var14 * 2)) + (ko.field_e[2].field_m - var9 * 2);
          var17 = 13421772;
          if (op.field_o == 0) {
            var12 += 50;
            int discarded$3 = nua.a(-1, var13, var15, pqa.a(false, var2), 0, mb.field_k[op.field_o], var17, var16, -55, var12, 0, var2);
            int discarded$4 = nua.a(-1, var13, 140 + var15, pqa.a(false, var2), 0, lu.field_a, 16755200, var16, -51, var12, 0, var2);
            break L1;
          } else {
            var12 -= 10;
            var20 = this.a("<savekey>", (byte) 119, mb.field_k[op.field_o], ve.field_p);
            var21 = this.a("<loadkey>", (byte) 63, var20, gg.field_j);
            int discarded$5 = nua.a(-1, var13, var15, pqa.a(false, var2), 1, var21, var17, var16, -42, var12, 0, var2);
            break L1;
          }
        }
        pm.a(80 - -var5, -1, -50 + var6 + 160, pt.a(op.field_o, -98), 1, 16738305, (byte) -96);
    }

    private final void b(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        sg var10 = null;
        int var11 = 0;
        int var12_int = 0;
        String var12 = null;
        String var13 = null;
        java.awt.datatransfer.StringSelection var13_ref = null;
        String var14 = null;
        int var15 = 0;
        int[] var16 = null;
        String var18 = null;
        String var19 = null;
        String var20 = null;
        int[] var23 = null;
        int stackIn_40_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_156_0 = 0;
        int stackIn_161_0 = 0;
        int stackIn_166_0 = 0;
        int stackIn_193_0 = 0;
        int stackOut_160_0 = 0;
        int stackOut_159_0 = 0;
        int stackOut_165_0 = 0;
        int stackOut_164_0 = 0;
        int stackOut_192_0 = 0;
        int stackOut_191_0 = 0;
        int stackOut_155_0 = 0;
        int stackOut_154_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        L0: {
          var15 = VoidHunters.field_G;
          var4 = 1;
          var5 = vba.field_p[((wf) this).field_c][param2];
          var10_int = var5;
          if (var10_int != 0) {
            if (var10_int == 1) {
              if (((wf) this).field_b.e((byte) -126)) {
                if (fda.e((byte) 85)) {
                  iba.a((no) (Object) dsb.field_p, 2, (byte) -115, 320, ck.field_o, param1, wc.field_d, 0, 8, true, dsb.field_p.field_o, dra.field_v, 240, 8, dsb.field_p.field_A + dsb.field_p.field_o);
                  break L0;
                } else {
                  var10_int = param1 ? 1 : 0;
                  lha.a(wgb.field_f, var10_int != 0, (byte) -85, -4);
                  break L0;
                }
              } else {
                break L0;
              }
            } else {
              if (var10_int != 2) {
                if (5 != var10_int) {
                  if (16 == var10_int) {
                    if (((wf) this).field_b.e((byte) -78)) {
                      var10_int = param1 ? 1 : 0;
                      lha.a(wgb.field_f, var10_int != 0, (byte) -85, 7);
                      fhb.field_p = true;
                      break L0;
                    } else {
                      break L0;
                    }
                  } else {
                    if (var10_int == 3) {
                      if (((wf) this).field_b.e((byte) -86)) {
                        op.field_o = 0;
                        var10_int = param1 ? 1 : 0;
                        lha.a(wgb.field_f, var10_int != 0, (byte) -85, 5);
                        break L0;
                      } else {
                        break L0;
                      }
                    } else {
                      if (var10_int != 6) {
                        if (20 == var10_int) {
                          if (!((wf) this).field_b.e((byte) -95)) {
                            break L0;
                          } else {
                            var10_int = param1 ? 1 : 0;
                            lha.a(wgb.field_f, var10_int != 0, (byte) -85, 8);
                            break L0;
                          }
                        } else {
                          if (var10_int != 21) {
                            if (var10_int != 13) {
                              if (var10_int != 14) {
                                if (4 == var10_int) {
                                  if (((wf) this).field_b.e((byte) -87)) {
                                    apb.a((byte) 125);
                                    break L0;
                                  } else {
                                    break L0;
                                  }
                                } else {
                                  if (19 == var10_int) {
                                    L1: {
                                      var8 = 0;
                                      if (((wf) this).field_b.c((byte) -45)) {
                                        jha.field_p = jha.field_p + 1;
                                        var8 = 1;
                                        break L1;
                                      } else {
                                        break L1;
                                      }
                                    }
                                    L2: {
                                      if (!((wf) this).field_b.a(42)) {
                                        break L2;
                                      } else {
                                        jha.field_p = jha.field_p - 1;
                                        var8 = 1;
                                        break L2;
                                      }
                                    }
                                    L3: {
                                      if (3 > jha.field_p) {
                                        break L3;
                                      } else {
                                        jha.field_p = 0;
                                        break L3;
                                      }
                                    }
                                    L4: {
                                      if (jha.field_p >= 0) {
                                        break L4;
                                      } else {
                                        jha.field_p = 2;
                                        break L4;
                                      }
                                    }
                                    if (var8 != 0) {
                                      aw.a(false);
                                      if (!ef.field_E) {
                                        break L0;
                                      } else {
                                        bea.a((byte) 114, (Object) (Object) "graphics_quality", jha.field_p);
                                        qra.a(-96);
                                        break L0;
                                      }
                                    } else {
                                      break L0;
                                    }
                                  } else {
                                    if (var10_int != 24) {
                                      if (var10_int == 7) {
                                        if (!((wf) this).field_b.e((byte) -126)) {
                                          break L0;
                                        } else {
                                          L5: {
                                            if (null == vqa.field_g) {
                                              break L5;
                                            } else {
                                              vqa.field_g.a(param1, -10510);
                                              break L5;
                                            }
                                          }
                                          aeb.field_a = true;
                                          bg.field_o = false;
                                          if (!wh.g(-118)) {
                                            break L0;
                                          } else {
                                            if (jkb.field_a) {
                                              dpa.field_p.h(param0 ^ 24343, 10);
                                              jkb.field_a = false;
                                              nwa.field_d = false;
                                              break L0;
                                            } else {
                                              break L0;
                                            }
                                          }
                                        }
                                      } else {
                                        if (var10_int != 8) {
                                          if (var10_int == 9) {
                                            if (!((wf) this).field_b.e((byte) -94)) {
                                              break L0;
                                            } else {
                                              L6: {
                                                vqa.field_g.i(60);
                                                var10_int = param1 ? 1 : 0;
                                                if (!bqa.a(false)) {
                                                  stackOut_160_0 = 0;
                                                  stackIn_161_0 = stackOut_160_0;
                                                  break L6;
                                                } else {
                                                  stackOut_159_0 = 7;
                                                  stackIn_161_0 = stackOut_159_0;
                                                  break L6;
                                                }
                                              }
                                              lha.a(stackIn_161_0, var10_int != 0, (byte) -85, -1);
                                              break L0;
                                            }
                                          } else {
                                            if (var10_int == 10) {
                                              if (!((wf) this).field_b.e((byte) -96)) {
                                                break L0;
                                              } else {
                                                L7: {
                                                  vqa.field_g.b(true);
                                                  var10_int = param1 ? 1 : 0;
                                                  if (bqa.a(false)) {
                                                    stackOut_165_0 = 7;
                                                    stackIn_166_0 = stackOut_165_0;
                                                    break L7;
                                                  } else {
                                                    stackOut_164_0 = 0;
                                                    stackIn_166_0 = stackOut_164_0;
                                                    break L7;
                                                  }
                                                }
                                                lha.a(stackIn_166_0, var10_int != 0, (byte) -85, -1);
                                                break L0;
                                              }
                                            } else {
                                              if (var10_int == 11) {
                                                if (!((wf) this).field_b.e((byte) -98)) {
                                                  break L0;
                                                } else {
                                                  L8: {
                                                    if (idb.field_o) {
                                                      var10_int = param1 ? 1 : 0;
                                                      lha.a(wgb.field_f, var10_int != 0, (byte) -85, -5);
                                                      break L8;
                                                    } else {
                                                      break L8;
                                                    }
                                                  }
                                                  if (!nhb.field_p) {
                                                    break L0;
                                                  } else {
                                                    jua.a(0, 11, 20694);
                                                    break L0;
                                                  }
                                                }
                                              } else {
                                                if (var10_int != 17) {
                                                  if (var10_int == 18) {
                                                    L9: {
                                                      if (!((wf) this).field_b.e((byte) -115)) {
                                                        break L9;
                                                      } else {
                                                        if (!this.a(param2, param0 ^ 96)) {
                                                          break L9;
                                                        } else {
                                                          op.field_o = op.field_o + 1;
                                                          break L9;
                                                        }
                                                      }
                                                    }
                                                    if (this.a(param2, 125)) {
                                                      break L0;
                                                    } else {
                                                      if (!param1) {
                                                        ((wf) this).field_b.field_j = ((wf) this).field_b.field_j - 1;
                                                        break L0;
                                                      } else {
                                                        break L0;
                                                      }
                                                    }
                                                  } else {
                                                    if (var10_int == 12) {
                                                      if (!((wf) this).field_b.e((byte) -82)) {
                                                        break L0;
                                                      } else {
                                                        VoidHunters.a(vpa.b((byte) -123), param0 + -20);
                                                        break L0;
                                                      }
                                                    } else {
                                                      if (var10_int == 22) {
                                                        if (!((wf) this).field_b.e((byte) -119)) {
                                                          break L0;
                                                        } else {
                                                          L10: {
                                                            if (!ji.b(true)) {
                                                              stackOut_192_0 = 0;
                                                              stackIn_193_0 = stackOut_192_0;
                                                              break L10;
                                                            } else {
                                                              stackOut_191_0 = 1;
                                                              stackIn_193_0 = stackOut_191_0;
                                                              break L10;
                                                            }
                                                          }
                                                          var10_int = stackIn_193_0;
                                                          qqa.a(var10_int != 0, (byte) -90);
                                                          break L0;
                                                        }
                                                      } else {
                                                        if (23 != var10_int) {
                                                          break L0;
                                                        } else {
                                                          if (((wf) this).field_b.e((byte) -84)) {
                                                            var4 = 0;
                                                            if (vqa.field_g == null) {
                                                              break L0;
                                                            } else {
                                                              if (wh.field_n > 0) {
                                                                break L0;
                                                              } else {
                                                                L11: {
                                                                  if (!fwa.field_g.field_a) {
                                                                    break L11;
                                                                  } else {
                                                                    if (ssa.b(2)) {
                                                                      break L11;
                                                                    } else {
                                                                      break L0;
                                                                    }
                                                                  }
                                                                }
                                                                var10 = vqa.field_g.field_m.b(1).field_g.d(vqa.field_g.field_L, 93);
                                                                if (var10 == null) {
                                                                  break L0;
                                                                } else {
                                                                  if (bm.field_o == null) {
                                                                    return;
                                                                  } else {
                                                                    var23 = rsa.a(var10.field_k, param0 ^ -98);
                                                                    var18 = rob.a(65535, var23);
                                                                    var14 = var18;
                                                                    var13 = var14;
                                                                    var13 = var18;
                                                                    if (var18 == null) {
                                                                      return;
                                                                    } else {
                                                                      if (var18.length() == 0) {
                                                                        return;
                                                                      } else {
                                                                        L12: {
                                                                          var12 = "ship_view.ws?ship=" + var18;
                                                                          var14 = var12;
                                                                          var13 = var14;
                                                                          var13 = var12;
                                                                          var13 = "games.jagex.com";
                                                                          var19 = mab.field_a.getParameter("environment");
                                                                          var14 = var19;
                                                                          var13 = var14;
                                                                          var13 = var19;
                                                                          var14 = var13;
                                                                          var13 = var14;
                                                                          if (var19 == null) {
                                                                            break L12;
                                                                          } else {
                                                                            var14 = var19.toLowerCase();
                                                                            var13 = var14;
                                                                            var13 = var14;
                                                                            if (var14.equals((Object) (Object) "wtwip")) {
                                                                              var13 = "games-wtwip.jagex.com";
                                                                              break L12;
                                                                            } else {
                                                                              if (!var14.equals((Object) (Object) "wtqa")) {
                                                                                if (var14.equals((Object) (Object) "wtrc")) {
                                                                                  var13 = "games-wtrc.jagex.com";
                                                                                  break L12;
                                                                                } else {
                                                                                  if (!var14.equals((Object) (Object) "wti")) {
                                                                                    break L12;
                                                                                  } else {
                                                                                    var13 = "games-wti.jagex.com";
                                                                                    break L12;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                var13 = "games-wtqa.jagex.com";
                                                                                break L12;
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                        var20 = "http://" + var13 + "/g=voidhunters/autochoose.ws?dest=" + msa.a((CharSequence) (Object) var12, 32);
                                                                        var13_ref = new java.awt.datatransfer.StringSelection(var20);
                                                                        mob discarded$3 = bm.field_o.a((byte) -45, (java.awt.datatransfer.Transferable) (Object) var13_ref);
                                                                        wh.field_n = 100;
                                                                        var4 = 1;
                                                                        qp.a(true, 0, vpa.b((byte) -92), var20);
                                                                        break L0;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            break L0;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  L13: {
                                                    if (!((wf) this).field_b.e((byte) -81)) {
                                                      break L13;
                                                    } else {
                                                      if (!this.a(param2, 115)) {
                                                        break L13;
                                                      } else {
                                                        op.field_o = op.field_o - 1;
                                                        break L13;
                                                      }
                                                    }
                                                  }
                                                  if (this.a(param2, 113)) {
                                                    break L0;
                                                  } else {
                                                    if (!param1) {
                                                      ((wf) this).field_b.field_j = ((wf) this).field_b.field_j + 1;
                                                      break L0;
                                                    } else {
                                                      break L0;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          if (((wf) this).field_b.e((byte) -89)) {
                                            L14: {
                                              vqa.field_g.e(true);
                                              var10_int = param1 ? 1 : 0;
                                              if (bqa.a(false)) {
                                                stackOut_155_0 = 7;
                                                stackIn_156_0 = stackOut_155_0;
                                                break L14;
                                              } else {
                                                stackOut_154_0 = 0;
                                                stackIn_156_0 = stackOut_154_0;
                                                break L14;
                                              }
                                            }
                                            lha.a(stackIn_156_0, var10_int != 0, (byte) -85, -1);
                                            break L0;
                                          } else {
                                            break L0;
                                          }
                                        }
                                      }
                                    } else {
                                      L15: {
                                        var9 = 0;
                                        if (!((wf) this).field_b.c((byte) -45)) {
                                          break L15;
                                        } else {
                                          var9 = 1;
                                          break L15;
                                        }
                                      }
                                      L16: {
                                        if (!((wf) this).field_b.a(52)) {
                                          break L16;
                                        } else {
                                          var9 = -1;
                                          break L16;
                                        }
                                      }
                                      if (var9 == 0) {
                                        break L0;
                                      } else {
                                        var10_int = 0;
                                        L17: while (true) {
                                          if (~var10_int <= ~ub.field_f.length) {
                                            break L0;
                                          } else {
                                            var11 = lwa.a(eaa.field_q, -1);
                                            var11 = (var9 + ub.field_f.length + var11) % ub.field_f.length;
                                            var12_int = ub.field_f[var11];
                                            if (wea.a(-25915, var12_int)) {
                                              var16 = new int[]{var12_int};
                                              vq.field_x.a(false, fja.a(var16, 2));
                                              break L0;
                                            } else {
                                              var10_int++;
                                              continue L17;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                L18: {
                                  var7 = hlb.field_p;
                                  if (!((wf) this).field_b.a(true)) {
                                    break L18;
                                  } else {
                                    re.a(0, (byte) -109);
                                    break L18;
                                  }
                                }
                                L19: {
                                  if (((wf) this).field_b.d(param0 + 12441)) {
                                    re.a(256, (byte) -104);
                                    break L19;
                                  } else {
                                    break L19;
                                  }
                                }
                                L20: {
                                  if (((wf) this).field_b.b((byte) 111)) {
                                    var10_int = this.b(31488, param2) + (this.a((byte) -76, param2) + -wrb.a(100, 131)) >> 1;
                                    var11 = kc.field_b + -var10_int;
                                    var12_int = 256 * var11 / wrb.a(100, 131);
                                    if (var12_int > 0) {
                                      if (var12_int < 256) {
                                        re.a(var12_int, (byte) -111);
                                        break L20;
                                      } else {
                                        re.a(256, (byte) -112);
                                        break L20;
                                      }
                                    } else {
                                      re.a(0, (byte) -127);
                                      break L20;
                                    }
                                  } else {
                                    break L20;
                                  }
                                }
                                L21: {
                                  if (!((wf) this).field_b.d((byte) -7)) {
                                    break L21;
                                  } else {
                                    mi.e((byte) -81);
                                    break L21;
                                  }
                                }
                                L22: {
                                  if (!((wf) this).field_b.b(-80)) {
                                    break L22;
                                  } else {
                                    vcb.f(32);
                                    break L22;
                                  }
                                }
                                if (hlb.field_p == var7) {
                                  break L0;
                                } else {
                                  if (ef.field_E) {
                                    bea.a((byte) -22, (Object) (Object) "music_volume", hlb.field_p);
                                    qra.a(-122);
                                    break L0;
                                  } else {
                                    break L0;
                                  }
                                }
                              }
                            } else {
                              L23: {
                                var6 = 0;
                                if (!((wf) this).field_b.a(true)) {
                                  break L23;
                                } else {
                                  if (kt.field_l > 0) {
                                    nl.a(0, -13205);
                                    var6 = 1;
                                    break L23;
                                  } else {
                                    break L23;
                                  }
                                }
                              }
                              L24: {
                                if (!((wf) this).field_b.d(12465)) {
                                  break L24;
                                } else {
                                  if (256 > kt.field_l) {
                                    var6 = 1;
                                    nl.a(256, -13205);
                                    break L24;
                                  } else {
                                    break L24;
                                  }
                                }
                              }
                              L25: {
                                if (((wf) this).field_b.b((byte) 126)) {
                                  var10_int = this.b(31488, param2) - (-this.a((byte) -79, param2) + wrb.a(100, 131)) >> 1;
                                  var11 = kc.field_b - var10_int;
                                  var12_int = 256 * var11 / wrb.a(param0 + 76, 131);
                                  var6 = 1;
                                  if (var12_int <= 0) {
                                    nl.a(0, -13205);
                                    break L25;
                                  } else {
                                    if (256 > var12_int) {
                                      nl.a(var12_int, -13205);
                                      break L25;
                                    } else {
                                      nl.a(256, -13205);
                                      break L25;
                                    }
                                  }
                                } else {
                                  break L25;
                                }
                              }
                              L26: {
                                if (!((wf) this).field_b.d((byte) -7)) {
                                  break L26;
                                } else {
                                  if (kt.field_l > 0) {
                                    var6 = 1;
                                    spa.b((byte) 64);
                                    break L26;
                                  } else {
                                    break L26;
                                  }
                                }
                              }
                              L27: {
                                if (!((wf) this).field_b.b(-86)) {
                                  break L27;
                                } else {
                                  if (kt.field_l >= 256) {
                                    break L27;
                                  } else {
                                    ft.b(18941);
                                    var6 = 1;
                                    break L27;
                                  }
                                }
                              }
                              if (var6 == 0) {
                                break L0;
                              } else {
                                L28: {
                                  L29: {
                                    if (!((wf) this).field_b.b((byte) 119)) {
                                      break L29;
                                    } else {
                                      if (~mba.field_b > ~kdb.field_o) {
                                        break L29;
                                      } else {
                                        break L28;
                                      }
                                    }
                                  }
                                  ana discarded$4 = lha.a(-124, fa.field_d[1]);
                                  mba.field_b = 20 + kdb.field_o;
                                  break L28;
                                }
                                if (!ef.field_E) {
                                  break L0;
                                } else {
                                  bea.a((byte) 3, (Object) (Object) "fx_volume", kt.field_l);
                                  qra.a(-108);
                                  break L0;
                                }
                              }
                            }
                          } else {
                            if (((wf) this).field_b.e((byte) -107)) {
                              var10_int = param1 ? 1 : 0;
                              lha.a(wgb.field_f, var10_int != 0, (byte) -85, 9);
                              break L0;
                            } else {
                              break L0;
                            }
                          }
                        }
                      } else {
                        if (!((wf) this).field_b.e((byte) -105)) {
                          break L0;
                        } else {
                          var10_int = he.field_o;
                          var11 = param1 ? 1 : 0;
                          lha.a(wgb.field_f, var11 != 0, (byte) -85, var10_int);
                          break L0;
                        }
                      }
                    }
                  }
                } else {
                  if (((wf) this).field_b.e((byte) -83)) {
                    var10_int = param1 ? 1 : 0;
                    lha.a(wgb.field_f, var10_int != 0, (byte) -85, 0);
                    break L0;
                  } else {
                    break L0;
                  }
                }
              } else {
                if (((wf) this).field_b.e((byte) -97)) {
                  L30: {
                    var10_int = param1 ? 1 : 0;
                    if (bqa.a(false)) {
                      stackOut_50_0 = 7;
                      stackIn_51_0 = stackOut_50_0;
                      break L30;
                    } else {
                      stackOut_49_0 = 0;
                      stackIn_51_0 = stackOut_49_0;
                      break L30;
                    }
                  }
                  lha.a(stackIn_51_0, var10_int != 0, (byte) -85, -1);
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          } else {
            if (((wf) this).field_b.e((byte) -78)) {
              L31: {
                var10_int = param1 ? 1 : 0;
                if (bqa.a(false)) {
                  stackOut_39_0 = 7;
                  stackIn_40_0 = stackOut_39_0;
                  break L31;
                } else {
                  stackOut_38_0 = 0;
                  stackIn_40_0 = stackOut_38_0;
                  break L31;
                }
              }
              lha.a(stackIn_40_0, var10_int != 0, (byte) -85, -3);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L32: {
          if (param0 == 24) {
            break L32;
          } else {
            ((wf) this).c((byte) 37);
            break L32;
          }
        }
        L33: {
          if (var4 == 0) {
            break L33;
          } else {
            if (((wf) this).field_b.e((byte) -102)) {
              ana discarded$5 = lha.a(param0 ^ -106, fa.field_d[7]);
              break L33;
            } else {
              break L33;
            }
          }
        }
    }

    final void c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        var7 = VoidHunters.field_G;
        this.b(150, (byte) -61);
        if (((wf) this).field_c != 7) {
          L0: {
            if (((wf) this).field_c != 8) {
              break L0;
            } else {
              nb.e((byte) 102);
              break L0;
            }
          }
          L1: {
            if (param0 == 65) {
              break L1;
            } else {
              var8 = null;
              String discarded$2 = this.a((String) null, (byte) -83, (String) null, -38);
              break L1;
            }
          }
          var2 = 0;
          L2: while (true) {
            if (var2 >= ((wf) this).field_b.field_c) {
              L3: {
                if (5 == ((wf) this).field_c) {
                  this.d((byte) -48);
                  break L3;
                } else {
                  if (((wf) this).field_c == 6) {
                    var2 = 3;
                    var3 = aib.a((byte) -37, iia.field_c, pqa.a(false, var2), var2, 480);
                    var4 = 16;
                    var5_int = (ip.field_p.width - dma.field_g) / 2;
                    var6 = (-dma.field_j + ip.field_p.height) / 2;
                    var3 = var3 + var4 * 2;
                    af.a((byte) -115, 255, var3, var5_int + (80 + -var4), -var4 + (var6 + 160), var4 * 2 + 480);
                    int discarded$3 = nua.a(-1, 1000, 80 + var5_int, pqa.a(false, var2), 0, iia.field_c, 8555923, 480, -32, 160 + var6, 0, var2);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                var2 = pob.field_b;
                var3 = 0;
                if (var2 < 16) {
                  if (var2 > 0) {
                    var3 = mg.f(255) * 4;
                    break L4;
                  } else {
                    break L4;
                  }
                } else {
                  var3 = 4 * (-mg.f(param0 ^ 190) + 255);
                  break L4;
                }
              }
              L5: {
                var4 = (ip.field_p.height - dma.field_j) / 2;
                if (((wf) this).field_c != 0) {
                  if (((wf) this).field_c >= ocb.field_m.length) {
                    break L5;
                  } else {
                    if (ocb.field_m[((wf) this).field_c] == null) {
                      break L5;
                    } else {
                      var5 = ocb.field_m[((wf) this).field_c];
                      var6 = 1;
                      pm.a(ip.field_p.width / 2 - (tea.a(var6, var5, 13879) / 2 + -var3), 1, var4 + 110, var5, 1, 16777215, (byte) -120);
                      break L5;
                    }
                  }
                } else {
                  bn.a(137, var3 + ip.field_p.width / 2 - wrb.a(param0 ^ 37, 137) / 2, (byte) 103, 20 + var4);
                  break L5;
                }
              }
              return;
            } else {
              if (this.a(var2, 126)) {
                L6: {
                  stackOut_10_0 = this;
                  stackOut_10_1 = var2;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  if (((wf) this).field_b.field_j != var2) {
                    stackOut_12_0 = this;
                    stackOut_12_1 = stackIn_12_1;
                    stackOut_12_2 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    stackIn_13_2 = stackOut_12_2;
                    break L6;
                  } else {
                    stackOut_11_0 = this;
                    stackOut_11_1 = stackIn_11_1;
                    stackOut_11_2 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    stackIn_13_2 = stackOut_11_2;
                    break L6;
                  }
                }
                this.a(stackIn_13_1, stackIn_13_2 != 0, param0 ^ 40);
                var2++;
                continue L2;
              } else {
                var2++;
                continue L2;
              }
            }
          }
        } else {
          return;
        }
    }

    private final int b(int param0, int param1) {
        int var4 = 0;
        if (param0 != 31488) {
            int discarded$0 = this.a((byte) -10, -10);
        }
        int var3 = (ip.field_p.width - dma.field_g) / 2;
        if (((wf) this).field_c == 5) {
            return 190 * param1 + var3 + vba.field_r[((wf) this).field_c];
        }
        if (!(0 != ((wf) this).field_c)) {
            if (param1 < 2) {
                var4 = -25 + (ip.field_p.width / 2 - wrb.a(100, 128));
                return var4;
            }
            return 25 + var3 + vba.field_r[((wf) this).field_c];
        }
        return vba.field_r[((wf) this).field_c] - -var3;
    }

    private final boolean a(int param0, int param1) {
        if (param1 <= 112) {
            field_d = -28;
        }
        if (((wf) this).field_c != 5) {
            return true;
        }
        if (param0 == 0) {
            if (!(op.field_o != 0)) {
                return false;
            }
        }
        if (param0 == 2) {
            if (~op.field_o == ~(mb.field_k.length - 1)) {
                return false;
            }
        }
        return true;
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = VoidHunters.field_G;
          if (si.field_o[13]) {
            var2 = vba.field_p[((wf) this).field_c].length;
            var3 = 0;
            L1: while (true) {
              if (var2 <= var3) {
                break L0;
              } else {
                var4 = vba.field_p[((wf) this).field_c][var3];
                if (var4 == 6) {
                  var5 = he.field_o;
                  lha.a(wgb.field_f, false, (byte) -85, var5);
                  var3++;
                  continue L1;
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
          } else {
            if (5 != oab.field_o) {
              ((wf) this).field_b.a((byte) -63);
              break L0;
            } else {
              this.c(132);
              break L0;
            }
          }
        }
    }

    private final int a(byte param0, int param1) {
        int var3 = (-dma.field_g + ip.field_p.width) / 2;
        if (((wf) this).field_c == 5) {
            return this.b(31488, param1) + 140;
        }
        if (param0 > -1) {
            return -98;
        }
        if (((wf) this).field_c == 0) {
            if (param1 < 2) {
                return ip.field_p.width / 2;
            }
        }
        return vba.field_q[((wf) this).field_c] + var3;
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_10_0 = 0;
        int stackIn_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        var3 = VoidHunters.field_G;
        if (!vba.f((byte) -72)) {
          L0: {
            if (param0 == 0) {
              break L0;
            } else {
              ((wf) this).field_c = 40;
              break L0;
            }
          }
          L1: {
            if (8 != ((wf) this).field_c) {
              break L1;
            } else {
              fia.a(false);
              break L1;
            }
          }
          if (((wf) this).field_c != 7) {
            L2: {
              if (lu.field_d) {
                break L2;
              } else {
                if (!dua.field_o) {
                  L3: while (true) {
                    if (!ata.e(127)) {
                      L4: {
                        var2 = ((wf) this).field_b.field_j;
                        ((wf) this).field_b.a(((wf) this).a(qs.field_a, oq.field_H, 6868), 5620, ((wf) this).a(uia.field_b, kc.field_b, param0 ^ 6868));
                        if (((wf) this).field_b.field_j < 0) {
                          break L4;
                        } else {
                          if (~var2 == ~((wf) this).field_b.field_j) {
                            break L4;
                          } else {
                            ana discarded$2 = lha.a(-124, fa.field_d[0]);
                            break L4;
                          }
                        }
                      }
                      if (((wf) this).field_b.field_j == -1) {
                        break L2;
                      } else {
                        this.b(24, true, ((wf) this).field_b.field_j);
                        break L2;
                      }
                    } else {
                      if (!qmb.a(-22029)) {
                        if (pma.field_o == 13) {
                          L5: {
                            if (1 == ((wf) this).field_c) {
                              break L5;
                            } else {
                              if (2 == ((wf) this).field_c) {
                                break L5;
                              } else {
                                if (((wf) this).field_c == 3) {
                                  break L5;
                                } else {
                                  if (((wf) this).field_c == 4) {
                                    break L5;
                                  } else {
                                    continue L3;
                                  }
                                }
                              }
                            }
                          }
                          L6: {
                            if (!bqa.a(false)) {
                              stackOut_40_0 = 0;
                              stackIn_41_0 = stackOut_40_0;
                              break L6;
                            } else {
                              stackOut_39_0 = 7;
                              stackIn_41_0 = stackOut_39_0;
                              break L6;
                            }
                          }
                          lha.a(stackIn_41_0, false, (byte) -85, -1);
                          continue L3;
                        } else {
                          L7: {
                            var2 = ((wf) this).field_b.field_j;
                            this.a((byte) -51);
                            if (0 > ((wf) this).field_b.field_j) {
                              break L7;
                            } else {
                              if (~var2 == ~((wf) this).field_b.field_j) {
                                break L7;
                              } else {
                                ana discarded$3 = lha.a(-110, fa.field_d[0]);
                                break L7;
                              }
                            }
                          }
                          if (((wf) this).field_b.field_j == -1) {
                            continue L3;
                          } else {
                            this.b(24, false, ((wf) this).field_b.field_j);
                            continue L3;
                          }
                        }
                      } else {
                        continue L3;
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
            }
            return;
          } else {
            L8: {
              if (ee.a(-75)) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L8;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L8;
              }
            }
            L9: {
              var2 = ll.a(stackIn_10_0 != 0, (byte) 40);
              if (3 != var2) {
                break L9;
              } else {
                L10: {
                  if (null == psb.field_b) {
                    break L10;
                  } else {
                    cqb.b((byte) -42);
                    break L10;
                  }
                }
                mra.a(vpa.b((byte) -105), 0);
                break L9;
              }
            }
            L11: {
              if (var2 == 1) {
                lha.a(wgb.field_f, false, (byte) -85, 0);
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if (var2 == 2) {
                lha.a(wgb.field_f, true, (byte) -85, 0);
                break L12;
              } else {
                break L12;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    private final int a(int param0, byte param1) {
        if (((wf) this).field_c == 0) {
            if (param0 < 2) {
                return vba.field_o[((wf) this).field_c] + 30;
            }
        }
        return 30;
    }

    wf(int param0) {
        ((wf) this).field_c = param0;
        ((wf) this).field_b = new ae(vba.field_p[((wf) this).field_c].length);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 12;
    }
}
