/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am {
    static String field_a;
    static String field_b;
    static kc field_c;

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
            field_c = null;
        }
        field_c = null;
        field_b = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(byte param0, int[] param1) {
        long var2 = 0L;
        qe var4_ref_qe = null;
        int var4 = 0;
        int var5_int = 0;
        qe var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        if (qc.field_c != ob.field_eb) {
          return false;
        } else {
          if (param0 == 26) {
            L0: {
              var2 = qj.b(-26572);
              if (-1 == (ob.field_ab ^ -1)) {
                break L0;
              } else {
                if ((so.field_d ^ -1) > -1) {
                  var4_ref_qe = (qe) (Object) uf.field_a.b(12623);
                  if (var4_ref_qe == null) {
                    break L0;
                  } else {
                    if (var4_ref_qe.field_q >= var2) {
                      break L0;
                    } else {
                      var4_ref_qe.a(true);
                      fj.field_h = var4_ref_qe.field_k.length;
                      df.field_z.field_g = 0;
                      var5_int = 0;
                      L1: while (true) {
                        if (var5_int >= fj.field_h) {
                          ve.field_m = nf.field_W;
                          nf.field_W = se.field_I;
                          se.field_I = on.field_g;
                          on.field_g = var4_ref_qe.field_g;
                          return true;
                        } else {
                          df.field_z.field_j[var5_int] = var4_ref_qe.field_k[var5_int];
                          var5_int++;
                          continue L1;
                        }
                      }
                    }
                  }
                } else {
                  break L0;
                }
              }
            }
            L2: while (true) {
              L3: {
                if (0 <= so.field_d) {
                  break L3;
                } else {
                  df.field_z.field_g = 0;
                  if (pe.a((byte) -86, 1)) {
                    so.field_d = df.field_z.g((byte) 62);
                    df.field_z.field_g = 0;
                    fj.field_h = param1[so.field_d];
                    break L3;
                  } else {
                    return false;
                  }
                }
              }
              if (pn.b(-12564)) {
                if (ob.field_ab != 0) {
                  L4: {
                    var4 = ob.field_ab;
                    if (0.0 == hb.field_Cb) {
                      break L4;
                    } else {
                      var4 = (int)((double)var4 + ag.field_D.nextGaussian() * hb.field_Cb);
                      if (-1 < (var4 ^ -1)) {
                        var4 = 0;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var5 = new qe(var2 + (long)var4, so.field_d, new byte[fj.field_h]);
                  var6 = 0;
                  L5: while (true) {
                    if (fj.field_h <= var6) {
                      uf.field_a.b((pg) (Object) var5, -1);
                      so.field_d = -1;
                      continue L2;
                    } else {
                      var5.field_k[var6] = df.field_z.field_j[var6];
                      var6++;
                      continue L5;
                    }
                  }
                } else {
                  ve.field_m = nf.field_W;
                  nf.field_W = se.field_I;
                  se.field_I = on.field_g;
                  on.field_g = so.field_d;
                  so.field_d = -1;
                  return true;
                }
              } else {
                return false;
              }
            }
          } else {
            return false;
          }
        }
    }

    final boolean a(byte param0) {
        int var2 = 0;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          L1: {
            var2 = -128 % ((param0 - 17) / 52);
            if (this == (Object) (Object) co.field_h) {
              break L1;
            } else {
              if (this == (Object) (Object) bb.field_c) {
                break L1;
              } else {
                if (this != (Object) (Object) qc.field_c) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          stackOut_4_0 = 1;
          stackIn_6_0 = stackOut_4_0;
          break L0;
        }
        return stackIn_6_0 != 0;
    }

    final static void a(int param0) {
        if (!(qe.field_p)) {
            throw new IllegalStateException();
        }
        if (param0 != 3020) {
            field_a = null;
        }
        lh.field_n = true;
        tj.a(false, (byte) -106);
        fj.field_j = 0;
    }

    final static int a(int param0, int param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_40_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        var4 = param1 >> -1102712353;
        param1 = param1 - -var4 ^ var4;
        if (!param2) {
          L0: {
            var4 = param0 >> 241898175;
            param0 = param0 + var4 ^ var4;
            if (param0 <= param1) {
              break L0;
            } else {
              var4 = param1;
              param1 = param0;
              param0 = var4;
              break L0;
            }
          }
          L1: {
            var3 = 0;
            if (param1 < 32768) {
              break L1;
            } else {
              L2: {
                if (1073741824 <= param1) {
                  var3 += 16;
                  param1 = param1 >> 16;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (-4194305 >= param1) {
                  param1 = param1 >> 8;
                  var3 += 8;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (-262145 > param1) {
                  break L4;
                } else {
                  param1 = param1 >> 4;
                  var3 += 4;
                  break L4;
                }
              }
              L5: {
                if (param1 >= 65536) {
                  var3 += 2;
                  param1 = param1 >> 2;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if ((param1 ^ -1) <= -32769) {
                  param1 = param1 >> 1;
                  var3++;
                  break L6;
                } else {
                  break L6;
                }
              }
              param0 = param0 >> var3;
              break L1;
            }
          }
          if (param1 <= param0 << -1893384027) {
            param1 = param1 * param1 + param0 * param0;
            if (param1 >= 65536) {
              if ((param1 ^ -1) > -16777217) {
                if (-1048577 >= param1) {
                  if ((param1 ^ -1) <= -4194305) {
                    return gj.field_g[param1 >> -1275338928] >> -1109693596;
                  } else {
                    return gj.field_g[param1 >> 1944815982] >> 563869829;
                  }
                } else {
                  if (-262145 > param1) {
                    return gj.field_g[param1 >> 2052215082] >> 1307515687;
                  } else {
                    return gj.field_g[param1 >> 1717579596] >> 1088704902;
                  }
                }
              } else {
                if ((param1 ^ -1) <= -268435457) {
                  if (1073741824 <= param1) {
                    return gj.field_g[param1 >> -1559587176] << var3;
                  } else {
                    L7: {
                      if (var3 >= 1) {
                        stackOut_48_0 = gj.field_g[param1 >> 549846230] << var3 + -1;
                        stackIn_49_0 = stackOut_48_0;
                        break L7;
                      } else {
                        stackOut_47_0 = gj.field_g[param1 >> -579115018] >> -var3 + 1;
                        stackIn_49_0 = stackOut_47_0;
                        break L7;
                      }
                    }
                    return stackIn_49_0;
                  }
                } else {
                  if (param1 > -67108865) {
                    L8: {
                      if (var3 < 3) {
                        stackOut_43_0 = gj.field_g[param1 >> -2119657294] >> 3 - var3;
                        stackIn_44_0 = stackOut_43_0;
                        break L8;
                      } else {
                        stackOut_42_0 = gj.field_g[param1 >> -2121922542] << var3 - 3;
                        stackIn_44_0 = stackOut_42_0;
                        break L8;
                      }
                    }
                    return stackIn_44_0;
                  } else {
                    L9: {
                      if (-3 <= var3) {
                        stackOut_39_0 = gj.field_g[param1 >> -1134007724] << -2 + var3;
                        stackIn_40_0 = stackOut_39_0;
                        break L9;
                      } else {
                        stackOut_38_0 = gj.field_g[param1 >> 291504116] >> -var3 + 2;
                        stackIn_40_0 = stackOut_38_0;
                        break L9;
                      }
                    }
                    return stackIn_40_0;
                  }
                }
              }
            } else {
              if (256 > param1) {
                if (0 > param1) {
                  return -1;
                } else {
                  return gj.field_g[param1] >> -902353972;
                }
              } else {
                if ((param1 ^ -1) <= -4097) {
                  if (16384 <= param1) {
                    return gj.field_g[param1 >> -593633432] >> 627695208;
                  } else {
                    return gj.field_g[param1 >> 2143142662] >> 52046441;
                  }
                } else {
                  if ((param1 ^ -1) > -1025) {
                    return gj.field_g[param1 >> 1920063330] >> 454719115;
                  } else {
                    return gj.field_g[param1 >> 349370916] >> 1910767434;
                  }
                }
              }
            }
          } else {
            return param1 << var3;
          }
        } else {
          return -23;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Always fire at medium power; just point and click.";
        field_a = "Show chat (1 unread message)";
    }
}
