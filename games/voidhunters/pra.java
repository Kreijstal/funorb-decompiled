/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pra extends rqa {
    static int field_o;
    static Object field_p;
    static String field_q;

    pra(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            return null;
        }
        return new nc((Object) (Object) frb.a(59, 121));
    }

    final static void a(boolean param0, boolean param1) {
        int var3 = 0;
        L0: {
          var3 = VoidHunters.field_G;
          if (param0) {
            wo.field_o = false;
            break L0;
          } else {
            if (null == lqa.field_o) {
              wo.field_o = false;
              break L0;
            } else {
              if (param0) {
                if (-1 > (lia.field_b ^ -1)) {
                  L1: {
                    lia.field_b = lia.field_b - 1;
                    if (param1) {
                      break L1;
                    } else {
                      pra.a(true, false);
                      break L1;
                    }
                  }
                  return;
                } else {
                  if (-1 <= (nf.field_a ^ -1)) {
                    if ((tba.field_p ^ -1) < -1) {
                      L2: {
                        tba.field_p = tba.field_p - 1;
                        if (param1) {
                          break L2;
                        } else {
                          pra.a(true, false);
                          break L2;
                        }
                      }
                      return;
                    } else {
                      if (param1) {
                        return;
                      } else {
                        pra.a(true, false);
                        return;
                      }
                    }
                  } else {
                    L3: {
                      nf.field_a = nf.field_a - 1;
                      if (param1) {
                        break L3;
                      } else {
                        pra.a(true, false);
                        break L3;
                      }
                    }
                    return;
                  }
                }
              } else {
                L4: {
                  if (lqa.field_o != null) {
                    if (0 >= lia.field_b) {
                      if ((nf.field_a ^ -1) >= -1) {
                        if (ldb.field_o > tba.field_p) {
                          if (-1 != (tba.field_p ^ -1)) {
                            L5: {
                              tba.field_p = tba.field_p + 1;
                              if (param1) {
                                break L5;
                              } else {
                                pra.a(true, false);
                                break L5;
                              }
                            }
                            return;
                          } else {
                            L6: {
                              ai.a(false, 0);
                              tba.field_p = tba.field_p + 1;
                              if (param1) {
                                break L6;
                              } else {
                                pra.a(true, false);
                                break L6;
                              }
                            }
                            return;
                          }
                        } else {
                          break L4;
                        }
                      } else {
                        nf.field_a = nf.field_a - 1;
                        break L4;
                      }
                    } else {
                      lia.field_b = lia.field_b - 1;
                      break L4;
                    }
                  } else {
                    if (null != ohb.field_o) {
                      if (0 < lia.field_b) {
                        lia.field_b = lia.field_b - 1;
                        break L4;
                      } else {
                        if (0 < tba.field_p) {
                          tba.field_p = tba.field_p - 1;
                          break L4;
                        } else {
                          if ((nf.field_a ^ -1) > (ldb.field_o ^ -1)) {
                            L7: {
                              if (-1 == (nf.field_a ^ -1)) {
                                ai.a(true, 0);
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            nf.field_a = nf.field_a + 1;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                    } else {
                      wo.field_o = false;
                      if (0 < nf.field_a) {
                        nf.field_a = nf.field_a - 1;
                        break L4;
                      } else {
                        if (-1 <= (tba.field_p ^ -1)) {
                          if ((lia.field_b ^ -1) > (ldb.field_o ^ -1)) {
                            fma.l(8611);
                            lia.field_b = lia.field_b + 1;
                            break L4;
                          } else {
                            if (param1) {
                              return;
                            } else {
                              pra.a(true, false);
                              return;
                            }
                          }
                        } else {
                          tba.field_p = tba.field_p - 1;
                          break L4;
                        }
                      }
                    }
                  }
                }
                if (param1) {
                  return;
                } else {
                  pra.a(true, false);
                  return;
                }
              }
            }
          }
        }
        L8: {
          if (param0) {
            if (-1 > (lia.field_b ^ -1)) {
              lia.field_b = lia.field_b - 1;
              if (param1) {
                return;
              } else {
                pra.a(true, false);
                return;
              }
            } else {
              if (-1 <= (nf.field_a ^ -1)) {
                if ((tba.field_p ^ -1) >= -1) {
                  break L8;
                } else {
                  tba.field_p = tba.field_p - 1;
                  if (param1) {
                    return;
                  } else {
                    pra.a(true, false);
                    return;
                  }
                }
              } else {
                nf.field_a = nf.field_a - 1;
                if (param1) {
                  return;
                } else {
                  pra.a(true, false);
                  return;
                }
              }
            }
          } else {
            if (lqa.field_o != null) {
              if (0 >= lia.field_b) {
                if ((nf.field_a ^ -1) >= -1) {
                  if (ldb.field_o > tba.field_p) {
                    if (-1 != (tba.field_p ^ -1)) {
                      tba.field_p = tba.field_p + 1;
                      if (param1) {
                        return;
                      } else {
                        pra.a(true, false);
                        return;
                      }
                    } else {
                      ai.a(false, 0);
                      tba.field_p = tba.field_p + 1;
                      if (param1) {
                        return;
                      } else {
                        pra.a(true, false);
                        return;
                      }
                    }
                  } else {
                    break L8;
                  }
                } else {
                  nf.field_a = nf.field_a - 1;
                  break L8;
                }
              } else {
                lia.field_b = lia.field_b - 1;
                break L8;
              }
            } else {
              if (null != ohb.field_o) {
                if (0 < lia.field_b) {
                  lia.field_b = lia.field_b - 1;
                  break L8;
                } else {
                  if (0 < tba.field_p) {
                    tba.field_p = tba.field_p - 1;
                    break L8;
                  } else {
                    if ((nf.field_a ^ -1) > (ldb.field_o ^ -1)) {
                      L9: {
                        if (-1 == (nf.field_a ^ -1)) {
                          ai.a(true, 0);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      nf.field_a = nf.field_a + 1;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
              } else {
                wo.field_o = false;
                if (0 < nf.field_a) {
                  nf.field_a = nf.field_a - 1;
                  break L8;
                } else {
                  if (-1 <= (tba.field_p ^ -1)) {
                    if ((lia.field_b ^ -1) > (ldb.field_o ^ -1)) {
                      fma.l(8611);
                      lia.field_b = lia.field_b + 1;
                      break L8;
                    } else {
                      if (param1) {
                        return;
                      } else {
                        pra.a(true, false);
                        return;
                      }
                    }
                  } else {
                    tba.field_p = tba.field_p - 1;
                    break L8;
                  }
                }
              }
            }
          }
        }
        if (param1) {
          return;
        } else {
          pra.a(true, false);
          return;
        }
    }

    public static void a(int param0) {
        if (param0 >= -71) {
            field_p = null;
            field_q = null;
            field_p = null;
            return;
        }
        field_q = null;
        field_p = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Ship blueprint recorded";
    }
}
