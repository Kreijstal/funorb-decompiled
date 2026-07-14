/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class ll extends rqa {
    static aja field_p;
    static boolean field_o;

    final static int a(int param0) {
        int var1 = 0;
        var1 = 17 / ((param0 - -41) / 54);
        ho.field_a.a(0);
        if (ff.field_o.e(0)) {
          return 0;
        } else {
          return vq.g(-6269);
        }
    }

    ll(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          field_o = false;
          return new nc((Object) (Object) frb.a(15, 75));
        } else {
          return new nc((Object) (Object) frb.a(15, 75));
        }
    }

    public static void e(int param0) {
        field_p = null;
        if (param0 == 1) {
            return;
        }
        field_o = false;
    }

    final static void e(byte param0) {
        Object exception = null;
        File var1 = null;
        Throwable decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = null;
                    if (param0 == -120) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_p = null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    try {
                        var1 = lfb.a(ata.field_L, (byte) 34);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    exception = (Exception) (Object) caughtException;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (var1 == null) {
                        statePc = 7;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 7: {
                    return;
                }
                case 8: {
                    exception = (Exception) asa.a(var1, (byte) -48);
                    if (!(exception instanceof Hashtable)) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    wqb.field_e = (Hashtable) (Object) exception;
                    return;
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int a(boolean param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = VoidHunters.field_G;
        ao.field_o = ao.field_o + 65536;
        L0: while (true) {
          if ((jca.a(si.field_r, ao.field_o, (byte) 74) ^ -1) > -65537) {
            L1: {
              var2 = -1;
              if (lqa.field_p != null) {
                var2 = lqa.field_p.length;
                break L1;
              } else {
                if (via.field_a == null) {
                  break L1;
                } else {
                  var2 = via.field_a.length;
                  break L1;
                }
              }
            }
            L2: {
              if (0 != (var2 ^ -1)) {
                L3: {
                  if (si.field_s <= otb.field_q) {
                    break L3;
                  } else {
                    L4: {
                      otb.field_q = otb.field_q + 1;
                      if (si.field_p >= otb.field_q) {
                        break L4;
                      } else {
                        if (null != lqa.field_p) {
                          if (null != lqa.field_p[pa.field_b]) {
                            break L4;
                          } else {
                            otb.field_q = otb.field_q - 1;
                            break L3;
                          }
                        } else {
                          otb.field_q = otb.field_q - 1;
                          break L3;
                        }
                      }
                    }
                    if (otb.field_q < si.field_s) {
                      break L3;
                    } else {
                      if (lqa.field_p[(pa.field_b - -1) % var2] == null) {
                        otb.field_q = otb.field_q - 1;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L5: {
                  if (otb.field_q >= si.field_s) {
                    otb.field_q = otb.field_q - si.field_s;
                    if (!gt.field_q) {
                      pa.field_b = pa.field_b - 1;
                      if (pa.field_b < 0) {
                        pa.field_b = pa.field_b + var2;
                        break L5;
                      } else {
                        L6: {
                          if (otb.field_q <= si.field_p) {
                            break L6;
                          } else {
                            gt.field_q = true;
                            break L6;
                          }
                        }
                        L7: {
                          if (so.field_e != null) {
                            L8: {
                              var3 = 357 + -(so.field_e.field_n / 2);
                              var4 = 0;
                              if (pba.field_o == 0) {
                                break L8;
                              } else {
                                if (var3 >= qs.field_a) {
                                  break L8;
                                } else {
                                  if (qs.field_a < var3 + so.field_e.field_p) {
                                    L9: {
                                      if (269 - so.field_e.field_q >= oq.field_H) {
                                        break L9;
                                      } else {
                                        if (269 <= oq.field_H) {
                                          break L9;
                                        } else {
                                          otb.field_q = si.field_s;
                                          gt.field_q = false;
                                          var4 = 1;
                                          break L9;
                                        }
                                      }
                                    }
                                    if (-587 <= (oq.field_H ^ -1)) {
                                      break L8;
                                    } else {
                                      if (oq.field_H < 586 + so.field_e.field_q) {
                                        otb.field_q = si.field_s;
                                        var4 = 1;
                                        gt.field_q = true;
                                        break L8;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                            if (var4 != 0) {
                              break L7;
                            } else {
                              if (otb.field_q <= si.field_p) {
                                break L7;
                              } else {
                                if (var3 >= uia.field_b) {
                                  break L7;
                                } else {
                                  if (so.field_e.field_p + var3 > uia.field_b) {
                                    L10: {
                                      if (269 + -so.field_e.field_q >= kc.field_b) {
                                        break L10;
                                      } else {
                                        if (-270 <= kc.field_b) {
                                          break L10;
                                        } else {
                                          L11: {
                                            otb.field_q = si.field_p;
                                            if (586 >= kc.field_b) {
                                              break L11;
                                            } else {
                                              if (kc.field_b < so.field_e.field_q + 586) {
                                                otb.field_q = si.field_p;
                                                break L11;
                                              } else {
                                                break L11;
                                              }
                                            }
                                          }
                                          var3 = 13 % ((param1 - -42) / 37);
                                          if (param0) {
                                            L12: {
                                              nna.field_z.a(pmb.a(-1, qs.field_a, oq.field_H), 5620, pmb.a(-1, uia.field_b, kc.field_b));
                                              if (nna.field_z.e((byte) -120)) {
                                                if (nna.field_z.field_j != 0) {
                                                  if (nna.field_z.field_j == 1) {
                                                    return 2;
                                                  } else {
                                                    break L12;
                                                  }
                                                } else {
                                                  return 3;
                                                }
                                              } else {
                                                break L12;
                                              }
                                            }
                                            L13: while (true) {
                                              if (ata.e(127)) {
                                                L14: {
                                                  nna.field_z.a(false, 0);
                                                  if (nna.field_z.e((byte) -127)) {
                                                    if (0 == nna.field_z.field_j) {
                                                      return 3;
                                                    } else {
                                                      if (-2 != (nna.field_z.field_j ^ -1)) {
                                                        break L14;
                                                      } else {
                                                        return 1;
                                                      }
                                                    }
                                                  } else {
                                                    break L14;
                                                  }
                                                }
                                                if ((pma.field_o ^ -1) != -14) {
                                                  continue L13;
                                                } else {
                                                  return 1;
                                                }
                                              } else {
                                                return 0;
                                              }
                                            }
                                          } else {
                                            return 0;
                                          }
                                        }
                                      }
                                    }
                                    if (586 >= kc.field_b) {
                                      break L7;
                                    } else {
                                      if (kc.field_b < so.field_e.field_q + 586) {
                                        otb.field_q = si.field_p;
                                        break L7;
                                      } else {
                                        var3 = 13 % ((param1 - -42) / 37);
                                        if (param0) {
                                          L15: {
                                            nna.field_z.a(pmb.a(-1, qs.field_a, oq.field_H), 5620, pmb.a(-1, uia.field_b, kc.field_b));
                                            if (nna.field_z.e((byte) -120)) {
                                              if (nna.field_z.field_j != 0) {
                                                if (nna.field_z.field_j == 1) {
                                                  return 2;
                                                } else {
                                                  break L15;
                                                }
                                              } else {
                                                return 3;
                                              }
                                            } else {
                                              break L15;
                                            }
                                          }
                                          L16: while (true) {
                                            if (ata.e(127)) {
                                              L17: {
                                                nna.field_z.a(false, 0);
                                                if (nna.field_z.e((byte) -127)) {
                                                  if (0 == nna.field_z.field_j) {
                                                    return 3;
                                                  } else {
                                                    if (-2 != (nna.field_z.field_j ^ -1)) {
                                                      break L17;
                                                    } else {
                                                      return 1;
                                                    }
                                                  }
                                                } else {
                                                  break L17;
                                                }
                                              }
                                              if ((pma.field_o ^ -1) != -14) {
                                                continue L16;
                                              } else {
                                                return 1;
                                              }
                                            } else {
                                              return 0;
                                            }
                                          }
                                        } else {
                                          return 0;
                                        }
                                      }
                                    }
                                  } else {
                                    var3 = 13 % ((param1 - -42) / 37);
                                    if (param0) {
                                      L18: {
                                        nna.field_z.a(pmb.a(-1, qs.field_a, oq.field_H), 5620, pmb.a(-1, uia.field_b, kc.field_b));
                                        if (nna.field_z.e((byte) -120)) {
                                          if (nna.field_z.field_j != 0) {
                                            if (nna.field_z.field_j == 1) {
                                              return 2;
                                            } else {
                                              break L18;
                                            }
                                          } else {
                                            return 3;
                                          }
                                        } else {
                                          break L18;
                                        }
                                      }
                                      L19: while (true) {
                                        if (ata.e(127)) {
                                          L20: {
                                            nna.field_z.a(false, 0);
                                            if (nna.field_z.e((byte) -127)) {
                                              if (0 == nna.field_z.field_j) {
                                                return 3;
                                              } else {
                                                if (-2 != (nna.field_z.field_j ^ -1)) {
                                                  break L20;
                                                } else {
                                                  return 1;
                                                }
                                              }
                                            } else {
                                              break L20;
                                            }
                                          }
                                          if (pma.field_o != -14) {
                                            continue L19;
                                          } else {
                                            return 1;
                                          }
                                        } else {
                                          return 0;
                                        }
                                      }
                                    } else {
                                      return 0;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            break L7;
                          }
                        }
                        var3 = 13 % ((param1 - -42) / 37);
                        if (param0) {
                          nna.field_z.a(pmb.a(-1, qs.field_a, oq.field_H), 5620, pmb.a(-1, uia.field_b, kc.field_b));
                          if (nna.field_z.e((byte) -120)) {
                            if (nna.field_z.field_j != 0) {
                              if (nna.field_z.field_j != 1) {
                                L21: while (true) {
                                  if (ata.e(127)) {
                                    L22: {
                                      nna.field_z.a(false, 0);
                                      if (nna.field_z.e((byte) -127)) {
                                        if (0 == nna.field_z.field_j) {
                                          return 3;
                                        } else {
                                          if (-2 != (nna.field_z.field_j ^ -1)) {
                                            break L22;
                                          } else {
                                            return 1;
                                          }
                                        }
                                      } else {
                                        break L22;
                                      }
                                    }
                                    if ((pma.field_o ^ -1) != -14) {
                                      continue L21;
                                    } else {
                                      return 1;
                                    }
                                  } else {
                                    return 0;
                                  }
                                }
                              } else {
                                return 2;
                              }
                            } else {
                              return 3;
                            }
                          } else {
                            L23: while (true) {
                              if (ata.e(127)) {
                                L24: {
                                  nna.field_z.a(false, 0);
                                  if (nna.field_z.e((byte) -127)) {
                                    if (0 == nna.field_z.field_j) {
                                      return 3;
                                    } else {
                                      if (-2 != (nna.field_z.field_j ^ -1)) {
                                        break L24;
                                      } else {
                                        return 1;
                                      }
                                    }
                                  } else {
                                    break L24;
                                  }
                                }
                                if ((pma.field_o ^ -1) != -14) {
                                  continue L23;
                                } else {
                                  return 1;
                                }
                              } else {
                                return 0;
                              }
                            }
                          }
                        } else {
                          return 0;
                        }
                      }
                    } else {
                      pa.field_b = pa.field_b + 1;
                      if (var2 <= pa.field_b) {
                        pa.field_b = pa.field_b - var2;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                if (otb.field_q > si.field_p) {
                  gt.field_q = true;
                  break L2;
                } else {
                  L25: {
                    if (so.field_e != null) {
                      L26: {
                        var3 = 357 + -(so.field_e.field_n / 2);
                        var4 = 0;
                        if (pba.field_o == 0) {
                          break L26;
                        } else {
                          if (var3 >= qs.field_a) {
                            break L26;
                          } else {
                            if (qs.field_a < var3 + so.field_e.field_p) {
                              L27: {
                                if (269 - so.field_e.field_q >= oq.field_H) {
                                  break L27;
                                } else {
                                  if (269 <= oq.field_H) {
                                    break L27;
                                  } else {
                                    otb.field_q = si.field_s;
                                    gt.field_q = false;
                                    var4 = 1;
                                    break L27;
                                  }
                                }
                              }
                              if (-587 <= (oq.field_H ^ -1)) {
                                break L26;
                              } else {
                                if (oq.field_H < 586 + so.field_e.field_q) {
                                  otb.field_q = si.field_s;
                                  var4 = 1;
                                  gt.field_q = true;
                                  break L26;
                                } else {
                                  break L26;
                                }
                              }
                            } else {
                              break L26;
                            }
                          }
                        }
                      }
                      if (var4 != 0) {
                        break L25;
                      } else {
                        if (otb.field_q <= si.field_p) {
                          break L25;
                        } else {
                          if (var3 >= uia.field_b) {
                            break L25;
                          } else {
                            if (so.field_e.field_p + var3 > uia.field_b) {
                              L28: {
                                if (269 + -so.field_e.field_q >= kc.field_b) {
                                  break L28;
                                } else {
                                  if (-270 <= kc.field_b) {
                                    break L28;
                                  } else {
                                    L29: {
                                      otb.field_q = si.field_p;
                                      if (586 >= kc.field_b) {
                                        break L29;
                                      } else {
                                        if (kc.field_b < so.field_e.field_q + 586) {
                                          otb.field_q = si.field_p;
                                          break L29;
                                        } else {
                                          break L29;
                                        }
                                      }
                                    }
                                    var3 = 13 % ((param1 - -42) / 37);
                                    if (param0) {
                                      L30: {
                                        nna.field_z.a(pmb.a(-1, qs.field_a, oq.field_H), 5620, pmb.a(-1, uia.field_b, kc.field_b));
                                        if (nna.field_z.e((byte) -120)) {
                                          if (nna.field_z.field_j != 0) {
                                            if (nna.field_z.field_j == 1) {
                                              return 2;
                                            } else {
                                              break L30;
                                            }
                                          } else {
                                            return 3;
                                          }
                                        } else {
                                          break L30;
                                        }
                                      }
                                      L31: while (true) {
                                        if (ata.e(127)) {
                                          L32: {
                                            nna.field_z.a(false, 0);
                                            if (nna.field_z.e((byte) -127)) {
                                              if (0 == nna.field_z.field_j) {
                                                return 3;
                                              } else {
                                                if (-2 != (nna.field_z.field_j ^ -1)) {
                                                  break L32;
                                                } else {
                                                  return 1;
                                                }
                                              }
                                            } else {
                                              break L32;
                                            }
                                          }
                                          if ((pma.field_o ^ -1) != -14) {
                                            continue L31;
                                          } else {
                                            return 1;
                                          }
                                        } else {
                                          return 0;
                                        }
                                      }
                                    } else {
                                      return 0;
                                    }
                                  }
                                }
                              }
                              if (586 >= kc.field_b) {
                                break L25;
                              } else {
                                if (kc.field_b < so.field_e.field_q + 586) {
                                  otb.field_q = si.field_p;
                                  break L25;
                                } else {
                                  var3 = 13 % ((param1 - -42) / 37);
                                  if (param0) {
                                    L33: {
                                      nna.field_z.a(pmb.a(-1, qs.field_a, oq.field_H), 5620, pmb.a(-1, uia.field_b, kc.field_b));
                                      if (nna.field_z.e((byte) -120)) {
                                        if (nna.field_z.field_j != 0) {
                                          if (nna.field_z.field_j == 1) {
                                            return 2;
                                          } else {
                                            break L33;
                                          }
                                        } else {
                                          return 3;
                                        }
                                      } else {
                                        break L33;
                                      }
                                    }
                                    L34: while (true) {
                                      if (ata.e(127)) {
                                        L35: {
                                          nna.field_z.a(false, 0);
                                          if (nna.field_z.e((byte) -127)) {
                                            if (0 == nna.field_z.field_j) {
                                              return 3;
                                            } else {
                                              if (-2 != (nna.field_z.field_j ^ -1)) {
                                                break L35;
                                              } else {
                                                return 1;
                                              }
                                            }
                                          } else {
                                            break L35;
                                          }
                                        }
                                        if ((pma.field_o ^ -1) != -14) {
                                          continue L34;
                                        } else {
                                          return 1;
                                        }
                                      } else {
                                        return 0;
                                      }
                                    }
                                  } else {
                                    return 0;
                                  }
                                }
                              }
                            } else {
                              var3 = 13 % ((param1 - -42) / 37);
                              if (param0) {
                                L36: {
                                  nna.field_z.a(pmb.a(-1, qs.field_a, oq.field_H), 5620, pmb.a(-1, uia.field_b, kc.field_b));
                                  if (nna.field_z.e((byte) -120)) {
                                    if (nna.field_z.field_j != 0) {
                                      if (nna.field_z.field_j == 1) {
                                        return 2;
                                      } else {
                                        break L36;
                                      }
                                    } else {
                                      return 3;
                                    }
                                  } else {
                                    break L36;
                                  }
                                }
                                L37: while (true) {
                                  if (ata.e(127)) {
                                    L38: {
                                      nna.field_z.a(false, 0);
                                      if (nna.field_z.e((byte) -127)) {
                                        if (0 == nna.field_z.field_j) {
                                          return 3;
                                        } else {
                                          if (-2 != (nna.field_z.field_j ^ -1)) {
                                            break L38;
                                          } else {
                                            return 1;
                                          }
                                        }
                                      } else {
                                        break L38;
                                      }
                                    }
                                    if (pma.field_o != -14) {
                                      continue L37;
                                    } else {
                                      return 1;
                                    }
                                  } else {
                                    return 0;
                                  }
                                }
                              } else {
                                return 0;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      break L25;
                    }
                  }
                  var3 = 13 % ((param1 - -42) / 37);
                  if (param0) {
                    nna.field_z.a(pmb.a(-1, qs.field_a, oq.field_H), 5620, pmb.a(-1, uia.field_b, kc.field_b));
                    if (nna.field_z.e((byte) -120)) {
                      if (nna.field_z.field_j != 0) {
                        if (nna.field_z.field_j != 1) {
                          L39: while (true) {
                            if (ata.e(127)) {
                              L40: {
                                nna.field_z.a(false, 0);
                                if (nna.field_z.e((byte) -127)) {
                                  if (0 == nna.field_z.field_j) {
                                    return 3;
                                  } else {
                                    if (-2 != (nna.field_z.field_j ^ -1)) {
                                      break L40;
                                    } else {
                                      return 1;
                                    }
                                  }
                                } else {
                                  break L40;
                                }
                              }
                              if ((pma.field_o ^ -1) != -14) {
                                continue L39;
                              } else {
                                return 1;
                              }
                            } else {
                              return 0;
                            }
                          }
                        } else {
                          return 2;
                        }
                      } else {
                        return 3;
                      }
                    } else {
                      L41: while (true) {
                        if (ata.e(127)) {
                          L42: {
                            nna.field_z.a(false, 0);
                            if (nna.field_z.e((byte) -127)) {
                              if (0 == nna.field_z.field_j) {
                                return 3;
                              } else {
                                if (-2 != (nna.field_z.field_j ^ -1)) {
                                  break L42;
                                } else {
                                  return 1;
                                }
                              }
                            } else {
                              break L42;
                            }
                          }
                          if ((pma.field_o ^ -1) != -14) {
                            continue L41;
                          } else {
                            return 1;
                          }
                        } else {
                          return 0;
                        }
                      }
                    }
                  } else {
                    return 0;
                  }
                }
              } else {
                break L2;
              }
            }
            L43: {
              if (so.field_e != null) {
                L44: {
                  var3 = 357 + -(so.field_e.field_n / 2);
                  var4 = 0;
                  if (pba.field_o == 0) {
                    break L44;
                  } else {
                    if (var3 >= qs.field_a) {
                      break L44;
                    } else {
                      if (qs.field_a < var3 + so.field_e.field_p) {
                        L45: {
                          if (269 - so.field_e.field_q >= oq.field_H) {
                            break L45;
                          } else {
                            if (269 <= oq.field_H) {
                              break L45;
                            } else {
                              otb.field_q = si.field_s;
                              gt.field_q = false;
                              var4 = 1;
                              break L45;
                            }
                          }
                        }
                        if (-587 <= (oq.field_H ^ -1)) {
                          break L44;
                        } else {
                          if (oq.field_H < 586 + so.field_e.field_q) {
                            otb.field_q = si.field_s;
                            var4 = 1;
                            gt.field_q = true;
                            break L44;
                          } else {
                            break L44;
                          }
                        }
                      } else {
                        break L44;
                      }
                    }
                  }
                }
                if (var4 != 0) {
                  break L43;
                } else {
                  if (otb.field_q <= si.field_p) {
                    break L43;
                  } else {
                    if (var3 >= uia.field_b) {
                      break L43;
                    } else {
                      if (so.field_e.field_p + var3 > uia.field_b) {
                        L46: {
                          if (269 + -so.field_e.field_q >= kc.field_b) {
                            break L46;
                          } else {
                            if (-270 <= kc.field_b) {
                              break L46;
                            } else {
                              L47: {
                                otb.field_q = si.field_p;
                                if (586 >= kc.field_b) {
                                  break L47;
                                } else {
                                  if (kc.field_b < so.field_e.field_q + 586) {
                                    otb.field_q = si.field_p;
                                    break L47;
                                  } else {
                                    break L47;
                                  }
                                }
                              }
                              var3 = 13 % ((param1 - -42) / 37);
                              if (param0) {
                                nna.field_z.a(pmb.a(-1, qs.field_a, oq.field_H), 5620, pmb.a(-1, uia.field_b, kc.field_b));
                                if (nna.field_z.e((byte) -120)) {
                                  if (nna.field_z.field_j != 0) {
                                    if (nna.field_z.field_j != 1) {
                                      L48: while (true) {
                                        if (ata.e(127)) {
                                          L49: {
                                            nna.field_z.a(false, 0);
                                            if (nna.field_z.e((byte) -127)) {
                                              if (0 == nna.field_z.field_j) {
                                                return 3;
                                              } else {
                                                if (-2 != (nna.field_z.field_j ^ -1)) {
                                                  break L49;
                                                } else {
                                                  return 1;
                                                }
                                              }
                                            } else {
                                              break L49;
                                            }
                                          }
                                          if ((pma.field_o ^ -1) != -14) {
                                            continue L48;
                                          } else {
                                            return 1;
                                          }
                                        } else {
                                          return 0;
                                        }
                                      }
                                    } else {
                                      return 2;
                                    }
                                  } else {
                                    return 3;
                                  }
                                } else {
                                  L50: while (true) {
                                    if (ata.e(127)) {
                                      L51: {
                                        nna.field_z.a(false, 0);
                                        if (nna.field_z.e((byte) -127)) {
                                          if (0 == nna.field_z.field_j) {
                                            return 3;
                                          } else {
                                            if (-2 != (nna.field_z.field_j ^ -1)) {
                                              break L51;
                                            } else {
                                              return 1;
                                            }
                                          }
                                        } else {
                                          break L51;
                                        }
                                      }
                                      if ((pma.field_o ^ -1) != -14) {
                                        continue L50;
                                      } else {
                                        return 1;
                                      }
                                    } else {
                                      return 0;
                                    }
                                  }
                                }
                              } else {
                                return 0;
                              }
                            }
                          }
                        }
                        if (586 >= kc.field_b) {
                          break L43;
                        } else {
                          if (kc.field_b < so.field_e.field_q + 586) {
                            otb.field_q = si.field_p;
                            break L43;
                          } else {
                            var3 = 13 % ((param1 - -42) / 37);
                            if (param0) {
                              nna.field_z.a(pmb.a(-1, qs.field_a, oq.field_H), 5620, pmb.a(-1, uia.field_b, kc.field_b));
                              if (nna.field_z.e((byte) -120)) {
                                if (nna.field_z.field_j != 0) {
                                  if (nna.field_z.field_j == 1) {
                                    return 2;
                                  } else {
                                    L52: while (true) {
                                      if (!ata.e(127)) {
                                        return 0;
                                      } else {
                                        L53: {
                                          nna.field_z.a(false, 0);
                                          if (nna.field_z.e((byte) -127)) {
                                            if (0 == nna.field_z.field_j) {
                                              return 3;
                                            } else {
                                              if (-2 != (nna.field_z.field_j ^ -1)) {
                                                break L53;
                                              } else {
                                                return 1;
                                              }
                                            }
                                          } else {
                                            break L53;
                                          }
                                        }
                                        if ((pma.field_o ^ -1) != -14) {
                                          continue L52;
                                        } else {
                                          return 1;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  return 3;
                                }
                              } else {
                                L54: while (true) {
                                  if (!ata.e(127)) {
                                    return 0;
                                  } else {
                                    L55: {
                                      nna.field_z.a(false, 0);
                                      if (nna.field_z.e((byte) -127)) {
                                        if (0 == nna.field_z.field_j) {
                                          return 3;
                                        } else {
                                          if (-2 != (nna.field_z.field_j ^ -1)) {
                                            break L55;
                                          } else {
                                            return 1;
                                          }
                                        }
                                      } else {
                                        break L55;
                                      }
                                    }
                                    if ((pma.field_o ^ -1) != -14) {
                                      continue L54;
                                    } else {
                                      return 1;
                                    }
                                  }
                                }
                              }
                            } else {
                              return 0;
                            }
                          }
                        }
                      } else {
                        var3 = 13 % ((param1 - -42) / 37);
                        if (param0) {
                          L56: {
                            nna.field_z.a(pmb.a(-1, qs.field_a, oq.field_H), 5620, pmb.a(-1, uia.field_b, kc.field_b));
                            if (nna.field_z.e((byte) -120)) {
                              if (nna.field_z.field_j != 0) {
                                if (nna.field_z.field_j == 1) {
                                  return 2;
                                } else {
                                  break L56;
                                }
                              } else {
                                return 3;
                              }
                            } else {
                              break L56;
                            }
                          }
                          L57: while (true) {
                            if (ata.e(127)) {
                              L58: {
                                nna.field_z.a(false, 0);
                                if (nna.field_z.e((byte) -127)) {
                                  if (0 == nna.field_z.field_j) {
                                    return 3;
                                  } else {
                                    if (-2 != (nna.field_z.field_j ^ -1)) {
                                      break L58;
                                    } else {
                                      return 1;
                                    }
                                  }
                                } else {
                                  break L58;
                                }
                              }
                              if (pma.field_o != -14) {
                                continue L57;
                              } else {
                                return 1;
                              }
                            } else {
                              return 0;
                            }
                          }
                        } else {
                          return 0;
                        }
                      }
                    }
                  }
                }
              } else {
                break L43;
              }
            }
            var3 = 13 % ((param1 - -42) / 37);
            if (param0) {
              nna.field_z.a(pmb.a(-1, qs.field_a, oq.field_H), 5620, pmb.a(-1, uia.field_b, kc.field_b));
              if (nna.field_z.e((byte) -120)) {
                if (nna.field_z.field_j != 0) {
                  if (nna.field_z.field_j == 1) {
                    return 2;
                  } else {
                    L59: while (true) {
                      if (!ata.e(127)) {
                        return 0;
                      } else {
                        L60: {
                          nna.field_z.a(false, 0);
                          if (nna.field_z.e((byte) -127)) {
                            if (0 == nna.field_z.field_j) {
                              return 3;
                            } else {
                              if (-2 != (nna.field_z.field_j ^ -1)) {
                                break L60;
                              } else {
                                return 1;
                              }
                            }
                          } else {
                            break L60;
                          }
                        }
                        if ((pma.field_o ^ -1) != -14) {
                          continue L59;
                        } else {
                          return 1;
                        }
                      }
                    }
                  }
                } else {
                  return 3;
                }
              } else {
                L61: while (true) {
                  if (!ata.e(127)) {
                    return 0;
                  } else {
                    L62: {
                      nna.field_z.a(false, 0);
                      if (nna.field_z.e((byte) -127)) {
                        if (0 == nna.field_z.field_j) {
                          return 3;
                        } else {
                          if (-2 != (nna.field_z.field_j ^ -1)) {
                            break L62;
                          } else {
                            return 1;
                          }
                        }
                      } else {
                        break L62;
                      }
                    }
                    if ((pma.field_o ^ -1) != -14) {
                      continue L61;
                    } else {
                      return 1;
                    }
                  }
                }
              }
            } else {
              return 0;
            }
          } else {
            ao.field_o = ao.field_o - si.field_r;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = true;
    }
}
