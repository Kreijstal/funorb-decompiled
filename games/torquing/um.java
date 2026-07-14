/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class um extends gf {
    static vn field_m;
    static int field_r;
    static int field_p;
    static int field_o;
    static String field_q;
    static int field_l;
    private tk field_n;

    um(tk param0, tk param1) {
        super(param0);
        ((um) this).field_n = param1;
    }

    final cd a(int param0, String param1) {
        sk var3 = null;
        cd stackIn_5_0 = null;
        cd stackIn_13_0 = null;
        cd stackIn_22_0 = null;
        cd stackOut_21_0 = null;
        cd stackOut_20_0 = null;
        cd stackOut_12_0 = null;
        cd stackOut_11_0 = null;
        cd stackOut_4_0 = null;
        cd stackOut_3_0 = null;
        if (((um) this).field_n instanceof wg) {
          var3 = ((wg) (Object) ((um) this).field_n).a(-10116);
          if (var3 != null) {
            if (var3.a((byte) -95) == so.field_s) {
              if (param0 < 62) {
                return null;
              } else {
                L0: {
                  if (!param1.equals((Object) (Object) ((um) this).field_n.field_m)) {
                    stackOut_21_0 = so.field_u;
                    stackIn_22_0 = stackOut_21_0;
                    break L0;
                  } else {
                    stackOut_20_0 = so.field_s;
                    stackIn_22_0 = stackOut_20_0;
                    break L0;
                  }
                }
                return stackIn_22_0;
              }
            } else {
              return so.field_u;
            }
          } else {
            if (param0 < 62) {
              return null;
            } else {
              L1: {
                if (!param1.equals((Object) (Object) ((um) this).field_n.field_m)) {
                  stackOut_12_0 = so.field_u;
                  stackIn_13_0 = stackOut_12_0;
                  break L1;
                } else {
                  stackOut_11_0 = so.field_s;
                  stackIn_13_0 = stackOut_11_0;
                  break L1;
                }
              }
              return stackIn_13_0;
            }
          }
        } else {
          if (param0 < 62) {
            return null;
          } else {
            L2: {
              if (!param1.equals((Object) (Object) ((um) this).field_n.field_m)) {
                stackOut_4_0 = so.field_u;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = so.field_s;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    final String a(byte param0, String param1) {
        sk var3 = null;
        sk var4 = null;
        sk var5 = null;
        if (param0 == -121) {
          if (((um) this).field_n instanceof wg) {
            var5 = ((wg) (Object) ((um) this).field_n).a(param0 ^ 10235);
            if (var5 != null) {
              if (var5.a((byte) -91) == so.field_s) {
                if (!param1.equals((Object) (Object) ((um) this).field_n.field_m)) {
                  return hm.field_u;
                } else {
                  return var5.a(param0 ^ -8);
                }
              } else {
                return var5.a(param0 ^ -8);
              }
            } else {
              if (!param1.equals((Object) (Object) ((um) this).field_n.field_m)) {
                return hm.field_u;
              } else {
                return null;
              }
            }
          } else {
            if (!param1.equals((Object) (Object) ((um) this).field_n.field_m)) {
              return hm.field_u;
            } else {
              return null;
            }
          }
        } else {
          field_m = null;
          if (((um) this).field_n instanceof wg) {
            var4 = ((wg) (Object) ((um) this).field_n).a(param0 ^ 10235);
            var3 = var4;
            if (var4 != null) {
              if (var4.a((byte) -91) == so.field_s) {
                if (param1.equals((Object) (Object) ((um) this).field_n.field_m)) {
                  return var4.a(param0 ^ -8);
                } else {
                  return hm.field_u;
                }
              } else {
                return var4.a(param0 ^ -8);
              }
            } else {
              if (!param1.equals((Object) (Object) ((um) this).field_n.field_m)) {
                return hm.field_u;
              } else {
                return null;
              }
            }
          } else {
            if (!param1.equals((Object) (Object) ((um) this).field_n.field_m)) {
              return hm.field_u;
            } else {
              return null;
            }
          }
        }
    }

    final static void a(uc param0, int param1, uc param2, int param3) {
        if (param3 < 13) {
          um.c((byte) 48);
          sp.field_Q = param2;
          bo.field_e = param0;
          ka.field_j = param1;
          cl.a(-67, ph.field_j / 2, ph.field_d / 2);
          nb.a(param2.field_s, -108, param0.field_s, param0.field_t + param0.field_s, param2.field_t + param2.field_s);
          return;
        } else {
          sp.field_Q = param2;
          bo.field_e = param0;
          ka.field_j = param1;
          cl.a(-67, ph.field_j / 2, ph.field_d / 2);
          nb.a(param2.field_s, -108, param0.field_s, param0.field_t + param0.field_s, param2.field_t + param2.field_s);
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Torquing.field_u;
        if (!param5) {
          var6 = -param0 + param3;
          var7 = param4 + -param2;
          if (var6 != 0) {
            if (var7 == 0) {
              ef.a(param3, param1, param2, param0, 115);
              return;
            } else {
              var12 = (var7 << 1702573676) / var6;
              var13 = -(var12 * param0 >> 1706380492) + param2;
              if (param3 >= kn.field_e) {
                if (qg.field_z >= param3) {
                  var9 = param3;
                  var11 = param4;
                  if (kn.field_e <= param0) {
                    if (qg.field_z < param0) {
                      var10 = var13 - -(qg.field_z * var12 >> 87934732);
                      var8 = qg.field_z;
                      if (j.field_q <= var11) {
                        if (var11 > qk.field_p) {
                          var9 = (qk.field_p - var13 << -1618692852) / var12;
                          var11 = qk.field_p;
                          if (var10 >= j.field_q) {
                            if (qk.field_p < var10) {
                              var8 = (-var13 + qk.field_p << 1313944588) / var12;
                              var10 = qk.field_p;
                              oh.a(var8, var10, var11, (byte) -128, var9, param1);
                              return;
                            } else {
                              oh.a(var8, var10, var11, (byte) -128, var9, param1);
                              return;
                            }
                          } else {
                            var8 = (j.field_q + -var13 << -175871284) / var12;
                            var10 = j.field_q;
                            oh.a(var8, var10, var11, (byte) -128, var9, param1);
                            return;
                          }
                        } else {
                          if (var10 >= j.field_q) {
                            if (qk.field_p < var10) {
                              var8 = (-var13 + qk.field_p << 1313944588) / var12;
                              var10 = qk.field_p;
                              oh.a(var8, var10, var11, (byte) -128, var9, param1);
                              return;
                            } else {
                              oh.a(var8, var10, var11, (byte) -128, var9, param1);
                              return;
                            }
                          } else {
                            var8 = (j.field_q + -var13 << -175871284) / var12;
                            var10 = j.field_q;
                            oh.a(var8, var10, var11, (byte) -128, var9, param1);
                            return;
                          }
                        }
                      } else {
                        var11 = j.field_q;
                        var9 = (j.field_q - var13 << 2039829740) / var12;
                        if (var10 >= j.field_q) {
                          if (qk.field_p < var10) {
                            var8 = (-var13 + qk.field_p << 1313944588) / var12;
                            var10 = qk.field_p;
                            oh.a(var8, var10, var11, (byte) -128, var9, param1);
                            return;
                          } else {
                            oh.a(var8, var10, var11, (byte) -128, var9, param1);
                            return;
                          }
                        } else {
                          var8 = (j.field_q + -var13 << -175871284) / var12;
                          var10 = j.field_q;
                          oh.a(var8, var10, var11, (byte) -128, var9, param1);
                          return;
                        }
                      }
                    } else {
                      var8 = param0;
                      var10 = param2;
                      if (j.field_q <= var11) {
                        if (var11 > qk.field_p) {
                          var9 = (qk.field_p - var13 << -1618692852) / var12;
                          var11 = qk.field_p;
                          if (var10 >= j.field_q) {
                            if (qk.field_p < var10) {
                              var8 = (-var13 + qk.field_p << 1313944588) / var12;
                              var10 = qk.field_p;
                              oh.a(var8, var10, var11, (byte) -128, var9, param1);
                              return;
                            } else {
                              oh.a(var8, var10, var11, (byte) -128, var9, param1);
                              return;
                            }
                          } else {
                            var8 = (j.field_q + -var13 << -175871284) / var12;
                            var10 = j.field_q;
                            oh.a(var8, var10, var11, (byte) -128, var9, param1);
                            return;
                          }
                        } else {
                          if (var10 >= j.field_q) {
                            if (qk.field_p < var10) {
                              var8 = (-var13 + qk.field_p << 1313944588) / var12;
                              var10 = qk.field_p;
                              oh.a(var8, var10, var11, (byte) -128, var9, param1);
                              return;
                            } else {
                              oh.a(var8, var10, var11, (byte) -128, var9, param1);
                              return;
                            }
                          } else {
                            var8 = (j.field_q + -var13 << -175871284) / var12;
                            var10 = j.field_q;
                            oh.a(var8, var10, var11, (byte) -128, var9, param1);
                            return;
                          }
                        }
                      } else {
                        var11 = j.field_q;
                        var9 = (j.field_q - var13 << 2039829740) / var12;
                        if (var10 >= j.field_q) {
                          if (qk.field_p < var10) {
                            var8 = (-var13 + qk.field_p << 1313944588) / var12;
                            var10 = qk.field_p;
                            oh.a(var8, var10, var11, (byte) -128, var9, param1);
                            return;
                          } else {
                            oh.a(var8, var10, var11, (byte) -128, var9, param1);
                            return;
                          }
                        } else {
                          var8 = (j.field_q + -var13 << -175871284) / var12;
                          var10 = j.field_q;
                          oh.a(var8, var10, var11, (byte) -128, var9, param1);
                          return;
                        }
                      }
                    }
                  } else {
                    var10 = var13 + (var12 * kn.field_e >> -2077032756);
                    var8 = kn.field_e;
                    if (j.field_q <= var11) {
                      if (var11 > qk.field_p) {
                        var9 = (qk.field_p - var13 << -1618692852) / var12;
                        var11 = qk.field_p;
                        if (var10 >= j.field_q) {
                          if (qk.field_p < var10) {
                            var8 = (-var13 + qk.field_p << 1313944588) / var12;
                            var10 = qk.field_p;
                            oh.a(var8, var10, var11, (byte) -128, var9, param1);
                            return;
                          } else {
                            oh.a(var8, var10, var11, (byte) -128, var9, param1);
                            return;
                          }
                        } else {
                          var8 = (j.field_q + -var13 << -175871284) / var12;
                          var10 = j.field_q;
                          oh.a(var8, var10, var11, (byte) -128, var9, param1);
                          return;
                        }
                      } else {
                        if (var10 >= j.field_q) {
                          if (qk.field_p < var10) {
                            var8 = (-var13 + qk.field_p << 1313944588) / var12;
                            var10 = qk.field_p;
                            oh.a(var8, var10, var11, (byte) -128, var9, param1);
                            return;
                          } else {
                            oh.a(var8, var10, var11, (byte) -128, var9, param1);
                            return;
                          }
                        } else {
                          var8 = (j.field_q + -var13 << -175871284) / var12;
                          var10 = j.field_q;
                          oh.a(var8, var10, var11, (byte) -128, var9, param1);
                          return;
                        }
                      }
                    } else {
                      var11 = j.field_q;
                      var9 = (j.field_q - var13 << 2039829740) / var12;
                      if (var10 >= j.field_q) {
                        if (qk.field_p < var10) {
                          var8 = (-var13 + qk.field_p << 1313944588) / var12;
                          var10 = qk.field_p;
                          oh.a(var8, var10, var11, (byte) -128, var9, param1);
                          return;
                        } else {
                          oh.a(var8, var10, var11, (byte) -128, var9, param1);
                          return;
                        }
                      } else {
                        var8 = (j.field_q + -var13 << -175871284) / var12;
                        var10 = j.field_q;
                        oh.a(var8, var10, var11, (byte) -128, var9, param1);
                        return;
                      }
                    }
                  }
                } else {
                  L0: {
                    var11 = var13 + (var12 * qg.field_z >> -502389428);
                    var9 = qg.field_z;
                    if (kn.field_e <= param0) {
                      if (qg.field_z < param0) {
                        var10 = var13 - -(qg.field_z * var12 >> 87934732);
                        var8 = qg.field_z;
                        break L0;
                      } else {
                        var8 = param0;
                        var10 = param2;
                        break L0;
                      }
                    } else {
                      var10 = var13 + (var12 * kn.field_e >> -2077032756);
                      var8 = kn.field_e;
                      break L0;
                    }
                  }
                  if (j.field_q <= var11) {
                    if (var11 > qk.field_p) {
                      var9 = (qk.field_p - var13 << -1618692852) / var12;
                      var11 = qk.field_p;
                      if (var10 >= j.field_q) {
                        if (qk.field_p < var10) {
                          var8 = (-var13 + qk.field_p << 1313944588) / var12;
                          var10 = qk.field_p;
                          oh.a(var8, var10, var11, (byte) -128, var9, param1);
                          return;
                        } else {
                          oh.a(var8, var10, var11, (byte) -128, var9, param1);
                          return;
                        }
                      } else {
                        var8 = (j.field_q + -var13 << -175871284) / var12;
                        var10 = j.field_q;
                        oh.a(var8, var10, var11, (byte) -128, var9, param1);
                        return;
                      }
                    } else {
                      if (var10 >= j.field_q) {
                        if (qk.field_p < var10) {
                          var8 = (-var13 + qk.field_p << 1313944588) / var12;
                          var10 = qk.field_p;
                          oh.a(var8, var10, var11, (byte) -128, var9, param1);
                          return;
                        } else {
                          oh.a(var8, var10, var11, (byte) -128, var9, param1);
                          return;
                        }
                      } else {
                        var8 = (j.field_q + -var13 << -175871284) / var12;
                        var10 = j.field_q;
                        oh.a(var8, var10, var11, (byte) -128, var9, param1);
                        return;
                      }
                    }
                  } else {
                    var11 = j.field_q;
                    var9 = (j.field_q - var13 << 2039829740) / var12;
                    if (var10 >= j.field_q) {
                      if (qk.field_p < var10) {
                        var8 = (-var13 + qk.field_p << 1313944588) / var12;
                        var10 = qk.field_p;
                        oh.a(var8, var10, var11, (byte) -128, var9, param1);
                        return;
                      } else {
                        oh.a(var8, var10, var11, (byte) -128, var9, param1);
                        return;
                      }
                    } else {
                      var8 = (j.field_q + -var13 << -175871284) / var12;
                      var10 = j.field_q;
                      oh.a(var8, var10, var11, (byte) -128, var9, param1);
                      return;
                    }
                  }
                }
              } else {
                L1: {
                  var11 = (var12 * kn.field_e >> 514581068) + var13;
                  var9 = kn.field_e;
                  if (kn.field_e <= param0) {
                    if (qg.field_z < param0) {
                      var10 = var13 - -(qg.field_z * var12 >> 87934732);
                      var8 = qg.field_z;
                      break L1;
                    } else {
                      var8 = param0;
                      var10 = param2;
                      break L1;
                    }
                  } else {
                    var10 = var13 + (var12 * kn.field_e >> -2077032756);
                    var8 = kn.field_e;
                    break L1;
                  }
                }
                L2: {
                  if (j.field_q <= var11) {
                    if (var11 > qk.field_p) {
                      var9 = (qk.field_p - var13 << -1618692852) / var12;
                      var11 = qk.field_p;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    var11 = j.field_q;
                    var9 = (j.field_q - var13 << 2039829740) / var12;
                    break L2;
                  }
                }
                if (var10 >= j.field_q) {
                  if (qk.field_p < var10) {
                    var8 = (-var13 + qk.field_p << 1313944588) / var12;
                    var10 = qk.field_p;
                    oh.a(var8, var10, var11, (byte) -128, var9, param1);
                    return;
                  } else {
                    oh.a(var8, var10, var11, (byte) -128, var9, param1);
                    return;
                  }
                } else {
                  var8 = (j.field_q + -var13 << -175871284) / var12;
                  var10 = j.field_q;
                  oh.a(var8, var10, var11, (byte) -128, var9, param1);
                  return;
                }
              }
            }
          } else {
            L3: {
              if (0 == var7) {
                break L3;
              } else {
                we.a(param0, param4, param1, -2686, param2);
                break L3;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    public static void c(byte param0) {
        field_q = null;
        if (param0 >= -66) {
            return;
        }
        field_m = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = 50;
        field_q = "Create your own free Jagex account";
    }
}
