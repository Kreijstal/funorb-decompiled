/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h extends tn {
    static qr field_v;
    private int[] field_D;
    private gh field_E;
    static String[] field_w;
    private int field_l;
    static String[] field_x;
    private int field_y;
    private int field_n;
    ga field_r;
    static boolean field_q;
    private gh field_z;
    private gh field_o;
    ga field_u;
    static int[] field_t;
    private int[] field_p;
    private int field_B;
    private ga field_m;
    static int[] field_s;
    static bi field_F;
    private boolean field_A;
    private boolean field_C;

    final boolean a(gh param0, byte param1) {
        Object var4 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param1 == -23) {
            break L0;
          } else {
            var4 = null;
            this.a((ga) null, (byte) 55, (ga) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if (param0 == ((h) this).field_z) {
              break L2;
            } else {
              if (((h) this).field_E != param0) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    public static void d(int param0) {
        field_v = null;
        field_s = null;
        field_F = null;
        field_w = null;
        if (param0 != -1) {
            h.d(22);
        }
        field_x = null;
        field_t = null;
    }

    final void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_33_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_62_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        if (((h) this).field_B <= 0) {
          ((h) this).a(param2);
          return;
        } else {
          L0: {
            if (((h) this).field_C) {
              L1: {
                if (((h) this).field_l >= -1) {
                  break L1;
                } else {
                  if (!((h) this).field_u.h(5309)) {
                    ((h) this).field_C = false;
                    ((h) this).field_l = -((h) this).field_l;
                    ((h) this).field_z = null;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              if (-1 <= ((h) this).field_l) {
                break L0;
              } else {
                if (!((h) this).field_r.h(5309)) {
                  ((h) this).field_E = null;
                  ((h) this).field_C = false;
                  ((h) this).field_l = -((h) this).field_l;
                  break L0;
                } else {
                  break L0;
                }
              }
            } else {
              break L0;
            }
          }
          L2: {
            var4 = (((h) this).field_n >> -1141386388) * ((h) this).field_B / 256;
            var5 = ((h) this).field_B - var4;
            if (((h) this).field_l == 0) {
              break L2;
            } else {
              ((h) this).field_n = ((h) this).field_n + ((h) this).field_l * param2;
              if ((((h) this).field_n ^ -1) > -1048577) {
                if ((((h) this).field_n ^ -1) >= -1) {
                  ((h) this).field_n = 0;
                  if (((h) this).field_C) {
                    break L2;
                  } else {
                    ((h) this).field_l = 0;
                    if (!((h) this).field_A) {
                      L3: {
                        if (((h) this).field_z != null) {
                          ((h) this).field_u.e(15);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      ((h) this).field_z = null;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                } else {
                  break L2;
                }
              } else {
                ((h) this).field_n = 1048576;
                if (((h) this).field_C) {
                  break L2;
                } else {
                  ((h) this).field_l = 0;
                  if (!((h) this).field_A) {
                    L4: {
                      if (null == ((h) this).field_E) {
                        break L4;
                      } else {
                        ((h) this).field_r.e(15);
                        break L4;
                      }
                    }
                    ((h) this).field_E = null;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          L5: {
            if (ap.field_h) {
              stackOut_32_0 = param2 << -1720716415;
              stackIn_33_0 = stackOut_32_0;
              break L5;
            } else {
              stackOut_31_0 = param2;
              stackIn_33_0 = stackOut_31_0;
              break L5;
            }
          }
          L6: {
            var6 = stackIn_33_0;
            if (((h) this).field_y < 256) {
              L7: {
                if (null != ((h) this).field_z) {
                  break L7;
                } else {
                  if (null == ((h) this).field_E) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              if (256 != var4) {
                if (-257 == (var5 ^ -1)) {
                  ((h) this).field_r.b(param0, param1, param2);
                  break L6;
                } else {
                  L8: {
                    L9: {
                      if (((h) this).field_D == null) {
                        break L9;
                      } else {
                        if (((h) this).field_D.length < var6) {
                          break L9;
                        } else {
                          ps.a(((h) this).field_D, 0, var6);
                          ps.a(((h) this).field_p, 0, var6);
                          break L8;
                        }
                      }
                    }
                    ((h) this).field_p = new int[var6];
                    ((h) this).field_D = new int[var6];
                    break L8;
                  }
                  L10: {
                    ((h) this).field_u.b(((h) this).field_D, 0, param2);
                    ((h) this).field_r.b(((h) this).field_p, 0, param2);
                    if (!ap.field_h) {
                      stackOut_47_0 = param1;
                      stackIn_48_0 = stackOut_47_0;
                      break L10;
                    } else {
                      param1 = param1 << 1;
                      stackOut_46_0 = param1 << 1;
                      stackIn_48_0 = stackOut_46_0;
                      break L10;
                    }
                  }
                  var7 = stackIn_48_0;
                  var8 = 0;
                  L11: while (true) {
                    if (var6 <= var8) {
                      break L6;
                    } else {
                      param0[var7 - -var8] = param0[var7 - -var8] + (((h) this).field_p[var8] * var5 + ((h) this).field_D[var8] * var4 >> -1115320280);
                      var8++;
                      continue L11;
                    }
                  }
                }
              } else {
                ((h) this).field_u.b(param0, param1, param2);
                break L6;
              }
            } else {
              break L6;
            }
          }
          L12: {
            if (((h) this).field_o == null) {
              break L12;
            } else {
              if (((h) this).field_y != 0) {
                L13: {
                  L14: {
                    if (null == ((h) this).field_D) {
                      break L14;
                    } else {
                      if (((h) this).field_D.length < var6) {
                        break L14;
                      } else {
                        ps.a(((h) this).field_D, 0, var6);
                        break L13;
                      }
                    }
                  }
                  ((h) this).field_p = new int[var6];
                  ((h) this).field_D = new int[var6];
                  break L13;
                }
                L15: {
                  ((h) this).field_m.b(((h) this).field_D, 0, param2);
                  if (ap.field_h) {
                    param1 = param1 << 1;
                    stackOut_61_0 = param1 << 1;
                    stackIn_62_0 = stackOut_61_0;
                    break L15;
                  } else {
                    stackOut_60_0 = param1;
                    stackIn_62_0 = stackOut_60_0;
                    break L15;
                  }
                }
                var7 = stackIn_62_0;
                var8 = ((h) this).field_y * ((h) this).field_B / 256;
                var9 = -var8 + ((h) this).field_B;
                var10 = 0;
                L16: while (true) {
                  if (var10 >= var6) {
                    break L12;
                  } else {
                    param0[var7 + var10] = var8 * ((h) this).field_D[var10] + param0[var10 + var7] * var9 >> 1682057032;
                    var10++;
                    continue L16;
                  }
                }
              } else {
                break L12;
              }
            }
          }
          return;
        }
    }

    final synchronized void a(int param0) {
        int var3 = 0;
        L0: {
          var3 = ShatteredPlansClient.field_F ? 1 : 0;
          if (((h) this).field_n < -1) {
            if (((h) this).field_z != null) {
              ((h) this).field_u.a(param0);
              if (((h) this).field_n < 1048576) {
                if (((h) this).field_E != null) {
                  ((h) this).field_r.a(param0);
                  if (-1 <= ((h) this).field_y) {
                    break L0;
                  } else {
                    if (((h) this).field_o == null) {
                      break L0;
                    } else {
                      ((h) this).field_m.a(param0);
                      break L0;
                    }
                  }
                } else {
                  if (-1 >= ((h) this).field_y) {
                    break L0;
                  } else {
                    if (((h) this).field_o == null) {
                      break L0;
                    } else {
                      ((h) this).field_m.a(param0);
                      break L0;
                    }
                  }
                }
              } else {
                if (-1 <= ((h) this).field_y) {
                  break L0;
                } else {
                  if (((h) this).field_o == null) {
                    break L0;
                  } else {
                    ((h) this).field_m.a(param0);
                    break L0;
                  }
                }
              }
            } else {
              if (((h) this).field_n < 1048576) {
                if (((h) this).field_E != null) {
                  ((h) this).field_r.a(param0);
                  if (-1 <= (((h) this).field_y ^ -1)) {
                    break L0;
                  } else {
                    if (((h) this).field_o == null) {
                      break L0;
                    } else {
                      ((h) this).field_m.a(param0);
                      break L0;
                    }
                  }
                } else {
                  if (-1 >= ((h) this).field_y) {
                    break L0;
                  } else {
                    if (((h) this).field_o == null) {
                      break L0;
                    } else {
                      ((h) this).field_m.a(param0);
                      break L0;
                    }
                  }
                }
              } else {
                if (-1 <= ((h) this).field_y) {
                  break L0;
                } else {
                  if (((h) this).field_o == null) {
                    break L0;
                  } else {
                    ((h) this).field_m.a(param0);
                    break L0;
                  }
                }
              }
            }
          } else {
            if (((h) this).field_n >= 1048576) {
              if (-1 <= ((h) this).field_y) {
                break L0;
              } else {
                if (((h) this).field_o == null) {
                  break L0;
                } else {
                  ((h) this).field_m.a(param0);
                  break L0;
                }
              }
            } else {
              if (-1 >= ((h) this).field_y) {
                break L0;
              } else {
                if (((h) this).field_o == null) {
                  break L0;
                } else {
                  ((h) this).field_m.a(param0);
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (((h) this).field_C) {
            if ((((h) this).field_l ^ -1) >= -1) {
              if (0 <= ((h) this).field_l) {
                break L1;
              } else {
                if (((h) this).field_r.h(5309)) {
                  break L1;
                } else {
                  ((h) this).field_C = false;
                  ((h) this).field_l = -((h) this).field_l;
                  ((h) this).field_E = null;
                  break L1;
                }
              }
            } else {
              if (!((h) this).field_u.h(5309)) {
                ((h) this).field_C = false;
                ((h) this).field_z = null;
                ((h) this).field_l = -((h) this).field_l;
                break L1;
              } else {
                if (0 <= ((h) this).field_l) {
                  break L1;
                } else {
                  if (((h) this).field_r.h(5309)) {
                    break L1;
                  } else {
                    ((h) this).field_C = false;
                    ((h) this).field_l = -((h) this).field_l;
                    ((h) this).field_E = null;
                    break L1;
                  }
                }
              }
            }
          } else {
            break L1;
          }
        }
        L2: {
          if (((h) this).field_l != 0) {
            ((h) this).field_n = ((h) this).field_n + ((h) this).field_l * param0;
            if (1048576 > ((h) this).field_n) {
              if (-1 <= (((h) this).field_n ^ -1)) {
                ((h) this).field_n = 0;
                if (((h) this).field_C) {
                  break L2;
                } else {
                  ((h) this).field_l = 0;
                  if (!((h) this).field_A) {
                    L3: {
                      if (((h) this).field_z == null) {
                        break L3;
                      } else {
                        ((h) this).field_u.e(15);
                        break L3;
                      }
                    }
                    ((h) this).field_z = null;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            } else {
              ((h) this).field_n = 1048576;
              if (((h) this).field_C) {
                break L2;
              } else {
                ((h) this).field_l = 0;
                if (((h) this).field_A) {
                  break L2;
                } else {
                  L4: {
                    if (((h) this).field_E != null) {
                      ((h) this).field_r.e(15);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  ((h) this).field_E = null;
                  break L2;
                }
              }
            }
          } else {
            break L2;
          }
        }
    }

    private final void a(int param0, int param1, ga param2, int param3) {
        param2.a((byte) -78, -1, param0);
        param2.c(param1, false);
        if (param3 > -93) {
            h.d(-81);
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            java.net.URL var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var4 = param1.getCodeBase();
                var3 = jg.a(param1, false, var4).getFile();
                Object discarded$6 = ll.a(param1, "updatelinks", new Object[2], -95);
                Object discarded$7 = ll.a(param1, "updatelinks", new Object[2], -65);
                Object discarded$8 = ll.a(param1, "updatelinks", new Object[2], -88);
                Object discarded$9 = ll.a(param1, "updatelinks", new Object[2], -118);
                Object discarded$10 = ll.a(param1, "updatelinks", new Object[2], param0 ^ 81);
                if (param0 == -1) {
                  break L0;
                } else {
                  field_w = null;
                  break L0;
                }
              }
              Object discarded$11 = ll.a(param1, "updatelinks", new Object[2], -104);
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var2 = decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final tn d() {
        return null;
    }

    private final void a(ga param0, byte param1, ga param2) {
        ((h) this).field_u = param0;
        if (param1 != 17) {
            return;
        }
        ((h) this).field_r = param2;
        ((h) this).field_n = 1048576;
    }

    final synchronized void a(int param0, int param1) {
        if (param1 != 0) {
            Object var4 = null;
            boolean discarded$0 = ((h) this).a((gh) null, (byte) -108);
        }
        ((h) this).field_B = param0;
    }

    final synchronized int a() {
        return 2;
    }

    final tn b() {
        return null;
    }

    final synchronized void a(int param0, int param1, byte param2, boolean param3, int param4, gh param5) {
        int var7 = 0;
        int var8 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_32_0 = 0;
        ga stackIn_38_0 = null;
        gh stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        ga stackIn_39_0 = null;
        gh stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        ga stackIn_40_0 = null;
        gh stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        int stackIn_40_3 = 0;
        ga stackIn_47_0 = null;
        gh stackIn_47_1 = null;
        int stackIn_47_2 = 0;
        ga stackIn_48_0 = null;
        gh stackIn_48_1 = null;
        int stackIn_48_2 = 0;
        ga stackIn_49_0 = null;
        gh stackIn_49_1 = null;
        int stackIn_49_2 = 0;
        int stackIn_49_3 = 0;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        ga stackOut_46_0 = null;
        gh stackOut_46_1 = null;
        int stackOut_46_2 = 0;
        ga stackOut_48_0 = null;
        gh stackOut_48_1 = null;
        int stackOut_48_2 = 0;
        int stackOut_48_3 = 0;
        ga stackOut_47_0 = null;
        gh stackOut_47_1 = null;
        int stackOut_47_2 = 0;
        int stackOut_47_3 = 0;
        ga stackOut_37_0 = null;
        gh stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        ga stackOut_39_0 = null;
        gh stackOut_39_1 = null;
        int stackOut_39_2 = 0;
        int stackOut_39_3 = 0;
        ga stackOut_38_0 = null;
        gh stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        int stackOut_38_3 = 0;
        L0: {
          var8 = ShatteredPlansClient.field_F ? 1 : 0;
          if (!((h) this).field_C) {
            break L0;
          } else {
            if (param3) {
              L1: {
                if ((((h) this).field_l ^ -1) >= -1) {
                  L2: {
                    if (null != ((h) this).field_E) {
                      ((h) this).field_r.e(15);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  ((h) this).field_E = param5;
                  if (param5 != null) {
                    ((h) this).field_r.a(param5, (byte) 101, false);
                    this.a(param1, param0, ((h) this).field_r, -108);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  L3: {
                    if (null == ((h) this).field_z) {
                      break L3;
                    } else {
                      ((h) this).field_u.e(15);
                      break L3;
                    }
                  }
                  ((h) this).field_z = param5;
                  if (param5 != null) {
                    ((h) this).field_u.a(param5, (byte) 101, false);
                    this.a(param1, param0, ((h) this).field_u, -119);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              return;
            } else {
              break L0;
            }
          }
        }
        L4: {
          stackOut_16_0 = this;
          stackIn_18_0 = stackOut_16_0;
          stackIn_17_0 = stackOut_16_0;
          if (!param3) {
            stackOut_18_0 = this;
            stackOut_18_1 = 0;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            break L4;
          } else {
            stackOut_17_0 = this;
            stackOut_17_1 = 1;
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            break L4;
          }
        }
        ((h) this).field_C = stackIn_19_1 != 0;
        if (((h) this).field_z != param5) {
          if (param5 != ((h) this).field_E) {
            if (param2 < -94) {
              L5: {
                if (null != ((h) this).field_z) {
                  if (null != ((h) this).field_E) {
                    L6: {
                      if ((((h) this).field_n ^ -1) <= -524289) {
                        stackOut_31_0 = 0;
                        stackIn_32_0 = stackOut_31_0;
                        break L6;
                      } else {
                        stackOut_30_0 = 1;
                        stackIn_32_0 = stackOut_30_0;
                        break L6;
                      }
                    }
                    var7 = stackIn_32_0;
                    break L5;
                  } else {
                    var7 = 0;
                    break L5;
                  }
                } else {
                  var7 = 1;
                  break L5;
                }
              }
              L7: {
                if (var7 == 0) {
                  L8: {
                    if (((h) this).field_E != null) {
                      ((h) this).field_r.e(15);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    ((h) this).field_E = param5;
                    if (param5 == null) {
                      break L9;
                    } else {
                      L10: {
                        stackOut_46_0 = ((h) this).field_r;
                        stackOut_46_1 = (gh) param5;
                        stackOut_46_2 = 101;
                        stackIn_48_0 = stackOut_46_0;
                        stackIn_48_1 = stackOut_46_1;
                        stackIn_48_2 = stackOut_46_2;
                        stackIn_47_0 = stackOut_46_0;
                        stackIn_47_1 = stackOut_46_1;
                        stackIn_47_2 = stackOut_46_2;
                        if (param3) {
                          stackOut_48_0 = (ga) (Object) stackIn_48_0;
                          stackOut_48_1 = (gh) (Object) stackIn_48_1;
                          stackOut_48_2 = stackIn_48_2;
                          stackOut_48_3 = 0;
                          stackIn_49_0 = stackOut_48_0;
                          stackIn_49_1 = stackOut_48_1;
                          stackIn_49_2 = stackOut_48_2;
                          stackIn_49_3 = stackOut_48_3;
                          break L10;
                        } else {
                          stackOut_47_0 = (ga) (Object) stackIn_47_0;
                          stackOut_47_1 = (gh) (Object) stackIn_47_1;
                          stackOut_47_2 = stackIn_47_2;
                          stackOut_47_3 = 1;
                          stackIn_49_0 = stackOut_47_0;
                          stackIn_49_1 = stackOut_47_1;
                          stackIn_49_2 = stackOut_47_2;
                          stackIn_49_3 = stackOut_47_3;
                          break L10;
                        }
                      }
                      ((ga) (Object) stackIn_49_0).a(stackIn_49_1, (byte) stackIn_49_2, stackIn_49_3 != 0);
                      this.a(param1, param0, ((h) this).field_r, -94);
                      break L9;
                    }
                  }
                  ((h) this).field_l = -param4;
                  break L7;
                } else {
                  L11: {
                    if (((h) this).field_z == null) {
                      break L11;
                    } else {
                      ((h) this).field_u.e(15);
                      break L11;
                    }
                  }
                  L12: {
                    ((h) this).field_z = param5;
                    if (param5 == null) {
                      break L12;
                    } else {
                      L13: {
                        stackOut_37_0 = ((h) this).field_u;
                        stackOut_37_1 = (gh) param5;
                        stackOut_37_2 = 101;
                        stackIn_39_0 = stackOut_37_0;
                        stackIn_39_1 = stackOut_37_1;
                        stackIn_39_2 = stackOut_37_2;
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        stackIn_38_2 = stackOut_37_2;
                        if (param3) {
                          stackOut_39_0 = (ga) (Object) stackIn_39_0;
                          stackOut_39_1 = (gh) (Object) stackIn_39_1;
                          stackOut_39_2 = stackIn_39_2;
                          stackOut_39_3 = 0;
                          stackIn_40_0 = stackOut_39_0;
                          stackIn_40_1 = stackOut_39_1;
                          stackIn_40_2 = stackOut_39_2;
                          stackIn_40_3 = stackOut_39_3;
                          break L13;
                        } else {
                          stackOut_38_0 = (ga) (Object) stackIn_38_0;
                          stackOut_38_1 = (gh) (Object) stackIn_38_1;
                          stackOut_38_2 = stackIn_38_2;
                          stackOut_38_3 = 1;
                          stackIn_40_0 = stackOut_38_0;
                          stackIn_40_1 = stackOut_38_1;
                          stackIn_40_2 = stackOut_38_2;
                          stackIn_40_3 = stackOut_38_3;
                          break L13;
                        }
                      }
                      ((ga) (Object) stackIn_40_0).a(stackIn_40_1, (byte) stackIn_40_2, stackIn_40_3 != 0);
                      this.a(param1, param0, ((h) this).field_u, -103);
                      break L12;
                    }
                  }
                  ((h) this).field_l = param4;
                  break L7;
                }
              }
              return;
            } else {
              return;
            }
          } else {
            ((h) this).field_l = -param4;
            this.a(param1, param0, ((h) this).field_r, -97);
            return;
          }
        } else {
          ((h) this).field_l = param4;
          this.a(param1, param0, ((h) this).field_u, -94);
          return;
        }
    }

    public h() {
        ((h) this).field_y = 0;
        ((h) this).field_A = false;
        ((h) this).field_B = 256;
        ga var1 = new ga();
        this.a(var1, (byte) 17, new ga(var1));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_x = new String[]{"Metal", "Biomass", "Energy", "Exotics"};
        field_t = new int[8192];
        field_s = new int[]{-14671840, -12566464, -10461088, -8355712, -6250336, -4144960, -2039584, -1};
    }
}
