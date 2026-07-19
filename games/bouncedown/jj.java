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
            IOException iOException = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (param1) {
                break L0;
              } else {
                field_a = (si) null;
                break L0;
              }
            }
            L1: {
              if (dh.field_a == null) {
                break L1;
              } else {
                L2: {
                  if (param0 < 0) {
                    break L2;
                  } else {
                    if (pj.field_a == b.field_b) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  if (0 != hh.field_p.field_h) {
                    break L3;
                  } else {
                    if ((fa.a(101) ^ -1L) < (10000L + wa.field_e ^ -1L)) {
                      hh.field_p.a(true, param0);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (0 >= hh.field_p.field_h) {
                    break L4;
                  } else {
                    try {
                      L5: {
                        dh.field_a.a(hh.field_p.field_h, hh.field_p.field_i, 0, 0);
                        wa.field_e = fa.a(-76);
                        break L5;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L6: {
                        iOException = (IOException) (Object) decompiledCaughtException;
                        kc.a((byte) 18);
                        break L6;
                      }
                    }
                    hh.field_p.field_h = 0;
                    break L4;
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
        if (param0 != 10000) {
            field_a = (si) null;
            return (sg) ((Object) new el());
        }
        return (sg) ((Object) new el());
    }

    final synchronized static byte[] a(int param0, int param1) {
        int fieldTemp$45 = 0;
        int fieldTemp$46 = 0;
        int fieldTemp$47 = 0;
        int fieldTemp$48 = 0;
        int fieldTemp$49 = 0;
        int fieldTemp$50 = 0;
        int fieldTemp$51 = 0;
        int fieldTemp$52 = 0;
        int fieldTemp$53 = 0;
        int fieldTemp$54 = 0;
        int fieldTemp$55 = 0;
        int fieldTemp$56 = 0;
        int fieldTemp$57 = 0;
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        if (param0 == 10000) {
          if (100 != param1) {
            if ((param1 ^ -1) != -5001) {
              L0: {
                if (30000 != param1) {
                  break L0;
                } else {
                  if ((ch.field_a ^ -1) >= -1) {
                    break L0;
                  } else {
                    fieldTemp$45 = ch.field_a - 1;
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
                    if (param1 == ok.field_c[var2]) {
                      if (de.field_e[var2] > 0) {
                        de.field_e[var2] = de.field_e[var2] - 1;
                        var3 = ri.field_B[var2][de.field_e[var2] - 1];
                        ri.field_B[var2][de.field_e[var2]] = null;
                        return var3;
                      } else {
                        var2++;
                        continue L1;
                      }
                    } else {
                      var2++;
                      continue L1;
                    }
                  }
                }
              } else {
                return new byte[param1];
              }
            } else {
              if (-1 > (hj.field_b ^ -1)) {
                fieldTemp$46 = hj.field_b - 1;
                hj.field_b = hj.field_b - 1;
                var2_ref_byte__ = jh.field_r[fieldTemp$46];
                jh.field_r[hj.field_b] = null;
                return var2_ref_byte__;
              } else {
                L2: {
                  if (30000 != param1) {
                    break L2;
                  } else {
                    if ((ch.field_a ^ -1) >= -1) {
                      break L2;
                    } else {
                      fieldTemp$47 = ch.field_a - 1;
                      ch.field_a = ch.field_a - 1;
                      var2_ref_byte__ = hh.field_r[fieldTemp$47];
                      hh.field_r[ch.field_a] = null;
                      return var2_ref_byte__;
                    }
                  }
                }
                if (ri.field_B != null) {
                  var2 = 0;
                  L3: while (true) {
                    if (ok.field_c.length <= var2) {
                      return new byte[param1];
                    } else {
                      if (param1 == ok.field_c[var2]) {
                        if (de.field_e[var2] > 0) {
                          de.field_e[var2] = de.field_e[var2] - 1;
                          var3 = ri.field_B[var2][de.field_e[var2] - 1];
                          ri.field_B[var2][de.field_e[var2]] = null;
                          return var3;
                        } else {
                          var2++;
                          continue L3;
                        }
                      } else {
                        var2++;
                        continue L3;
                      }
                    }
                  }
                } else {
                  return new byte[param1];
                }
              }
            }
          } else {
            if (-1 <= (dk.field_a ^ -1)) {
              if ((param1 ^ -1) != -5001) {
                if (30000 == param1) {
                  if ((ch.field_a ^ -1) < -1) {
                    fieldTemp$48 = ch.field_a - 1;
                    ch.field_a = ch.field_a - 1;
                    var2_ref_byte__ = hh.field_r[fieldTemp$48];
                    hh.field_r[ch.field_a] = null;
                    return var2_ref_byte__;
                  } else {
                    if (ri.field_B != null) {
                      var2 = 0;
                      L4: while (true) {
                        if (ok.field_c.length <= var2) {
                          return new byte[param1];
                        } else {
                          if (param1 == ok.field_c[var2]) {
                            if (de.field_e[var2] > 0) {
                              de.field_e[var2] = de.field_e[var2] - 1;
                              var3 = ri.field_B[var2][de.field_e[var2] - 1];
                              ri.field_B[var2][de.field_e[var2]] = null;
                              return var3;
                            } else {
                              var2++;
                              continue L4;
                            }
                          } else {
                            var2++;
                            continue L4;
                          }
                        }
                      }
                    } else {
                      return new byte[param1];
                    }
                  }
                } else {
                  if (ri.field_B != null) {
                    var2 = 0;
                    L5: while (true) {
                      if (ok.field_c.length <= var2) {
                        return new byte[param1];
                      } else {
                        if (param1 == ok.field_c[var2]) {
                          if (de.field_e[var2] > 0) {
                            de.field_e[var2] = de.field_e[var2] - 1;
                            var3 = ri.field_B[var2][de.field_e[var2] - 1];
                            ri.field_B[var2][de.field_e[var2]] = null;
                            return var3;
                          } else {
                            var2++;
                            continue L5;
                          }
                        } else {
                          var2++;
                          continue L5;
                        }
                      }
                    }
                  } else {
                    return new byte[param1];
                  }
                }
              } else {
                if (-1 <= (hj.field_b ^ -1)) {
                  L6: {
                    if (30000 != param1) {
                      break L6;
                    } else {
                      if ((ch.field_a ^ -1) >= -1) {
                        break L6;
                      } else {
                        fieldTemp$49 = ch.field_a - 1;
                        ch.field_a = ch.field_a - 1;
                        var2_ref_byte__ = hh.field_r[fieldTemp$49];
                        hh.field_r[ch.field_a] = null;
                        return var2_ref_byte__;
                      }
                    }
                  }
                  if (ri.field_B != null) {
                    var2 = 0;
                    L7: while (true) {
                      if (ok.field_c.length > var2) {
                        if (param1 == ok.field_c[var2]) {
                          if (de.field_e[var2] > 0) {
                            de.field_e[var2] = de.field_e[var2] - 1;
                            var3 = ri.field_B[var2][de.field_e[var2] - 1];
                            ri.field_B[var2][de.field_e[var2]] = null;
                            return var3;
                          } else {
                            var2++;
                            continue L7;
                          }
                        } else {
                          var2++;
                          continue L7;
                        }
                      } else {
                        return new byte[param1];
                      }
                    }
                  } else {
                    return new byte[param1];
                  }
                } else {
                  fieldTemp$50 = hj.field_b - 1;
                  hj.field_b = hj.field_b - 1;
                  var2_ref_byte__ = jh.field_r[fieldTemp$50];
                  jh.field_r[hj.field_b] = null;
                  return var2_ref_byte__;
                }
              }
            } else {
              fieldTemp$51 = dk.field_a - 1;
              dk.field_a = dk.field_a - 1;
              var2_ref_byte__ = qh.field_b[fieldTemp$51];
              qh.field_b[dk.field_a] = null;
              return var2_ref_byte__;
            }
          }
        } else {
          field_a = (si) null;
          if (100 == param1) {
            if (-1 > (dk.field_a ^ -1)) {
              fieldTemp$52 = dk.field_a - 1;
              dk.field_a = dk.field_a - 1;
              var2_ref_byte__ = qh.field_b[fieldTemp$52];
              qh.field_b[dk.field_a] = null;
              return var2_ref_byte__;
            } else {
              if ((param1 ^ -1) == -5001) {
                if (-1 > (hj.field_b ^ -1)) {
                  fieldTemp$53 = hj.field_b - 1;
                  hj.field_b = hj.field_b - 1;
                  var2_ref_byte__ = jh.field_r[fieldTemp$53];
                  jh.field_r[hj.field_b] = null;
                  return var2_ref_byte__;
                } else {
                  L8: {
                    if (30000 != param1) {
                      break L8;
                    } else {
                      if ((ch.field_a ^ -1) >= -1) {
                        break L8;
                      } else {
                        fieldTemp$54 = ch.field_a - 1;
                        ch.field_a = ch.field_a - 1;
                        var2_ref_byte__ = hh.field_r[fieldTemp$54];
                        hh.field_r[ch.field_a] = null;
                        return var2_ref_byte__;
                      }
                    }
                  }
                  if (ri.field_B != null) {
                    var2 = 0;
                    L9: while (true) {
                      if (ok.field_c.length > var2) {
                        if (param1 == ok.field_c[var2]) {
                          if (de.field_e[var2] > 0) {
                            de.field_e[var2] = de.field_e[var2] - 1;
                            var3 = ri.field_B[var2][de.field_e[var2] - 1];
                            ri.field_B[var2][de.field_e[var2]] = null;
                            return var3;
                          } else {
                            var2++;
                            continue L9;
                          }
                        } else {
                          var2++;
                          continue L9;
                        }
                      } else {
                        return new byte[param1];
                      }
                    }
                  } else {
                    return new byte[param1];
                  }
                }
              } else {
                L10: {
                  if (30000 != param1) {
                    break L10;
                  } else {
                    if ((ch.field_a ^ -1) >= -1) {
                      break L10;
                    } else {
                      fieldTemp$55 = ch.field_a - 1;
                      ch.field_a = ch.field_a - 1;
                      var2_ref_byte__ = hh.field_r[fieldTemp$55];
                      hh.field_r[ch.field_a] = null;
                      return var2_ref_byte__;
                    }
                  }
                }
                if (ri.field_B != null) {
                  var2 = 0;
                  L11: while (true) {
                    if (ok.field_c.length > var2) {
                      if (param1 == ok.field_c[var2]) {
                        if (de.field_e[var2] > 0) {
                          de.field_e[var2] = de.field_e[var2] - 1;
                          var3 = ri.field_B[var2][de.field_e[var2] - 1];
                          ri.field_B[var2][de.field_e[var2]] = null;
                          return var3;
                        } else {
                          var2++;
                          continue L11;
                        }
                      } else {
                        var2++;
                        continue L11;
                      }
                    } else {
                      return new byte[param1];
                    }
                  }
                } else {
                  return new byte[param1];
                }
              }
            }
          } else {
            L12: {
              if ((param1 ^ -1) != -5001) {
                break L12;
              } else {
                if (-1 > (hj.field_b ^ -1)) {
                  fieldTemp$56 = hj.field_b - 1;
                  hj.field_b = hj.field_b - 1;
                  var2_ref_byte__ = jh.field_r[fieldTemp$56];
                  jh.field_r[hj.field_b] = null;
                  return var2_ref_byte__;
                } else {
                  break L12;
                }
              }
            }
            L13: {
              if (30000 != param1) {
                break L13;
              } else {
                if ((ch.field_a ^ -1) >= -1) {
                  break L13;
                } else {
                  fieldTemp$57 = ch.field_a - 1;
                  ch.field_a = ch.field_a - 1;
                  var2_ref_byte__ = hh.field_r[fieldTemp$57];
                  hh.field_r[ch.field_a] = null;
                  return var2_ref_byte__;
                }
              }
            }
            if (ri.field_B != null) {
              var2 = 0;
              L14: while (true) {
                if (ok.field_c.length > var2) {
                  if (param1 == ok.field_c[var2]) {
                    if (de.field_e[var2] > 0) {
                      de.field_e[var2] = de.field_e[var2] - 1;
                      var3 = ri.field_B[var2][de.field_e[var2] - 1];
                      ri.field_B[var2][de.field_e[var2]] = null;
                      return var3;
                    } else {
                      var2++;
                      continue L14;
                    }
                  } else {
                    var2++;
                    continue L14;
                  }
                } else {
                  return new byte[param1];
                }
              }
            } else {
              return new byte[param1];
            }
          }
        }
    }

    final static String a(byte param0) {
        String discarded$0 = null;
        if (param0 != -54) {
            discarded$0 = jj.a((byte) -57);
            return jc.field_g.b(true);
        }
        return jc.field_g.b(true);
    }

    static {
    }
}
