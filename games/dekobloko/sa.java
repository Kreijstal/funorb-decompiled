/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa extends bh {
    int field_v;
    static String field_n;
    int field_s;
    ck field_o;
    int field_D;
    static int field_p;
    static String field_A;
    String field_r;
    int field_z;
    static ud field_w;
    int field_u;
    int field_y;
    static boolean field_x;
    boolean field_q;
    static vj field_C;
    static String field_B;
    int field_t;

    public static void c(byte param0) {
        field_n = null;
        field_C = null;
        field_A = null;
        field_w = null;
        field_B = null;
        if (param0 >= -65) {
            sa.c((byte) -48);
        }
    }

    final static void a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_12_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_134_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_132_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_127_0 = 0;
        L0: {
          var3 = client.field_A ? 1 : 0;
          jc.field_g = jc.field_g + 1;
          if (field_p != 0) {
            break L0;
          } else {
            if (0 == u.field_e) {
              u.field_e = pm.field_f;
              field_p = bh.field_g;
              break L0;
            } else {
              if (param0 != null) {
                if (param0.equals((Object) (Object) k.field_e)) {
                  L1: {
                    k.field_e = param0;
                    if (wd.field_d) {
                      break L1;
                    } else {
                      if (o.field_b <= jc.field_g) {
                        break L1;
                      } else {
                        if (!pm.field_b) {
                          break L1;
                        } else {
                          dh.field_e = u.field_e;
                          pa.field_Z = field_p;
                          jc.field_g = 0;
                          break L1;
                        }
                      }
                    }
                  }
                  L2: {
                    field_p = param1;
                    u.field_e = -1;
                    if (!wd.field_d) {
                      break L2;
                    } else {
                      if (ve.field_hc == jc.field_g) {
                        jc.field_g = 0;
                        wd.field_d = false;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  return;
                } else {
                  L3: {
                    if (!wd.field_d) {
                      if (jc.field_g >= o.field_b) {
                        if (o.field_b - -he.field_gb > jc.field_g) {
                          stackOut_54_0 = 1;
                          stackIn_56_0 = stackOut_54_0;
                          break L3;
                        } else {
                          stackOut_53_0 = 0;
                          stackIn_56_0 = stackOut_53_0;
                          break L3;
                        }
                      } else {
                        stackOut_51_0 = 0;
                        stackIn_56_0 = stackOut_51_0;
                        break L3;
                      }
                    } else {
                      stackOut_49_0 = 0;
                      stackIn_56_0 = stackOut_49_0;
                      break L3;
                    }
                  }
                  L4: {
                    var2 = stackIn_56_0;
                    if (param0 != null) {
                      if (wd.field_d) {
                        jc.field_g = o.field_b;
                        break L4;
                      } else {
                        if (var2 != 0) {
                          jc.field_g = o.field_b;
                          break L4;
                        } else {
                          jc.field_g = 0;
                          break L4;
                        }
                      }
                    } else {
                      jc.field_g = 0;
                      break L4;
                    }
                  }
                  L5: {
                    if (param0 != null) {
                      wd.field_d = false;
                      dh.field_e = u.field_e;
                      pa.field_Z = field_p;
                      break L5;
                    } else {
                      if (var2 != 0) {
                        wd.field_d = true;
                        dh.field_e = u.field_e;
                        pa.field_Z = field_p;
                        break L5;
                      } else {
                        dh.field_e = u.field_e;
                        pa.field_Z = field_p;
                        break L5;
                      }
                    }
                  }
                  L6: {
                    k.field_e = param0;
                    if (wd.field_d) {
                      break L6;
                    } else {
                      if (o.field_b <= jc.field_g) {
                        break L6;
                      } else {
                        if (!pm.field_b) {
                          break L6;
                        } else {
                          dh.field_e = u.field_e;
                          pa.field_Z = field_p;
                          jc.field_g = 0;
                          break L6;
                        }
                      }
                    }
                  }
                  L7: {
                    field_p = param1;
                    u.field_e = -1;
                    if (!wd.field_d) {
                      break L7;
                    } else {
                      if (ve.field_hc == jc.field_g) {
                        jc.field_g = 0;
                        wd.field_d = false;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                  return;
                }
              } else {
                if (null != k.field_e) {
                  L8: {
                    k.field_e = param0;
                    if (wd.field_d) {
                      break L8;
                    } else {
                      if (o.field_b <= jc.field_g) {
                        break L8;
                      } else {
                        if (!pm.field_b) {
                          break L8;
                        } else {
                          dh.field_e = u.field_e;
                          pa.field_Z = field_p;
                          jc.field_g = 0;
                          break L8;
                        }
                      }
                    }
                  }
                  L9: {
                    field_p = param1;
                    u.field_e = -1;
                    if (!wd.field_d) {
                      break L9;
                    } else {
                      if (ve.field_hc == jc.field_g) {
                        jc.field_g = 0;
                        wd.field_d = false;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                  }
                  return;
                } else {
                  L10: {
                    if (!wd.field_d) {
                      if (jc.field_g >= o.field_b) {
                        if (o.field_b - -he.field_gb > jc.field_g) {
                          stackOut_10_0 = 1;
                          stackIn_12_0 = stackOut_10_0;
                          break L10;
                        } else {
                          stackOut_9_0 = 0;
                          stackIn_12_0 = stackOut_9_0;
                          break L10;
                        }
                      } else {
                        stackOut_7_0 = 0;
                        stackIn_12_0 = stackOut_7_0;
                        break L10;
                      }
                    } else {
                      stackOut_5_0 = 0;
                      stackIn_12_0 = stackOut_5_0;
                      break L10;
                    }
                  }
                  L11: {
                    var2 = stackIn_12_0;
                    if (param0 != null) {
                      L12: {
                        if (wd.field_d) {
                          break L12;
                        } else {
                          if (var2 != 0) {
                            break L12;
                          } else {
                            jc.field_g = 0;
                            break L11;
                          }
                        }
                      }
                      jc.field_g = o.field_b;
                      break L11;
                    } else {
                      jc.field_g = 0;
                      break L11;
                    }
                  }
                  L13: {
                    if (param0 != null) {
                      wd.field_d = false;
                      dh.field_e = u.field_e;
                      pa.field_Z = field_p;
                      break L13;
                    } else {
                      if (var2 != 0) {
                        wd.field_d = true;
                        dh.field_e = u.field_e;
                        pa.field_Z = field_p;
                        break L13;
                      } else {
                        dh.field_e = u.field_e;
                        pa.field_Z = field_p;
                        break L13;
                      }
                    }
                  }
                  L14: {
                    k.field_e = param0;
                    if (wd.field_d) {
                      break L14;
                    } else {
                      if (o.field_b <= jc.field_g) {
                        break L14;
                      } else {
                        if (!pm.field_b) {
                          break L14;
                        } else {
                          dh.field_e = u.field_e;
                          pa.field_Z = field_p;
                          jc.field_g = 0;
                          break L14;
                        }
                      }
                    }
                  }
                  L15: {
                    field_p = param1;
                    u.field_e = -1;
                    if (!wd.field_d) {
                      break L15;
                    } else {
                      if (ve.field_hc == jc.field_g) {
                        jc.field_g = 0;
                        wd.field_d = false;
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                  }
                  return;
                }
              }
            }
          }
        }
        L16: {
          if (param0 != null) {
            if (!param0.equals((Object) (Object) k.field_e)) {
              break L16;
            } else {
              L17: {
                k.field_e = param0;
                if (wd.field_d) {
                  break L17;
                } else {
                  if (o.field_b <= jc.field_g) {
                    break L17;
                  } else {
                    if (!pm.field_b) {
                      break L17;
                    } else {
                      dh.field_e = u.field_e;
                      pa.field_Z = field_p;
                      jc.field_g = 0;
                      field_p = param1;
                      u.field_e = -1;
                      if (wd.field_d) {
                        if (ve.field_hc != jc.field_g) {
                          return;
                        } else {
                          jc.field_g = 0;
                          wd.field_d = false;
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
              field_p = param1;
              u.field_e = -1;
              if (wd.field_d) {
                if (ve.field_hc == jc.field_g) {
                  jc.field_g = 0;
                  wd.field_d = false;
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            if (null == k.field_e) {
              break L16;
            } else {
              L18: {
                k.field_e = param0;
                if (wd.field_d) {
                  break L18;
                } else {
                  if (o.field_b <= jc.field_g) {
                    break L18;
                  } else {
                    if (!pm.field_b) {
                      break L18;
                    } else {
                      dh.field_e = u.field_e;
                      pa.field_Z = field_p;
                      jc.field_g = 0;
                      field_p = param1;
                      u.field_e = -1;
                      if (wd.field_d) {
                        if (ve.field_hc != jc.field_g) {
                          return;
                        } else {
                          jc.field_g = 0;
                          wd.field_d = false;
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
              field_p = param1;
              u.field_e = -1;
              if (wd.field_d) {
                if (ve.field_hc != jc.field_g) {
                  return;
                } else {
                  jc.field_g = 0;
                  wd.field_d = false;
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
        L19: {
          if (!wd.field_d) {
            if (jc.field_g >= o.field_b) {
              if (o.field_b - -he.field_gb > jc.field_g) {
                stackOut_132_0 = 1;
                stackIn_134_0 = stackOut_132_0;
                break L19;
              } else {
                stackOut_131_0 = 0;
                stackIn_134_0 = stackOut_131_0;
                break L19;
              }
            } else {
              stackOut_129_0 = 0;
              stackIn_134_0 = stackOut_129_0;
              break L19;
            }
          } else {
            stackOut_127_0 = 0;
            stackIn_134_0 = stackOut_127_0;
            break L19;
          }
        }
        L20: {
          var2 = stackIn_134_0;
          if (param0 == null) {
            jc.field_g = 0;
            break L20;
          } else {
            if (wd.field_d) {
              jc.field_g = o.field_b;
              break L20;
            } else {
              if (var2 == 0) {
                L21: {
                  jc.field_g = 0;
                  if (param0 != null) {
                    wd.field_d = false;
                    dh.field_e = u.field_e;
                    pa.field_Z = field_p;
                    break L21;
                  } else {
                    if (var2 != 0) {
                      wd.field_d = true;
                      dh.field_e = u.field_e;
                      pa.field_Z = field_p;
                      break L21;
                    } else {
                      dh.field_e = u.field_e;
                      pa.field_Z = field_p;
                      break L21;
                    }
                  }
                }
                L22: {
                  k.field_e = param0;
                  if (wd.field_d) {
                    break L22;
                  } else {
                    if (o.field_b <= jc.field_g) {
                      break L22;
                    } else {
                      if (!pm.field_b) {
                        break L22;
                      } else {
                        dh.field_e = u.field_e;
                        pa.field_Z = field_p;
                        jc.field_g = 0;
                        break L22;
                      }
                    }
                  }
                }
                L23: {
                  field_p = param1;
                  u.field_e = -1;
                  if (!wd.field_d) {
                    break L23;
                  } else {
                    if (ve.field_hc == jc.field_g) {
                      jc.field_g = 0;
                      wd.field_d = false;
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                }
                return;
              } else {
                jc.field_g = o.field_b;
                break L20;
              }
            }
          }
        }
        if (param0 != null) {
          wd.field_d = false;
          L24: {
            dh.field_e = u.field_e;
            pa.field_Z = field_p;
            k.field_e = param0;
            if (wd.field_d) {
              break L24;
            } else {
              if (o.field_b <= jc.field_g) {
                break L24;
              } else {
                if (!pm.field_b) {
                  break L24;
                } else {
                  L25: {
                    dh.field_e = u.field_e;
                    pa.field_Z = field_p;
                    jc.field_g = 0;
                    field_p = param1;
                    u.field_e = -1;
                    if (!wd.field_d) {
                      break L25;
                    } else {
                      if (ve.field_hc == jc.field_g) {
                        jc.field_g = 0;
                        wd.field_d = false;
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                  }
                  return;
                }
              }
            }
          }
          L26: {
            field_p = param1;
            u.field_e = -1;
            if (!wd.field_d) {
              break L26;
            } else {
              if (ve.field_hc == jc.field_g) {
                jc.field_g = 0;
                wd.field_d = false;
                break L26;
              } else {
                return;
              }
            }
          }
          return;
        } else {
          if (var2 != 0) {
            wd.field_d = true;
            L27: {
              dh.field_e = u.field_e;
              pa.field_Z = field_p;
              k.field_e = param0;
              if (wd.field_d) {
                break L27;
              } else {
                if (o.field_b <= jc.field_g) {
                  break L27;
                } else {
                  if (!pm.field_b) {
                    break L27;
                  } else {
                    L28: {
                      dh.field_e = u.field_e;
                      pa.field_Z = field_p;
                      jc.field_g = 0;
                      field_p = param1;
                      u.field_e = -1;
                      if (!wd.field_d) {
                        break L28;
                      } else {
                        if (ve.field_hc == jc.field_g) {
                          jc.field_g = 0;
                          wd.field_d = false;
                          break L28;
                        } else {
                          break L28;
                        }
                      }
                    }
                    return;
                  }
                }
              }
            }
            field_p = param1;
            u.field_e = -1;
            if (wd.field_d) {
              if (ve.field_hc == jc.field_g) {
                jc.field_g = 0;
                wd.field_d = false;
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            L29: {
              dh.field_e = u.field_e;
              pa.field_Z = field_p;
              k.field_e = param0;
              if (wd.field_d) {
                break L29;
              } else {
                if (o.field_b <= jc.field_g) {
                  break L29;
                } else {
                  if (!pm.field_b) {
                    break L29;
                  } else {
                    dh.field_e = u.field_e;
                    pa.field_Z = field_p;
                    jc.field_g = 0;
                    break L29;
                  }
                }
              }
            }
            field_p = param1;
            u.field_e = -1;
            if (wd.field_d) {
              if (ve.field_hc != jc.field_g) {
                return;
              } else {
                jc.field_g = 0;
                wd.field_d = false;
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    sa(boolean param0, int param1, int param2, int param3, int[] param4, int param5, int param6, String[] param7) {
        ((sa) this).field_t = param3;
        ((sa) this).field_u = param1;
        ((sa) this).field_y = param6;
        ((sa) this).field_q = param0 ? true : false;
        ((sa) this).field_D = param2;
        ((sa) this).field_r = hf.a(param7.length, 0, (CharSequence[]) (Object) param7, (byte) 74);
        if (param4 != null) {
            if (param5 >= param4.length) {
                param5 = param4.length + -1;
            }
            ((sa) this).field_s = param4[param5];
        } else {
            ((sa) this).field_s = param5;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "OVER <%0>";
        field_p = -1;
        field_A = "members-only content";
        field_C = new vj();
    }
}
