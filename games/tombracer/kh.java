/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh extends uia {
    static String[][] field_l;
    private int field_i;
    private qea field_n;
    static String field_p;
    static String field_j;
    static String field_m;
    private int field_k;
    static String field_o;

    kh(byte[] param0) {
        super(param0);
    }

    final int j(int param0) {
        if (param0 >= -25) {
            ((kh) this).field_i = 127;
            ((kh) this).field_h = ((kh) this).field_h + 1;
            return 255 & ((kh) this).field_g[((kh) this).field_h] + -((kh) this).field_n.b(104);
        }
        ((kh) this).field_h = ((kh) this).field_h + 1;
        return 255 & ((kh) this).field_g[((kh) this).field_h] + -((kh) this).field_n.b(104);
    }

    final void a(byte param0, int param1, int param2) {
        int var5 = TombRacer.field_G ? 1 : 0;
        int var4 = 9 / ((-85 - param0) / 40);
        param1 = param1 & fca.field_b[param2];
        while ((((kh) this).field_k ^ -1) > (param2 ^ -1)) {
            param2 = param2 - ((kh) this).field_k;
            ((kh) this).field_h = ((kh) this).field_h + 1;
            ((kh) this).field_g[((kh) this).field_h] = (byte)(((kh) this).field_g[((kh) this).field_h] + (param1 >>> param2));
            ((kh) this).field_g[((kh) this).field_h] = (byte) 0;
            ((kh) this).field_k = 8;
        }
        if ((((kh) this).field_k ^ -1) != (param2 ^ -1)) {
            ((kh) this).field_k = ((kh) this).field_k - param2;
            ((kh) this).field_g[((kh) this).field_h] = (byte)(((kh) this).field_g[((kh) this).field_h] + (param1 << ((kh) this).field_k));
        } else {
            ((kh) this).field_h = ((kh) this).field_h + 1;
            ((kh) this).field_g[((kh) this).field_h] = (byte)(((kh) this).field_g[((kh) this).field_h] + param1);
            ((kh) this).field_g[((kh) this).field_h] = (byte) 0;
            ((kh) this).field_k = 8;
            return;
        }
    }

    kh(int param0) {
        super(param0);
    }

    final void h(byte param0) {
        ((kh) this).field_i = ((kh) this).field_h * 8;
        int var2 = -117 % ((61 - param0) / 49);
    }

    final void i(int param0) {
        ((kh) this).field_g[((kh) this).field_h] = (byte) 0;
        ((kh) this).field_k = param0;
    }

    final void a(int param0, int[] param1) {
        ((kh) this).field_n = new qea(param1);
        if (param0 == -26185) {
            return;
        }
        int discarded$0 = ((kh) this).b((byte) -116, 2);
    }

    final int b(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        var3 = ((kh) this).field_i >> -579569853;
        var4 = 8 - (((kh) this).field_i & 7);
        var5 = 0;
        ((kh) this).field_i = ((kh) this).field_i + param1;
        if (param0 != 44) {
          field_m = null;
          L0: while (true) {
            if ((var4 ^ -1) <= (param1 ^ -1)) {
              L1: {
                if ((var4 ^ -1) != (param1 ^ -1)) {
                  var5 = var5 + (((kh) this).field_g[var3] >> -param1 + var4 & fca.field_b[param1]);
                  break L1;
                } else {
                  var5 = var5 + (fca.field_b[var4] & ((kh) this).field_g[var3]);
                  break L1;
                }
              }
              return var5;
            } else {
              var3++;
              var5 = var5 + ((fca.field_b[var4] & ((kh) this).field_g[var3]) << -var4 + param1);
              param1 = param1 - var4;
              var4 = 8;
              continue L0;
            }
          }
        } else {
          L2: while (true) {
            if ((var4 ^ -1) <= (param1 ^ -1)) {
              L3: {
                if ((var4 ^ -1) != (param1 ^ -1)) {
                  var5 = var5 + (((kh) this).field_g[var3] >> -param1 + var4 & fca.field_b[param1]);
                  break L3;
                } else {
                  var5 = var5 + (fca.field_b[var4] & ((kh) this).field_g[var3]);
                  break L3;
                }
              }
              return var5;
            } else {
              var3++;
              var5 = var5 + ((fca.field_b[var4] & ((kh) this).field_g[var3]) << -var4 + param1);
              param1 = param1 - var4;
              var4 = 8;
              continue L2;
            }
          }
        }
    }

    final void i(byte param0) {
        ((kh) this).field_h = (((kh) this).field_i + 7) / 8;
        if (param0 == 98) {
            return;
        }
        ((kh) this).k(-21, -101);
    }

    final void j(int param0, int param1) {
        int var3 = 0;
        param0 = param0 & 15;
        if (param1 == 4) {
          var3 = ((kh) this).field_k;
          if ((var3 ^ -1) == -5) {
            ((kh) this).field_h = ((kh) this).field_h + 1;
            ((kh) this).field_g[((kh) this).field_h] = (byte)(((kh) this).field_g[((kh) this).field_h] + param0);
            ((kh) this).field_g[((kh) this).field_h] = (byte) 0;
            ((kh) this).field_k = 8;
            return;
          } else {
            if ((var3 ^ -1) == -4) {
              ((kh) this).field_h = ((kh) this).field_h + 1;
              ((kh) this).field_g[((kh) this).field_h] = (byte)(((kh) this).field_g[((kh) this).field_h] + (param0 >>> 2057430785));
              ((kh) this).field_g[((kh) this).field_h] = (byte)(param0 << 1646486855);
              ((kh) this).field_k = 7;
              return;
            } else {
              if (var3 != 2) {
                if (-2 == (var3 ^ -1)) {
                  ((kh) this).field_h = ((kh) this).field_h + 1;
                  ((kh) this).field_g[((kh) this).field_h] = (byte)(((kh) this).field_g[((kh) this).field_h] + (param0 >>> -676205885));
                  ((kh) this).field_g[((kh) this).field_h] = (byte)(param0 << -140099131);
                  ((kh) this).field_k = 5;
                  return;
                } else {
                  if ((var3 ^ -1) == -1) {
                    ((kh) this).field_h = ((kh) this).field_h + 1;
                    ((kh) this).field_g[((kh) this).field_h] = (byte)(param0 << -572710012);
                    ((kh) this).field_k = 4;
                    return;
                  } else {
                    ((kh) this).field_k = ((kh) this).field_k - 4;
                    ((kh) this).field_g[((kh) this).field_h] = (byte)(((kh) this).field_g[((kh) this).field_h] + (param0 << ((kh) this).field_k));
                    return;
                  }
                }
              } else {
                ((kh) this).field_h = ((kh) this).field_h + 1;
                ((kh) this).field_g[((kh) this).field_h] = (byte)(((kh) this).field_g[((kh) this).field_h] + (param0 >>> -1826190686));
                ((kh) this).field_g[((kh) this).field_h] = (byte)(param0 << -498940954);
                ((kh) this).field_k = 6;
                return;
              }
            }
          }
        } else {
          field_p = null;
          var3 = ((kh) this).field_k;
          if ((var3 ^ -1) == -5) {
            ((kh) this).field_h = ((kh) this).field_h + 1;
            ((kh) this).field_g[((kh) this).field_h] = (byte)(((kh) this).field_g[((kh) this).field_h] + param0);
            ((kh) this).field_g[((kh) this).field_h] = (byte) 0;
            ((kh) this).field_k = 8;
            return;
          } else {
            if ((var3 ^ -1) == -4) {
              ((kh) this).field_h = ((kh) this).field_h + 1;
              ((kh) this).field_g[((kh) this).field_h] = (byte)(((kh) this).field_g[((kh) this).field_h] + (param0 >>> 2057430785));
              ((kh) this).field_g[((kh) this).field_h] = (byte)(param0 << 1646486855);
              ((kh) this).field_k = 7;
              return;
            } else {
              if (var3 != 2) {
                if (-2 == (var3 ^ -1)) {
                  ((kh) this).field_h = ((kh) this).field_h + 1;
                  ((kh) this).field_g[((kh) this).field_h] = (byte)(((kh) this).field_g[((kh) this).field_h] + (param0 >>> -676205885));
                  ((kh) this).field_g[((kh) this).field_h] = (byte)(param0 << -140099131);
                  ((kh) this).field_k = 5;
                  return;
                } else {
                  if ((var3 ^ -1) == -1) {
                    ((kh) this).field_h = ((kh) this).field_h + 1;
                    ((kh) this).field_g[((kh) this).field_h] = (byte)(param0 << -572710012);
                    ((kh) this).field_k = 4;
                    return;
                  } else {
                    ((kh) this).field_k = ((kh) this).field_k - 4;
                    ((kh) this).field_g[((kh) this).field_h] = (byte)(((kh) this).field_g[((kh) this).field_h] + (param0 << ((kh) this).field_k));
                    return;
                  }
                }
              } else {
                ((kh) this).field_h = ((kh) this).field_h + 1;
                ((kh) this).field_g[((kh) this).field_h] = (byte)(((kh) this).field_g[((kh) this).field_h] + (param0 >>> -1826190686));
                ((kh) this).field_g[((kh) this).field_h] = (byte)(param0 << -498940954);
                ((kh) this).field_k = 6;
                return;
              }
            }
          }
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        var5 = 0;
        var6 = 80 / ((70 - param1) / 50);
        L0: while (true) {
          if ((var5 ^ -1) > (param3 ^ -1)) {
            ((kh) this).field_h = ((kh) this).field_h + 1;
            param2[param0 + var5] = (byte)(((kh) this).field_g[((kh) this).field_h] + -((kh) this).field_n.b(120));
            var5++;
            continue L0;
          } else {
            return;
          }
        }
    }

    final static void a(boolean param0, kia param1, kea param2) {
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        if (param2 == qla.field_f) {
          if (la.field_k == param1) {
            return;
          } else {
            if (param0) {
              qla.field_f = param2;
              la.field_k = param1;
              if (ska.field_r == la.field_k) {
                if (qla.field_f == baa.field_e) {
                  L0: {
                    baa.field_d.a(0, new ei[1]);
                    if (null != mq.field_e) {
                      mq.field_e.field_g = aia.e(5);
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                  return;
                } else {
                  if (tia.field_d == qla.field_f) {
                    L1: {
                      baa.field_d.a(0, new ei[1]);
                      if (null != mq.field_e) {
                        mq.field_e.field_g = aia.e(5);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    return;
                  } else {
                    if (qla.field_f == kva.field_s) {
                      L2: {
                        baa.field_d.a(0, new ei[1]);
                        if (null != mq.field_e) {
                          mq.field_e.field_g = aia.e(5);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      return;
                    } else {
                      L3: {
                        if (null != mq.field_e) {
                          mq.field_e.field_g = aia.e(5);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      return;
                    }
                  }
                }
              } else {
                L4: {
                  if (qla.field_f != baa.field_e) {
                    if (qla.field_f == tia.field_d) {
                      L5: {
                        baa.field_d.a(0, new ei[1]);
                        if (null != mq.field_e) {
                          mq.field_e.field_g = aia.e(5);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      return;
                    } else {
                      if (qla.field_f == kva.field_s) {
                        L6: {
                          baa.field_d.a(0, new ei[1]);
                          if (null != mq.field_e) {
                            mq.field_e.field_g = aia.e(5);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        return;
                      } else {
                        break L4;
                      }
                    }
                  } else {
                    baa.field_d.a(0, new ei[1]);
                    break L4;
                  }
                }
                L7: {
                  if (null != mq.field_e) {
                    mq.field_e.field_g = aia.e(5);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                return;
              }
            } else {
              return;
            }
          }
        } else {
          if (param0) {
            qla.field_f = param2;
            la.field_k = param1;
            if (ska.field_r == la.field_k) {
              if (qla.field_f == baa.field_e) {
                L8: {
                  baa.field_d.a(0, new ei[1]);
                  if (null != mq.field_e) {
                    mq.field_e.field_g = aia.e(5);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                return;
              } else {
                if (tia.field_d == qla.field_f) {
                  L9: {
                    baa.field_d.a(0, new ei[1]);
                    if (null != mq.field_e) {
                      mq.field_e.field_g = aia.e(5);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  return;
                } else {
                  if (qla.field_f == kva.field_s) {
                    L10: {
                      baa.field_d.a(0, new ei[1]);
                      if (null != mq.field_e) {
                        mq.field_e.field_g = aia.e(5);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    return;
                  } else {
                    L11: {
                      if (null != mq.field_e) {
                        mq.field_e.field_g = aia.e(5);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    return;
                  }
                }
              }
            } else {
              L12: {
                if (qla.field_f != baa.field_e) {
                  if (qla.field_f == tia.field_d) {
                    L13: {
                      baa.field_d.a(0, new ei[1]);
                      if (null != mq.field_e) {
                        mq.field_e.field_g = aia.e(5);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    return;
                  } else {
                    if (qla.field_f == kva.field_s) {
                      L14: {
                        baa.field_d.a(0, new ei[1]);
                        if (null != mq.field_e) {
                          mq.field_e.field_g = aia.e(5);
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      return;
                    } else {
                      break L12;
                    }
                  }
                } else {
                  baa.field_d.a(0, new ei[1]);
                  break L12;
                }
              }
              L15: {
                if (null != mq.field_e) {
                  mq.field_e.field_g = aia.e(5);
                  break L15;
                } else {
                  break L15;
                }
              }
              return;
            }
          } else {
            return;
          }
        }
    }

    final void k(int param0, int param1) {
        if (param1 != -2988) {
            return;
        }
        ((kh) this).field_h = ((kh) this).field_h + 1;
        ((kh) this).field_g[((kh) this).field_h] = (byte)(((kh) this).field_n.b(104) + param0);
    }

    public static void g(byte param0) {
        field_j = null;
        field_m = null;
        field_l = null;
        field_p = null;
        field_o = null;
        if (param0 == 0) {
            return;
        }
        field_j = null;
    }

    final void k(int param0) {
        if (8 > ((kh) this).field_k) {
            ((kh) this).field_k = 8;
            ((kh) this).field_h = ((kh) this).field_h + 1;
            if (param0 == -1826190686) {
                return;
            }
            field_o = null;
            return;
        }
        if (param0 == -1826190686) {
            return;
        }
        field_o = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Game";
        field_j = "Close";
        field_m = "Rumour has it these bags o' loot were abandoned by ancient smugglers. Now you can smuggle them out for points.";
        field_o = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
    }
}
