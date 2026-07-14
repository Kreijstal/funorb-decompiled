/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb {
    static sd[] field_b;
    static String field_e;
    static eg field_a;
    static am field_c;
    static String field_f;
    static boolean field_h;
    static String field_d;
    static qb[] field_g;
    static String[] field_i;

    final static boolean a(String param0, String param1, int param2, ln param3, int param4, String param5, boolean param6) {
        Object var8 = null;
        ie var10 = null;
        ie var11 = null;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (uj.field_h == in.field_Gb) {
          if (param4 == -30001) {
            var11 = new ie(p.field_b, param3);
            p.field_b.b((qm) (Object) var11, 15637);
            if (!jk.b(63)) {
              L0: {
                ln.field_Q = param1;
                i.field_i = null;
                qm.field_u = param2;
                in.field_Gb = sk.field_a;
                on.field_d = param5;
                if (!param6) {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                } else {
                  stackOut_13_0 = 1;
                  stackIn_15_0 = stackOut_13_0;
                  break L0;
                }
              }
              bj.field_mb = stackIn_15_0 != 0;
              kf.field_a = param0;
              return true;
            } else {
              var11.l(248);
              return true;
            }
          } else {
            var8 = null;
            boolean discarded$1 = bb.a((String) null, (String) null, 89, (ln) null, 120, (String) null, false);
            var10 = new ie(p.field_b, param3);
            p.field_b.b((qm) (Object) var10, 15637);
            if (!jk.b(63)) {
              L1: {
                ln.field_Q = param1;
                i.field_i = null;
                qm.field_u = param2;
                in.field_Gb = sk.field_a;
                on.field_d = param5;
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
              bj.field_mb = stackIn_8_0 != 0;
              kf.field_a = param0;
              return true;
            } else {
              var10.l(248);
              return true;
            }
          }
        } else {
          return false;
        }
    }

    final synchronized static byte[] a(int param0, int param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        if (-101 == (param0 ^ -1)) {
          if (we.field_b <= 0) {
            if (param1 >= 41) {
              if (param0 != 5000) {
                L0: {
                  if (-30001 != (param0 ^ -1)) {
                    break L0;
                  } else {
                    if (0 >= sn.field_K) {
                      break L0;
                    } else {
                      sn.field_K = sn.field_K - 1;
                      var2_ref_byte__ = jh.field_b[sn.field_K - 1];
                      jh.field_b[sn.field_K] = null;
                      return var2_ref_byte__;
                    }
                  }
                }
                L1: {
                  if (null == vm.field_a) {
                    break L1;
                  } else {
                    var2 = 0;
                    L2: while (true) {
                      if (di.field_l.length <= var2) {
                        break L1;
                      } else {
                        if (di.field_l[var2] != param0) {
                          var2++;
                          var2++;
                          continue L2;
                        } else {
                          if (-1 > (tf.field_g[var2] ^ -1)) {
                            tf.field_g[var2] = tf.field_g[var2] - 1;
                            var3 = vm.field_a[var2][tf.field_g[var2] - 1];
                            vm.field_a[var2][tf.field_g[var2]] = null;
                            return var3;
                          } else {
                            var2++;
                            continue L2;
                          }
                        }
                      }
                    }
                  }
                }
                return new byte[param0];
              } else {
                if (kc.field_D < -1) {
                  kc.field_D = kc.field_D - 1;
                  var2_ref_byte__ = sn.field_F[kc.field_D - 1];
                  sn.field_F[kc.field_D] = null;
                  return var2_ref_byte__;
                } else {
                  if (-30001 == param0) {
                    if (0 < sn.field_K) {
                      sn.field_K = sn.field_K - 1;
                      var2_ref_byte__ = jh.field_b[sn.field_K - 1];
                      jh.field_b[sn.field_K] = null;
                      return var2_ref_byte__;
                    } else {
                      L3: {
                        if (null == vm.field_a) {
                          break L3;
                        } else {
                          var2 = 0;
                          L4: while (true) {
                            if (di.field_l.length <= var2) {
                              break L3;
                            } else {
                              if (di.field_l[var2] != param0) {
                                var2++;
                                var2++;
                                continue L4;
                              } else {
                                if (-1 > (tf.field_g[var2] ^ -1)) {
                                  tf.field_g[var2] = tf.field_g[var2] - 1;
                                  var3 = vm.field_a[var2][tf.field_g[var2] - 1];
                                  vm.field_a[var2][tf.field_g[var2]] = null;
                                  return var3;
                                } else {
                                  var2++;
                                  continue L4;
                                }
                              }
                            }
                          }
                        }
                      }
                      return new byte[param0];
                    }
                  } else {
                    L5: {
                      if (null == vm.field_a) {
                        break L5;
                      } else {
                        var2 = 0;
                        L6: while (true) {
                          if (di.field_l.length <= var2) {
                            break L5;
                          } else {
                            if (di.field_l[var2] != param0) {
                              var2++;
                              var2++;
                              continue L6;
                            } else {
                              if (-1 > (tf.field_g[var2] ^ -1)) {
                                tf.field_g[var2] = tf.field_g[var2] - 1;
                                var3 = vm.field_a[var2][tf.field_g[var2] - 1];
                                vm.field_a[var2][tf.field_g[var2]] = null;
                                return var3;
                              } else {
                                var2++;
                                continue L6;
                              }
                            }
                          }
                        }
                      }
                    }
                    return new byte[param0];
                  }
                }
              }
            } else {
              L7: {
                bb.c((byte) -67);
                if (param0 != 5000) {
                  break L7;
                } else {
                  if ((kc.field_D ^ -1) < -1) {
                    kc.field_D = kc.field_D - 1;
                    var2_ref_byte__ = sn.field_F[kc.field_D - 1];
                    sn.field_F[kc.field_D] = null;
                    return var2_ref_byte__;
                  } else {
                    break L7;
                  }
                }
              }
              L8: {
                if (-30001 != (param0 ^ -1)) {
                  break L8;
                } else {
                  if (0 >= sn.field_K) {
                    break L8;
                  } else {
                    sn.field_K = sn.field_K - 1;
                    var2_ref_byte__ = jh.field_b[sn.field_K - 1];
                    jh.field_b[sn.field_K] = null;
                    return var2_ref_byte__;
                  }
                }
              }
              if (null != vm.field_a) {
                var2 = 0;
                L9: while (true) {
                  if (di.field_l.length > var2) {
                    if (di.field_l[var2] != param0) {
                      var2++;
                      var2++;
                      continue L9;
                    } else {
                      if (-1 > (tf.field_g[var2] ^ -1)) {
                        tf.field_g[var2] = tf.field_g[var2] - 1;
                        var3 = vm.field_a[var2][tf.field_g[var2] - 1];
                        vm.field_a[var2][tf.field_g[var2]] = null;
                        return var3;
                      } else {
                        var2++;
                        continue L9;
                      }
                    }
                  } else {
                    return new byte[param0];
                  }
                }
              } else {
                return new byte[param0];
              }
            }
          } else {
            we.field_b = we.field_b - 1;
            var2_ref_byte__ = cf.field_g[we.field_b - 1];
            cf.field_g[we.field_b] = null;
            return var2_ref_byte__;
          }
        } else {
          if (param1 >= 41) {
            if (param0 != 5000) {
              L10: {
                if (-30001 != (param0 ^ -1)) {
                  break L10;
                } else {
                  if (0 >= sn.field_K) {
                    break L10;
                  } else {
                    sn.field_K = sn.field_K - 1;
                    var2_ref_byte__ = jh.field_b[sn.field_K - 1];
                    jh.field_b[sn.field_K] = null;
                    return var2_ref_byte__;
                  }
                }
              }
              if (null != vm.field_a) {
                var2 = 0;
                if (di.field_l.length > var2) {
                  if (di.field_l[var2] == param0) {
                    if (-1 <= (tf.field_g[var2] ^ -1)) {
                      var2++;
                      var2++;
                      var2++;
                      return new byte[param0];
                    } else {
                      tf.field_g[var2] = tf.field_g[var2] - 1;
                      var3 = vm.field_a[var2][tf.field_g[var2] - 1];
                      vm.field_a[var2][tf.field_g[var2]] = null;
                      return var3;
                    }
                  } else {
                    var2++;
                    var2++;
                    var2++;
                    return new byte[param0];
                  }
                } else {
                  return new byte[param0];
                }
              } else {
                return new byte[param0];
              }
            } else {
              if (kc.field_D >= -1) {
                L11: {
                  if (-30001 != param0) {
                    break L11;
                  } else {
                    if (0 >= sn.field_K) {
                      break L11;
                    } else {
                      sn.field_K = sn.field_K - 1;
                      var2_ref_byte__ = jh.field_b[sn.field_K - 1];
                      jh.field_b[sn.field_K] = null;
                      return var2_ref_byte__;
                    }
                  }
                }
                if (null != vm.field_a) {
                  var2 = 0;
                  if (di.field_l.length > var2) {
                    if (di.field_l[var2] == param0) {
                      if (-1 <= (tf.field_g[var2] ^ -1)) {
                        var2++;
                        var2++;
                        var2++;
                        var2++;
                        return new byte[param0];
                      } else {
                        tf.field_g[var2] = tf.field_g[var2] - 1;
                        var3 = vm.field_a[var2][tf.field_g[var2] - 1];
                        vm.field_a[var2][tf.field_g[var2]] = null;
                        return var3;
                      }
                    } else {
                      var2++;
                      var2++;
                      var2++;
                      var2++;
                      return new byte[param0];
                    }
                  } else {
                    return new byte[param0];
                  }
                } else {
                  return new byte[param0];
                }
              } else {
                kc.field_D = kc.field_D - 1;
                var2_ref_byte__ = sn.field_F[kc.field_D - 1];
                sn.field_F[kc.field_D] = null;
                return var2_ref_byte__;
              }
            }
          } else {
            L12: {
              bb.c((byte) -67);
              if (param0 != 5000) {
                break L12;
              } else {
                if ((kc.field_D ^ -1) < -1) {
                  kc.field_D = kc.field_D - 1;
                  var2_ref_byte__ = sn.field_F[kc.field_D - 1];
                  sn.field_F[kc.field_D] = null;
                  return var2_ref_byte__;
                } else {
                  break L12;
                }
              }
            }
            L13: {
              if (-30001 != (param0 ^ -1)) {
                break L13;
              } else {
                if (0 >= sn.field_K) {
                  break L13;
                } else {
                  sn.field_K = sn.field_K - 1;
                  var2_ref_byte__ = jh.field_b[sn.field_K - 1];
                  jh.field_b[sn.field_K] = null;
                  return var2_ref_byte__;
                }
              }
            }
            if (null != vm.field_a) {
              var2 = 0;
              if (di.field_l.length > var2) {
                if (di.field_l[var2] == param0) {
                  if (-1 > (tf.field_g[var2] ^ -1)) {
                    tf.field_g[var2] = tf.field_g[var2] - 1;
                    var3 = vm.field_a[var2][tf.field_g[var2] - 1];
                    vm.field_a[var2][tf.field_g[var2]] = null;
                    return var3;
                  } else {
                    var2++;
                    var2++;
                    var2++;
                    var2++;
                    return new byte[param0];
                  }
                } else {
                  var2++;
                  var2++;
                  var2++;
                  var2++;
                  return new byte[param0];
                }
              } else {
                return new byte[param0];
              }
            } else {
              return new byte[param0];
            }
          }
        }
    }

    public static void a(byte param0) {
        field_i = null;
        field_b = null;
        field_c = null;
        field_d = null;
        field_e = null;
        field_f = null;
        field_a = null;
        field_g = null;
        if (param0 > -70) {
            bb.c((byte) -8);
        }
    }

    final static void c(byte param0) {
        int var1 = 0;
        if (jf.field_j > -154) {
          if (-11 < ad.field_d) {
            boolean discarded$2 = lc.a((byte) 112);
            he.field_e.b((byte) -76, 68);
            if (param0 >= -116) {
              return;
            } else {
              L0: {
                var1 = 0;
                if (-17 <= var1) {
                  break L0;
                } else {
                  L1: {
                    b.field_f[var1] = var1;
                    if (var1 < 6) {
                      var1++;
                      var1++;
                      break L1;
                    } else {
                      b.field_f[var1] = b.field_f[var1] + 6;
                      var1++;
                      break L1;
                    }
                  }
                  var1++;
                  var1++;
                  var1++;
                  break L0;
                }
              }
              return;
            }
          } else {
            return;
          }
        } else {
          boolean discarded$3 = lc.a((byte) 112);
          he.field_e.b((byte) -76, 68);
          if (param0 >= -116) {
            return;
          } else {
            L2: {
              var1 = 0;
              if (-17 <= var1) {
                break L2;
              } else {
                L3: {
                  b.field_f[var1] = var1;
                  if (var1 < 6) {
                    var1++;
                    var1++;
                    break L3;
                  } else {
                    b.field_f[var1] = b.field_f[var1] + 6;
                    var1++;
                    break L3;
                  }
                }
                var1++;
                var1++;
                var1++;
                break L2;
              }
            }
            return;
          }
        }
    }

    final static String b(byte param0) {
        if ((ih.field_f ^ -1) > -3) {
          return field_e;
        } else {
          if (lh.field_g != null) {
            if (!lh.field_g.c(-10923)) {
              return vn.field_f;
            } else {
              return ld.field_o;
            }
          } else {
            if (!da.field_b.c(-10923)) {
              return sc.field_Z;
            } else {
              if (!da.field_b.a("commonui", -24417)) {
                return gd.field_nb + " - " + da.field_b.b("commonui", 100) + "%";
              } else {
                if (!ea.field_C.c(-10923)) {
                  return wh.field_a;
                } else {
                  if (param0 <= -121) {
                    if (ea.field_C.a("commonui", -24417)) {
                      if (ho.field_g.c(-10923)) {
                        if (!ho.field_g.a(123)) {
                          return mm.field_t + " - " + ho.field_g.a((byte) 79) + "%";
                        } else {
                          return ba.field_f;
                        }
                      } else {
                        return di.field_c;
                      }
                    } else {
                      return ra.field_d + " - " + ea.field_C.b("commonui", 104) + "%";
                    }
                  } else {
                    return null;
                  }
                }
              }
            }
          }
        }
    }

    final static void a(String param0, int param1, String param2) {
        if (param1 != -3) {
          return;
        } else {
          L0: {
            if (vf.field_k != null) {
              vf.field_k.h(77);
              break L0;
            } else {
              break L0;
            }
          }
          wh.field_f = new e(param0, param2, false, true, true);
          g.field_e.a((byte) -92, (qm) (Object) wh.field_f);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Searching for opponents";
        field_c = new am();
        field_d = "Good luck against the cyclopes. The battle will commence after you press 'Enter'. Try to knock enemies into the water to defeat them quickly.";
        field_i = new String[255];
    }
}
