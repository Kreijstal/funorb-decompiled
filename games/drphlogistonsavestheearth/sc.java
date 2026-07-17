/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc {
    static sa field_d;
    static rf field_f;
    static String[] field_b;
    static oi field_e;
    static he[] field_a;
    static nh field_c;

    final synchronized static byte[] a(int param0, int param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        if (100 != param1) {
          if (param1 != 5000) {
            L0: {
              if (30000 != param1) {
                break L0;
              } else {
                if (uh.field_m <= 0) {
                  break L0;
                } else {
                  int fieldTemp$103 = uh.field_m - 1;
                  uh.field_m = uh.field_m - 1;
                  var2_ref_byte__ = sj.field_c[fieldTemp$103];
                  sj.field_c[uh.field_m] = null;
                  return var2_ref_byte__;
                }
              }
            }
            if (param0 == -16705) {
              L1: {
                if (null == gi.field_a) {
                  break L1;
                } else {
                  var2 = 0;
                  L2: while (true) {
                    if (~mf.field_E.length >= ~var2) {
                      break L1;
                    } else {
                      L3: {
                        if (param1 != mf.field_E[var2]) {
                          var2++;
                          break L3;
                        } else {
                          if (eb.field_b[var2] <= 0) {
                            break L3;
                          } else {
                            eb.field_b[var2] = eb.field_b[var2] - 1;
                            var3 = gi.field_a[var2][eb.field_b[var2] - 1];
                            gi.field_a[var2][eb.field_b[var2]] = null;
                            return var3;
                          }
                        }
                      }
                      var2++;
                      continue L2;
                    }
                  }
                }
              }
              return new byte[param1];
            } else {
              L4: {
                field_b = null;
                if (null == gi.field_a) {
                  break L4;
                } else {
                  var2 = 0;
                  L5: while (true) {
                    if (~mf.field_E.length >= ~var2) {
                      break L4;
                    } else {
                      L6: {
                        if (param1 != mf.field_E[var2]) {
                          var2++;
                          break L6;
                        } else {
                          if (eb.field_b[var2] <= 0) {
                            break L6;
                          } else {
                            eb.field_b[var2] = eb.field_b[var2] - 1;
                            var3 = gi.field_a[var2][eb.field_b[var2] - 1];
                            gi.field_a[var2][eb.field_b[var2]] = null;
                            return var3;
                          }
                        }
                      }
                      var2++;
                      continue L5;
                    }
                  }
                }
              }
              return new byte[param1];
            }
          } else {
            if (pk.field_s > 0) {
              int fieldTemp$104 = pk.field_s - 1;
              pk.field_s = pk.field_s - 1;
              var2_ref_byte__ = eb.field_f[fieldTemp$104];
              eb.field_f[pk.field_s] = null;
              return var2_ref_byte__;
            } else {
              if (30000 == param1) {
                if (uh.field_m > 0) {
                  int fieldTemp$105 = uh.field_m - 1;
                  uh.field_m = uh.field_m - 1;
                  var2_ref_byte__ = sj.field_c[fieldTemp$105];
                  sj.field_c[uh.field_m] = null;
                  return var2_ref_byte__;
                } else {
                  if (param0 == -16705) {
                    L7: {
                      if (null == gi.field_a) {
                        break L7;
                      } else {
                        var2 = 0;
                        L8: while (true) {
                          if (~mf.field_E.length >= ~var2) {
                            break L7;
                          } else {
                            L9: {
                              if (param1 != mf.field_E[var2]) {
                                var2++;
                                break L9;
                              } else {
                                if (eb.field_b[var2] <= 0) {
                                  break L9;
                                } else {
                                  eb.field_b[var2] = eb.field_b[var2] - 1;
                                  var3 = gi.field_a[var2][eb.field_b[var2] - 1];
                                  gi.field_a[var2][eb.field_b[var2]] = null;
                                  return var3;
                                }
                              }
                            }
                            var2++;
                            continue L8;
                          }
                        }
                      }
                    }
                    return new byte[param1];
                  } else {
                    L10: {
                      field_b = null;
                      if (null == gi.field_a) {
                        break L10;
                      } else {
                        var2 = 0;
                        L11: while (true) {
                          if (~mf.field_E.length >= ~var2) {
                            break L10;
                          } else {
                            L12: {
                              if (param1 != mf.field_E[var2]) {
                                var2++;
                                break L12;
                              } else {
                                if (eb.field_b[var2] <= 0) {
                                  break L12;
                                } else {
                                  eb.field_b[var2] = eb.field_b[var2] - 1;
                                  var3 = gi.field_a[var2][eb.field_b[var2] - 1];
                                  gi.field_a[var2][eb.field_b[var2]] = null;
                                  return var3;
                                }
                              }
                            }
                            var2++;
                            continue L11;
                          }
                        }
                      }
                    }
                    return new byte[param1];
                  }
                }
              } else {
                if (param0 == -16705) {
                  L13: {
                    if (null == gi.field_a) {
                      break L13;
                    } else {
                      var2 = 0;
                      L14: while (true) {
                        if (~mf.field_E.length >= ~var2) {
                          break L13;
                        } else {
                          L15: {
                            if (param1 != mf.field_E[var2]) {
                              var2++;
                              break L15;
                            } else {
                              if (eb.field_b[var2] <= 0) {
                                break L15;
                              } else {
                                eb.field_b[var2] = eb.field_b[var2] - 1;
                                var3 = gi.field_a[var2][eb.field_b[var2] - 1];
                                gi.field_a[var2][eb.field_b[var2]] = null;
                                return var3;
                              }
                            }
                          }
                          var2++;
                          continue L14;
                        }
                      }
                    }
                  }
                  return new byte[param1];
                } else {
                  L16: {
                    field_b = null;
                    if (null == gi.field_a) {
                      break L16;
                    } else {
                      var2 = 0;
                      L17: while (true) {
                        if (~mf.field_E.length >= ~var2) {
                          break L16;
                        } else {
                          L18: {
                            if (param1 != mf.field_E[var2]) {
                              var2++;
                              break L18;
                            } else {
                              if (eb.field_b[var2] <= 0) {
                                break L18;
                              } else {
                                eb.field_b[var2] = eb.field_b[var2] - 1;
                                var3 = gi.field_a[var2][eb.field_b[var2] - 1];
                                gi.field_a[var2][eb.field_b[var2]] = null;
                                return var3;
                              }
                            }
                          }
                          var2++;
                          continue L17;
                        }
                      }
                    }
                  }
                  return new byte[param1];
                }
              }
            }
          }
        } else {
          if (0 < uf.field_k) {
            int fieldTemp$106 = uf.field_k - 1;
            uf.field_k = uf.field_k - 1;
            var2_ref_byte__ = vc.field_f[fieldTemp$106];
            vc.field_f[uf.field_k] = null;
            return var2_ref_byte__;
          } else {
            if (param1 == 5000) {
              if (pk.field_s > 0) {
                int fieldTemp$107 = pk.field_s - 1;
                pk.field_s = pk.field_s - 1;
                var2_ref_byte__ = eb.field_f[fieldTemp$107];
                eb.field_f[pk.field_s] = null;
                return var2_ref_byte__;
              } else {
                if (30000 == param1) {
                  if (uh.field_m <= 0) {
                    if (param0 == -16705) {
                      if (null != gi.field_a) {
                        var2 = 0;
                        L19: while (true) {
                          if (~mf.field_E.length < ~var2) {
                            L20: {
                              if (param1 != mf.field_E[var2]) {
                                var2++;
                                break L20;
                              } else {
                                if (eb.field_b[var2] <= 0) {
                                  break L20;
                                } else {
                                  eb.field_b[var2] = eb.field_b[var2] - 1;
                                  var3 = gi.field_a[var2][eb.field_b[var2] - 1];
                                  gi.field_a[var2][eb.field_b[var2]] = null;
                                  return var3;
                                }
                              }
                            }
                            var2++;
                            continue L19;
                          } else {
                            return new byte[param1];
                          }
                        }
                      } else {
                        return new byte[param1];
                      }
                    } else {
                      L21: {
                        field_b = null;
                        if (null == gi.field_a) {
                          break L21;
                        } else {
                          var2 = 0;
                          L22: while (true) {
                            if (~mf.field_E.length >= ~var2) {
                              break L21;
                            } else {
                              L23: {
                                if (param1 != mf.field_E[var2]) {
                                  var2++;
                                  break L23;
                                } else {
                                  if (eb.field_b[var2] <= 0) {
                                    break L23;
                                  } else {
                                    eb.field_b[var2] = eb.field_b[var2] - 1;
                                    var3 = gi.field_a[var2][eb.field_b[var2] - 1];
                                    gi.field_a[var2][eb.field_b[var2]] = null;
                                    return var3;
                                  }
                                }
                              }
                              var2++;
                              continue L22;
                            }
                          }
                        }
                      }
                      return new byte[param1];
                    }
                  } else {
                    int fieldTemp$108 = uh.field_m - 1;
                    uh.field_m = uh.field_m - 1;
                    var2_ref_byte__ = sj.field_c[fieldTemp$108];
                    sj.field_c[uh.field_m] = null;
                    return var2_ref_byte__;
                  }
                } else {
                  L24: {
                    if (param0 == -16705) {
                      break L24;
                    } else {
                      field_b = null;
                      break L24;
                    }
                  }
                  L25: {
                    if (null == gi.field_a) {
                      break L25;
                    } else {
                      var2 = 0;
                      L26: while (true) {
                        if (~mf.field_E.length >= ~var2) {
                          break L25;
                        } else {
                          L27: {
                            if (param1 != mf.field_E[var2]) {
                              var2++;
                              break L27;
                            } else {
                              if (eb.field_b[var2] <= 0) {
                                break L27;
                              } else {
                                eb.field_b[var2] = eb.field_b[var2] - 1;
                                var3 = gi.field_a[var2][eb.field_b[var2] - 1];
                                gi.field_a[var2][eb.field_b[var2]] = null;
                                return var3;
                              }
                            }
                          }
                          var2++;
                          continue L26;
                        }
                      }
                    }
                  }
                  return new byte[param1];
                }
              }
            } else {
              L28: {
                if (30000 != param1) {
                  break L28;
                } else {
                  if (uh.field_m <= 0) {
                    break L28;
                  } else {
                    int fieldTemp$109 = uh.field_m - 1;
                    uh.field_m = uh.field_m - 1;
                    var2_ref_byte__ = sj.field_c[fieldTemp$109];
                    sj.field_c[uh.field_m] = null;
                    return var2_ref_byte__;
                  }
                }
              }
              L29: {
                if (param0 == -16705) {
                  break L29;
                } else {
                  field_b = null;
                  break L29;
                }
              }
              L30: {
                if (null == gi.field_a) {
                  break L30;
                } else {
                  var2 = 0;
                  if (~mf.field_E.length >= ~var2) {
                    break L30;
                  } else {
                    L31: {
                      if (param1 != mf.field_E[var2]) {
                        var2++;
                        break L31;
                      } else {
                        if (eb.field_b[var2] <= 0) {
                          var2++;
                          break L31;
                        } else {
                          eb.field_b[var2] = eb.field_b[var2] - 1;
                          var3 = gi.field_a[var2][eb.field_b[var2] - 1];
                          gi.field_a[var2][eb.field_b[var2]] = null;
                          return var3;
                        }
                      }
                    }
                    var2++;
                    var2++;
                    var2++;
                    break L30;
                  }
                }
              }
              return new byte[param1];
            }
          }
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        field_f = null;
        field_b = null;
        field_a = null;
        field_e = null;
    }

    final static void a(int param0, boolean param1, ok param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == null) {
                break L1;
              } else {
                if (param2 != hj.field_g) {
                  L2: {
                    s.field_a.a((byte) -114);
                    el.field_sb.g();
                    hj.field_g = param2;
                    s.field_a.a(hj.field_g, param1, (byte) 120);
                    if (param0 == -1) {
                      break L2;
                    } else {
                      byte[] discarded$2 = sc.a(-73, -118);
                      break L2;
                    }
                  }
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) runtimeException;
            stackOut_6_1 = new StringBuilder().append("sc.C(").append(param0).append(44).append(param1).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new sa(11, 0, 1, 2);
        field_b = new String[]{"Victorus Morti", "Victorus Legioni", "Victorus Goliath", "Victorus Campus", "Pacifist Award", "Untouchable Award", "Safety Award", "Collector Award", "Anti-collector Award", "Total Destruction Award", "Earth Defender Award", "Star Defender Award", "Ultimate Defender Award", "Friend of Earth", "Victorus Ultima"};
    }
}
