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
        int fieldTemp$2 = 0;
        int dupTemp$3 = 0;
        byte[][] arrayValue$4 = null;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int dupTemp$7 = 0;
        byte[][] arrayValue$8 = null;
        int fieldTemp$9 = 0;
        int dupTemp$10 = 0;
        byte[][] arrayValue$11 = null;
        int dupTemp$12 = 0;
        byte[][] arrayValue$13 = null;
        int fieldTemp$14 = 0;
        int dupTemp$15 = 0;
        byte[][] arrayValue$16 = null;
        int fieldTemp$17 = 0;
        int fieldTemp$18 = 0;
        int fieldTemp$19 = 0;
        int fieldTemp$20 = 0;
        int fieldTemp$21 = 0;
        int dupTemp$22 = 0;
        byte[][] arrayValue$23 = null;
        int fieldTemp$24 = 0;
        int dupTemp$25 = 0;
        byte[][] arrayValue$26 = null;
        int fieldTemp$27 = 0;
        int fieldTemp$28 = 0;
        int dupTemp$29 = 0;
        byte[][] arrayValue$30 = null;
        byte[] var2_ref_byte__;
        int var2;
        byte[] var3;
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
                    fieldTemp$2 = ch.field_a - 1;
                    ch.field_a = ch.field_a - 1;
                    var2_ref_byte__ = hh.field_r[fieldTemp$2];
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
                        dupTemp$3 = de.field_e[var2] - 1;
                        arrayValue$4 = ri.field_B[var2];
                        de.field_e[var2] = dupTemp$3;
                        var3 = arrayValue$4[dupTemp$3];
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
                fieldTemp$5 = hj.field_b - 1;
                hj.field_b = hj.field_b - 1;
                var2_ref_byte__ = jh.field_r[fieldTemp$5];
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
                      fieldTemp$6 = ch.field_a - 1;
                      ch.field_a = ch.field_a - 1;
                      var2_ref_byte__ = hh.field_r[fieldTemp$6];
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
                          dupTemp$7 = de.field_e[var2] - 1;
                          arrayValue$8 = ri.field_B[var2];
                          de.field_e[var2] = dupTemp$7;
                          var3 = arrayValue$8[dupTemp$7];
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
                    fieldTemp$9 = ch.field_a - 1;
                    ch.field_a = ch.field_a - 1;
                    var2_ref_byte__ = hh.field_r[fieldTemp$9];
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
                              dupTemp$10 = de.field_e[var2] - 1;
                              arrayValue$11 = ri.field_B[var2];
                              de.field_e[var2] = dupTemp$10;
                              var3 = arrayValue$11[dupTemp$10];
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
                            dupTemp$12 = de.field_e[var2] - 1;
                            arrayValue$13 = ri.field_B[var2];
                            de.field_e[var2] = dupTemp$12;
                            var3 = arrayValue$13[dupTemp$12];
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
                        fieldTemp$14 = ch.field_a - 1;
                        ch.field_a = ch.field_a - 1;
                        var2_ref_byte__ = hh.field_r[fieldTemp$14];
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
                            dupTemp$15 = de.field_e[var2] - 1;
                            arrayValue$16 = ri.field_B[var2];
                            de.field_e[var2] = dupTemp$15;
                            var3 = arrayValue$16[dupTemp$15];
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
                  fieldTemp$17 = hj.field_b - 1;
                  hj.field_b = hj.field_b - 1;
                  var2_ref_byte__ = jh.field_r[fieldTemp$17];
                  jh.field_r[hj.field_b] = null;
                  return var2_ref_byte__;
                }
              }
            } else {
              fieldTemp$18 = dk.field_a - 1;
              dk.field_a = dk.field_a - 1;
              var2_ref_byte__ = qh.field_b[fieldTemp$18];
              qh.field_b[dk.field_a] = null;
              return var2_ref_byte__;
            }
          }
        } else {
          field_a = (si) null;
          if (100 == param1) {
            if (-1 > (dk.field_a ^ -1)) {
              fieldTemp$19 = dk.field_a - 1;
              dk.field_a = dk.field_a - 1;
              var2_ref_byte__ = qh.field_b[fieldTemp$19];
              qh.field_b[dk.field_a] = null;
              return var2_ref_byte__;
            } else {
              if ((param1 ^ -1) == -5001) {
                if (-1 > (hj.field_b ^ -1)) {
                  fieldTemp$20 = hj.field_b - 1;
                  hj.field_b = hj.field_b - 1;
                  var2_ref_byte__ = jh.field_r[fieldTemp$20];
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
                        fieldTemp$21 = ch.field_a - 1;
                        ch.field_a = ch.field_a - 1;
                        var2_ref_byte__ = hh.field_r[fieldTemp$21];
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
                            dupTemp$22 = de.field_e[var2] - 1;
                            arrayValue$23 = ri.field_B[var2];
                            de.field_e[var2] = dupTemp$22;
                            var3 = arrayValue$23[dupTemp$22];
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
                      fieldTemp$24 = ch.field_a - 1;
                      ch.field_a = ch.field_a - 1;
                      var2_ref_byte__ = hh.field_r[fieldTemp$24];
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
                          dupTemp$25 = de.field_e[var2] - 1;
                          arrayValue$26 = ri.field_B[var2];
                          de.field_e[var2] = dupTemp$25;
                          var3 = arrayValue$26[dupTemp$25];
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
                  fieldTemp$27 = hj.field_b - 1;
                  hj.field_b = hj.field_b - 1;
                  var2_ref_byte__ = jh.field_r[fieldTemp$27];
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
                  fieldTemp$28 = ch.field_a - 1;
                  ch.field_a = ch.field_a - 1;
                  var2_ref_byte__ = hh.field_r[fieldTemp$28];
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
                      dupTemp$29 = de.field_e[var2] - 1;
                      arrayValue$30 = ri.field_B[var2];
                      de.field_e[var2] = dupTemp$29;
                      var3 = arrayValue$30[dupTemp$29];
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
        if (param0 != -54) {
            jj.a((byte) -57);
            return jc.field_g.b(true);
        }
        return jc.field_g.b(true);
    }

    static {
    }
}
