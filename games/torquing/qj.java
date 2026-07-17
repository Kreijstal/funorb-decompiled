/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    static String field_b;
    static int field_f;
    String field_c;
    String field_d;
    static String field_a;
    boolean field_e;

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_208_0 = 0;
        int stackOut_207_0 = 0;
        int stackOut_206_0 = 0;
        L0: {
          var3 = Torquing.field_u;
          q.field_d = q.field_d + 1;
          if (param1 == il.field_l) {
            il.field_l = param1;
            if (!wa.field_f) {
              if (q.field_d < dg.field_h) {
                L1: {
                  if (!he.field_a) {
                    break L1;
                  } else {
                    ro.field_w = n.field_t;
                    ue.field_h = k.field_e;
                    q.field_d = 0;
                    break L1;
                  }
                }
                if (!wa.field_f) {
                  break L0;
                } else {
                  if (q.field_d != p.field_u) {
                    break L0;
                  } else {
                    wa.field_f = false;
                    q.field_d = 0;
                    break L0;
                  }
                }
              } else {
                L2: {
                  if (!wa.field_f) {
                    break L2;
                  } else {
                    if (q.field_d != p.field_u) {
                      break L2;
                    } else {
                      wa.field_f = false;
                      q.field_d = 0;
                      if (!wa.field_f) {
                        break L0;
                      } else {
                        if (q.field_d != p.field_u) {
                          break L0;
                        } else {
                          wa.field_f = false;
                          q.field_d = 0;
                          break L0;
                        }
                      }
                    }
                  }
                }
                return;
              }
            } else {
              L3: {
                if (!wa.field_f) {
                  break L3;
                } else {
                  if (q.field_d != p.field_u) {
                    break L3;
                  } else {
                    wa.field_f = false;
                    q.field_d = 0;
                    break L3;
                  }
                }
              }
              return;
            }
          } else {
            if (!wa.field_f) {
              if (q.field_d >= dg.field_h) {
                L4: {
                  if (cf.field_e + dg.field_h <= q.field_d) {
                    stackOut_207_0 = 0;
                    stackIn_208_0 = stackOut_207_0;
                    break L4;
                  } else {
                    stackOut_206_0 = 1;
                    stackIn_208_0 = stackOut_206_0;
                    break L4;
                  }
                }
                L5: {
                  var2 = stackIn_208_0;
                  if (param1 == -1) {
                    q.field_d = 0;
                    break L5;
                  } else {
                    if (!wa.field_f) {
                      if (var2 == 0) {
                        q.field_d = 0;
                        break L5;
                      } else {
                        q.field_d = dg.field_h;
                        break L5;
                      }
                    } else {
                      q.field_d = dg.field_h;
                      break L5;
                    }
                  }
                }
                ue.field_h = k.field_e;
                ro.field_w = n.field_t;
                if (-1 == param1) {
                  if (var2 != 0) {
                    wa.field_f = true;
                    L6: {
                      il.field_l = param1;
                      if (wa.field_f) {
                        break L6;
                      } else {
                        if (q.field_d >= dg.field_h) {
                          break L6;
                        } else {
                          if (!he.field_a) {
                            break L6;
                          } else {
                            ro.field_w = n.field_t;
                            ue.field_h = k.field_e;
                            q.field_d = 0;
                            if (wa.field_f) {
                              if (q.field_d != p.field_u) {
                                return;
                              } else {
                                wa.field_f = false;
                                q.field_d = 0;
                                return;
                              }
                            } else {
                              return;
                            }
                          }
                        }
                      }
                    }
                    if (wa.field_f) {
                      if (q.field_d == p.field_u) {
                        wa.field_f = false;
                        q.field_d = 0;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    L7: {
                      il.field_l = param1;
                      if (wa.field_f) {
                        break L7;
                      } else {
                        if (q.field_d >= dg.field_h) {
                          break L7;
                        } else {
                          if (!he.field_a) {
                            break L7;
                          } else {
                            ro.field_w = n.field_t;
                            ue.field_h = k.field_e;
                            q.field_d = 0;
                            if (wa.field_f) {
                              if (q.field_d != p.field_u) {
                                return;
                              } else {
                                wa.field_f = false;
                                q.field_d = 0;
                                return;
                              }
                            } else {
                              return;
                            }
                          }
                        }
                      }
                    }
                    if (wa.field_f) {
                      if (q.field_d != p.field_u) {
                        return;
                      } else {
                        wa.field_f = false;
                        q.field_d = 0;
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  wa.field_f = false;
                  if (wa.field_f) {
                    if (q.field_d == p.field_u) {
                      wa.field_f = false;
                      q.field_d = 0;
                      break L0;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                L8: {
                  var2 = 0;
                  if (param1 != -1) {
                    if (!wa.field_f) {
                      if (var2 != 0) {
                        q.field_d = dg.field_h;
                        break L8;
                      } else {
                        q.field_d = 0;
                        break L8;
                      }
                    } else {
                      q.field_d = dg.field_h;
                      break L8;
                    }
                  } else {
                    q.field_d = 0;
                    break L8;
                  }
                }
                ue.field_h = k.field_e;
                ro.field_w = n.field_t;
                if (-1 == param1) {
                  if (var2 != 0) {
                    wa.field_f = true;
                    L9: {
                      il.field_l = param1;
                      if (!wa.field_f) {
                        if (!wa.field_f) {
                          break L9;
                        } else {
                          L10: {
                            if (q.field_d == p.field_u) {
                              break L10;
                            } else {
                              if (!wa.field_f) {
                                break L9;
                              } else {
                                if (q.field_d != p.field_u) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                          wa.field_f = false;
                          q.field_d = 0;
                          break L9;
                        }
                      } else {
                        if (!wa.field_f) {
                          break L9;
                        } else {
                          if (q.field_d != p.field_u) {
                            break L9;
                          } else {
                            wa.field_f = false;
                            q.field_d = 0;
                            break L9;
                          }
                        }
                      }
                    }
                    return;
                  } else {
                    il.field_l = param1;
                    if (!wa.field_f) {
                      if (q.field_d < dg.field_h) {
                        if (he.field_a) {
                          ro.field_w = n.field_t;
                          ue.field_h = k.field_e;
                          q.field_d = 0;
                          if (wa.field_f) {
                            if (q.field_d == p.field_u) {
                              wa.field_f = false;
                              q.field_d = 0;
                              return;
                            } else {
                              return;
                            }
                          } else {
                            return;
                          }
                        } else {
                          L11: {
                            if (!wa.field_f) {
                              break L11;
                            } else {
                              if (q.field_d != p.field_u) {
                                break L11;
                              } else {
                                wa.field_f = false;
                                q.field_d = 0;
                                break L11;
                              }
                            }
                          }
                          return;
                        }
                      } else {
                        L12: {
                          if (!wa.field_f) {
                            break L12;
                          } else {
                            if (q.field_d != p.field_u) {
                              break L12;
                            } else {
                              wa.field_f = false;
                              q.field_d = 0;
                              break L12;
                            }
                          }
                        }
                        return;
                      }
                    } else {
                      L13: {
                        if (!wa.field_f) {
                          break L13;
                        } else {
                          if (q.field_d != p.field_u) {
                            break L13;
                          } else {
                            wa.field_f = false;
                            q.field_d = 0;
                            break L13;
                          }
                        }
                      }
                      return;
                    }
                  }
                } else {
                  wa.field_f = false;
                  L14: {
                    il.field_l = param1;
                    if (!wa.field_f) {
                      if (!wa.field_f) {
                        break L14;
                      } else {
                        L15: {
                          if (q.field_d == p.field_u) {
                            break L15;
                          } else {
                            if (!wa.field_f) {
                              break L14;
                            } else {
                              if (q.field_d != p.field_u) {
                                break L14;
                              } else {
                                break L15;
                              }
                            }
                          }
                        }
                        wa.field_f = false;
                        q.field_d = 0;
                        break L14;
                      }
                    } else {
                      if (!wa.field_f) {
                        break L14;
                      } else {
                        if (q.field_d != p.field_u) {
                          break L14;
                        } else {
                          wa.field_f = false;
                          q.field_d = 0;
                          break L14;
                        }
                      }
                    }
                  }
                  return;
                }
              }
            } else {
              L16: {
                var2 = 0;
                if (param1 != -1) {
                  break L16;
                } else {
                  break L16;
                }
              }
              q.field_d = 0;
              ue.field_h = k.field_e;
              ro.field_w = n.field_t;
              if (-1 == param1) {
                if (var2 != 0) {
                  wa.field_f = true;
                  L17: {
                    il.field_l = param1;
                    if (!wa.field_f) {
                      if (!wa.field_f) {
                        break L17;
                      } else {
                        L18: {
                          if (q.field_d == p.field_u) {
                            break L18;
                          } else {
                            if (!wa.field_f) {
                              break L17;
                            } else {
                              if (q.field_d != p.field_u) {
                                break L17;
                              } else {
                                break L18;
                              }
                            }
                          }
                        }
                        wa.field_f = false;
                        q.field_d = 0;
                        break L17;
                      }
                    } else {
                      if (!wa.field_f) {
                        break L17;
                      } else {
                        if (q.field_d != p.field_u) {
                          break L17;
                        } else {
                          wa.field_f = false;
                          q.field_d = 0;
                          break L17;
                        }
                      }
                    }
                  }
                  return;
                } else {
                  L19: {
                    il.field_l = param1;
                    if (!wa.field_f) {
                      if (!wa.field_f) {
                        break L19;
                      } else {
                        L20: {
                          if (q.field_d == p.field_u) {
                            break L20;
                          } else {
                            if (!wa.field_f) {
                              break L19;
                            } else {
                              if (q.field_d != p.field_u) {
                                break L19;
                              } else {
                                break L20;
                              }
                            }
                          }
                        }
                        wa.field_f = false;
                        q.field_d = 0;
                        break L19;
                      }
                    } else {
                      if (!wa.field_f) {
                        break L19;
                      } else {
                        if (q.field_d != p.field_u) {
                          break L19;
                        } else {
                          wa.field_f = false;
                          q.field_d = 0;
                          break L19;
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                wa.field_f = false;
                L21: {
                  il.field_l = param1;
                  if (!wa.field_f) {
                    if (!wa.field_f) {
                      break L21;
                    } else {
                      L22: {
                        if (q.field_d == p.field_u) {
                          break L22;
                        } else {
                          if (!wa.field_f) {
                            break L21;
                          } else {
                            if (q.field_d != p.field_u) {
                              break L21;
                            } else {
                              break L22;
                            }
                          }
                        }
                      }
                      wa.field_f = false;
                      q.field_d = 0;
                      break L21;
                    }
                  } else {
                    if (!wa.field_f) {
                      break L21;
                    } else {
                      if (q.field_d != p.field_u) {
                        break L21;
                      } else {
                        wa.field_f = false;
                        q.field_d = 0;
                        break L21;
                      }
                    }
                  }
                }
                return;
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, gg param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            tb.field_l.a(param3, 100, on.field_c * 96 / 160, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("qj.B(").append(param0).append(44).append(-5205).append(44).append(96).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param3 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
    }

    public static void a() {
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 640;
        field_b = "World <%0> Level <%1>";
        field_a = "No adverts";
    }
}
