/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SecondaryDeque {
    static Sprite contactProbeRaster;
    static int field_d;
    static int field_a;
    static IntrusiveDeque spawnQueue;
    private DualLinkNode sentinel;
    static String field_f;
    private DualLinkNode iterationCursor;

    final DualLinkNode nextForIteration(int methodGuard) {
        int var3 = -123 % ((methodGuard - 21) / 32);
        DualLinkNode iterationNode = this.iterationCursor;
        if (this.sentinel != iterationNode) {
            this.iterationCursor = iterationNode.nextSecondaryNode;
            return iterationNode;
        }
        this.iterationCursor = null;
        return null;
    }

    public static void b(int param0) {
        contactProbeRaster = null;
        if (param0 != -10943) {
            field_f = (String) null;
            field_f = null;
            spawnQueue = null;
            return;
        }
        field_f = null;
        spawnQueue = null;
    }

    final void addFirst(DualLinkNode node, boolean methodGuard) {
        if (!(node.previousSecondaryNode == null)) {
            node.unlinkSecondaryNode((byte) 45);
        }
        node.nextSecondaryNode = this.sentinel.nextSecondaryNode;
        node.previousSecondaryNode = this.sentinel;
        if (methodGuard) {
            return;
        }
        try {
            node.previousSecondaryNode.nextSecondaryNode = node;
            node.nextSecondaryNode.previousSecondaryNode = node;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "wd.L(" + (node != null ? "{...}" : "null") + ',' + methodGuard + ')');
        }
    }

    final static void c(int param0) {
        kb.b(-120);
        if (param0 != 480) {
            field_d = -37;
        }
    }

    final DualLinkNode removeFirst(boolean methodGuard) {
        DualLinkNode firstNode = this.sentinel.nextSecondaryNode;
        if (!methodGuard) {
            SecondaryDeque.a((byte) -92);
            if (this.sentinel != firstNode) {
                firstNode.unlinkSecondaryNode((byte) 65);
                return firstNode;
            }
            return null;
        }
        if (this.sentinel != firstNode) {
            firstNode.unlinkSecondaryNode((byte) 65);
            return firstNode;
        }
        return null;
    }

    final int countNodes(byte methodGuard) {
        DualLinkNode nodeToCount = null;
        int var4 = Geoblox.field_C;
        int nodeCount = 0;
        if (methodGuard == 67) {
            nodeToCount = this.sentinel.nextSecondaryNode;
            while (this.sentinel != nodeToCount) {
                nodeToCount = nodeToCount.nextSecondaryNode;
                nodeCount++;
            }
            return nodeCount;
        }
        contactProbeRaster = (Sprite) null;
        nodeToCount = this.sentinel.nextSecondaryNode;
        while (this.sentinel != nodeToCount) {
            nodeToCount = nodeToCount.nextSecondaryNode;
            nodeCount++;
        }
        return nodeCount;
    }

    final void addLast(int methodGuard, DualLinkNode node) {
        try {
            if (!(node.previousSecondaryNode == null)) {
                node.unlinkSecondaryNode((byte) 62);
            }
            int var3_int = -75 % ((methodGuard - 62) / 46);
            node.previousSecondaryNode = this.sentinel.previousSecondaryNode;
            node.nextSecondaryNode = this.sentinel;
            node.previousSecondaryNode.nextSecondaryNode = node;
            node.nextSecondaryNode.previousSecondaryNode = node;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "wd.I(" + methodGuard + ',' + (node != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0) {
        jk.field_d = 2;
        if (param0 < 45) {
            SecondaryDeque.a(true, -75);
        }
    }

    final static void a(boolean param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        re var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Geoblox.field_C;
        try {
          L0: {
            var4 = (re) ((Object) PendingActionMarker.field_f.firstForIteration(0));
            L1: while (var4 != null) {
              ik.a(var4, param1, (byte) 107);
              var4 = (re) ((Object) PendingActionMarker.field_f.nextForIteration(1));
            }
            if (param0) {
              break L0;
            } else {
              field_a = -80;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "wd.K(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, String param1) {
        try {
            if (param0 != 69) {
                field_a = 99;
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "wd.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public SecondaryDeque() {
        this.sentinel = new DualLinkNode();
        this.sentinel.nextSecondaryNode = this.sentinel;
        this.sentinel.previousSecondaryNode = this.sentinel;
    }

    final static df a(boolean param0, long param1, String param2, String param3, boolean param4) {
        RuntimeException var6 = null;
        th stackIn_7_0 = null;
        nk stackIn_9_0 = null;
        lf stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param0) {
              field_f = (String) null;
            }
            if (param1 == 0L) {
              if (param2 != null) {
                stackIn_9_0 = new nk(param2, param3);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
            if (!param4) {
              stackIn_11_0 = new lf(param1, param3);
              decompiledRegionSelector0 = 2;
            } else {
              stackIn_7_0 = new th(param1, param3);
              decompiledRegionSelector0 = 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = (RuntimeException) (var6);

          stackIn_14_1 = new StringBuilder().append("wd.G(").append(param0).append(',').append(param1).append(',');

          if (param2 == null) {
            stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
            stackIn_15_2 = "null";
          } else {
            stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
            stackIn_15_2 = "{...}";
          }


          stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

          if (param3 == null) {
            stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
            stackIn_18_2 = "null";
          } else {
            stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
            stackIn_18_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param4).append(')').toString());
        }
        if (decompiledRegionSelector0 == 0) {
          return (df) ((Object) stackIn_7_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (df) ((Object) stackIn_9_0);
          } else {
            return (df) ((Object) stackIn_11_0);
          }
        }
    }

    final DualLinkNode firstForIteration(byte methodGuard) {
        DualLinkNode firstNode = this.sentinel.nextSecondaryNode;
        if (firstNode == this.sentinel) {
            this.iterationCursor = null;
            return null;
        }
        this.iterationCursor = firstNode.nextSecondaryNode;
        if (methodGuard == 121) {
            return firstNode;
        }
        SecondaryDeque.b(67);
        return firstNode;
    }

    static {
        contactProbeRaster = new Sprite(460, 460);
        field_d = (-contactProbeRaster.field_o + 480) / 2;
        field_a = (640 + -contactProbeRaster.field_s) / 2;
        spawnQueue = new IntrusiveDeque();
    }
}
