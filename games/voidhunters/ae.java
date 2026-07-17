/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae {
    private int field_a;
    private int field_d;
    int field_c;
    static ri field_g;
    private int field_i;
    private int field_h;
    private boolean field_b;
    private int field_e;
    static pr field_f;
    int field_j;

    final boolean a(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 > 0) {
          if (((ae) this).field_h != 2) {
            if (((ae) this).field_i == 96) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          ((ae) this).a((byte) 66, -23);
          if (((ae) this).field_h == 2) {
            return true;
          } else {
            L0: {
              if (((ae) this).field_i != 96) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final void c(int param0) {
        ((ae) this).field_a = 0;
        ((ae) this).field_h = 0;
        ((ae) this).field_i = 0;
        if (param0 != -19255) {
          L0: {
            ((ae) this).a(false, 6);
            if (-1 == ((ae) this).field_d) {
              ((ae) this).field_i = pma.field_o;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (-1 == ((ae) this).field_d) {
              ((ae) this).field_i = pma.field_o;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        if (~((ae) this).field_c >= ~param2) {
          throw new IllegalArgumentException();
        } else {
          if (param1 != 5620) {
            ((ae) this).field_i = -16;
            if (~param0 > ~((ae) this).field_c) {
              ((ae) this).field_i = 0;
              ((ae) this).field_a = 0;
              ((ae) this).field_h = 0;
              if (pba.field_o != 0) {
                ((ae) this).field_e = jab.field_p;
                ((ae) this).field_b = true;
                ((ae) this).field_h = pba.field_o;
                ((ae) this).field_a = pba.field_o;
                ((ae) this).field_j = param0;
                ((ae) this).field_d = pba.field_o;
                if (((ae) this).field_d != 0) {
                  if (hu.field_b != 0) {
                    if (((ae) this).field_e > 0) {
                      L0: {
                        ((ae) this).field_e = ((ae) this).field_e - 1;
                        if (pba.field_o != 0) {
                          break L0;
                        } else {
                          if (0 != hu.field_b) {
                            break L0;
                          } else {
                            ((ae) this).field_d = 0;
                            break L0;
                          }
                        }
                      }
                      L1: {
                        if (0 != ((ae) this).field_d) {
                          break L1;
                        } else {
                          L2: {
                            if (((ae) this).field_b) {
                              break L2;
                            } else {
                              if (upb.field_c) {
                                break L2;
                              } else {
                                break L1;
                              }
                            }
                          }
                          if (0 <= param2) {
                            if (~((ae) this).field_j != ~param2) {
                              ((ae) this).field_b = true;
                              ((ae) this).field_j = param2;
                              return;
                            } else {
                              ((ae) this).field_b = true;
                              ((ae) this).field_j = param2;
                              return;
                            }
                          } else {
                            if (((ae) this).field_b) {
                              ((ae) this).field_j = -1;
                              break L1;
                            } else {
                              break L1;
                            }
                          }
                        }
                      }
                      return;
                    } else {
                      ((ae) this).field_e = og.field_q;
                      ((ae) this).field_h = ((ae) this).field_d;
                      L3: {
                        ((ae) this).field_e = ((ae) this).field_e - 1;
                        if (pba.field_o != 0) {
                          break L3;
                        } else {
                          if (0 != hu.field_b) {
                            break L3;
                          } else {
                            ((ae) this).field_d = 0;
                            break L3;
                          }
                        }
                      }
                      if (0 != ((ae) this).field_d) {
                        return;
                      } else {
                        L4: {
                          if (((ae) this).field_b) {
                            break L4;
                          } else {
                            if (upb.field_c) {
                              break L4;
                            } else {
                              return;
                            }
                          }
                        }
                        if (0 <= param2) {
                          if (~((ae) this).field_j != ~param2) {
                            ((ae) this).field_b = true;
                            ((ae) this).field_j = param2;
                            return;
                          } else {
                            ((ae) this).field_b = true;
                            ((ae) this).field_j = param2;
                            return;
                          }
                        } else {
                          if (((ae) this).field_b) {
                            ((ae) this).field_j = -1;
                            return;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  } else {
                    L5: {
                      if (pba.field_o != 0) {
                        break L5;
                      } else {
                        if (0 != hu.field_b) {
                          break L5;
                        } else {
                          ((ae) this).field_d = 0;
                          if (0 != ((ae) this).field_d) {
                            return;
                          } else {
                            L6: {
                              if (((ae) this).field_b) {
                                break L6;
                              } else {
                                if (upb.field_c) {
                                  break L6;
                                } else {
                                  return;
                                }
                              }
                            }
                            if (0 <= param2) {
                              if (~((ae) this).field_j != ~param2) {
                                ((ae) this).field_b = true;
                                ((ae) this).field_j = param2;
                                return;
                              } else {
                                ((ae) this).field_b = true;
                                ((ae) this).field_j = param2;
                                return;
                              }
                            } else {
                              if (((ae) this).field_b) {
                                ((ae) this).field_j = -1;
                                return;
                              } else {
                                return;
                              }
                            }
                          }
                        }
                      }
                    }
                    if (0 != ((ae) this).field_d) {
                      return;
                    } else {
                      L7: {
                        if (((ae) this).field_b) {
                          break L7;
                        } else {
                          if (upb.field_c) {
                            break L7;
                          } else {
                            return;
                          }
                        }
                      }
                      if (0 <= param2) {
                        if (~((ae) this).field_j != ~param2) {
                          ((ae) this).field_b = true;
                          ((ae) this).field_j = param2;
                          return;
                        } else {
                          ((ae) this).field_b = true;
                          ((ae) this).field_j = param2;
                          return;
                        }
                      } else {
                        if (((ae) this).field_b) {
                          ((ae) this).field_j = -1;
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                } else {
                  L8: {
                    if (pba.field_o != 0) {
                      break L8;
                    } else {
                      if (0 != hu.field_b) {
                        break L8;
                      } else {
                        ((ae) this).field_d = 0;
                        if (0 != ((ae) this).field_d) {
                          return;
                        } else {
                          L9: {
                            if (((ae) this).field_b) {
                              break L9;
                            } else {
                              if (upb.field_c) {
                                break L9;
                              } else {
                                return;
                              }
                            }
                          }
                          if (0 <= param2) {
                            if (~((ae) this).field_j != ~param2) {
                              ((ae) this).field_b = true;
                              ((ae) this).field_j = param2;
                              return;
                            } else {
                              ((ae) this).field_b = true;
                              ((ae) this).field_j = param2;
                              return;
                            }
                          } else {
                            if (((ae) this).field_b) {
                              ((ae) this).field_j = -1;
                              return;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                    }
                  }
                  if (0 != ((ae) this).field_d) {
                    return;
                  } else {
                    L10: {
                      if (((ae) this).field_b) {
                        break L10;
                      } else {
                        if (upb.field_c) {
                          break L10;
                        } else {
                          return;
                        }
                      }
                    }
                    if (0 <= param2) {
                      if (~((ae) this).field_j != ~param2) {
                        ((ae) this).field_b = true;
                        ((ae) this).field_j = param2;
                        return;
                      } else {
                        ((ae) this).field_b = true;
                        ((ae) this).field_j = param2;
                        return;
                      }
                    } else {
                      if (((ae) this).field_b) {
                        ((ae) this).field_j = -1;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
              } else {
                L11: {
                  if (((ae) this).field_d == 0) {
                    break L11;
                  } else {
                    if (hu.field_b == 0) {
                      break L11;
                    } else {
                      if (((ae) this).field_e > 0) {
                        L12: {
                          ((ae) this).field_e = ((ae) this).field_e - 1;
                          if (pba.field_o != 0) {
                            break L12;
                          } else {
                            if (0 != hu.field_b) {
                              break L12;
                            } else {
                              ((ae) this).field_d = 0;
                              break L12;
                            }
                          }
                        }
                        L13: {
                          if (0 != ((ae) this).field_d) {
                            break L13;
                          } else {
                            L14: {
                              if (((ae) this).field_b) {
                                break L14;
                              } else {
                                if (upb.field_c) {
                                  break L14;
                                } else {
                                  break L13;
                                }
                              }
                            }
                            if (0 <= param2) {
                              if (~((ae) this).field_j != ~param2) {
                                ((ae) this).field_b = true;
                                ((ae) this).field_j = param2;
                                return;
                              } else {
                                ((ae) this).field_b = true;
                                ((ae) this).field_j = param2;
                                return;
                              }
                            } else {
                              if (((ae) this).field_b) {
                                ((ae) this).field_j = -1;
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                          }
                        }
                        return;
                      } else {
                        ((ae) this).field_e = og.field_q;
                        ((ae) this).field_h = ((ae) this).field_d;
                        L15: {
                          ((ae) this).field_e = ((ae) this).field_e - 1;
                          if (pba.field_o != 0) {
                            break L15;
                          } else {
                            if (0 != hu.field_b) {
                              break L15;
                            } else {
                              ((ae) this).field_d = 0;
                              break L15;
                            }
                          }
                        }
                        L16: {
                          if (0 != ((ae) this).field_d) {
                            break L16;
                          } else {
                            L17: {
                              if (((ae) this).field_b) {
                                break L17;
                              } else {
                                if (upb.field_c) {
                                  break L17;
                                } else {
                                  break L16;
                                }
                              }
                            }
                            if (0 <= param2) {
                              if (~((ae) this).field_j != ~param2) {
                                ((ae) this).field_b = true;
                                ((ae) this).field_j = param2;
                                return;
                              } else {
                                ((ae) this).field_b = true;
                                ((ae) this).field_j = param2;
                                return;
                              }
                            } else {
                              if (((ae) this).field_b) {
                                ((ae) this).field_j = -1;
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                }
                L18: {
                  if (pba.field_o != 0) {
                    break L18;
                  } else {
                    if (0 != hu.field_b) {
                      break L18;
                    } else {
                      L19: {
                        ((ae) this).field_d = 0;
                        if (0 != ((ae) this).field_d) {
                          break L19;
                        } else {
                          L20: {
                            if (((ae) this).field_b) {
                              break L20;
                            } else {
                              if (upb.field_c) {
                                break L20;
                              } else {
                                break L19;
                              }
                            }
                          }
                          if (0 <= param2) {
                            if (~((ae) this).field_j != ~param2) {
                              ((ae) this).field_b = true;
                              ((ae) this).field_j = param2;
                              return;
                            } else {
                              ((ae) this).field_b = true;
                              ((ae) this).field_j = param2;
                              return;
                            }
                          } else {
                            if (((ae) this).field_b) {
                              ((ae) this).field_j = -1;
                              break L19;
                            } else {
                              break L19;
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                if (0 != ((ae) this).field_d) {
                  return;
                } else {
                  L21: {
                    if (((ae) this).field_b) {
                      break L21;
                    } else {
                      if (upb.field_c) {
                        break L21;
                      } else {
                        return;
                      }
                    }
                  }
                  if (0 <= param2) {
                    if (~((ae) this).field_j != ~param2) {
                      ((ae) this).field_b = true;
                      ((ae) this).field_j = param2;
                      return;
                    } else {
                      ((ae) this).field_b = true;
                      ((ae) this).field_j = param2;
                      return;
                    }
                  } else {
                    if (((ae) this).field_b) {
                      ((ae) this).field_j = -1;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
            } else {
              throw new IllegalArgumentException();
            }
          } else {
            if (~param0 > ~((ae) this).field_c) {
              L22: {
                ((ae) this).field_i = 0;
                ((ae) this).field_a = 0;
                ((ae) this).field_h = 0;
                if (pba.field_o == 0) {
                  break L22;
                } else {
                  ((ae) this).field_e = jab.field_p;
                  ((ae) this).field_b = true;
                  ((ae) this).field_h = pba.field_o;
                  ((ae) this).field_a = pba.field_o;
                  ((ae) this).field_j = param0;
                  ((ae) this).field_d = pba.field_o;
                  break L22;
                }
              }
              L23: {
                if (((ae) this).field_d == 0) {
                  break L23;
                } else {
                  if (hu.field_b == 0) {
                    break L23;
                  } else {
                    if (((ae) this).field_e > 0) {
                      L24: {
                        ((ae) this).field_e = ((ae) this).field_e - 1;
                        if (pba.field_o != 0) {
                          break L24;
                        } else {
                          if (0 != hu.field_b) {
                            break L24;
                          } else {
                            ((ae) this).field_d = 0;
                            break L24;
                          }
                        }
                      }
                      L25: {
                        if (0 != ((ae) this).field_d) {
                          break L25;
                        } else {
                          L26: {
                            if (((ae) this).field_b) {
                              break L26;
                            } else {
                              if (upb.field_c) {
                                break L26;
                              } else {
                                break L25;
                              }
                            }
                          }
                          if (0 <= param2) {
                            if (~((ae) this).field_j != ~param2) {
                              ((ae) this).field_b = true;
                              ((ae) this).field_j = param2;
                              return;
                            } else {
                              ((ae) this).field_b = true;
                              ((ae) this).field_j = param2;
                              return;
                            }
                          } else {
                            if (((ae) this).field_b) {
                              ((ae) this).field_j = -1;
                              break L25;
                            } else {
                              break L25;
                            }
                          }
                        }
                      }
                      return;
                    } else {
                      ((ae) this).field_e = og.field_q;
                      ((ae) this).field_h = ((ae) this).field_d;
                      L27: {
                        ((ae) this).field_e = ((ae) this).field_e - 1;
                        if (pba.field_o != 0) {
                          break L27;
                        } else {
                          if (0 != hu.field_b) {
                            break L27;
                          } else {
                            ((ae) this).field_d = 0;
                            break L27;
                          }
                        }
                      }
                      L28: {
                        if (0 != ((ae) this).field_d) {
                          break L28;
                        } else {
                          L29: {
                            if (((ae) this).field_b) {
                              break L29;
                            } else {
                              if (upb.field_c) {
                                break L29;
                              } else {
                                break L28;
                              }
                            }
                          }
                          if (0 <= param2) {
                            if (~((ae) this).field_j != ~param2) {
                              ((ae) this).field_b = true;
                              ((ae) this).field_j = param2;
                              return;
                            } else {
                              ((ae) this).field_b = true;
                              ((ae) this).field_j = param2;
                              return;
                            }
                          } else {
                            if (((ae) this).field_b) {
                              ((ae) this).field_j = -1;
                              break L28;
                            } else {
                              break L28;
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                }
              }
              L30: {
                if (pba.field_o != 0) {
                  break L30;
                } else {
                  if (0 != hu.field_b) {
                    break L30;
                  } else {
                    L31: {
                      ((ae) this).field_d = 0;
                      if (0 != ((ae) this).field_d) {
                        break L31;
                      } else {
                        L32: {
                          if (((ae) this).field_b) {
                            break L32;
                          } else {
                            if (upb.field_c) {
                              break L32;
                            } else {
                              break L31;
                            }
                          }
                        }
                        if (0 <= param2) {
                          if (~((ae) this).field_j != ~param2) {
                            ((ae) this).field_b = true;
                            ((ae) this).field_j = param2;
                            return;
                          } else {
                            ((ae) this).field_b = true;
                            ((ae) this).field_j = param2;
                            return;
                          }
                        } else {
                          if (((ae) this).field_b) {
                            ((ae) this).field_j = -1;
                            break L31;
                          } else {
                            break L31;
                          }
                        }
                      }
                    }
                    return;
                  }
                }
              }
              if (0 != ((ae) this).field_d) {
                return;
              } else {
                L33: {
                  if (((ae) this).field_b) {
                    break L33;
                  } else {
                    if (upb.field_c) {
                      break L33;
                    } else {
                      return;
                    }
                  }
                }
                if (0 <= param2) {
                  if (~((ae) this).field_j != ~param2) {
                    ((ae) this).field_b = true;
                    ((ae) this).field_j = param2;
                    return;
                  } else {
                    ((ae) this).field_b = true;
                    ((ae) this).field_j = param2;
                    return;
                  }
                } else {
                  if (((ae) this).field_b) {
                    ((ae) this).field_j = -1;
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        }
    }

    final void a(byte param0, int param1) {
        if (param0 == -17) {
          if (((ae) this).field_d == 0) {
            ((ae) this).field_b = false;
            ((ae) this).field_j = param1;
            return;
          } else {
            return;
          }
        } else {
          boolean discarded$6 = ((ae) this).a(true);
          if (((ae) this).field_d != 0) {
            return;
          } else {
            ((ae) this).field_b = false;
            ((ae) this).field_j = param1;
            return;
          }
        }
    }

    final boolean b(byte param0) {
        int var2 = 41 / ((param0 - 43) / 61);
        return ((ae) this).field_d != 0 ? true : false;
    }

    final boolean e(byte param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 < -74) {
          if (((ae) this).field_a == 0) {
            if (84 != ((ae) this).field_i) {
              if (((ae) this).field_i == 83) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          boolean discarded$7 = ((ae) this).d(-86);
          if (((ae) this).field_a == 0) {
            if (84 == ((ae) this).field_i) {
              return true;
            } else {
              L0: {
                if (((ae) this).field_i != 83) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L0;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        }
    }

    final boolean c(byte param0) {
        int stackIn_9_0 = 0;
        int stackOut_7_0 = 0;
        if (param0 == -45) {
          if (-2 != ((ae) this).field_h) {
            if (-98 != ((ae) this).field_i) {
              if (((ae) this).field_i != 84) {
                if (83 == ((ae) this).field_i) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_7_0 = 1;
                stackIn_9_0 = stackOut_7_0;
                return stackIn_9_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final void a(boolean param0, int param1) {
        ((ae) this).field_a = 0;
        ((ae) this).field_i = 0;
        if (!param0) {
          L0: {
            ((ae) this).field_h = 0;
            if (0 == ((ae) this).field_d) {
              ((ae) this).field_i = pma.field_o;
              break L0;
            } else {
              break L0;
            }
          }
          if (((ae) this).field_d != 0) {
            L1: {
              if (((ae) this).field_d != 0) {
                break L1;
              } else {
                if (97 != pma.field_o) {
                  break L1;
                } else {
                  L2: {
                    ((ae) this).field_j = ((ae) this).field_j + 1;
                    if (((ae) this).field_c <= ((ae) this).field_j) {
                      ((ae) this).field_j = 0;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  ((ae) this).field_b = false;
                  break L1;
                }
              }
            }
            if (((ae) this).field_d == 0) {
              L3: {
                if (pma.field_o == 98) {
                  break L3;
                } else {
                  if (pma.field_o == 99) {
                    break L3;
                  } else {
                    return;
                  }
                }
              }
              ((ae) this).field_b = false;
              if (0 <= ((ae) this).field_j) {
                return;
              } else {
                ((ae) this).field_j = param1;
                return;
              }
            } else {
              return;
            }
          } else {
            if (pma.field_o == 96) {
              if (0 < ((ae) this).field_j) {
                ((ae) this).field_b = false;
                ((ae) this).field_j = ((ae) this).field_j - 1;
                if (((ae) this).field_d == 0) {
                  if (97 == pma.field_o) {
                    L4: {
                      ((ae) this).field_j = ((ae) this).field_j + 1;
                      if (((ae) this).field_c <= ((ae) this).field_j) {
                        ((ae) this).field_j = 0;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    ((ae) this).field_b = false;
                    if (((ae) this).field_d == 0) {
                      L5: {
                        if (pma.field_o == 98) {
                          break L5;
                        } else {
                          if (pma.field_o == 99) {
                            break L5;
                          } else {
                            return;
                          }
                        }
                      }
                      ((ae) this).field_b = false;
                      if (0 > ((ae) this).field_j) {
                        ((ae) this).field_j = param1;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (((ae) this).field_d == 0) {
                      L6: {
                        if (pma.field_o == 98) {
                          break L6;
                        } else {
                          if (pma.field_o == 99) {
                            break L6;
                          } else {
                            return;
                          }
                        }
                      }
                      ((ae) this).field_b = false;
                      if (0 <= ((ae) this).field_j) {
                        return;
                      } else {
                        ((ae) this).field_j = param1;
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  if (((ae) this).field_d == 0) {
                    L7: {
                      if (pma.field_o == 98) {
                        break L7;
                      } else {
                        if (pma.field_o == 99) {
                          break L7;
                        } else {
                          return;
                        }
                      }
                    }
                    ((ae) this).field_b = false;
                    if (0 <= ((ae) this).field_j) {
                      return;
                    } else {
                      ((ae) this).field_j = param1;
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                ((ae) this).field_j = ((ae) this).field_c;
                L8: {
                  ((ae) this).field_b = false;
                  ((ae) this).field_j = ((ae) this).field_j - 1;
                  if (((ae) this).field_d != 0) {
                    break L8;
                  } else {
                    if (97 != pma.field_o) {
                      break L8;
                    } else {
                      L9: {
                        ((ae) this).field_j = ((ae) this).field_j + 1;
                        if (((ae) this).field_c <= ((ae) this).field_j) {
                          ((ae) this).field_j = 0;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      ((ae) this).field_b = false;
                      break L8;
                    }
                  }
                }
                if (((ae) this).field_d == 0) {
                  L10: {
                    if (pma.field_o == 98) {
                      break L10;
                    } else {
                      if (pma.field_o == 99) {
                        break L10;
                      } else {
                        return;
                      }
                    }
                  }
                  ((ae) this).field_b = false;
                  if (0 > ((ae) this).field_j) {
                    ((ae) this).field_j = param1;
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              L11: {
                if (((ae) this).field_d != 0) {
                  break L11;
                } else {
                  if (97 != pma.field_o) {
                    break L11;
                  } else {
                    L12: {
                      ((ae) this).field_j = ((ae) this).field_j + 1;
                      if (((ae) this).field_c <= ((ae) this).field_j) {
                        ((ae) this).field_j = 0;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    ((ae) this).field_b = false;
                    break L11;
                  }
                }
              }
              if (((ae) this).field_d == 0) {
                L13: {
                  if (pma.field_o == 98) {
                    break L13;
                  } else {
                    if (pma.field_o == 99) {
                      break L13;
                    } else {
                      return;
                    }
                  }
                }
                ((ae) this).field_b = false;
                if (0 <= ((ae) this).field_j) {
                  return;
                } else {
                  ((ae) this).field_j = param1;
                  return;
                }
              } else {
                return;
              }
            }
          }
        } else {
          L14: {
            ((ae) this).field_a = 19;
            ((ae) this).field_h = 0;
            if (0 == ((ae) this).field_d) {
              ((ae) this).field_i = pma.field_o;
              break L14;
            } else {
              break L14;
            }
          }
          if (((ae) this).field_d == 0) {
            L15: {
              if (pma.field_o == 96) {
                if (0 < ((ae) this).field_j) {
                  ((ae) this).field_b = false;
                  ((ae) this).field_j = ((ae) this).field_j - 1;
                  break L15;
                } else {
                  ((ae) this).field_j = ((ae) this).field_c;
                  ((ae) this).field_b = false;
                  ((ae) this).field_j = ((ae) this).field_j - 1;
                  break L15;
                }
              } else {
                break L15;
              }
            }
            if (((ae) this).field_d != 0) {
              L16: {
                if (((ae) this).field_d != 0) {
                  break L16;
                } else {
                  L17: {
                    if (pma.field_o == 98) {
                      break L17;
                    } else {
                      if (pma.field_o == 99) {
                        break L17;
                      } else {
                        break L16;
                      }
                    }
                  }
                  ((ae) this).field_b = false;
                  if (0 > ((ae) this).field_j) {
                    ((ae) this).field_j = param1;
                    break L16;
                  } else {
                    break L16;
                  }
                }
              }
              return;
            } else {
              L18: {
                if (97 != pma.field_o) {
                  break L18;
                } else {
                  L19: {
                    ((ae) this).field_j = ((ae) this).field_j + 1;
                    if (((ae) this).field_c <= ((ae) this).field_j) {
                      ((ae) this).field_j = 0;
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  ((ae) this).field_b = false;
                  break L18;
                }
              }
              L20: {
                if (((ae) this).field_d != 0) {
                  break L20;
                } else {
                  L21: {
                    if (pma.field_o == 98) {
                      break L21;
                    } else {
                      if (pma.field_o == 99) {
                        break L21;
                      } else {
                        break L20;
                      }
                    }
                  }
                  ((ae) this).field_b = false;
                  if (0 > ((ae) this).field_j) {
                    ((ae) this).field_j = param1;
                    break L20;
                  } else {
                    break L20;
                  }
                }
              }
              return;
            }
          } else {
            L22: {
              if (((ae) this).field_d != 0) {
                break L22;
              } else {
                if (97 != pma.field_o) {
                  break L22;
                } else {
                  L23: {
                    ((ae) this).field_j = ((ae) this).field_j + 1;
                    if (((ae) this).field_c <= ((ae) this).field_j) {
                      ((ae) this).field_j = 0;
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                  ((ae) this).field_b = false;
                  break L22;
                }
              }
            }
            L24: {
              if (((ae) this).field_d != 0) {
                break L24;
              } else {
                L25: {
                  if (pma.field_o == 98) {
                    break L25;
                  } else {
                    if (pma.field_o == 99) {
                      break L25;
                    } else {
                      break L24;
                    }
                  }
                }
                ((ae) this).field_b = false;
                if (0 > ((ae) this).field_j) {
                  ((ae) this).field_j = param1;
                  break L24;
                } else {
                  break L24;
                }
              }
            }
            return;
          }
        }
    }

    final boolean a(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (!param0) {
          L0: {
            ((ae) this).a((byte) -113, -81);
            if (((ae) this).field_i != 102) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((ae) this).field_i != 102) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(byte param0) {
        ((ae) this).field_h = 0;
        ((ae) this).field_i = 0;
        ((ae) this).field_a = 0;
        if (-1 != ((ae) this).field_d) {
          if (0 == ((ae) this).field_d) {
            if (98 == pma.field_o) {
              if (((ae) this).field_j > 0) {
                ((ae) this).field_b = false;
                ((ae) this).field_j = ((ae) this).field_j - 1;
                if (param0 <= -37) {
                  if (((ae) this).field_d == 0) {
                    if (99 != pma.field_o) {
                      return;
                    } else {
                      L0: {
                        ((ae) this).field_j = ((ae) this).field_j + 1;
                        if (((ae) this).field_j >= ((ae) this).field_c) {
                          ((ae) this).field_j = 0;
                          break L0;
                        } else {
                          break L0;
                        }
                      }
                      ((ae) this).field_b = false;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  ae.e(15);
                  if (((ae) this).field_d == 0) {
                    if (99 == pma.field_o) {
                      L1: {
                        ((ae) this).field_j = ((ae) this).field_j + 1;
                        if (((ae) this).field_j >= ((ae) this).field_c) {
                          ((ae) this).field_j = 0;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      ((ae) this).field_b = false;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                ((ae) this).field_j = ((ae) this).field_c;
                ((ae) this).field_b = false;
                ((ae) this).field_j = ((ae) this).field_j - 1;
                if (param0 <= -37) {
                  L2: {
                    if (((ae) this).field_d != 0) {
                      break L2;
                    } else {
                      if (99 == pma.field_o) {
                        L3: {
                          ((ae) this).field_j = ((ae) this).field_j + 1;
                          if (((ae) this).field_j >= ((ae) this).field_c) {
                            ((ae) this).field_j = 0;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        ((ae) this).field_b = false;
                        break L2;
                      } else {
                        return;
                      }
                    }
                  }
                  return;
                } else {
                  L4: {
                    ae.e(15);
                    if (((ae) this).field_d != 0) {
                      break L4;
                    } else {
                      if (99 == pma.field_o) {
                        L5: {
                          ((ae) this).field_j = ((ae) this).field_j + 1;
                          if (((ae) this).field_j >= ((ae) this).field_c) {
                            ((ae) this).field_j = 0;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        ((ae) this).field_b = false;
                        break L4;
                      } else {
                        return;
                      }
                    }
                  }
                  return;
                }
              }
            } else {
              if (param0 <= -37) {
                if (((ae) this).field_d == 0) {
                  if (99 == pma.field_o) {
                    L6: {
                      ((ae) this).field_j = ((ae) this).field_j + 1;
                      if (((ae) this).field_j >= ((ae) this).field_c) {
                        ((ae) this).field_j = 0;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    ((ae) this).field_b = false;
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                ae.e(15);
                if (((ae) this).field_d == 0) {
                  if (99 != pma.field_o) {
                    return;
                  } else {
                    L7: {
                      ((ae) this).field_j = ((ae) this).field_j + 1;
                      if (((ae) this).field_j >= ((ae) this).field_c) {
                        ((ae) this).field_j = 0;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    ((ae) this).field_b = false;
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          } else {
            if (param0 <= -37) {
              if (((ae) this).field_d == 0) {
                if (99 != pma.field_o) {
                  return;
                } else {
                  L8: {
                    ((ae) this).field_j = ((ae) this).field_j + 1;
                    if (((ae) this).field_j >= ((ae) this).field_c) {
                      ((ae) this).field_j = 0;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  ((ae) this).field_b = false;
                  return;
                }
              } else {
                return;
              }
            } else {
              ae.e(15);
              if (((ae) this).field_d == 0) {
                if (99 != pma.field_o) {
                  return;
                } else {
                  L9: {
                    ((ae) this).field_j = ((ae) this).field_j + 1;
                    if (((ae) this).field_j >= ((ae) this).field_c) {
                      ((ae) this).field_j = 0;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  ((ae) this).field_b = false;
                  return;
                }
              } else {
                return;
              }
            }
          }
        } else {
          ((ae) this).field_i = pma.field_o;
          if (0 == ((ae) this).field_d) {
            if (98 == pma.field_o) {
              L10: {
                if (((ae) this).field_j > 0) {
                  ((ae) this).field_b = false;
                  ((ae) this).field_j = ((ae) this).field_j - 1;
                  break L10;
                } else {
                  ((ae) this).field_j = ((ae) this).field_c;
                  ((ae) this).field_b = false;
                  ((ae) this).field_j = ((ae) this).field_j - 1;
                  break L10;
                }
              }
              L11: {
                if (param0 <= -37) {
                  break L11;
                } else {
                  ae.e(15);
                  break L11;
                }
              }
              if (((ae) this).field_d == 0) {
                if (99 != pma.field_o) {
                  return;
                } else {
                  L12: {
                    ((ae) this).field_j = ((ae) this).field_j + 1;
                    if (((ae) this).field_j >= ((ae) this).field_c) {
                      ((ae) this).field_j = 0;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  ((ae) this).field_b = false;
                  return;
                }
              } else {
                return;
              }
            } else {
              L13: {
                if (param0 <= -37) {
                  break L13;
                } else {
                  ae.e(15);
                  break L13;
                }
              }
              L14: {
                if (((ae) this).field_d != 0) {
                  break L14;
                } else {
                  if (99 == pma.field_o) {
                    L15: {
                      ((ae) this).field_j = ((ae) this).field_j + 1;
                      if (((ae) this).field_j >= ((ae) this).field_c) {
                        ((ae) this).field_j = 0;
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    ((ae) this).field_b = false;
                    break L14;
                  } else {
                    break L14;
                  }
                }
              }
              return;
            }
          } else {
            L16: {
              if (param0 <= -37) {
                break L16;
              } else {
                ae.e(15);
                break L16;
              }
            }
            L17: {
              if (-1 != ((ae) this).field_d) {
                break L17;
              } else {
                if (99 == pma.field_o) {
                  L18: {
                    ((ae) this).field_j = ((ae) this).field_j + 1;
                    if (((ae) this).field_j >= ((ae) this).field_c) {
                      ((ae) this).field_j = 0;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  ((ae) this).field_b = false;
                  break L17;
                } else {
                  break L17;
                }
              }
            }
            return;
          }
        }
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param0) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((ae) this).field_b = stackIn_3_1 != 0;
        ((ae) this).field_d = 0;
        if (!((ae) this).field_b) {
          ((ae) this).field_j = param2;
          if (param1 == -1) {
            return;
          } else {
            ((ae) this).field_j = -82;
            return;
          }
        } else {
          ((ae) this).field_j = param3;
          if (param1 == -1) {
            return;
          } else {
            ((ae) this).field_j = -82;
            return;
          }
        }
    }

    final static sg a(int[] param0, byte param1) {
        sg var2 = null;
        RuntimeException var2_ref = null;
        sg stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        sg stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var2 = new sg();
              var2.field_k = qia.a(1, param0);
              var2.e((byte) 119);
              var2.field_k.a(true, 0, 0, 0, 0, var2.f((byte) -123));
              var2.field_k.a((byte) 21, (anb) (Object) var2);
              if (param1 > 21) {
                break L1;
              } else {
                field_g = null;
                break L1;
              }
            }
            stackOut_2_0 = (sg) var2;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2_ref;
            stackOut_4_1 = new StringBuilder().append("ae.G(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    public static void e(int param0) {
        Object var2 = null;
        if (param0 != -1) {
          var2 = null;
          sg discarded$2 = ae.a((int[]) null, (byte) -13);
          field_f = null;
          field_g = null;
          return;
        } else {
          field_f = null;
          field_g = null;
          return;
        }
    }

    final boolean d(byte param0) {
        if (param0 != -7) {
            return true;
        }
        return ((ae) this).field_i == 96 ? true : false;
    }

    final boolean d(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 12465) {
          L0: {
            ((ae) this).a((byte) 108, -98);
            if (-104 != ((ae) this).field_i) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-104 != ((ae) this).field_i) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 > -79) {
          L0: {
            ((ae) this).field_i = -15;
            if (97 != ((ae) this).field_i) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (97 != ((ae) this).field_i) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    ae(int param0) {
        ((ae) this).field_b = false;
        ((ae) this).field_j = 0;
        ((ae) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new ri(12, 0, 1, 0);
    }
}
