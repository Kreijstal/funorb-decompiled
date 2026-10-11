/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eja extends rqa {
    static String field_p;
    static int[] field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -119) {
            field_p = (String) null;
          }
          stackIn_3_0 = new nc(lfa.field_j);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("eja.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    eja(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, int param1, int param2) {
        if (null == hb.field_d ||
          !(hb.field_d.length >= param1)) {
          hb.field_d = new int[2 * param1];
        }
        if (fmb.field_o == null) {
          fmb.field_o = new int[param1 * 2];
          if (null == emb.field_o ||
            !(param1 <= emb.field_o.length)) {
            emb.field_o = new int[param1 * 2];
          }
          if (hma.field_d == null ||
            !(hma.field_d.length >= param1)) {
            hma.field_d = new int[2 * param1];
          }
          if (null == fv.field_o) {
            fv.field_o = new int[2 * param1];
            if (hga.field_o == null ||
              !(param1 <= hga.field_o.length)) {
              hga.field_o = new int[2 * param1];
            }
            if (null == sv.field_f ||
              !(sv.field_f.length >= param0 + param1)) {
              sv.field_f = new int[2 * (param0 + param1)];
            }
            if (uj.field_a == null ||
              !(param1 <= uj.field_a.length)) {
              uj.field_a = new boolean[param1 * 2];
            }
          } else {
            if (param1 > fv.field_o.length) {
              fv.field_o = new int[2 * param1];
              if (hga.field_o == null ||
                !(param1 <= hga.field_o.length)) {
                hga.field_o = new int[2 * param1];
              }
              if (null == sv.field_f ||
                !(sv.field_f.length >= param0 + param1)) {
                sv.field_f = new int[2 * (param0 + param1)];
              }
              if (uj.field_a == null ||
                !(param1 <= uj.field_a.length)) {
                uj.field_a = new boolean[param1 * 2];
              }
            } else {
              if (hga.field_o == null) {
                hga.field_o = new int[2 * param1];
                if (null == sv.field_f ||
                  !(sv.field_f.length >= param0 + param1)) {
                  sv.field_f = new int[2 * (param0 + param1)];
                }
                if (uj.field_a == null ||
                  !(param1 <= uj.field_a.length)) {
                  uj.field_a = new boolean[param1 * 2];
                }
              } else {
                if (param1 > hga.field_o.length) {
                  hga.field_o = new int[2 * param1];
                  if (null == sv.field_f ||
                    !(sv.field_f.length >= param0 + param1)) {
                    sv.field_f = new int[2 * (param0 + param1)];
                  }
                  if (uj.field_a == null ||
                    !(param1 <= uj.field_a.length)) {
                    uj.field_a = new boolean[param1 * 2];
                  }
                } else {
                  if (null == sv.field_f) {
                    sv.field_f = new int[2 * (param0 + param1)];
                    if (uj.field_a == null ||
                      !(param1 <= uj.field_a.length)) {
                      uj.field_a = new boolean[param1 * 2];
                    }
                  } else {
                    if (sv.field_f.length >= param0 + param1) {
                      if (uj.field_a == null ||
                        !(param1 <= uj.field_a.length)) {
                        uj.field_a = new boolean[param1 * 2];
                      }
                    } else {
                      sv.field_f = new int[2 * (param0 + param1)];
                      if (uj.field_a == null ||
                        !(param1 <= uj.field_a.length)) {
                        uj.field_a = new boolean[param1 * 2];
                      }
                    }
                  }
                }
              }
            }
          }
        } else {
          if (param1 <= fmb.field_o.length) {
            if (null == emb.field_o ||
              !(param1 <= emb.field_o.length)) {
              emb.field_o = new int[param1 * 2];
            }
            if (hma.field_d == null ||
              !(hma.field_d.length >= param1)) {
              hma.field_d = new int[2 * param1];
            }
            if (null == fv.field_o) {
              fv.field_o = new int[2 * param1];
              if (hga.field_o == null ||
                !(param1 <= hga.field_o.length)) {
                hga.field_o = new int[2 * param1];
              }
              if (null == sv.field_f ||
                !(sv.field_f.length >= param0 + param1)) {
                sv.field_f = new int[2 * (param0 + param1)];
              }
              if (uj.field_a == null ||
                !(param1 <= uj.field_a.length)) {
                uj.field_a = new boolean[param1 * 2];
              }
            } else {
              if (param1 > fv.field_o.length) {
                fv.field_o = new int[2 * param1];
                if (hga.field_o == null ||
                  !(param1 <= hga.field_o.length)) {
                  hga.field_o = new int[2 * param1];
                }
                if (null == sv.field_f ||
                  !(sv.field_f.length >= param0 + param1)) {
                  sv.field_f = new int[2 * (param0 + param1)];
                }
                if (uj.field_a == null ||
                  !(param1 <= uj.field_a.length)) {
                  uj.field_a = new boolean[param1 * 2];
                }
              } else {
                if (hga.field_o == null) {
                  hga.field_o = new int[2 * param1];
                  if (null == sv.field_f ||
                    !(sv.field_f.length >= param0 + param1)) {
                    sv.field_f = new int[2 * (param0 + param1)];
                  }
                  if (uj.field_a == null ||
                    !(param1 <= uj.field_a.length)) {
                    uj.field_a = new boolean[param1 * 2];
                  }
                } else {
                  if (param1 > hga.field_o.length) {
                    hga.field_o = new int[2 * param1];
                    if (null == sv.field_f ||
                      !(sv.field_f.length >= param0 + param1)) {
                      sv.field_f = new int[2 * (param0 + param1)];
                    }
                    if (uj.field_a == null ||
                      !(param1 <= uj.field_a.length)) {
                      uj.field_a = new boolean[param1 * 2];
                    }
                  } else {
                    if (null == sv.field_f) {
                      sv.field_f = new int[2 * (param0 + param1)];
                      if (uj.field_a == null ||
                        !(param1 <= uj.field_a.length)) {
                        uj.field_a = new boolean[param1 * 2];
                      }
                    } else {
                      if (sv.field_f.length >= param0 + param1) {
                        if (uj.field_a == null ||
                          !(param1 <= uj.field_a.length)) {
                          uj.field_a = new boolean[param1 * 2];
                        }
                      } else {
                        sv.field_f = new int[2 * (param0 + param1)];
                        if (uj.field_a == null ||
                          !(param1 <= uj.field_a.length)) {
                          uj.field_a = new boolean[param1 * 2];
                        }
                      }
                    }
                  }
                }
              }
            }
          } else {
            fmb.field_o = new int[param1 * 2];
            if (null == emb.field_o ||
              !(param1 <= emb.field_o.length)) {
              emb.field_o = new int[param1 * 2];
            }
            if (hma.field_d == null ||
              !(hma.field_d.length >= param1)) {
              hma.field_d = new int[2 * param1];
            }
            if (null == fv.field_o) {
              fv.field_o = new int[2 * param1];
              if (hga.field_o == null ||
                !(param1 <= hga.field_o.length)) {
                hga.field_o = new int[2 * param1];
              }
              if (null == sv.field_f) {
                sv.field_f = new int[2 * (param0 + param1)];
                if (uj.field_a == null ||
                  !(param1 <= uj.field_a.length)) {
                  uj.field_a = new boolean[param1 * 2];
                }
              } else {
                if (sv.field_f.length >= param0 + param1) {
                  if (uj.field_a == null ||
                    !(param1 <= uj.field_a.length)) {
                    uj.field_a = new boolean[param1 * 2];
                  }
                } else {
                  sv.field_f = new int[2 * (param0 + param1)];
                  if (uj.field_a == null ||
                    !(param1 <= uj.field_a.length)) {
                    uj.field_a = new boolean[param1 * 2];
                  }
                }
              }
            } else {
              if (param1 > fv.field_o.length) {
                fv.field_o = new int[2 * param1];
                if (hga.field_o == null ||
                  !(param1 <= hga.field_o.length)) {
                  hga.field_o = new int[2 * param1];
                }
                if (null == sv.field_f ||
                  !(sv.field_f.length >= param0 + param1)) {
                  sv.field_f = new int[2 * (param0 + param1)];
                }
                if (uj.field_a == null ||
                  !(param1 <= uj.field_a.length)) {
                  uj.field_a = new boolean[param1 * 2];
                }
              } else {
                if (hga.field_o == null) {
                  hga.field_o = new int[2 * param1];
                  if (null == sv.field_f) {
                    sv.field_f = new int[2 * (param0 + param1)];
                    if (uj.field_a == null ||
                      !(param1 <= uj.field_a.length)) {
                      uj.field_a = new boolean[param1 * 2];
                    }
                  } else {
                    if (sv.field_f.length >= param0 + param1) {
                      if (uj.field_a == null ||
                        !(param1 <= uj.field_a.length)) {
                        uj.field_a = new boolean[param1 * 2];
                      }
                    } else {
                      sv.field_f = new int[2 * (param0 + param1)];
                      if (uj.field_a == null ||
                        !(param1 <= uj.field_a.length)) {
                        uj.field_a = new boolean[param1 * 2];
                      }
                    }
                  }
                } else {
                  if (param1 <= hga.field_o.length) {
                    if (null == sv.field_f) {
                      sv.field_f = new int[2 * (param0 + param1)];
                      if (uj.field_a == null ||
                        !(param1 <= uj.field_a.length)) {
                        uj.field_a = new boolean[param1 * 2];
                      }
                    } else {
                      if (sv.field_f.length >= param0 + param1) {
                        if (uj.field_a == null ||
                          !(param1 <= uj.field_a.length)) {
                          uj.field_a = new boolean[param1 * 2];
                        }
                      } else {
                        sv.field_f = new int[2 * (param0 + param1)];
                        if (uj.field_a == null ||
                          !(param1 <= uj.field_a.length)) {
                          uj.field_a = new boolean[param1 * 2];
                        }
                      }
                    }
                  } else {
                    hga.field_o = new int[2 * param1];
                    if (null == sv.field_f) {
                      sv.field_f = new int[2 * (param0 + param1)];
                      if (uj.field_a == null ||
                        !(param1 <= uj.field_a.length)) {
                        uj.field_a = new boolean[param1 * 2];
                      }
                    } else {
                      if (sv.field_f.length >= param0 + param1) {
                        if (uj.field_a == null ||
                          !(param1 <= uj.field_a.length)) {
                          uj.field_a = new boolean[param1 * 2];
                        }
                      } else {
                        sv.field_f = new int[2 * (param0 + param1)];
                        if (uj.field_a == null ||
                          !(param1 <= uj.field_a.length)) {
                          uj.field_a = new boolean[param1 * 2];
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        rha.field_d = 2147483647;
        qbb.field_a = -2147483648;
        pn.field_b = -2147483648;
        bea.field_e = param2;
        npa.field_d = 2147483647;
    }

    public static void a(int param0) {
        if (param0 != 2) {
          eja.a(-99);
          field_o = null;
          field_p = null;
          return;
        }
        field_o = null;
        field_p = null;
    }

    final static boolean a(int param0, byte param1, int param2) {
        if (param1 >= -49) {
          return false;
        }
        return (param0 & 2048) != 0 ? true : false;
    }

    static {
        field_o = new int[4];
        field_p = "Next condition/action";
    }
}
