/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jj {
    static si field_a;

    public static void a(boolean param0) {
        if (!param0) {
            jj.a(false);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(int param0, boolean param1) {
        try {
            Throwable decompiledCaughtException = null;
            L0: {
              if (dh.field_a == null) {
                break L0;
              } else {
                L1: {
                  if (param0 < 0) {
                    break L1;
                  } else {
                    if (pj.field_a == b.field_b) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
                L2: {
                  if (0 != hh.field_p.field_h) {
                    break L2;
                  } else {
                    if (~fa.a(101) < ~(10000L + wa.field_e)) {
                      hh.field_p.a(true, param0);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (0 >= hh.field_p.field_h) {
                    break L3;
                  } else {
                    {
                      L4: {
                        dh.field_a.a(hh.field_p.field_h, hh.field_p.field_i, 0, 0);
                        wa.field_e = fa.a(-76);
                        break L4;
                      }
                    }
                    hh.field_p.field_h = 0;
                    break L3;
                  }
                }
                return;
              }
            }
            hh.field_p.field_h = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static sg a(int param0) {
        return (sg) (Object) new el();
    }

    final synchronized static byte[] a(int param0, int param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        if (param0 == 10000) {
          if (100 != param1) {
            if (param1 != 5000) {
              L0: {
                if (30000 != param1) {
                  break L0;
                } else {
                  if (ch.field_a <= 0) {
                    break L0;
                  } else {
                    int fieldTemp$45 = ch.field_a - 1;
                    ch.field_a = ch.field_a - 1;
                    var2_ref_byte__ = hh.field_r[fieldTemp$45];
                    hh.field_r[ch.field_a] = null;
                    return var2_ref_byte__;
                  }
                }
              }
              if (ri.field_B != null) {
                var2 = 0;
                L1: while (true) {
                  if (ok.field_c.length <= var2) {
                    return new byte[param1];
                  } else {
                    L2: {
                      if (param1 != ok.field_c[var2]) {
                        var2++;
                        break L2;
                      } else {
                        if (de.field_e[var2] <= 0) {
                          break L2;
                        } else {
                          de.field_e[var2] = de.field_e[var2] - 1;
                          var3 = ri.field_B[var2][de.field_e[var2] - 1];
                          ri.field_B[var2][de.field_e[var2]] = null;
                          return var3;
                        }
                      }
                    }
                    var2++;
                    continue L1;
                  }
                }
              } else {
                return new byte[param1];
              }
            } else {
              if (hj.field_b > 0) {
                int fieldTemp$46 = hj.field_b - 1;
                hj.field_b = hj.field_b - 1;
                var2_ref_byte__ = jh.field_r[fieldTemp$46];
                jh.field_r[hj.field_b] = null;
                return var2_ref_byte__;
              } else {
                L3: {
                  if (30000 != param1) {
                    break L3;
                  } else {
                    if (ch.field_a <= 0) {
                      break L3;
                    } else {
                      int fieldTemp$47 = ch.field_a - 1;
                      ch.field_a = ch.field_a - 1;
                      var2_ref_byte__ = hh.field_r[fieldTemp$47];
                      hh.field_r[ch.field_a] = null;
                      return var2_ref_byte__;
                    }
                  }
                }
                if (ri.field_B != null) {
                  var2 = 0;
                  L4: while (true) {
                    if (ok.field_c.length <= var2) {
                      return new byte[param1];
                    } else {
                      L5: {
                        if (param1 != ok.field_c[var2]) {
                          var2++;
                          break L5;
                        } else {
                          if (de.field_e[var2] <= 0) {
                            break L5;
                          } else {
                            de.field_e[var2] = de.field_e[var2] - 1;
                            var3 = ri.field_B[var2][de.field_e[var2] - 1];
                            ri.field_B[var2][de.field_e[var2]] = null;
                            return var3;
                          }
                        }
                      }
                      var2++;
                      continue L4;
                    }
                  }
                } else {
                  return new byte[param1];
                }
              }
            }
          } else {
            if (dk.field_a > 0) {
              int fieldTemp$48 = dk.field_a - 1;
              dk.field_a = dk.field_a - 1;
              var2_ref_byte__ = qh.field_b[fieldTemp$48];
              qh.field_b[dk.field_a] = null;
              return var2_ref_byte__;
            } else {
              if (param1 != 5000) {
                if (30000 == param1) {
                  if (ch.field_a > 0) {
                    int fieldTemp$49 = ch.field_a - 1;
                    ch.field_a = ch.field_a - 1;
                    var2_ref_byte__ = hh.field_r[fieldTemp$49];
                    hh.field_r[ch.field_a] = null;
                    return var2_ref_byte__;
                  } else {
                    if (ri.field_B != null) {
                      var2 = 0;
                      L6: while (true) {
                        if (ok.field_c.length <= var2) {
                          return new byte[param1];
                        } else {
                          L7: {
                            if (param1 != ok.field_c[var2]) {
                              var2++;
                              break L7;
                            } else {
                              if (de.field_e[var2] <= 0) {
                                break L7;
                              } else {
                                de.field_e[var2] = de.field_e[var2] - 1;
                                var3 = ri.field_B[var2][de.field_e[var2] - 1];
                                ri.field_B[var2][de.field_e[var2]] = null;
                                return var3;
                              }
                            }
                          }
                          var2++;
                          continue L6;
                        }
                      }
                    } else {
                      return new byte[param1];
                    }
                  }
                } else {
                  if (ri.field_B != null) {
                    var2 = 0;
                    L8: while (true) {
                      if (ok.field_c.length <= var2) {
                        return new byte[param1];
                      } else {
                        L9: {
                          if (param1 != ok.field_c[var2]) {
                            var2++;
                            break L9;
                          } else {
                            if (de.field_e[var2] <= 0) {
                              break L9;
                            } else {
                              de.field_e[var2] = de.field_e[var2] - 1;
                              var3 = ri.field_B[var2][de.field_e[var2] - 1];
                              ri.field_B[var2][de.field_e[var2]] = null;
                              return var3;
                            }
                          }
                        }
                        var2++;
                        continue L8;
                      }
                    }
                  } else {
                    return new byte[param1];
                  }
                }
              } else {
                if (hj.field_b > 0) {
                  int fieldTemp$50 = hj.field_b - 1;
                  hj.field_b = hj.field_b - 1;
                  var2_ref_byte__ = jh.field_r[fieldTemp$50];
                  jh.field_r[hj.field_b] = null;
                  return var2_ref_byte__;
                } else {
                  L10: {
                    if (30000 != param1) {
                      break L10;
                    } else {
                      if (ch.field_a <= 0) {
                        break L10;
                      } else {
                        int fieldTemp$51 = ch.field_a - 1;
                        ch.field_a = ch.field_a - 1;
                        var2_ref_byte__ = hh.field_r[fieldTemp$51];
                        hh.field_r[ch.field_a] = null;
                        return var2_ref_byte__;
                      }
                    }
                  }
                  L11: {
                    if (ri.field_B != null) {
                      var2 = 0;
                      L12: while (true) {
                        if (ok.field_c.length <= var2) {
                          break L11;
                        } else {
                          L13: {
                            if (param1 != ok.field_c[var2]) {
                              var2++;
                              break L13;
                            } else {
                              if (de.field_e[var2] <= 0) {
                                break L13;
                              } else {
                                de.field_e[var2] = de.field_e[var2] - 1;
                                var3 = ri.field_B[var2][de.field_e[var2] - 1];
                                ri.field_B[var2][de.field_e[var2]] = null;
                                return var3;
                              }
                            }
                          }
                          var2++;
                          continue L12;
                        }
                      }
                    } else {
                      break L11;
                    }
                  }
                  return new byte[param1];
                }
              }
            }
          }
        } else {
          field_a = null;
          if (100 == param1) {
            if (dk.field_a > 0) {
              int fieldTemp$52 = dk.field_a - 1;
              dk.field_a = dk.field_a - 1;
              var2_ref_byte__ = qh.field_b[fieldTemp$52];
              qh.field_b[dk.field_a] = null;
              return var2_ref_byte__;
            } else {
              if (param1 == 5000) {
                if (hj.field_b > 0) {
                  int fieldTemp$53 = hj.field_b - 1;
                  hj.field_b = hj.field_b - 1;
                  var2_ref_byte__ = jh.field_r[fieldTemp$53];
                  jh.field_r[hj.field_b] = null;
                  return var2_ref_byte__;
                } else {
                  L14: {
                    if (30000 != param1) {
                      break L14;
                    } else {
                      if (ch.field_a <= 0) {
                        break L14;
                      } else {
                        int fieldTemp$54 = ch.field_a - 1;
                        ch.field_a = ch.field_a - 1;
                        var2_ref_byte__ = hh.field_r[fieldTemp$54];
                        hh.field_r[ch.field_a] = null;
                        return var2_ref_byte__;
                      }
                    }
                  }
                  if (ri.field_B != null) {
                    var2 = 0;
                    L15: while (true) {
                      if (ok.field_c.length <= var2) {
                        return new byte[param1];
                      } else {
                        L16: {
                          if (param1 != ok.field_c[var2]) {
                            var2++;
                            break L16;
                          } else {
                            if (de.field_e[var2] <= 0) {
                              break L16;
                            } else {
                              de.field_e[var2] = de.field_e[var2] - 1;
                              var3 = ri.field_B[var2][de.field_e[var2] - 1];
                              ri.field_B[var2][de.field_e[var2]] = null;
                              return var3;
                            }
                          }
                        }
                        var2++;
                        continue L15;
                      }
                    }
                  } else {
                    return new byte[param1];
                  }
                }
              } else {
                L17: {
                  if (30000 != param1) {
                    break L17;
                  } else {
                    if (ch.field_a <= 0) {
                      break L17;
                    } else {
                      int fieldTemp$55 = ch.field_a - 1;
                      ch.field_a = ch.field_a - 1;
                      var2_ref_byte__ = hh.field_r[fieldTemp$55];
                      hh.field_r[ch.field_a] = null;
                      return var2_ref_byte__;
                    }
                  }
                }
                L18: {
                  if (ri.field_B != null) {
                    var2 = 0;
                    L19: while (true) {
                      if (ok.field_c.length <= var2) {
                        break L18;
                      } else {
                        L20: {
                          if (param1 != ok.field_c[var2]) {
                            var2++;
                            break L20;
                          } else {
                            if (de.field_e[var2] <= 0) {
                              break L20;
                            } else {
                              de.field_e[var2] = de.field_e[var2] - 1;
                              var3 = ri.field_B[var2][de.field_e[var2] - 1];
                              ri.field_B[var2][de.field_e[var2]] = null;
                              return var3;
                            }
                          }
                        }
                        var2++;
                        continue L19;
                      }
                    }
                  } else {
                    break L18;
                  }
                }
                return new byte[param1];
              }
            }
          } else {
            L21: {
              if (param1 != 5000) {
                break L21;
              } else {
                if (hj.field_b > 0) {
                  int fieldTemp$56 = hj.field_b - 1;
                  hj.field_b = hj.field_b - 1;
                  var2_ref_byte__ = jh.field_r[fieldTemp$56];
                  jh.field_r[hj.field_b] = null;
                  return var2_ref_byte__;
                } else {
                  break L21;
                }
              }
            }
            L22: {
              if (30000 != param1) {
                break L22;
              } else {
                if (ch.field_a <= 0) {
                  break L22;
                } else {
                  int fieldTemp$57 = ch.field_a - 1;
                  ch.field_a = ch.field_a - 1;
                  var2_ref_byte__ = hh.field_r[fieldTemp$57];
                  hh.field_r[ch.field_a] = null;
                  return var2_ref_byte__;
                }
              }
            }
            L23: {
              if (ri.field_B != null) {
                var2 = 0;
                if (ok.field_c.length <= var2) {
                  break L23;
                } else {
                  L24: {
                    if (param1 != ok.field_c[var2]) {
                      var2++;
                      break L24;
                    } else {
                      if (de.field_e[var2] <= 0) {
                        var2++;
                        break L24;
                      } else {
                        de.field_e[var2] = de.field_e[var2] - 1;
                        var3 = ri.field_B[var2][de.field_e[var2] - 1];
                        ri.field_B[var2][de.field_e[var2]] = null;
                        return var3;
                      }
                    }
                  }
                  var2++;
                  var2++;
                  var2++;
                  break L23;
                }
              } else {
                break L23;
              }
            }
            return new byte[param1];
          }
        }
    }

    final static String a(byte param0) {
        if (param0 != -54) {
            String discarded$0 = jj.a((byte) -57);
            return jc.field_g.b(true);
        }
        return jc.field_g.b(true);
    }

    static {
    }
}
