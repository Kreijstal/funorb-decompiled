/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl {
    static String field_c;
    static int field_a;
    static int field_b;

    final static qj a(fa param0, fa param1, byte param2, int param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        qj stackIn_5_0 = null;
        qj stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (vh.a(param4, param3, param1, true)) {
              if (param2 > 12) {
                stackIn_7_0 = sb.a(false, param0.b(param4, -95, param3));
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = (qj) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("nl.B(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (qj) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final static void a(byte param0, String param1, java.applet.Applet param2) {
        try {
            int var3_int = 0;
            java.net.URL var4 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            StringBuilder stackIn_9_1 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var3 = null;
            RuntimeException var3_ref = null;
            try {
              L0: {
                try {
                  L1: {
                    var3_int = -19 / ((param0 - -28) / 32);
                    var4 = new java.net.URL(param2.getCodeBase(), param1);
                    var4 = bb.a((byte) 119, var4, param2);
                    m.a(param2, true, var4.toString(), 0);
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    var3.printStackTrace();
                    break L2;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_6_0 = (RuntimeException) (var3_ref);

                stackIn_6_1 = new StringBuilder().append("nl.D(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "null";
                  break L3;
                } else {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "{...}";
                  break L3;
                }
              }
              L4: {


                stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

                if (param2 == null) {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackIn_10_2 = "null";
                  break L4;
                } else {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackIn_10_2 = "{...}";
                  break L4;
                }
              }
              throw qk.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        l.d(0, 74, 640, 406, 0, 192);
        if (param0 >= 72) {
          L0: {
            rf.field_B[bk.d(23196)].a(0, 0, 102);
            l.e(0, 74, 640, 406, 16777215);
            aa.field_j.b(120, 76);
            if ((ef.field_j ^ -1) > -121) {
              break L0;
            } else {
              if ((jb.field_b ^ -1) > -77) {
                break L0;
              } else {
                if (220 < ef.field_j) {
                  break L0;
                } else {
                  if (-105 <= (jb.field_b ^ -1)) {
                    l.d(120, 76, 100, 28, 16777215, 128);
                    break L0;
                  } else {
                    if (rf.field_B[7].field_d) {
                      L1: {
                        wh.field_e.b(20, 76);
                        if (-21 < (ef.field_j ^ -1)) {
                          break L1;
                        } else {
                          if (-77 < (jb.field_b ^ -1)) {
                            break L1;
                          } else {
                            if (120 < ef.field_j) {
                              break L1;
                            } else {
                              if (-105 <= (jb.field_b ^ -1)) {
                                l.d(20, 76, 100, 28, 16777215, 128);
                                break L1;
                              } else {
                                qh.field_b.b(520, 76);
                                if (ef.field_j >= 520) {
                                  if (jb.field_b >= 76) {
                                    if (-621 <= (ef.field_j ^ -1)) {
                                      if (jb.field_b <= 104) {
                                        if (-1 < (ef.field_j ^ -1)) {
                                          return;
                                        } else {
                                          l.d(520, 76, 100, 28, 16777215, 128);
                                          return;
                                        }
                                      } else {
                                        return;
                                      }
                                    } else {
                                      return;
                                    }
                                  } else {
                                    return;
                                  }
                                } else {
                                  return;
                                }
                              }
                            }
                          }
                        }
                      }
                      qh.field_b.b(520, 76);
                      if (ef.field_j >= 520) {
                        if (jb.field_b >= 76) {
                          if (-621 <= (ef.field_j ^ -1)) {
                            if (jb.field_b <= 104) {
                              if (-1 < (ef.field_j ^ -1)) {
                                return;
                              } else {
                                l.d(520, 76, 100, 28, 16777215, 128);
                                return;
                              }
                            } else {
                              return;
                            }
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          }
          if (rf.field_B[7].field_d) {
            L2: {
              wh.field_e.b(20, 76);
              if (-21 < (ef.field_j ^ -1)) {
                break L2;
              } else {
                if (-77 < (jb.field_b ^ -1)) {
                  break L2;
                } else {
                  if (120 < ef.field_j) {
                    break L2;
                  } else {
                    if (-105 <= (jb.field_b ^ -1)) {
                      l.d(20, 76, 100, 28, 16777215, 128);
                      break L2;
                    } else {
                      qh.field_b.b(520, 76);
                      if (ef.field_j >= 520) {
                        if (jb.field_b >= 76) {
                          if (-621 <= (ef.field_j ^ -1)) {
                            if (jb.field_b <= 104) {
                              if (-1 < (ef.field_j ^ -1)) {
                                return;
                              } else {
                                l.d(520, 76, 100, 28, 16777215, 128);
                                return;
                              }
                            } else {
                              return;
                            }
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
            }
            L3: {
              qh.field_b.b(520, 76);
              if (ef.field_j < 520) {
                break L3;
              } else {
                if (jb.field_b < 76) {
                  break L3;
                } else {
                  if (-621 > (ef.field_j ^ -1)) {
                    break L3;
                  } else {
                    if (jb.field_b > 104) {
                      break L3;
                    } else {
                      if (-1 < (ef.field_j ^ -1)) {
                        break L3;
                      } else {
                        l.d(520, 76, 100, 28, 16777215, 128);
                        return;
                      }
                    }
                  }
                }
              }
            }
            return;
          } else {
            return;
          }
        } else {
          nl.a(105);
          rf.field_B[bk.d(23196)].a(0, 0, 102);
          l.e(0, 74, 640, 406, 16777215);
          aa.field_j.b(120, 76);
          if ((ef.field_j ^ -1) <= -121) {
            if ((jb.field_b ^ -1) <= -77) {
              L4: {
                if (220 < ef.field_j) {
                  break L4;
                } else {
                  if (-105 <= (jb.field_b ^ -1)) {
                    l.d(120, 76, 100, 28, 16777215, 128);
                    break L4;
                  } else {
                    L5: {
                      if (!rf.field_B[7].field_d) {
                        break L5;
                      } else {
                        wh.field_e.b(20, 76);
                        if (-21 >= (ef.field_j ^ -1)) {
                          if (-77 >= (jb.field_b ^ -1)) {
                            if (120 >= ef.field_j) {
                              L6: {
                                if (-105 <= (jb.field_b ^ -1)) {
                                  l.d(20, 76, 100, 28, 16777215, 128);
                                  break L6;
                                } else {
                                  break L6;
                                }
                              }
                              qh.field_b.b(520, 76);
                              if (ef.field_j < 520) {
                                break L5;
                              } else {
                                if (jb.field_b < 76) {
                                  break L5;
                                } else {
                                  if (-621 > (ef.field_j ^ -1)) {
                                    break L5;
                                  } else {
                                    if (jb.field_b > 104) {
                                      break L5;
                                    } else {
                                      if (-1 < (ef.field_j ^ -1)) {
                                        break L5;
                                      } else {
                                        l.d(520, 76, 100, 28, 16777215, 128);
                                        break L5;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              qh.field_b.b(520, 76);
                              if (ef.field_j < 520) {
                                break L5;
                              } else {
                                if (jb.field_b < 76) {
                                  break L5;
                                } else {
                                  if (-621 > (ef.field_j ^ -1)) {
                                    break L5;
                                  } else {
                                    if (jb.field_b > 104) {
                                      break L5;
                                    } else {
                                      if (-1 < (ef.field_j ^ -1)) {
                                        break L5;
                                      } else {
                                        l.d(520, 76, 100, 28, 16777215, 128);
                                        break L5;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            qh.field_b.b(520, 76);
                            if (ef.field_j < 520) {
                              break L5;
                            } else {
                              if (jb.field_b < 76) {
                                break L5;
                              } else {
                                if (-621 > (ef.field_j ^ -1)) {
                                  break L5;
                                } else {
                                  if (jb.field_b > 104) {
                                    break L5;
                                  } else {
                                    if (-1 < (ef.field_j ^ -1)) {
                                      break L5;
                                    } else {
                                      l.d(520, 76, 100, 28, 16777215, 128);
                                      break L5;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          qh.field_b.b(520, 76);
                          if (ef.field_j < 520) {
                            break L5;
                          } else {
                            if (jb.field_b < 76) {
                              break L5;
                            } else {
                              if (-621 > (ef.field_j ^ -1)) {
                                break L5;
                              } else {
                                if (jb.field_b > 104) {
                                  break L5;
                                } else {
                                  if (-1 < (ef.field_j ^ -1)) {
                                    break L5;
                                  } else {
                                    l.d(520, 76, 100, 28, 16777215, 128);
                                    break L5;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    return;
                  }
                }
              }
              if (rf.field_B[7].field_d) {
                L7: {
                  wh.field_e.b(20, 76);
                  if (-21 < (ef.field_j ^ -1)) {
                    break L7;
                  } else {
                    if (-77 < (jb.field_b ^ -1)) {
                      break L7;
                    } else {
                      if (120 < ef.field_j) {
                        break L7;
                      } else {
                        if (-105 <= (jb.field_b ^ -1)) {
                          l.d(20, 76, 100, 28, 16777215, 128);
                          break L7;
                        } else {
                          L8: {
                            qh.field_b.b(520, 76);
                            if (ef.field_j < 520) {
                              break L8;
                            } else {
                              if (jb.field_b < 76) {
                                break L8;
                              } else {
                                if (-621 > (ef.field_j ^ -1)) {
                                  break L8;
                                } else {
                                  if (jb.field_b > 104) {
                                    break L8;
                                  } else {
                                    if (-1 < (ef.field_j ^ -1)) {
                                      break L8;
                                    } else {
                                      l.d(520, 76, 100, 28, 16777215, 128);
                                      break L8;
                                    }
                                  }
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
                qh.field_b.b(520, 76);
                if (ef.field_j >= 520) {
                  if (jb.field_b >= 76) {
                    if (-621 <= (ef.field_j ^ -1)) {
                      if (jb.field_b <= 104) {
                        if (-1 >= (ef.field_j ^ -1)) {
                          l.d(520, 76, 100, 28, 16777215, 128);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              L9: {
                if (!rf.field_B[7].field_d) {
                  break L9;
                } else {
                  wh.field_e.b(20, 76);
                  if (-21 >= (ef.field_j ^ -1)) {
                    if (-77 >= (jb.field_b ^ -1)) {
                      if (120 >= ef.field_j) {
                        L10: {
                          if (-105 <= (jb.field_b ^ -1)) {
                            l.d(20, 76, 100, 28, 16777215, 128);
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        qh.field_b.b(520, 76);
                        if (ef.field_j < 520) {
                          break L9;
                        } else {
                          if (jb.field_b < 76) {
                            break L9;
                          } else {
                            if (-621 > (ef.field_j ^ -1)) {
                              break L9;
                            } else {
                              if (jb.field_b > 104) {
                                break L9;
                              } else {
                                if (-1 < (ef.field_j ^ -1)) {
                                  break L9;
                                } else {
                                  l.d(520, 76, 100, 28, 16777215, 128);
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        qh.field_b.b(520, 76);
                        if (ef.field_j < 520) {
                          break L9;
                        } else {
                          if (jb.field_b < 76) {
                            break L9;
                          } else {
                            if (-621 > (ef.field_j ^ -1)) {
                              break L9;
                            } else {
                              if (jb.field_b > 104) {
                                break L9;
                              } else {
                                if (-1 < (ef.field_j ^ -1)) {
                                  break L9;
                                } else {
                                  l.d(520, 76, 100, 28, 16777215, 128);
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      qh.field_b.b(520, 76);
                      if (ef.field_j < 520) {
                        break L9;
                      } else {
                        if (jb.field_b < 76) {
                          break L9;
                        } else {
                          if (-621 > (ef.field_j ^ -1)) {
                            break L9;
                          } else {
                            if (jb.field_b > 104) {
                              break L9;
                            } else {
                              if (-1 < (ef.field_j ^ -1)) {
                                break L9;
                              } else {
                                l.d(520, 76, 100, 28, 16777215, 128);
                                break L9;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    qh.field_b.b(520, 76);
                    if (ef.field_j < 520) {
                      break L9;
                    } else {
                      if (jb.field_b < 76) {
                        break L9;
                      } else {
                        if (-621 > (ef.field_j ^ -1)) {
                          break L9;
                        } else {
                          if (jb.field_b > 104) {
                            break L9;
                          } else {
                            if (-1 < (ef.field_j ^ -1)) {
                              break L9;
                            } else {
                              l.d(520, 76, 100, 28, 16777215, 128);
                              break L9;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              return;
            }
          } else {
            L11: {
              if (!rf.field_B[7].field_d) {
                break L11;
              } else {
                wh.field_e.b(20, 76);
                if (-21 >= (ef.field_j ^ -1)) {
                  if (-77 >= (jb.field_b ^ -1)) {
                    if (120 >= ef.field_j) {
                      L12: {
                        if (-105 <= (jb.field_b ^ -1)) {
                          l.d(20, 76, 100, 28, 16777215, 128);
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      qh.field_b.b(520, 76);
                      if (ef.field_j < 520) {
                        break L11;
                      } else {
                        if (jb.field_b < 76) {
                          break L11;
                        } else {
                          if (-621 > (ef.field_j ^ -1)) {
                            break L11;
                          } else {
                            if (jb.field_b > 104) {
                              break L11;
                            } else {
                              if (-1 < (ef.field_j ^ -1)) {
                                break L11;
                              } else {
                                l.d(520, 76, 100, 28, 16777215, 128);
                                break L11;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      qh.field_b.b(520, 76);
                      if (ef.field_j < 520) {
                        break L11;
                      } else {
                        if (jb.field_b < 76) {
                          break L11;
                        } else {
                          if (-621 > (ef.field_j ^ -1)) {
                            break L11;
                          } else {
                            if (jb.field_b > 104) {
                              break L11;
                            } else {
                              if (-1 < (ef.field_j ^ -1)) {
                                break L11;
                              } else {
                                l.d(520, 76, 100, 28, 16777215, 128);
                                break L11;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    qh.field_b.b(520, 76);
                    if (ef.field_j < 520) {
                      break L11;
                    } else {
                      if (jb.field_b < 76) {
                        break L11;
                      } else {
                        if (-621 > (ef.field_j ^ -1)) {
                          break L11;
                        } else {
                          if (jb.field_b > 104) {
                            break L11;
                          } else {
                            if (-1 < (ef.field_j ^ -1)) {
                              break L11;
                            } else {
                              l.d(520, 76, 100, 28, 16777215, 128);
                              break L11;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  qh.field_b.b(520, 76);
                  if (ef.field_j < 520) {
                    break L11;
                  } else {
                    if (jb.field_b < 76) {
                      break L11;
                    } else {
                      if (-621 > (ef.field_j ^ -1)) {
                        break L11;
                      } else {
                        if (jb.field_b > 104) {
                          break L11;
                        } else {
                          if (-1 < (ef.field_j ^ -1)) {
                            break L11;
                          } else {
                            l.d(520, 76, 100, 28, 16777215, 128);
                            break L11;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            return;
          }
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            field_c = (String) null;
            field_c = null;
            return;
        }
        field_c = null;
    }

    static {
        field_b = 0;
        field_c = "Click on one of the highlighted missions on the map";
    }
}
